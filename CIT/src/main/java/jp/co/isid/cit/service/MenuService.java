package jp.co.isid.cit.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.isid.cit.dao.ChoiceDao;
import jp.co.isid.cit.dao.CreatorAndAnswerStatusDtoDao;
import jp.co.isid.cit.dao.CreatorAndOpenStatusDtoDao;
import jp.co.isid.cit.dao.EnqueteAdminUserDao;
import jp.co.isid.cit.dao.EnqueteDao;
import jp.co.isid.cit.dao.EnqueteDeptDao;
import jp.co.isid.cit.dao.EsqUserDao;
import jp.co.isid.cit.dao.QuestionDao;
import jp.co.isid.cit.dto.CreatorAndAnswerStatusDto;
import jp.co.isid.cit.dto.CreatorAndOpenStatusDto;
import jp.co.isid.cit.entity.Enquete;
import jp.co.isid.cit.entity.EnqueteAdminUser;
import jp.co.isid.cit.entity.EsqUser;
import jp.co.isid.cit.entity.Question;
import jp.co.isid.cit.model.MenuAnswerVM;
import jp.co.isid.cit.model.MenuManagementVM;

@Service
public class MenuService {

	private final ChoiceDao choiceDao;
	private final QuestionDao questionDao;
	private final EnqueteDeptDao enqueteDeptDao;
	private final EnqueteDao enqueteDao;
	private final EsqUserDao esqUserDao;
	private final EnqueteAdminUserDao enqueteAdminUserDao;
	private final CreatorAndOpenStatusDtoDao creatorAndOpenStatusDtoDao;
	private final CreatorAndAnswerStatusDtoDao creatorAndAnswerStatusDtoDao;
	public final static Integer STATE_DRAFT = 1;
	public final static Integer STATE_CREATED = 2;
	public final static Integer STATE_OPEN = 3;
	public final static Integer STATE_CLOSED = 4;

	@Autowired
	public MenuService(EnqueteDao enqueteDao, EsqUserDao esqUserDao, EnqueteAdminUserDao enqueteAdminUserDao,
			CreatorAndOpenStatusDtoDao creatorAndOpenStatusDtoDao, EnqueteDeptDao enqueteDeptDao,
			QuestionDao questionDao, ChoiceDao choiceDao, CreatorAndAnswerStatusDtoDao creatorAndAnswerStatusDtoDao) {
		this.enqueteDao = enqueteDao;
		this.esqUserDao = esqUserDao;
		this.enqueteAdminUserDao = enqueteAdminUserDao;
		this.creatorAndOpenStatusDtoDao = creatorAndOpenStatusDtoDao;
		this.enqueteDeptDao = enqueteDeptDao;
		this.questionDao = questionDao;
		this.choiceDao = choiceDao;
		this.creatorAndAnswerStatusDtoDao = creatorAndAnswerStatusDtoDao;
	}

	/**
	 * 引数:String esqId 戻り値:MenuManagementVM menuManagementVM
	 * ログインユーザーのesqIDに紐付けて、管理対象のアンケート名などを調べるメソッド
	 */
	public MenuManagementVM getManagementEnqueteList(String esqId) {
		// ENQUETE_ADMIN_USERテーブルでログインしているユーザのesqIdで管理者であるアンケートIdを取得
		// EnqueteAdminUser enqueteAdminUser = new EnqueteAdminUser();
		List<EnqueteAdminUser> enqueteAdminUserList = enqueteAdminUserDao.selectByEsqId(esqId);
		List<CreatorAndOpenStatusDto> creatorAndOpenStatusDtoList = new ArrayList<CreatorAndOpenStatusDto>();
		Integer enqueteId;

		for (EnqueteAdminUser enqueteAdminUser : enqueteAdminUserList) {
			enqueteId = enqueteAdminUser.getEnqueteId();
			// アンケートIdを元に、該当アンケートのアンケート状態、アンケートタイトル、アンケート作成者を格納した
			// CreatorAndOpenStatusDtoを取得する
			CreatorAndOpenStatusDto creatorAndOpenStatusDto = creatorAndOpenStatusDtoDao.selectById(enqueteId);
			// 取得したCreatorAndOpenStatusDtoからVMに情報を格納する
			creatorAndOpenStatusDtoList.add(creatorAndOpenStatusDto);
		}
		MenuManagementVM menuManagementVM = new MenuManagementVM();
		menuManagementVM.setCreatorAndOpenStatusDtoList(creatorAndOpenStatusDtoList);
		return menuManagementVM;
	}

