//パッケージ名はテスト対象クラスと同じにする
//ただしテストクラスはsrc/test/javaに作成する
package jp.co.isid.cit.EnqueteService;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import jp.co.isid.cit.dao.ChoiceDao;
import jp.co.isid.cit.dao.CreatorDtoDao;
import jp.co.isid.cit.dao.DeptDao;
import jp.co.isid.cit.dao.EnqueteAdminDtoDao;
import jp.co.isid.cit.dao.EnqueteAdminUserDao;
import jp.co.isid.cit.dao.EnqueteDao;
import jp.co.isid.cit.dao.EnqueteDeptDao;
import jp.co.isid.cit.dao.EnqueteDeptDtoDao;
import jp.co.isid.cit.dao.QuestionDao;
import jp.co.isid.cit.dao.QuestionDtoDao;
import jp.co.isid.cit.dao.QuestionTypeDao;
import jp.co.isid.cit.dao.UserDeptDtoDao;
import jp.co.isid.cit.dto.UserDeptDto;
import jp.co.isid.cit.entity.Choice;
import jp.co.isid.cit.entity.Enquete;
import jp.co.isid.cit.entity.EnqueteAdminUser;
import jp.co.isid.cit.entity.EnqueteDept;
import jp.co.isid.cit.entity.Question;
import jp.co.isid.cit.form.ChoiceForm;
import jp.co.isid.cit.form.EnqueteAdminSearchUserForm;
import jp.co.isid.cit.form.EnqueteAdminUserForm;
import jp.co.isid.cit.form.EnqueteCreateForm;
import jp.co.isid.cit.form.EnqueteDeptForm;
import jp.co.isid.cit.form.EnqueteForm;
import jp.co.isid.cit.form.QuestionForm;
import jp.co.isid.cit.model.EnqueteConfigPreviewVM;
import jp.co.isid.cit.model.EnqueteConfigVM;
import jp.co.isid.cit.model.EnqueteManagementConfigVM;
import jp.co.isid.cit.model.EnqueteManagementSearchUserVM;
import jp.co.isid.cit.service.EnqueteService;

@RunWith(JUnit4.class)
public class EnqueteServiceTest { // テストクラス名は「テスト対象クラス名+Test」とする

	// テスト対象クラスが呼び出す外部のオブジェクトをモックにする
	@Mock
	private EnqueteDao mockedEnqueteDao;
	@Mock
	private QuestionDao mockedQuestionDao;
	@Mock
	private ChoiceDao mockedChoiceDao;
	@Mock
	private DeptDao mockedDeptDao;
	@Mock
	private EnqueteDeptDao mockedEnqueteDeptDao;
	@Mock
	private QuestionTypeDao mockedQuestionTypeDao;
	@Mock
	private EnqueteAdminUserDao mockedEnqueteAdminUserDao;
	@Mock
	private EnqueteAdminDtoDao mockedEnqueteAdminDtoDao;
	@Mock
	private CreatorDtoDao mockedCreatorDtoDao;
	@Mock
	private QuestionDtoDao mockedQuestionDtoDao;
	@Mock
	private EnqueteCreateForm mockedEnqueteCreateForm;
	@Mock
	private EnqueteConfigPreviewVM mockedEnqueteConfigPreviewVM;
	@Mock
	private EnqueteConfigVM mockedEnqueteConfigVM;
	@Mock
	private EnqueteDeptDtoDao mockedEnqueteDeptDtoDao;
	@Mock
	private UserDeptDtoDao mockedUserDeptDtoDao;

	// テスト対象のサービスクラスに@InjectMocksをつけて宣言する
	@InjectMocks
	private EnqueteService enqueteService;

	// モックオブジェクトをテスト対象クラスにインジェクションする
	@Before
	public void setupMock() {
		initMocks(this);
	}

	@Test
	public void 新規作成したアンケートのアンケート名を登録できる() {
		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Enquete> enqueteCaptor = ArgumentCaptor.forClass(Enquete.class);

		// モックオブジェクトのメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedEnqueteDao.insert(enqueteCaptor.capture())).thenReturn(1);
		when(mockedEnqueteDao.selectLastInsert()).thenReturn(1);

		// テスト対象クラスのメソッドを実行する
		EnqueteCreateForm enqueteCreateForm = new EnqueteCreateForm();
		// アンケートフォームの設定
		EnqueteForm enqueteForm = new EnqueteForm();
		enqueteForm.setEnqueteName("CIT事業部に関するアンケート");
		// アンケート管理者フォームリストの設定
		ArrayList<EnqueteAdminUserForm> enqueteAdminUserFormList = new ArrayList<EnqueteAdminUserForm>();
		// アンケート対象事業部フォームリストの設定
		ArrayList<EnqueteDeptForm> enqueteDeptFormList = new ArrayList<EnqueteDeptForm>();
		// 質問フォームリストと選択肢フォームリストの設定
		ArrayList<QuestionForm> questionFormList = new ArrayList<QuestionForm>();
		// EnqueteCreateFormに作成したフォームを設定していく
		enqueteCreateForm.setEnqueteForm(enqueteForm);
		enqueteCreateForm.setEnqueteAdminUserFormList(enqueteAdminUserFormList);
		enqueteCreateForm.setEnqueteDeptFormList(enqueteDeptFormList);
		enqueteCreateForm.setQuestionFormList(questionFormList);
		// サービスを呼び出す
		boolean result = enqueteService.addEnquete(enqueteCreateForm);

		// キャプチャしたオブジェクトを受け取る
		final Enquete captoredEnquete = enqueteCaptor.getValue();

		// キャプチャ値を検証する
		// assertThat(captoredEnquete.getEnqueteId(), is(1));
		assertThat(captoredEnquete.getEnqueteName(), is("CIT事業部に関するアンケート"));
		// テスト対象メソッドの返り値も一緒に検証するのが望ましい
		assertThat(result, is(true));

	}

