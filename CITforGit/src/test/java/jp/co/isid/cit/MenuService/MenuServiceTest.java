package jp.co.isid.cit.MenuService;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import jp.co.isid.cit.dao.ChoiceDao;
import jp.co.isid.cit.dao.CreatorAndAnswerStatusDtoDao;
import jp.co.isid.cit.dao.CreatorAndOpenStatusDtoDao;
import jp.co.isid.cit.dao.CreatorDtoDao;
import jp.co.isid.cit.dao.EnqueteAdminUserDao;
import jp.co.isid.cit.dao.EnqueteAnswerDao;
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
import jp.co.isid.cit.service.MenuService;

public class MenuServiceTest {
	// テスト対象クラスが呼び出す外部のオブジェクトをモックにする
	@Mock
	private EnqueteAdminUserDao mockedEnqueteAdminUserDao;
	@Mock
	private CreatorAndOpenStatusDtoDao mockedCreatorAndOpenStatusDtoDao;
	@Mock
	private EsqUserDao mockedEsqUserDao;
	@Mock
	private EnqueteDao mockedEnqueteDao;
	@Mock
	private EnqueteAnswerDao mockedEnqueteAnswerDao;
	@Mock
	private QuestionDao mockedQuestionDao;
	@Mock
	private ChoiceDao mockedChoiceDao;
	@Mock
	private EnqueteDeptDao mockedEnqueteDeptDao;
	@Mock
	private CreatorDtoDao mockedCreatorDtoDao;
	@Mock
	private CreatorAndAnswerStatusDtoDao mockedCreatorAndAnswerStatusDtoDao;

	private Date current;

	// テスト対象のサービスクラスに@InjectMocksをつけて宣言する
	@InjectMocks
	private MenuService menuService;

	// モックオブジェクトをテスト対象クラスにインジェクションする
	@Before
	public void setupMock() {
		initMocks(this);
	}

	@Test
	public void アンケートIDをもとにMenuManagementVMクラスのオブジェクトを返す() {
		// メソッドで使う変数の宣言
		int enqueteId = 0;
		String enqueteName = "";
		String enqueteState = "";

		List<EnqueteAdminUser> enqueteAdminUserList = new ArrayList<EnqueteAdminUser>();
		EnqueteAdminUser enqueteAdminUser = new EnqueteAdminUser();
		enqueteAdminUser.setEsqId("li9010");
		enqueteAdminUser.setEnqueteId(4);
		enqueteAdminUserList.add(enqueteAdminUser);
		when(mockedEnqueteAdminUserDao.selectByEsqId("li9010")).thenReturn(enqueteAdminUserList);

		CreatorAndOpenStatusDto creatorAndOpenStatusDto = new CreatorAndOpenStatusDto();
		creatorAndOpenStatusDto.setEnqueteId(4);
		creatorAndOpenStatusDto.setEnqueteState("一時保存");
		creatorAndOpenStatusDto.setEnqueteName("健康診断");
		when(mockedCreatorAndOpenStatusDtoDao.selectById(4)).thenReturn(creatorAndOpenStatusDto);

		// テスト対象クラスのメソッドを実行し、返り値を受け取る
		MenuManagementVM actual = new MenuManagementVM();
		actual = menuService.getManagementEnqueteList("li9010");

		// CreatorAndOpenStatusDtoからアンケートID、タイトル、実施状態を取得する
		List<CreatorAndOpenStatusDto> creatorAndOpenStatusDtoList = new ArrayList<CreatorAndOpenStatusDto>();
		creatorAndOpenStatusDtoList = actual.getCreatorAndOpenStatusDtoList();

		CreatorAndOpenStatusDto creatorAndOpenStatusDto1 = new CreatorAndOpenStatusDto();

		creatorAndOpenStatusDto1 = creatorAndOpenStatusDtoList.get(0);

		enqueteId = creatorAndOpenStatusDto1.getEnqueteId();
		enqueteName = creatorAndOpenStatusDto1.getEnqueteName();
		enqueteState = creatorAndOpenStatusDto1.getEnqueteState();

		// 値の比較検証を行う。ここではactualがと等しいことを検証している
		assertThat(enqueteId, is(4));
		assertThat(enqueteName, is("健康診断"));
		assertThat(enqueteState, is("一時保存"));

	}

