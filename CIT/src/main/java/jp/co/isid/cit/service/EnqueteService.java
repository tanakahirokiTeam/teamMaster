package jp.co.isid.cit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.isid.cit.dao.ChoiceDao;
import jp.co.isid.cit.dao.CreatorDtoDao;
import jp.co.isid.cit.dao.DeptDao;
import jp.co.isid.cit.dao.EnqueteAdminDtoDao;
import jp.co.isid.cit.dao.EnqueteAdminUserDao;
import jp.co.isid.cit.dao.EnqueteDao;
import jp.co.isid.cit.dao.EnqueteDeptDao;
import jp.co.isid.cit.dao.EnqueteDeptDtoDao;
import jp.co.isid.cit.dao.EsqUserDao;
import jp.co.isid.cit.dao.QuestionDao;
import jp.co.isid.cit.dao.QuestionDtoDao;
import jp.co.isid.cit.dao.QuestionTypeDao;
import jp.co.isid.cit.dao.UserDeptDtoDao;
import jp.co.isid.cit.dto.CreatorDto;
import jp.co.isid.cit.dto.EnqueteAdminDto;
import jp.co.isid.cit.dto.EnqueteDeptDto;
import jp.co.isid.cit.dto.QuestionDto;
import jp.co.isid.cit.dto.UserDeptDto;
import jp.co.isid.cit.entity.Choice;
import jp.co.isid.cit.entity.Dept;
import jp.co.isid.cit.entity.Enquete;
import jp.co.isid.cit.entity.EnqueteAdminUser;
import jp.co.isid.cit.entity.EnqueteDept;
import jp.co.isid.cit.entity.Question;
import jp.co.isid.cit.form.ChoiceForm;
import jp.co.isid.cit.form.EnqueteAdminSearchUserForm;
import jp.co.isid.cit.form.EnqueteAdminUserForm;
import jp.co.isid.cit.form.EnqueteCreateForm;
import jp.co.isid.cit.form.EnqueteDeptForm;
import jp.co.isid.cit.form.QuestionForm;
import jp.co.isid.cit.model.EnqueteConfigPreviewVM;
import jp.co.isid.cit.model.EnqueteConfigVM;
import jp.co.isid.cit.model.EnqueteManagementConfigVM;
import jp.co.isid.cit.model.EnqueteManagementSearchUserVM;
import jp.co.isid.cit.model.QuestionVM;

@Service
public class EnqueteService {

	private final EnqueteDao enqueteDao;
	private final QuestionDao questionDao;
	private final ChoiceDao choiceDao;
	private final DeptDao deptDao;
	private final EnqueteDeptDao enqueteDeptDao;
	private final QuestionTypeDao questionTypeDao;
	private final EnqueteAdminUserDao enqueteAdminUserDao;
	private final EnqueteAdminDtoDao enqueteAdminDtoDao;
	private final CreatorDtoDao creatorDtoDao;
	private final QuestionDtoDao questionDtoDao;
	private final EnqueteDeptDtoDao enqueteDeptDtoDao;
	private final EsqUserDao esqUserDao;
	private final UserDeptDtoDao userDeptDtoDao;

	@Autowired
	public EnqueteService(EnqueteDao enqueteDao, QuestionDao questionDao, ChoiceDao choiceDao, DeptDao deptDao,
			EnqueteDeptDao enqueteDeptDao, QuestionTypeDao questionTypeDao, EnqueteAdminUserDao enqueteAdminUserDao,
			EnqueteAdminDtoDao enqueteAdminDtoDao, CreatorDtoDao creatorDtoDao, QuestionDtoDao questionDtoDao,
			EnqueteDeptDtoDao enqueteDeptDtoDao, EsqUserDao esqUserDao, UserDeptDtoDao userDeptDtoDao) {

		this.enqueteDao = enqueteDao;
		this.questionDao = questionDao;
		this.choiceDao = choiceDao;
		this.deptDao = deptDao;
		this.enqueteDeptDao = enqueteDeptDao;
		this.questionTypeDao = questionTypeDao;
		this.enqueteAdminUserDao = enqueteAdminUserDao;
		this.enqueteAdminDtoDao = enqueteAdminDtoDao;
		this.creatorDtoDao = creatorDtoDao;
		this.questionDtoDao = questionDtoDao;
		this.enqueteDeptDtoDao = enqueteDeptDtoDao;
		this.esqUserDao = esqUserDao;
		this.userDeptDtoDao = userDeptDtoDao;
	}