	/**
	 * 引数:String esqId 戻り値:MenuAnswerVM menuAnswerVM
	 * ログインユーザーのesqIDに紐付けて、回答対象のアンケート名などを調べるメソッド
	 */
	public MenuAnswerVM getAnswerEnqueteList(String esqId) {
		// esqIdをもとに、ログインユーザーが所属する事業部の事業部IDを検索
		EsqUser esqUser = esqUserDao.selectById(esqId);
		Integer deptId = esqUser.getDeptId();

		List<CreatorAndAnswerStatusDto> creatorAndAnswerStatusDtoList = creatorAndAnswerStatusDtoDao.selectById(deptId,
				esqId);

		// menuAnswerVMにcreatorAndAnswerStatusDtoListをsetする
		MenuAnswerVM menuAnswerVM = new MenuAnswerVM(creatorAndAnswerStatusDtoList);

		return menuAnswerVM;
	}

	/**
	 * 引数:Integer enqueteId 戻り値:なし enqueteIdに紐付けて、アンケートを削除するメソッド
	 */
	public void deleteEnquete(Integer enqueteId) {
		// ENQUETEテーブルからenqueteを取得
		Enquete enquete = enqueteDao.selectById(enqueteId);
		// QUESTIONテーブルからquestionIdを取得
		List<Question> questionList = questionDao.selectByEnqueteId(enqueteId);
		// CHOICEテーブルをenqueteIdで削除
		for (Question question : questionList) {
			int questionId = question.getQuestionId();
			choiceDao.deleteByQuestionId(questionId);
		}
		// ENQUETE_ADMIN_USERテーブルをenqueteIdで削除
		enqueteAdminUserDao.delete(enqueteId);
		// ENQUETE_DEPTテーブルをenqueteIdで削除
		enqueteDeptDao.deleteByEnqueteId(enqueteId);
		// QUESTIONテーブルからenqueteIdで削除
		questionDao.deleteByEnqueteId(enqueteId);
		// ENQUETEをenqueteで削除
		enqueteDao.delete(enquete);
	}

	/**
	 * 引数:String enqueteId 戻り値:なし
	 * 選択したenqueteIDのアンケートの実施状態を回答受付状態にし、受付開始日を格納するメソッド
	 */
	public void startEnquete(int enqueteId) {
		// アンケートIdを元に、Enqueteのアンケート実施状態IDを3(回答受付)に変更する
		Enquete enquete = enqueteDao.selectById(enqueteId);

		if (isStart(enquete.getEnqueteStateId())) {
			enquete.setEnqueteStateId(3);
			// アンケートIdを元に、Enqueteの開始日に現在の日付を格納し更新する
			Date date = new Date();
			enquete.setStartDate(date);
			enqueteDao.update(enquete);
		}
	}

	/**
	 * 引数:int num 戻り値:boolean アンケートを公開できる場合、trueを返すメソッド
	 */
	public static boolean isStart(int num) {
		if (num == STATE_CREATED) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 引数:String enqueteId 戻り値:なし
	 * 選択したenqueteIDのアンケートの実施状態をを受付終了状態にし、受付終了日を格納するメソッド
	 */
	public void finishEnquete(int enqueteId) {
		// アンケートIdを元に、Enqueteのアンケート実施状態IDを3(回答受付)に変更し更新する
		Enquete enquete = enqueteDao.selectById(enqueteId);
		if (isFinish(enquete.getEnqueteStateId())) {
			enquete.setEnqueteStateId(4);
			// アンケートIdを元に、Enqueteの開始日に現在の日付を格納し更新する
			Date date = new Date();
			enquete.setFinishDate(date);
			enqueteDao.update(enquete);
		}
	}

	/**
	 * 引数:int num 戻り値:boolean アンケートを公開終了できる場合、trueを返すメソッド
	 */
	public static boolean isFinish(int num) {
		if (num == STATE_OPEN) {
			return true;
		} else {
			return false;
		}
	}
}