	@Test
	public void 新規作成したアンケートの入力情報を登録できる() {
		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Enquete> enqueteCaptor = ArgumentCaptor.forClass(Enquete.class);
		final ArgumentCaptor<Question> questionCaptor = ArgumentCaptor.forClass(Question.class);
		final ArgumentCaptor<Choice> choiceCaptor = ArgumentCaptor.forClass(Choice.class);
		final ArgumentCaptor<EnqueteDept> enqueteDeptCaptor = ArgumentCaptor.forClass(EnqueteDept.class);
		final ArgumentCaptor<EnqueteAdminUser> enqueteAdminUserCaptor = ArgumentCaptor.forClass(EnqueteAdminUser.class);

		// モックオブジェクトのメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedEnqueteDao.insert(enqueteCaptor.capture())).thenReturn(1);
		when(mockedEnqueteDao.selectLastInsert()).thenReturn(1);
		when(mockedEnqueteAdminUserDao.insert(enqueteAdminUserCaptor.capture())).thenReturn(1);
		when(mockedEnqueteDeptDao.insert(enqueteDeptCaptor.capture())).thenReturn(1);
		when(mockedQuestionDao.insert(questionCaptor.capture())).thenReturn(1);
		when(mockedQuestionDao.selectLastInsert()).thenReturn(1);
		when(mockedChoiceDao.insert(choiceCaptor.capture())).thenReturn(1);

		// テスト対象クラスのメソッドを実行する
		EnqueteCreateForm enqueteCreateForm = new EnqueteCreateForm();
		// アンケートフォームの設定
		EnqueteForm enqueteForm = new EnqueteForm();
		enqueteForm.setEnqueteName("CIT事業部に関するアンケート");
		enqueteForm.setCreateUserId("li9010");
		enqueteForm.setEnqueteSubtext("CITの方のみ");
		// アンケート管理者フォームリストの設定
		ArrayList<EnqueteAdminUserForm> enqueteAdminUserFormList = new ArrayList<EnqueteAdminUserForm>();
		EnqueteAdminUserForm enqueteAdminUserForm = new EnqueteAdminUserForm();
		// enqueteAdminUserForm.setEnqueteId(null);
		enqueteAdminUserForm.setEsqId("li9010");
		enqueteAdminUserFormList.add(enqueteAdminUserForm);
		// アンケート対象事業部フォームリストの設定
		ArrayList<EnqueteDeptForm> enqueteDeptFormList = new ArrayList<EnqueteDeptForm>();
		EnqueteDeptForm enqueteDeptForm = new EnqueteDeptForm();
		enqueteDeptForm.setEnqueteid(null);
		enqueteDeptForm.setDeptId(11);
		enqueteDeptFormList.add(enqueteDeptForm);
		// 質問フォームリストと選択肢フォームリストの設定
		ArrayList<QuestionForm> questionFormList = new ArrayList<QuestionForm>();
		QuestionForm questionForm = new QuestionForm();
		questionForm.setQuestionTypeId(1);
		questionForm.setRequireFlag(1);
		questionForm.setQuestionText("事業部旅行に参加しますか");
		questionForm.setQuestionSubtext("必ず回答してください");
		ArrayList<ChoiceForm> choiceFormList = new ArrayList<ChoiceForm>();
		ChoiceForm choiceForm = new ChoiceForm();
		choiceForm.setChoiceText("参加する");
		choiceFormList.add(choiceForm);
		questionForm.setChoiceFormList(choiceFormList);
		questionFormList.add(questionForm);
		// EnqueteCreateFormに作成したフォームを設定していく
		enqueteCreateForm.setEnqueteForm(enqueteForm);
		enqueteCreateForm.setEnqueteAdminUserFormList(enqueteAdminUserFormList);
		enqueteCreateForm.setEnqueteDeptFormList(enqueteDeptFormList);
		enqueteCreateForm.setQuestionFormList(questionFormList);
		// サービスを呼び出す
		boolean result = enqueteService.addEnquete(enqueteCreateForm);

		// キャプチャしたオブジェクトを受け取る
		final Enquete captoredEnquete = enqueteCaptor.getValue();
		final Question captoredQuestion = questionCaptor.getValue();
		final Choice captoredChoice = choiceCaptor.getValue();
		final EnqueteDept captoredEnqueteDept = enqueteDeptCaptor.getValue();
		final EnqueteAdminUser captoredEnqueteAdminUser = enqueteAdminUserCaptor.getValue();

		// キャプチャ値を検証する
		assertThat(captoredEnquete.getEnqueteName(), is("CIT事業部に関するアンケート"));
		assertThat(captoredEnquete.getCreateUserId(), is("li9010"));
		assertThat(captoredEnquete.getEnqueteSubtext(), is("CITの方のみ"));
		assertThat(captoredQuestion.getQuestionTypeId(), is(1));
		assertThat(captoredQuestion.getRequireFlag(), is(1));
		assertThat(captoredQuestion.getQuestionSubtext(), is("必ず回答してください"));
		assertThat(captoredChoice.getChoiceText(), is("参加する"));
		assertThat(captoredEnqueteDept.getDeptId(), is(11));
		assertThat(captoredEnqueteAdminUser.getEsqId(), is("li9010"));

		// テスト対象メソッドの返り値も一緒に検証するのが望ましい
		assertThat(result, is(true));

	}