	// DBにアンケートを新規登録する。
	public boolean addEnquete(EnqueteCreateForm enqueteCreateForm) {
		// 確認用変数
		int check1 = 0;
		int check2 = 0;
		int check3 = 0;
		int check4 = 0;
		int check5 = 0;
		// アンケートをDBに登録する。
		Enquete enquete = new Enquete();
		BeanUtils.copyProperties(enqueteCreateForm.getEnqueteForm(), enquete);
		check1 = enqueteDao.insert(enquete);
		if (check1 == 0)
			return false;
		enquete.setEnqueteId(enqueteDao.selectLastInsert());
		// アンケート管理者をDBに登録する。
		ArrayList<EnqueteAdminUserForm> enqueteAdminUserList = new ArrayList<EnqueteAdminUserForm>();
		enqueteAdminUserList = enqueteCreateForm.getEnqueteAdminUserFormList();
		for (EnqueteAdminUserForm enqueteAdminUserForm : enqueteAdminUserList) {
			EnqueteAdminUser enqueteAdminUser = new EnqueteAdminUser();
			enqueteAdminUser.setEnqueteId(enquete.getEnqueteId());
			enqueteAdminUser.setEsqId(enqueteAdminUserForm.getEsqId());
			enqueteAdminUser.setDeleteFlag(0);
			check5 = enqueteAdminUserDao.insert(enqueteAdminUser);
			if (check5 == 0) {
				return false;
			}
		}
		// アンケート対象事業部をDBに登録する。
		ArrayList<EnqueteDeptForm> enqueteDeptFormList = new ArrayList<EnqueteDeptForm>();
		enqueteDeptFormList = enqueteCreateForm.getEnqueteDeptFormList();
		for (EnqueteDeptForm enqueteDeptForm : enqueteDeptFormList) {
			if (enqueteDeptForm.getDeptId() != null) {
				EnqueteDept enqueteDept = new EnqueteDept();
				enqueteDept.setDeptId(enqueteDeptForm.getDeptId());
				enqueteDept.setEnqueteId(enquete.getEnqueteId());
				check2 = enqueteDeptDao.insert(enqueteDept);
				if (check2 == 0) {
					return false;
				}
			}
		}
		// 質問をDBに登録する。
		int questionNum = 1;
		ArrayList<QuestionForm> questionFormList = enqueteCreateForm.getQuestionFormList();
		for (QuestionForm newQuestion : questionFormList) {
			Question question = new Question();
			question.setEnqueteId(enquete.getEnqueteId());
			question.setQuestionNumber(questionNum);
			question.setQuestionTypeId(newQuestion.getQuestionTypeId());
			question.setRequireFlag(newQuestion.getRequireFlag());
			question.setQuestionText(newQuestion.getQuestionText());
			question.setQuestionSubtext(newQuestion.getQuestionSubtext());
			check3 = questionDao.insert(question);
			if (check3 == 0) {
				return false;
			}
			question.setQuestionId(questionDao.selectLastInsert());
			// 択一選択、複数選択の場合選択肢をDBに登録する。
			if (question.getQuestionTypeId() == 1 || question.getQuestionTypeId() == 2) {
				int choiceNum = 1;
				ArrayList<ChoiceForm> choiceFormList = newQuestion.getChoiceFormList();
				for (ChoiceForm newChoice : choiceFormList) {
					Choice choice = new Choice();
					choice.setQuestionId(question.getQuestionId());
					choice.setChoiceNumber(choiceNum);
					choice.setChoiceText(newChoice.getChoiceText());
					check4 = choiceDao.insert(choice);
					if (check4 == 0) {
						return false;
					}
					choiceNum++;
				}
			}
			questionNum++;
		}
		return true;
	}

