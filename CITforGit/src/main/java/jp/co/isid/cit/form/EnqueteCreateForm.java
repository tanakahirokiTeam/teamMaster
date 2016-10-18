package jp.co.isid.cit.form;

import java.io.Serializable;
import java.util.ArrayList;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class EnqueteCreateForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull(groups = { First.class })
	@Valid
	private EnqueteForm enqueteForm;

	// @NotEmpty(groups = { First.class }, message = "対象事業部は必ず1つ以上選択してください")
	@Valid
	private ArrayList<EnqueteDeptForm> enqueteDeptFormList;

	@NotEmpty(groups = { First.class })
	@Valid
	private ArrayList<EnqueteAdminUserForm> enqueteAdminUserFormList;

	@NotEmpty(groups = { First.class }, message = "質問は必ず1つ以上作成してください")
	@Valid
	private ArrayList<QuestionForm> questionFormList;

	@NotNull(groups = { First.class })
	private int enqueteId;

	private long version;

	public EnqueteCreateForm() {
		this.enqueteDeptFormList = new ArrayList<EnqueteDeptForm>();
		this.enqueteAdminUserFormList = new ArrayList<EnqueteAdminUserForm>();
		this.enqueteForm = new EnqueteForm();
		this.questionFormList = new ArrayList<QuestionForm>();
	}

	public ArrayList<EnqueteDeptForm> getEnqueteDeptFormList() {
		return enqueteDeptFormList;
	}

	public void setEnqueteDeptFormList(ArrayList<EnqueteDeptForm> enqueteDeptFormList) {
		this.enqueteDeptFormList = enqueteDeptFormList;
	}

	public ArrayList<EnqueteAdminUserForm> getEnqueteAdminUserFormList() {
		return enqueteAdminUserFormList;
	}

	public void setEnqueteAdminUserFormList(ArrayList<EnqueteAdminUserForm> enqueteAdminUserFormList) {
		this.enqueteAdminUserFormList = enqueteAdminUserFormList;
	}

	public EnqueteForm getEnqueteForm() {
		return enqueteForm;
	}

	public void setEnqueteForm(EnqueteForm enqueteForm) {
		this.enqueteForm = enqueteForm;
	}

	public ArrayList<QuestionForm> getQuestionFormList() {
		return questionFormList;
	}

	public void setQuestionFormList(ArrayList<QuestionForm> questionFormList) {
		this.questionFormList = questionFormList;
	}

	public int getEnqueteId() {
		return enqueteId;
	}

	public void setEnqueteId(int enqueteId) {
		this.enqueteId = enqueteId;
	}

	public long getVersion() {
		return version;
	}

	public void setEnqueteVersion(long version) {
		this.version = version;
	}

}