	@Test
	public void 編集したアンケートのアンケート名を登録できる() { // テストメソッド名はわかりやすい日本語で書く
		// キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
		final ArgumentCaptor<Enquete> enqueteCaptor = ArgumentCaptor.forClass(Enquete.class);

		// モックオブジェクトのメソッドを呼んだ時に引数をキャプチャするようにする
		when(mockedEnqueteDao.update(enqueteCaptor.capture())).thenReturn(1);

		// テスト対象クラスのメソッドを実行する
		EnqueteCreateForm enqueteCreateForm = new EnqueteCreateForm();
		// アンケートフォームの設定
		EnqueteForm enqueteForm = new EnqueteForm();
		enqueteForm.setEnqueteName("CIT事業部に関するアンケート");
		// アンケート管理者フォームリストの設定
		ArrayList<EnqueteAdminUserForm> enqueteAdminUserFormList = new ArrayList<EnqueteAdminUserForm>();
		// アンケート対象事業部フォームリストの設定
		ArrayList<EnqueteDeptForm> enqueteDeptFormList = new ArrayList<EnqueteDeptForm>();
		// 質問フォームリストと選択肢フォームリストの設定
		ArrayList<QuestionForm> questionFormList = new ArrayList<QuestionForm>();
		// EnqueteCreateFormに作成したフォームを設定していく
		enqueteCreateForm.setEnqueteId(1);
		enqueteCreateForm.setEnqueteForm(enqueteForm);
		enqueteCreateForm.setEnqueteAdminUserFormList(enqueteAdminUserFormList);
		enqueteCreateForm.setEnqueteDeptFormList(enqueteDeptFormList);
		enqueteCreateForm.setQuestionFormList(questionFormList);
		// サービスを呼び出す
		enqueteService.updateEnquete(enqueteCreateForm);

		// キャプチャしたオブジェクトを受け取る
		final Enquete captoredEnquete = enqueteCaptor.getValue();

		// キャプチャ値を検証する
		assertThat(captoredEnquete.getEnqueteName(), is("CIT事業部に関するアンケート"));
	}