	// アンケートの内容を更新する。
	public void updateEnquete(EnqueteCreateForm enqueteCreateForm) {
		// アンケートテーブルを更新する。
		Enquete enquete = new Enquete();
		enquete.setEnqueteId(enqueteCreateForm.getEnqueteId());
		enquete.setVersion(enqueteCreateForm.getVersion());
		BeanUtils.copyProperties(enqueteCreateForm.getEnqueteForm(), enquete);
		enqueteDao.update(enquete);
		// アンケート管理者を更新する。(すべて1にしてからupdateし、insertする)
		enqueteAdminUserDao.updateDeleteFlag(enquete.getEnqueteId());
		ArrayList<EnqueteAdminUserForm> enqueteAdminUserList = new ArrayList<EnqueteAdminUserForm>();
		enqueteAdminUserList = enqueteCreateForm.getEnqueteAdminUserFormList();
		for (EnqueteAdminUserForm enqueteAdminUserForm : enqueteAdminUserList) {
			EnqueteAdminUser enqueteAdminUser = new EnqueteAdminUser();
			enqueteAdminUser.setEnqueteId(enquete.getEnqueteId());
			enqueteAdminUser.setEsqId(enqueteAdminUserForm.getEsqId());
			enqueteAdminUser.setDeleteFlag(0);
			enqueteAdminUserDao.update(enqueteAdminUser);
			// 既にインサート済みのものはスキップ
			try {
				enqueteAdminUserDao.insert(enqueteAdminUser);
			} catch (Exception e) {

			}
		}
		// アンケート対象事業部更新する。(すべて削除し、新しく登録する)
		enqueteDeptDao.deleteByEnqueteId(enquete.getEnqueteId());
		ArrayList<EnqueteDeptForm> enqueteDeptFormList = new ArrayList<EnqueteDeptForm>();
		enqueteDeptFormList = enqueteCreateForm.getEnqueteDeptFormList();
		for (EnqueteDeptForm enqueteDeptForm : enqueteDeptFormList) {
			if (enqueteDeptForm.getDeptId() != null) {
				EnqueteDept enqueteDept = new EnqueteDept();
				enqueteDept.setDeptId(enqueteDeptForm.getDeptId());
				enqueteDept.setEnqueteId(enquete.getEnqueteId());
				enqueteDeptDao.insert(enqueteDept);
			}
		}
		// 更新前の質問の取得
		List<Question> preQuestionList = new ArrayList<Question>();
		preQuestionList = questionDao.selectByEnqueteId(enquete.getEnqueteId());

		// 質問を更新する。
		int questionNum = 1;
		ArrayList<QuestionForm> questionFormList = enqueteCreateForm.getQuestionFormList();
		for (QuestionForm newQuestion : questionFormList) {
			Question question = new Question();

			// 既存の設問がある場合は設問IDとバージョンを取得してセット
			Question oldQuestion = questionDao.selectById(newQuestion.getQuestionId());
			if (oldQuestion != null) {
				question.setQuestionId(oldQuestion.getQuestionId());
				question.setVersion(oldQuestion.getVersion());
			}

			// その他の情報をセット
			question.setEnqueteId(enquete.getEnqueteId());
			question.setQuestionTypeId(newQuestion.getQuestionTypeId());
			question.setRequireFlag(newQuestion.getRequireFlag());
			question.setQuestionText(newQuestion.getQuestionText());
			question.setQuestionSubtext(newQuestion.getQuestionSubtext());
			question.setQuestionNumber(questionNum);

			// 質問IDがnullの場合insertし、その他の場合はupdateする。
			if (question.getQuestionId() == null) {
				questionDao.insert(question);
				question.setQuestionId(questionDao.selectLastInsert());
			} else {
				questionDao.update(question);
				preQuestionList.removeIf(preQuestion -> {
					return preQuestion.getQuestionId().intValue() == question.getQuestionId().intValue();
				});
			}
			// 択一選択、複数選択の場合選択肢をDBに登録する。
			if (question.getQuestionTypeId() == 1 || question.getQuestionTypeId() == 2) {
				// 更新前の選択肢の取得
				List<Choice> preChoiceList = new ArrayList<Choice>();
				preChoiceList = choiceDao.selectByQuestionId(question.getQuestionId());
				// DBへの登録
				int choiceNum = 1;
				ArrayList<ChoiceForm> choiceFormList = newQuestion.getChoiceFormList();
				for (ChoiceForm newChoice : choiceFormList) {
					Choice choice = new Choice();

					// 既存の選択肢がある場合は選択肢IDとバージョンを取得してセット
					Choice oldChoice = choiceDao.selectById(newChoice.getChoiceId());
					if (oldChoice != null) {
						choice.setChoiceId(oldChoice.getChoiceId());
						choice.setVersion(oldChoice.getVersion());
					}

					// その他の情報をセット
					choice.setQuestionId(question.getQuestionId());
					choice.setChoiceNumber(choiceNum);
					choice.setChoiceText(newChoice.getChoiceText());

					// 新規の選択肢の場合insertし、その他の場合updateする。
					if (choice.getChoiceId() == null) {
						choiceDao.insert(choice);
					} else {
						choiceDao.update(choice);
						preChoiceList.removeIf(preChoice -> {
							return preChoice.getChoiceId().intValue() == choice.getChoiceId().intValue();
						});
					}
					choiceNum++;
				}
				// 選択肢の削除
				for (Choice deleteChoice : preChoiceList) {
					choiceDao.delete(deleteChoice);
				}
			}
			questionNum++;
		}
		// 質問の削除
		for (Question deleteQuestion : preQuestionList) {
			choiceDao.deleteByQuestionId(deleteQuestion.getQuestionId());
			questionDao.delete(deleteQuestion);
		}
	}

