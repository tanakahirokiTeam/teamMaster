package jp.co.isid.cit.web.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.isid.cit.dto.LoginUser;
import jp.co.isid.cit.model.MenuAnswerVM;
import jp.co.isid.cit.model.MenuManagementVM;
import jp.co.isid.cit.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String menu(@AuthenticationPrincipal LoginUser loginUser, Model model) {

		MenuManagementVM menuManagementVM = menuService.getManagementEnqueteList(loginUser.esqid);

		MenuAnswerVM menuAnswerVM = menuService.getAnswerEnqueteList(loginUser.esqid);

		model.addAttribute("MVM", menuManagementVM);
		model.addAttribute("AVM", menuAnswerVM);

		// @AuthenticationPrincipalを使うと認証オブジェクトを参照できる。
		model.addAttribute("LOGINUSER", loginUser);

		return "menu/menu";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteEnquete(@AuthenticationPrincipal LoginUser loginUser, Model model,
			@RequestParam("enqueteId") int enqueteId, RedirectAttributes redirectAttributes) {

		menuService.deleteEnquete(enqueteId);
		redirectAttributes.addFlashAttribute("MESSAGE", "削除しました。");
		redirectAttributes.addFlashAttribute("frag", "manager");
		return "redirect:/menu";
	}

	@RequestMapping(value = "/start", method = RequestMethod.POST)
	public String startEnquete(@AuthenticationPrincipal LoginUser loginUser, Model model,
			@RequestParam("enqueteId") int enqueteId, RedirectAttributes redirectAttributes) {

		menuService.startEnquete(enqueteId);
		redirectAttributes.addFlashAttribute("MESSAGE", "公開しました。");
		redirectAttributes.addFlashAttribute("frag", "manager");
		return "redirect:/menu";
	}

	@RequestMapping(value = "/finish", method = RequestMethod.POST)
	public String finishEnquete(@AuthenticationPrincipal LoginUser loginUser, Model model,
			@RequestParam("enqueteId") int enqueteId, RedirectAttributes redirectAttributes) {

		menuService.finishEnquete(enqueteId);
		redirectAttributes.addFlashAttribute("MESSAGE", "公開終了しました。");
		redirectAttributes.addFlashAttribute("frag", "manager");
		return "redirect:/menu";
	}
}
