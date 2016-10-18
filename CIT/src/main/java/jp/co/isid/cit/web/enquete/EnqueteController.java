package jp.co.isid.cit.web.enquete;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.isid.cit.dto.LoginUser;
import jp.co.isid.cit.form.EnqueteAdminSearchUserForm;
import jp.co.isid.cit.form.EnqueteAdminUserForm;
import jp.co.isid.cit.form.EnqueteAdminUserListForm;
import jp.co.isid.cit.form.EnqueteCreateForm;
import jp.co.isid.cit.form.EnqueteDeptForm;
import jp.co.isid.cit.form.First;
import jp.co.isid.cit.form.QuestionForm;
import jp.co.isid.cit.form.Second;
import jp.co.isid.cit.model.EnqueteConfigPreviewVM;
import jp.co.isid.cit.model.EnqueteConfigVM;
import jp.co.isid.cit.model.EnqueteManagementConfigVM;
import jp.co.isid.cit.model.EnqueteManagementSearchUserVM;
import jp.co.isid.cit.service.EnqueteService;

@Controller
@RequestMapping("/enquete")
@SessionAttributes(types = { EnqueteCreateForm.class })
public class EnqueteController {

	@Autowired
	private EnqueteService enqueteService;

	@RequestMapping(value = "/preview/{enqueteId}", method = RequestMethod.GET)
	public String enqueteConfigPreview(@AuthenticationPrincipal LoginUser loginUser, Model model,
			@PathVariable("enqueteId") int enqueteId, RedirectAttributes redirectAttributes) {

		EnqueteConfigPreviewVM enqueteConfigPreviewVM;
		enqueteConfigPreviewVM = enqueteService.getEnqueteConfigPreview(enqueteId);

		// URL不正アクセスの場合
		if (enqueteConfigPreviewVM.getCreatorDto() == null) {
			redirectAttributes.addFlashAttribute("MESSAGE", "不正なアクセスです。");
			return "redirect:/menu";
		}

		model.addAttribute("ECP", enqueteConfigPreviewVM);

		// @AuthenticationPrincipalを使うと認証オブジェクトを参照できる。
		model.addAttribute("LOGINUSER", loginUser);

		return "enquete/enquete_config_preview";
	}

	@RequestMapping("/config")
	public String enqueteConfig(@AuthenticationPrincipal LoginUser loginUser, Model model,
			@RequestParam("enqueteId") int enqueteId) {

		// System.out.println(enqueteId);
		EnqueteConfigVM enqueteConfigVM;
		// enqueteIDで新規作成か再編集かどうかを判断
		if (enqueteId == 0) {// 新規作成
			enqueteConfigVM = enqueteService.getEnqueteConfig();
			model.addAttribute(new EnqueteCreateForm());
		} else {// 再編集
			enqueteConfigVM = enqueteService.getEnqueteConfig(enqueteId);

			// 編集開始時のバージョンを取得
			EnqueteCreateForm enqueteCreateForm = new EnqueteCreateForm();
			enqueteCreateForm.setEnqueteVersion(enqueteConfigVM.getCreatorDto().getVersion());
			model.addAttribute(enqueteCreateForm);
		}

		model.addAttribute("EC", enqueteConfigVM);

		// @AuthenticationPrincipalを使うと認証オブジェクトを参照できる。
		model.addAttribute("LOGINUSER", loginUser);

		return "enquete/enquete_config";
	}

	@RequestMapping("/config/return")
	public String enqueteConfig(@AuthenticationPrincipal LoginUser loginUser, Model model,
			EnqueteCreateForm enqueteCreateForm) {

		EnqueteConfigVM enqueteConfigVM;
		enqueteConfigVM = enqueteService.enqueteFormToVM(enqueteCreateForm);

		model.addAttribute("EC", enqueteConfigVM);

		// @AuthenticationPrincipalを使うと認証オブジェクトを参照できる。
		model.addAttribute("LOGINUSER", loginUser);

		return "enquete/enquete_config";
	}