	// アンケート編集プレビュー画面用VMを返す。
	public EnqueteConfigPreviewVM getEnqueteConfigPreview(Integer enqueteId) {
		EnqueteConfigPreviewVM enqueteConfigPreviewVM = new EnqueteConfigPreviewVM();
		enqueteConfigPreviewVM.setCreatorDto(creatorDtoDao.selectById(enqueteId));
		enqueteConfigPreviewVM.setEnqueteDeptDtoList(enqueteDeptDtoDao.selectById(enqueteId));
		enqueteConfigPreviewVM.setEnqueteAdminDtoLsit(enqueteAdminDtoDao.selectById(enqueteId));
		// 質問リストを格納
		List<QuestionVM> questionVMList = new ArrayList<QuestionVM>();
		for (QuestionDto question : questionDtoDao.selectByEnqueteId(enqueteId)) {
			QuestionVM questionVM = new QuestionVM();
			questionVM.setQuestionDto(question);
			// 選択肢リストを格納
			questionVM.setChoiceList(choiceDao.selectByQuestionId(question.getQuestionId()));
			questionVMList.add(questionVM);
		}
		enqueteConfigPreviewVM.setQuestionVMList(questionVMList);
		return enqueteConfigPreviewVM;
	}

	// 対象事業部・質問形式をVMとして返す。
	public EnqueteConfigVM getEnqueteConfig() {
		EnqueteConfigVM enqueteConfigVM = new EnqueteConfigVM();
		enqueteConfigVM.setDeptList(deptDao.selectAll());
		enqueteConfigVM.setQuestionTypeList(questionTypeDao.selectAll());

		return enqueteConfigVM;
	}

	// オーバーロード
	// DBに登録されているアンケートをVMとして返す。
	public EnqueteConfigVM getEnqueteConfig(Integer enqueteId) {
		EnqueteConfigVM enqueteConfigVM = new EnqueteConfigVM();
		enqueteConfigVM.setCreatorDto(creatorDtoDao.selectById(enqueteId));
		enqueteConfigVM.setEnqueteName(enqueteConfigVM.getCreatorDto().getEnqueteName());
		enqueteConfigVM.setEnqueteDeptDtoList(enqueteDeptDtoDao.selectById(enqueteId));
		enqueteConfigVM.setEnqueteAdminDtoList(enqueteAdminDtoDao.selectById(enqueteId));
		enqueteConfigVM.setDeptList(deptDao.selectAll());
		enqueteConfigVM.setQuestionTypeList(questionTypeDao.selectAll());
		// 質問リストを格納
		List<QuestionVM> questionVMList = new ArrayList<QuestionVM>();
		for (QuestionDto question : questionDtoDao.selectByEnqueteId(enqueteId)) {
			QuestionVM questionVM = new QuestionVM();
			questionVM.setQuestionDto(question);
			// 選択肢リストを格納
			questionVM.setChoiceList(choiceDao.selectByQuestionId(question.getQuestionId()));
			questionVMList.add(questionVM);
		}
		enqueteConfigVM.setQuestionVMList(questionVMList);
		return enqueteConfigVM;
	}