	/**
	 * ESQ_IDがli9010のログインユーザー ,Dept_IDは1 回答対象のアンケートIDは1と2
	 * アンケートIDが1のものは未回答、2のものはアンケート回答IDが1
	 * アンケートIDが1のものは"CIT万歳アンケート"、2のものは"CITマンセーアンケート"
	 */
	@Test
	public void アンケートIDとESQIDをもとにMenuAnswerVMクラスのオブジェクトを返す() {
		// ■参照系
		// ここではselectByIdメソッドにli9010が渡されたら、esqUserを返すようにしている
		EsqUser esqUser = new EsqUser();
		esqUser.setDeptId(1);
		when(mockedEsqUserDao.selectById("li9010")).thenReturn(esqUser);
		// ■参照系
		// モックオブジェクトのselectByDeptIdメソッドが呼ばれた時に返す値をセットする
		// ここではselectByIdメソッドに1が渡されたら、enqueteDeptListを返すようにしている
		List<CreatorAndAnswerStatusDto> creatorAndAnswerStatusDtoList1 = new ArrayList<CreatorAndAnswerStatusDto>();
		CreatorAndAnswerStatusDto creatorAndAnswerStatusDto1 = new CreatorAndAnswerStatusDto();
		creatorAndAnswerStatusDto1.setEnqueteName("CIT万歳アンケート");
		creatorAndAnswerStatusDto1.setEnqueteId(1);
		creatorAndAnswerStatusDtoList1.add(creatorAndAnswerStatusDto1);

		CreatorAndAnswerStatusDto creatorAndAnswerStatusDto2 = new CreatorAndAnswerStatusDto();
		creatorAndAnswerStatusDto2.setEnqueteName("CITマンセーアンケート");
		creatorAndAnswerStatusDto2.setEnqueteId(2);
		creatorAndAnswerStatusDto2.setEnqueteAnswerId(1);
		creatorAndAnswerStatusDtoList1.add(creatorAndAnswerStatusDto2);

		when(mockedCreatorAndAnswerStatusDtoDao.selectById(1, "li9010")).thenReturn(creatorAndAnswerStatusDtoList1);

		// テスト対象クラスのメソッドを実行し、返り値を受け取る
		MenuAnswerVM menuAnswerVM = menuService.getAnswerEnqueteList("li9010");
		List<CreatorAndAnswerStatusDto> creatorAndAnswerStatusDtoList2 = menuAnswerVM.getCreatorAndAnswerStatusList();
		CreatorAndAnswerStatusDto creatorAndAnswerStatusDto3 = creatorAndAnswerStatusDtoList2.get(0);
		String enqueteName = creatorAndAnswerStatusDto3.getEnqueteName();
		int enqueteId = creatorAndAnswerStatusDto3.getEnqueteId();

		CreatorAndAnswerStatusDto creatorAndAnswerStatusDto4 = creatorAndAnswerStatusDtoList2.get(1);
		String enqueteName2 = creatorAndAnswerStatusDto4.getEnqueteName();
		int enqueteId2 = creatorAndAnswerStatusDto4.getEnqueteId();
		int enqueteAnswerId2 = creatorAndAnswerStatusDto4.getEnqueteAnswerId();

		// 値の比較検証を行う。ここではactualがと等しいことを検証している
		assertThat(enqueteName, is("CIT万歳アンケート"));
		assertThat(enqueteId, is(1));

		// 値の比較検証を行う。ここではactualがと等しいことを検証している
		assertThat(enqueteName2, is("CITマンセーアンケート"));
		assertThat(enqueteId2, is(2));
		assertThat(enqueteAnswerId2, is(1));
	}