	@RequestMapping(value = "/temp", method = RequestMethod.POST)
	public String tempEnquete(@AuthenticationPrincipal LoginUser loginUser, Model model,
			@Validated(Second.class) EnqueteCreateForm enqueteCreateForm, BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("EC", enqueteService.enqueteFormToVM(enqueteCreateForm));
			model.addAttribute("LOGINUSER", loginUser);
			return "enquete/enquete_config";
		}
		enqueteCreateForm.getEnqueteForm().setCreateDate(new Date());
		enqueteCreateForm.getEnqueteForm().setEnqueteStateId(1);
		enqueteCreateForm.getEnqueteForm().setCreateUserId(loginUser.esqid);

		// 新規作成
		if (enqueteCreateForm.getEnqueteId() == 0) {
			enqueteService.addEnquete(enqueteCreateForm);

			// 再編集
		} else {
			enqueteService.updateEnquete(enqueteCreateForm);
		}

		redirectAttributes.addFlashAttribute("MESSAGE", "アンケートを一時保存しました。");
		redirectAttributes.addFlashAttribute("frag", "manager");

		return "redirect:/menu";
	}

	@RequestMapping("/confirm")
	public String enqueteConfirm(@AuthenticationPrincipal LoginUser loginUser, Model model,
			@Validated({ First.class, Second.class }) EnqueteCreateForm enqueteCreateForm,
			BindingResult bindingResult) {

		int i = 0;
		for (QuestionForm question : enqueteCreateForm.getQuestionFormList()) {
			if (question.getQuestionTypeId() != null) {
				if (question.getQuestionTypeId() != 3 && question.getQuestionTypeId().intValue() != 0) {
					System.out.println("AAA");
					for (int j = 0; j < question.getChoiceFormList().size(); j++) {
						if (question.getChoiceFormList().get(j).getChoiceText() == null
								|| question.getChoiceFormList().get(j).getChoiceText() == ""
								|| question.getChoiceFormList().get(j).getChoiceText() == " "
								|| question.getChoiceFormList().get(j).getChoiceText() == "　") {
							bindingResult.rejectValue(
									"questionFormList[" + i + "].choiceFormList[" + j + "].choiceText", "",
									"未入力の選択肢があります");
						}
					}
				}

				if (question.getQuestionText() == null || question.getQuestionText() == ""
						|| question.getQuestionText() == " " || question.getQuestionText() == "　") {
					bindingResult.rejectValue("questionFormList[" + i + "].questionText", "", "質問文が入力されていない質問があります");
				}

				i++;
			}
		}
		int judge = 0;
		for (EnqueteDeptForm dept : enqueteCreateForm.getEnqueteDeptFormList()) {
			if (dept.getDeptId() != null) {
				judge = 1;
			}
		}
		if (judge == 0) {
			bindingResult.rejectValue("enqueteDeptFormList", "", "対象事業部は必ず1つ以上選択してください");
		}

		if (bindingResult.hasErrors()) {
			model.addAttribute("EC", enqueteService.enqueteFormToVM(enqueteCreateForm));
			model.addAttribute("LOGINUSER", loginUser);
			return "enquete/enquete_config";
		}

		EnqueteConfigVM enqueteConfigVM;
		enqueteConfigVM = enqueteService.enqueteFormToVM(enqueteCreateForm);

		model.addAttribute("EC", enqueteConfigVM);

		// @AuthenticationPrincipalを使うと認証オブジェクトを参照できる。
		model.addAttribute("LOGINUSER", loginUser);

		return "enquete/enquete_preview";
	}

	@RequestMapping("/complete")
	public String enqueteComplete(@AuthenticationPrincipal LoginUser loginUser, Model model,
			EnqueteCreateForm enqueteCreateForm, RedirectAttributes redirectAttributes) {
		enqueteCreateForm.getEnqueteForm().setCreateDate(new Date());
		enqueteCreateForm.getEnqueteForm().setEnqueteStateId(2);
		enqueteCreateForm.getEnqueteForm().setCreateUserId(loginUser.esqid);

		// 新規作成
		if (enqueteCreateForm.getEnqueteId() == 0) {
			enqueteService.addEnquete(enqueteCreateForm);

			// 再編集
		} else {
			enqueteService.updateEnquete(enqueteCreateForm);
		}

		redirectAttributes.addFlashAttribute("MESSAGE", "アンケートを作成完了しました。");
		redirectAttributes.addFlashAttribute("frag", "manager");

		return "redirect:/menu";
	}

	@RequestMapping("/manager")
	public String enqueteManagement(@AuthenticationPrincipal LoginUser loginUser, Model model,
			EnqueteCreateForm enqueteCreateForm) {
		model.addAttribute("LOGINUSER", loginUser);

		// 管理者ユニットの中身を保持するためのフォームを作成し投げておく
		EnqueteAdminUserListForm enqueteAdminUserListForm = new EnqueteAdminUserListForm();
		model.addAttribute(enqueteAdminUserListForm);
		// セッションから得たenqueteCreateFormから現在の管理者情報esqIdの入ったformのリストを取得しそれに応じた情報を取得する
		EnqueteManagementConfigVM enqueteManagementConfigVM = enqueteService.getAdmin(enqueteCreateForm);
		model.addAttribute(enqueteManagementConfigVM);
		// 検索ユニットの情報を取得する。初遷移時はenqueteAdminSearchUserFormをnewして引き渡す
		EnqueteAdminSearchUserForm enqueteAdminSearchUserForm = new EnqueteAdminSearchUserForm();
		EnqueteManagementSearchUserVM enqueteManagementSearchUserVM = enqueteService
				.searchUser(enqueteAdminSearchUserForm);

		model.addAttribute("SEARCHUSER", enqueteManagementSearchUserVM);
		model.addAttribute(enqueteAdminSearchUserForm);
		return "enquete/enquete_management_config";
	}

	@RequestMapping(value = "/searchUser", method = RequestMethod.POST)
	public String searchUser(@AuthenticationPrincipal LoginUser loginUser, Model model,
			EnqueteAdminSearchUserForm enqueteAdminSearchUserForm, EnqueteAdminUserListForm enqueteAdminUserListForm) {

		// 検索ユニットの情報からあいまい検索する
		EnqueteManagementSearchUserVM enqueteManagementSearchUserVM = enqueteService
				.searchUser(enqueteAdminSearchUserForm);

		model.addAttribute("LOGINUSER", loginUser);
		model.addAttribute(enqueteAdminUserListForm);
		model.addAttribute(enqueteAdminSearchUserForm);
		model.addAttribute("SEARCHUSER", enqueteManagementSearchUserVM);

		return "enquete/enquete_management_config";
	}

	@RequestMapping(value = "/adminConclude", method = RequestMethod.POST)
	public String adminConclude(@AuthenticationPrincipal LoginUser loginUser, Model model,
			EnqueteCreateForm enqueteCreateForm, EnqueteAdminUserListForm enqueteAdminUserListForm) {

		// EnqueteAdminUserListFormの内容をセッションに格納されているenqueteCreateFormに反映させる
		List<EnqueteAdminUserForm> enqueteAdminUserFormList = enqueteAdminUserListForm.getEnqueteAdminUserFormList();
		// removeListの内容を全件削除
		enqueteCreateForm.getEnqueteAdminUserFormList().clear();

		// EnqueteAdminUserListFormの内容をaddする
		for (EnqueteAdminUserForm enqueteAdminUserForm : enqueteAdminUserFormList) {
			enqueteCreateForm.getEnqueteAdminUserFormList().add(enqueteAdminUserForm);
		}
		EnqueteConfigVM enqueteConfigVM = enqueteService.enqueteFormToVM(enqueteCreateForm);

		model.addAttribute("LOGINUSER", loginUser);
		model.addAttribute(enqueteCreateForm);
		model.addAttribute("EC", enqueteConfigVM);

		return "enquete/enquete_config";
	}
}