	// アンケート入力情報のFormをVMに変換する。
	public EnqueteConfigVM enqueteFormToVM(EnqueteCreateForm enqueteCreateForm) {
		EnqueteConfigVM enqueteConfigVM = new EnqueteConfigVM();

		// EnqueteNameをセット
		enqueteConfigVM.setEnqueteName(enqueteCreateForm.getEnqueteForm().getEnqueteName());

		// EnqueteDeptDtoListをセット
		ArrayList<EnqueteDeptDto> enqueteDeptDtoList = new ArrayList<EnqueteDeptDto>();
		for (EnqueteDeptForm enqueteDeptForm : enqueteCreateForm.getEnqueteDeptFormList()) {
			if (enqueteDeptForm.getDeptId() != null) {
				EnqueteDeptDto enqueteDeptDto = new EnqueteDeptDto();
				enqueteDeptDto.setDeptId(enqueteDeptForm.getDeptId());
				enqueteDeptDto.setDeptName(deptDao.selectById(enqueteDeptForm.getDeptId()).getDeptName());
				enqueteDeptDto.setEnqueteId(enqueteCreateForm.getEnqueteId());
				enqueteDeptDtoList.add(enqueteDeptDto);
			}
		}
		enqueteConfigVM.setEnqueteDeptDtoList(enqueteDeptDtoList);

		// CreatorDtoをセット
		CreatorDto creatorDto = new CreatorDto();
		creatorDto.setEnqueteId(enqueteCreateForm.getEnqueteId());
		creatorDto.setEnqueteName(enqueteCreateForm.getEnqueteForm().getEnqueteName());
		creatorDto.setEnqueteStateId(enqueteCreateForm.getEnqueteForm().getEnqueteStateId());
		creatorDto.setCreateUserId(enqueteCreateForm.getEnqueteForm().getCreateUserId());
		creatorDto.setCreateDate(enqueteCreateForm.getEnqueteForm().getCreateDate());
		creatorDto.setEnqueteSubtext(enqueteCreateForm.getEnqueteForm().getEnqueteSubtext());
		creatorDto
				.setUserName(esqUserDao.selectById(enqueteCreateForm.getEnqueteForm().getCreateUserId()).getUserName());
		enqueteConfigVM.setCreatorDto(creatorDto);

		// EnqueteAdminDtoListをセット
		ArrayList<EnqueteAdminDto> enqueteAdminDtoList = new ArrayList<EnqueteAdminDto>();
		for (EnqueteAdminUserForm enqueteAdminUserForm : enqueteCreateForm.getEnqueteAdminUserFormList()) {
			EnqueteAdminDto enqueteAdminDto = new EnqueteAdminDto();
			enqueteAdminDto.setEsqId(enqueteAdminUserForm.getEsqId());
			enqueteAdminDto.setDeptId(esqUserDao.selectById(enqueteAdminUserForm.getEsqId()).getDeptId());
			enqueteAdminDto.setUserName(esqUserDao.selectById(enqueteAdminUserForm.getEsqId()).getUserName());
			enqueteAdminDto.setEnqueteId(enqueteCreateForm.getEnqueteId());
			enqueteAdminDtoList.add(enqueteAdminDto);
		}
		enqueteConfigVM.setEnqueteAdminDtoList(enqueteAdminDtoList);

		// QuestionVMListをセット
		List<QuestionVM> questionVMList = new ArrayList<QuestionVM>();
		for (QuestionForm questionForm : enqueteCreateForm.getQuestionFormList()) {
			QuestionVM questionVM = new QuestionVM();
			QuestionDto questionDto = new QuestionDto();
			questionDto.setQuestionId(questionForm.getQuestionId());
			questionDto.setEnqueteId(enqueteCreateForm.getEnqueteId());
			questionDto.setQuestionTypeId(questionForm.getQuestionTypeId());
			questionDto.setRequireFlag(questionForm.getRequireFlag());
			questionDto.setQuestionText(questionForm.getQuestionText());
			questionDto.setQuestionSubtext(questionForm.getQuestionSubtext());
			if (questionForm.getQuestionTypeId() != null) {
				if (questionForm.getQuestionTypeId() != 0) {
					questionDto.setQuestionType(
							questionTypeDao.selectById(questionForm.getQuestionTypeId()).getQuestionType());
				}
				questionVM.setQuestionDto(questionDto);

				// 自由記述ではない場合
				if (questionForm.getQuestionTypeId() != 3) {
					// 選択肢リストを格納
					List<Choice> choiceList = new ArrayList<Choice>();
					if (questionForm.getChoiceFormList() != null) {
						for (ChoiceForm choiceForm : questionForm.getChoiceFormList()) {
							Choice choice = new Choice();
							choice.setChoiceId(choiceForm.getChoiceId());
							choice.setChoiceText(choiceForm.getChoiceText());
							choiceList.add(choice);
						}
					}
					questionVM.setChoiceList(choiceList);
				}
			}
			questionVMList.add(questionVM);
		}
		enqueteConfigVM.setQuestionVMList(questionVMList);

		// DeptListをセット
		enqueteConfigVM.setDeptList(deptDao.selectAll());

		// QuestionTypeListをセット
		enqueteConfigVM.setQuestionTypeList(questionTypeDao.selectAll());

		return enqueteConfigVM;
	}