	@Test
	public void アンケートを削除できる() {
		// モックオブジェクトのselectByIdメソッドが呼ばれた時に返す値をセットする
		// ここではselectByIdメソッドに4が渡されたら、enqueteを返すようにしている
		Enquete enquete = new Enquete();
		enquete.setEnqueteId(4);
		when(mockedEnqueteDao.selectById(4)).thenReturn(enquete);

		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Enquete> enqueteCaptor = ArgumentCaptor.forClass(Enquete.class);
		// モックオブジェクトのdeleteメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedEnqueteDao.delete(enqueteCaptor.capture())).thenReturn(1);

		// モックオブジェクトのselectByIdメソッドが呼ばれた時に返す値をセットする
		// ここではselectByIdメソッドに4が渡されたら、questionListを返すようにしている
		List<Question> questionList = new ArrayList<Question>();
		Question question = new Question();
		question.setQuestionId(5);
		questionList.add(question);
		when(mockedQuestionDao.selectByEnqueteId(4)).thenReturn(questionList);

		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Integer> enqueteId1 = ArgumentCaptor.forClass(Integer.class);
		// モックオブジェクトのdeleteメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedQuestionDao.deleteByEnqueteId(enqueteId1.capture())).thenReturn(1);

		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Integer> questionId = ArgumentCaptor.forClass(Integer.class);
		// モックオブジェクトのdeleteメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedChoiceDao.deleteByQuestionId(questionId.capture())).thenReturn(1);

		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Integer> enqueteId2 = ArgumentCaptor.forClass(Integer.class);
		// モックオブジェクトのdeleteメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedEnqueteAdminUserDao.delete(enqueteId2.capture())).thenReturn(1);

		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Integer> enqueteId3 = ArgumentCaptor.forClass(Integer.class);
		// モックオブジェクトのdeleteメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedEnqueteDeptDao.deleteByEnqueteId(enqueteId3.capture())).thenReturn(1);

		// テスト対象クラスのメソッドを実行し、返り値を受け取る
		menuService.deleteEnquete(4);

		// キャプチャしたenqueteCaptorオブジェクトを受け取る
		final Enquete captoredEnquete = enqueteCaptor.getValue();

		// キャプチャしたenqueteCaptorオブジェクトを受け取る
		final Integer captoredEnqueteId1 = enqueteId1.getValue();

		// キャプチャしたenqueteCaptorオブジェクトを受け取る
		final Integer captoredQuestionId = questionId.getValue();

		// キャプチャしたenqueteCaptorオブジェクトを受け取る
		final Integer captoredEnqueteId2 = enqueteId1.getValue();

		// キャプチャしたenqueteCaptorオブジェクトを受け取る
		final Integer captoredEnqueteId3 = enqueteId1.getValue();

		// キャプチャ値を検証する
		assertThat(captoredEnquete.getEnqueteId(), is(4));
		// キャプチャ値を検証する
		assertThat(captoredEnqueteId1, is(4));
		// キャプチャ値を検証する
		assertThat(captoredQuestionId, is(5));
		// キャプチャ値を検証する
		assertThat(captoredEnqueteId2, is(4));
		// キャプチャ値を検証する
		assertThat(captoredEnqueteId3, is(4));

	}

	@Test
	public void ステータスが作成完了のアンケートを回答受付に変更できる() {
		// モックオブジェクトのselectByIdメソッドが呼ばれた時に返す値をセットする
		// ここではselectByIdメソッドに4が渡されたら、enqueteを返すようにしている
		Enquete enquete = new Enquete();
		enquete.setEnqueteId(4);
		enquete.setEnqueteStateId(2);
		when(mockedEnqueteDao.selectById(4)).thenReturn(enquete);

		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Enquete> enqueteCaptor = ArgumentCaptor.forClass(Enquete.class);
		// モックオブジェクトのdeleteメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedEnqueteDao.update(enqueteCaptor.capture())).thenReturn(1);

		// テスト対象クラスのメソッドを実行し、返り値を受け取る
		menuService.startEnquete(4);

		// キャプチャしたenqueteCaptorオブジェクトを受け取る
		final Enquete captoredEnquete = enqueteCaptor.getValue();

		current = new Date();
		// キャプチャ値を検証する
		assertThat(captoredEnquete.getEnqueteStateId(), is(3));
		assertThat(captoredEnquete.getStartDate(), is(current));
	}

	@Test
	public void ステータスが回答受付のアンケートを回答終了に変更できる() {
		// モックオブジェクトのselectByIdメソッドが呼ばれた時に返す値をセットする
		// ここではselectByIdメソッドに4が渡されたら、enqueteを返すようにしている
		Enquete enquete = new Enquete();
		enquete.setEnqueteId(4);
		enquete.setEnqueteStateId(3);
		when(mockedEnqueteDao.selectById(4)).thenReturn(enquete);

		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Enquete> enqueteCaptor = ArgumentCaptor.forClass(Enquete.class);
		// モックオブジェクトのdeleteメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedEnqueteDao.update(enqueteCaptor.capture())).thenReturn(1);

		// テスト対象クラスのメソッドを実行し、返り値を受け取る
		menuService.finishEnquete(4);

		// キャプチャしたenqueteCaptorオブジェクトを受け取る
		final Enquete captoredEnquete = enqueteCaptor.getValue();

		current = new Date();
		// キャプチャ値を検証する
		assertThat(captoredEnquete.getEnqueteStateId(), is(4));
		assertThat(captoredEnquete.getFinishDate(), is(current));

	}

}