	// @Test
	// public void 編集したアンケートの入力情報を登録できる() {
	// // キャプチャ対象のオブジェクトの型を使ってArgumentCaptorを宣言する
	// // モックオブジェクトのメソッドを呼んだ時に引数をキャプチャするようにする
	// // アンケートテーブルの更新
	// final ArgumentCaptor<Enquete> enqueteCaptor =
	// ArgumentCaptor.forClass(Enquete.class);
	// when(mockedEnqueteDao.update(enqueteCaptor.capture())).thenReturn(1);
	// // アンケート管理者の更新
	// final ArgumentCaptor<Integer> enqueteIdCaptor1 =
	// ArgumentCaptor.forClass(Integer.class);
	// final ArgumentCaptor<EnqueteAdminUser> enqueteAdminUserCaptor1 =
	// ArgumentCaptor
	// .forClass(EnqueteAdminUser.class);
	// final ArgumentCaptor<EnqueteAdminUser> enqueteAdminUserCaptor2 =
	// ArgumentCaptor
	// .forClass(EnqueteAdminUser.class);
	// when(mockedEnqueteAdminUserDao.updateDeleteFlag(enqueteIdCaptor1.capture())).thenReturn(1);
	// when(mockedEnqueteAdminUserDao.update(enqueteAdminUserCaptor1.capture())).thenReturn(1);
	// when(mockedEnqueteAdminUserDao.insert(enqueteAdminUserCaptor2.capture())).thenReturn(1);
	// // アンケート対象事業部の更新
	// final ArgumentCaptor<Integer> enqueteIdCaptor2 =
	// ArgumentCaptor.forClass(Integer.class);
	// final ArgumentCaptor<EnqueteDept> enqueteDeptCaptor =
	// ArgumentCaptor.forClass(EnqueteDept.class);
	// when(mockedEnqueteDeptDao.deleteByEnqueteId(enqueteIdCaptor2.capture())).thenReturn(1);
	// when(mockedEnqueteDeptDao.insert(enqueteDeptCaptor.capture())).thenReturn(1);
	// // 更新前の質問の取得
	// final ArgumentCaptor<Integer> enqueteIdCaptor3 =
	// ArgumentCaptor.forClass(Integer.class);
	// ArrayList<Question> qList = new ArrayList<Question>();
	// Question q1 = new Question();
	// q1.setQuestionId(1);
	// qList.add(q1);
	// Question q2 = new Question();
	// q2.setQuestionId(2);
	// qList.add(q2);
	// when(mockedQuestionDao.selectByEnqueteId(enqueteIdCaptor3.capture())).thenReturn(qList);
	// // 質問の更新
	// final ArgumentCaptor<Question> questionCaptor1 =
	// ArgumentCaptor.forClass(Question.class);
	// final ArgumentCaptor<Question> questionCaptor2 =
	// ArgumentCaptor.forClass(Question.class);
	// when(mockedQuestionDao.insert(questionCaptor1.capture())).thenReturn(1);
	// when(mockedQuestionDao.selectLastInsert()).thenReturn(1);
	// when(mockedQuestionDao.update(questionCaptor2.capture())).thenReturn(1);
	// // 更新前の選択肢の取得
	// // 質問1の選択肢
	// final ArgumentCaptor<Integer> questionIdCaptor1 =
	// ArgumentCaptor.forClass(Integer.class);
	// ArrayList<Choice> cList1 = new ArrayList<Choice>();
	// Choice c1_1 = new Choice();
	// c1_1.setChoiceId(1);
	// c1_1.setQuestionId(1);
	// cList1.add(c1_1);
	// Choice c1_2 = new Choice();
	// c1_2.setChoiceId(2);
	// c1_2.setQuestionId(1);
	// cList1.add(c1_2);
	// when(mockedChoiceDao.selectByQuestionId(questionIdCaptor1.capture())).thenReturn(cList1);
	// // 質問2の選択肢
	// final ArgumentCaptor<Integer> questionIdCaptor2 =
	// ArgumentCaptor.forClass(Integer.class);
	// ArrayList<Choice> cList2 = new ArrayList<Choice>();
	// Choice c2_1 = new Choice();
	// c2_1.setChoiceId(3);
	// c2_1.setQuestionId(2);
	// cList1.add(c2_1);
	// when(mockedChoiceDao.selectByQuestionId(questionIdCaptor2.capture())).thenReturn(cList2);
	// // 選択肢の更新
	// final ArgumentCaptor<Choice> choiceCaptor1 =
	// ArgumentCaptor.forClass(Choice.class);
	// final ArgumentCaptor<Choice> choiceCaptor2 =
	// ArgumentCaptor.forClass(Choice.class);
	// when(mockedChoiceDao.insert(choiceCaptor1.capture())).thenReturn(1);
	// when(mockedChoiceDao.update(choiceCaptor2.capture())).thenReturn(1);
	// // 選択肢の削除
	// final ArgumentCaptor<Choice> choiceCaptor3 =
	// ArgumentCaptor.forClass(Choice.class);
	// when(mockedChoiceDao.delete(choiceCaptor3.capture())).thenReturn(2);
	// // 質問の削除
	// final ArgumentCaptor<Question> questionCaptor3 =
	// ArgumentCaptor.forClass(Question.class);
	// final ArgumentCaptor<Integer> questionIdCaptor3 =
	// ArgumentCaptor.forClass(Integer.class);
	// when(mockedChoiceDao.deleteByQuestionId(questionIdCaptor3.capture())).thenReturn(1);
	// when(mockedQuestionDao.delete(questionCaptor3.capture())).thenReturn(1);
	//
	// // テスト対象クラスのメソッドを実行する
	// EnqueteCreateForm enqueteCreateForm = new EnqueteCreateForm();
	// // アンケートフォームの設定
	// EnqueteForm enqueteForm = new EnqueteForm();
	// enqueteForm.setEnqueteName("CIT事業部に関するアンケート");
	// enqueteForm.setCreateUserId("li9010");
	// enqueteForm.setEnqueteSubtext("CITの方のみ");
	// // アンケート管理者フォームリストの設定
	// ArrayList<EnqueteAdminUserForm> enqueteAdminUserFormList = new
	// ArrayList<EnqueteAdminUserForm>();
	// EnqueteAdminUserForm enqueteAdminUserForm = new EnqueteAdminUserForm();
	// // enqueteAdminUserForm.setEnqueteId(1);
	// enqueteAdminUserForm.setEsqId("li9010");
	// enqueteAdminUserFormList.add(enqueteAdminUserForm);
	// // アンケート対象事業部フォームリストの設定
	// ArrayList<EnqueteDeptForm> enqueteDeptFormList = new
	// ArrayList<EnqueteDeptForm>();
	// EnqueteDeptForm enqueteDeptForm = new EnqueteDeptForm();
	// enqueteDeptForm.setEnqueteid(1);
	// enqueteDeptForm.setDeptId(11);
	// enqueteDeptFormList.add(enqueteDeptForm);
	// // 質問フォームリストと選択肢フォームリストの設定
	// ArrayList<QuestionForm> questionFormList = new ArrayList<QuestionForm>();
	// // 質問1を設定
	// QuestionForm questionForm1 = new QuestionForm();
	// // questionForm1.setQuestionId(0);
	// questionForm1.setQuestionTypeId(1);
	// questionForm1.setRequireFlag(1);
	// questionForm1.setQuestionText("事業部旅行に参加しますか");
	// questionForm1.setQuestionSubtext("必ず回答してください");
	// ArrayList<ChoiceForm> choiceFormList1 = new ArrayList<ChoiceForm>();
	// ChoiceForm choiceForm1 = new ChoiceForm();
	// // choiceForm1.setChoiceId(0);
	// choiceForm1.setChoiceText("参加する");
	// choiceFormList1.add(choiceForm1);
	// questionForm1.setChoiceFormList(choiceFormList1);
	// questionFormList.add(questionForm1);
	// // 質問2を設定
	// QuestionForm questionForm2 = new QuestionForm();
	// questionForm2.setQuestionId(1);
	// questionForm2.setQuestionTypeId(1);
	// questionForm2.setRequireFlag(1);
	// questionForm2.setQuestionText("事業部旅行に参加しますか");
	// questionForm2.setQuestionSubtext("必ず回答してください");
	// ArrayList<ChoiceForm> choiceFormList2 = new ArrayList<ChoiceForm>();
	// ChoiceForm choiceForm2 = new ChoiceForm();
	// choiceForm2.setChoiceId(1);
	// choiceForm2.setChoiceText("参加する");
	// choiceFormList2.add(choiceForm2);
	// questionForm2.setChoiceFormList(choiceFormList2);
	// questionFormList.add(questionForm2);
	// // EnqueteCreateFormに作成したフォームを設定していく
	// enqueteCreateForm.setEnqueteId(1);
	// enqueteCreateForm.setEnqueteForm(enqueteForm);
	// enqueteCreateForm.setEnqueteAdminUserFormList(enqueteAdminUserFormList);
	// enqueteCreateForm.setEnqueteDeptFormList(enqueteDeptFormList);
	// enqueteCreateForm.setQuestionFormList(questionFormList);
	// // サービスを呼び出す
	// enqueteService.updateEnquete(enqueteCreateForm);
	//
	// // キャプチャしたオブジェクトを受け取る
	// // アンケートを更新
	// final Enquete captoredEnquete = enqueteCaptor.getValue();
	// // アンケート管理者を更新
	// final Integer captoredEnqueteId1 = enqueteIdCaptor1.getValue();
	// final EnqueteAdminUser captoredEnqueteAdminUser1 =
	// enqueteAdminUserCaptor1.getValue();
	// final EnqueteAdminUser captoredEnqueteAdminUser2 =
	// enqueteAdminUserCaptor2.getValue();
	// // アンケート対象事業部を更新
	// final Integer captoredEnqueteId2 = enqueteIdCaptor2.getValue();
	// final EnqueteDept captoredEnqueteDept = enqueteDeptCaptor.getValue();
	// // 更新前の質問を取得
	// final Integer captoredEnqueteId3 = enqueteIdCaptor3.getValue();
	// // 質問の更新
	// final Question captoredQuestion1 = questionCaptor1.getValue();
	// final Question captoredQuestion2 = questionCaptor2.getValue();
	// // 更新前の選択肢の取得
	// final Integer captoredQuestionId1 = questionIdCaptor1.getValue();
	// final Integer captoredQuestionId2 = questionIdCaptor2.getValue();
	// // 選択肢の更新
	// final Choice captoredChoice1 = choiceCaptor1.getValue();
	// final Choice captoredChoice2 = choiceCaptor2.getValue();
	// // 選択肢の削除
	// final Choice captoredChoice3 = choiceCaptor3.getValue();
	// // 質問の削除
	// final Question captoredQuestion3 = questionCaptor3.getValue();
	// final Integer captoredQuestionId3 = questionIdCaptor3.getValue();
	//
	// // キャプチャ値を検証する
	// // アンケート
	// assertThat(captoredEnquete.getEnqueteName(), is("CIT事業部に関するアンケート"));
	// assertThat(captoredEnquete.getCreateUserId(), is("li9010"));
	// assertThat(captoredEnquete.getEnqueteSubtext(), is("CITの方のみ"));
	// // アンケート管理者
	// assertThat(captoredEnqueteId1, is(1));
	// assertThat(captoredEnqueteAdminUser1.getEsqId(), is("li9010"));
	// assertThat(captoredEnqueteAdminUser2.getEsqId(), is("li9010"));
	// // アンケート対象事業部
	// assertThat(captoredEnqueteId2, is(1));
	// assertThat(captoredEnqueteDept.getDeptId(), is(11));
	// // 質問
	// assertThat(captoredEnqueteId3, is(1));
	// // 質問1
	// assertThat(captoredQuestion1.getQuestionTypeId(), is(1));
	// assertThat(captoredQuestion1.getRequireFlag(), is(1));
	// assertThat(captoredQuestion1.getQuestionSubtext(), is("必ず回答してください"));
	// assertThat(captoredQuestionId1, is(1));
	// assertThat(captoredChoice1.getChoiceText(), is("参加する"));
	// // 質問2
	// assertThat(captoredQuestion2.getQuestionId(), is(1));
	// assertThat(captoredQuestion2.getQuestionTypeId(), is(1));
	// assertThat(captoredQuestion2.getRequireFlag(), is(1));
	// assertThat(captoredQuestion2.getQuestionSubtext(), is("必ず回答してください"));
	// assertThat(captoredQuestionId2, is(1));
	// assertThat(captoredChoice2.getChoiceId(), is(1));
	// assertThat(captoredChoice2.getChoiceText(), is("参加する"));
	// // 設問の削除
	// assertThat(captoredChoice3.getChoiceId(), is(2));
	// // 質問2の削除
	// assertThat(captoredQuestionId3, is(2));
	// assertThat(captoredQuestion3.getQuestionId(), is(2));
	// }
	//
	// @Test
	// public void アンケートの内容を参照する() { //テストメソッド名はわかりやすい日本語で書く
	//
	// CreatorDto creatorDto = new CreatorDto();
	// creatorDto.setUserName("山田太郎");
	//
	// ArrayList<EnqueteDeptDto> enqueteDeptDtoList = new
	// ArrayList<EnqueteDeptDto>();
	// EnqueteDeptDto enqueteDeptDto = new EnqueteDeptDto();
	// enqueteDeptDto.setDeptName("技術本部");
	// enqueteDeptDtoList.add(enqueteDeptDto);
	//
	// ArrayList<EnqueteAdminDto> enqueteAdminDtoList = new
	// ArrayList<EnqueteAdminDto>();
	// EnqueteAdminDto enqueteAdminDto = new EnqueteAdminDto();
	// enqueteAdminDto.setEnqueteId(1);
	// enqueteAdminDtoList.add(enqueteAdminDto);
	//
	// ArrayList<QuestionDto> questionDtoList = new ArrayList<QuestionDto>();
	// QuestionDto questionDto = new QuestionDto();
	// questionDto.setQuestionText("朝食を食べていますか。");
	// questionDto.setQuestionId(1);
	// questionDtoList.add(questionDto);
	//
	// ArrayList<Choice> choiceList = new ArrayList<Choice>();
	// Choice choice = new Choice();
	// choice.setChoiceText("ほぼ毎日食べている");
	// choiceList.add(choice);
	//
	// //モックオブジェクトのメソッドが呼ばれた時に返す値をセットする
	// when(mockedCreatorDtoDao.selectById(1)).thenReturn(creatorDto);
	// when(mockedEnqueteDeptDtoDao.selectById(1)).thenReturn(enqueteDeptDtoList);
	// when(mockedEnqueteAdminDtoDao.selectById(1)).thenReturn(enqueteAdminDtoList);
	// when(mockedQuestionDtoDao.selectByEnqueteId(1)).thenReturn(questionDtoList);
	// when(mockedChoiceDao.selectByQuestionId(1)).thenReturn(choiceList);
	//
	// //テスト対象クラスのメソッドを実行し、返り値を受け取る //値の比較検証を行う
	// EnqueteConfigPreviewVM actual =
	// enqueteService.getEnqueteConfigPreview(1);
	//
	// //値の比較検証を行う
	// String deptName = null;
	// for(EnqueteDeptDto dto:actual.getEnqueteDeptDtoList()){
	// deptName = dto.getDeptName();
	// }
	//
	// int enqueteId = 0;
	// for(EnqueteAdminDto dto:actual.getEnqueteAdminDtoLsit()){
	// enqueteId = dto.getEnqueteId();
	// }
	//
	// String questionText = null;
	// for(QuestionDto dto:actual.getQuestionDtoList()){
	// questionText = dto.getQuestionText();
	// }
	//
	// int questionId = 0;
	// for(QuestionDto dto:actual.getQuestionDtoList()){
	// questionId = dto.getQuestionId();
	// }
	//
	// String choiceText = null;
	// for(Choice dto:actual.getChoiceList()){
	// choiceText = dto.getChoiceText();
	// }
	//
	// assertThat(actual.getCreatorDto().getUserName(), is("山田太郎"));
	// assertThat(deptName, is("技術本部"));
	// assertThat(enqueteId, is(1));
	// assertThat(questionText, is("朝食を食べていますか。"));
	// assertThat(questionId, is(1));
	// assertThat(choiceText, is("ほぼ毎日食べている"));
	//
	// }
	//
	//
	// @Test
	// public void アンケート設問設定画面を参照する() { //テストメソッド名はわかりやすい日本語で書く
	//
	// ArrayList<Dept> deptList = new ArrayList<Dept>();
	// Dept dept = new Dept();
	// dept.setDeptName("技術本部");
	// deptList.add(dept);
	//
	//
	// ArrayList<QuestionType> questionTypeList = new ArrayList<QuestionType>();
	// QuestionType questionType = new QuestionType();
	// questionType.setQuestionType("単一選択");
	// questionTypeList.add(questionType);
	//
	// //モックオブジェクトのメソッドが呼ばれた時に返す値をセットする
	// when(mockedDeptDao.selectAll()).thenReturn(deptList);
	// when(mockedQuestionTypeDao.selectAll()).thenReturn(questionTypeList);
	//
	// //テスト対象クラスのメソッドを実行し、返り値を受け取る //値の比較検証を行う
	// EnqueteConfigVM actual = enqueteService.getEnqueteConfig();
	//
	// //値の比較検証を行う
	// String deptName = null;
	// for(Dept dto:actual.getDeptList()){
	// deptName = dto.getDeptName();
	// }
	//
	// String questionType1 = null;
	// for(QuestionType dto:actual.getQuestionTypeList()){
	// questionType1 = dto.getQuestionType();
	// }
	//
	// assertThat(deptName, is("技術本部"));
	// assertThat(questionType1, is("単一選択"));
	//
	// }
	//
	// @Test
	// public void 編集途中のアンケート設問設定画面を参照する() { //テストメソッド名はわかりやすい日本語で書く
	//
	// CreatorDto creatorDto = new CreatorDto();
	// creatorDto.setEnqueteName("2016年度 定期健診・人間ドック 受診前問診票");
	//
	// ArrayList<Dept> deptList = new ArrayList<Dept>();
	// Dept dept = new Dept();
	// dept.setDeptName("技術本部");
	// deptList.add(dept);
	//
	// ArrayList<EnqueteAdminDto> enqueteAdminDtoList = new
	// ArrayList<EnqueteAdminDto>();
	// EnqueteAdminDto enqueteAdminDto = new EnqueteAdminDto();
	// enqueteAdminDto.setEnqueteId(1);
	// enqueteAdminDtoList.add(enqueteAdminDto);
	//
	// ArrayList<QuestionDto> questionDtoList = new ArrayList<QuestionDto>();
	// QuestionDto questionDto = new QuestionDto();
	// questionDto.setQuestionText("朝食を食べていますか。");
	// questionDto.setQuestionId(1);
	// questionDtoList.add(questionDto);
	//
	// ArrayList<Choice> choiceList = new ArrayList<Choice>();
	// Choice choice = new Choice();
	// choice.setChoiceText("ほぼ毎日食べている");
	// choiceList.add(choice);
	//
	// ArrayList<QuestionType> questionTypeList = new ArrayList<QuestionType>();
	// QuestionType questionType = new QuestionType();
	// questionType.setQuestionType("単一選択");
	// questionTypeList.add(questionType);
	//
	// //モックオブジェクトのメソッドが呼ばれた時に返す値をセットする
	// when(mockedCreatorDtoDao.selectById(1)).thenReturn(creatorDto);
	// when(mockedDeptDao.selectAll()).thenReturn(deptList);
	// when(mockedEnqueteAdminDtoDao.selectById(1)).thenReturn(enqueteAdminDtoList);
	// when(mockedQuestionDtoDao.selectByEnqueteId(1)).thenReturn(questionDtoList);
	// when(mockedChoiceDao.selectByQuestionId(1)).thenReturn(choiceList);
	// when(mockedQuestionTypeDao.selectAll()).thenReturn(questionTypeList);
	//
	// //テスト対象クラスのメソッドを実行し、返り値を受け取る //値の比較検証を行う
	// EnqueteConfigVM actual = enqueteService.getEnqueteConfig(1);
	//
	// //値の比較検証を行う
	// String deptName = null;
	// for(Dept dto:actual.getDeptList()){
	// deptName = dto.getDeptName();
	// }
	//
	// int enqueteId = 0;
	// for(EnqueteAdminDto dto:actual.getEnqueteAdminDtoList()){
	// enqueteId = dto.getEnqueteId();
	// }
	//
	// String questionText = null;
	// for(QuestionDto dto:actual.getQuestionDtoList()){
	// questionText = dto.getQuestionText();
	// }
	//
	// int questionId = 0;
	// for(QuestionDto dto:actual.getQuestionDtoList()){
	// questionId = dto.getQuestionId();
	// }
	//
	// String choiceText = null;
	// for(Choice dto:actual.getChoice()){
	// choiceText = dto.getChoiceText();
	// }
	//
	// String questionType1 = null;
	// for(QuestionType dto:actual.getQuestionTypeList()){
	// questionType1 = dto.getQuestionType();
	// }
	//
	// assertThat(actual.getEnqueteName(), is("2016年度 定期健診・人間ドック 受診前問診票"));
	// assertThat(deptName, is("技術本部"));
	// assertThat(enqueteId, is(1));
	// assertThat(questionText, is("朝食を食べていますか。"));
	// assertThat(questionId, is(1));
	// assertThat(choiceText, is("ほぼ毎日食べている"));
	// assertThat(questionType1, is("単一選択"));
	//
	// }
	//
	@Test
	public void ユーザー情報をあいまい検索できる() {
		// ■参照系
		// モックオブジェクトのselectByDeptIdメソッドが呼ばれた時に返す値をセットする
		// ここではselectByIdメソッドに1が渡されたら、enqueteDeptListを返すようにしている
		List<UserDeptDto> userDeptDtoList = new ArrayList<UserDeptDto>();
		UserDeptDto userDeptDto = new UserDeptDto();
		userDeptDto.setUserName("上野");
		userDeptDtoList.add(userDeptDto);
		when(mockedUserDeptDtoDao.searchUser(null, "上野", 0)).thenReturn(userDeptDtoList);

		// テスト対象クラスのメソッドを実行し、返り値を受け取る
		EnqueteAdminSearchUserForm enqueteAdminSearchUserForm = new EnqueteAdminSearchUserForm();
		enqueteAdminSearchUserForm.setUserName("上野");
		EnqueteManagementSearchUserVM enqueteManagementSearchUserVM = enqueteService
				.searchUser(enqueteAdminSearchUserForm);
		List<UserDeptDto> userDeptDtoListResult = enqueteManagementSearchUserVM.getUserDeptDtoList();
		UserDeptDto userDeptDtoResult = userDeptDtoListResult.get(0);
		assertThat(userDeptDtoResult.getUserName(), is("上野"));
		assertThat(userDeptDtoListResult.size(), is(1));
	}