	/**
	 * 引数:EnqueteAdminSearchUserForm enqueteAdminSearchUserForm
	 * 戻り値:EnqueteManagementSearchUserVM enqueteManagementSearchUserVM esqId,
	 * userName, deptIdであいまい検索するメソッド
	 */
	public EnqueteManagementSearchUserVM searchUser(EnqueteAdminSearchUserForm enqueteAdminSearchUserForm) {

		String esqId = enqueteAdminSearchUserForm.getEsqId();
		String userName = enqueteAdminSearchUserForm.getUserName();
		int deptId = enqueteAdminSearchUserForm.getDeptId();

		// 検索する
		List<UserDeptDto> userDeptDtoList = userDeptDtoDao.searchUser(esqId, userName, deptId);
		// 検索欄で使用する事業部リストを取得する
		List<Dept> deptList = deptDao.selectAll();
		// 検索結果をVMに入れる
		EnqueteManagementSearchUserVM enqueteManagementSearchUserVM = new EnqueteManagementSearchUserVM(userDeptDtoList,
				deptList);
		return enqueteManagementSearchUserVM;
	}

	/**
	 * 引数:EnqueteCreateForm enqueteCreateForm 戻り値:EnqueteManagementConfigVM
	 * enqueteManagementConfigVM enqueteCreateForm内のesqIdで管理者名などの情報を取得するメソッド
	 */
	public EnqueteManagementConfigVM getAdmin(EnqueteCreateForm enqueteCreateForm) {

		// セッション内部から来たenqueteCreateFormから管理者のesqIdをリストとして取得する
		List<String> esqIdList = new ArrayList<String>();
		for (EnqueteAdminUserForm enqueteAdminUserForm : enqueteCreateForm.getEnqueteAdminUserFormList()) {
			esqIdList.add(enqueteAdminUserForm.getEsqId());
		}
		// 取得したesqIdのリストから情報を取得する
		List<UserDeptDto> userDeptDtoList = new ArrayList<UserDeptDto>();
		for (String esqId : esqIdList) {
			UserDeptDto userDeptDto = userDeptDtoDao.selectById(esqId);
			userDeptDtoList.add(userDeptDto);
		}
		// 取得した情報をVMに入れコントローラへ返す
		EnqueteManagementConfigVM enqueteManagementConfigVM = new EnqueteManagementConfigVM(userDeptDtoList);
		return enqueteManagementConfigVM;
	}
}