	@Test
	public void 管理者の情報が取得できる() {
		// ■参照系
		// モックオブジェクトのselectById(esqId)が呼ばれた時に返す値をセットする
		// ここではselectByIdメソッドにli9000が渡されたら、ユーザー名「大塚スグル」
		// li9999が渡されたら、事業部名「大塚グループ」が返るようにしている
		UserDeptDto userDeptDto1 = new UserDeptDto();
		userDeptDto1.setUserName("大塚スグル");
		UserDeptDto userDeptDto2 = new UserDeptDto();
		userDeptDto2.setDeptName("大塚グループ");
		when(mockedUserDeptDtoDao.selectById("li9000")).thenReturn(userDeptDto1);
		when(mockedUserDeptDtoDao.selectById("li9999")).thenReturn(userDeptDto2);

		// テスト対象クラスに渡すenqueteCreateFormを作成する
		EnqueteCreateForm enqueteCreateForm = new EnqueteCreateForm();
		ArrayList<EnqueteAdminUserForm> enqueteAdminUserFormList = new ArrayList<EnqueteAdminUserForm>();
		EnqueteAdminUserForm enqueteAdminUserForm1 = new EnqueteAdminUserForm();
		EnqueteAdminUserForm enqueteAdminUserForm2 = new EnqueteAdminUserForm();
		enqueteAdminUserForm1.setEsqId("li9000");
		enqueteAdminUserForm2.setEsqId("li9999");
		enqueteAdminUserFormList.add(enqueteAdminUserForm1);
		enqueteAdminUserFormList.add(enqueteAdminUserForm2);
		enqueteCreateForm.setEnqueteAdminUserFormList(enqueteAdminUserFormList);
		// 作成したenqueteCreateFormをサービスに渡してメソッドを動かす
		EnqueteManagementConfigVM enqueteManagementConfigVM = enqueteService.getAdmin(enqueteCreateForm);
		// VMから検証用のデータを取得する
		List<UserDeptDto> userDeptDtoList = enqueteManagementConfigVM.getUserDeptDtoList();

		// 比較評価する
		assertThat(userDeptDtoList.get(0).getUserName(), is("大塚スグル"));
		assertThat(userDeptDtoList.get(1).getDeptName(), is("大塚グループ"));

	}
}