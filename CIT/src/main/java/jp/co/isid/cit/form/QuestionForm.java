package jp.co.isid.cit.form;

import java.io.Serializable;
import java.util.ArrayList;

import javax.validation.Valid;

import org.hibernate.validator.constraints.Range;

public class QuestionForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Range(min = 1, max = 3, groups = { Second.class }, message = "質問は必ず1問以上作成してください")
	private Integer questionTypeId;

	@Range(min = 0, max = 1, groups = { Second.class })
	private Integer requireFlag;

	// @NotBlank(groups = { First.class }, message = "質問文が入力されていない質問があります")
	private String questionText;

	private String questionSubtext;

	// @NotNull(groups = { First.class })
	@Valid
	private ArrayList<ChoiceForm> choiceFormList;

	private int questionId;

	public QuestionForm() {
		// this.choiceFormList = new ArrayList<ChoiceForm>();
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public Integer getQuestionTypeId() {
		return questionTypeId;
	}

	public void setQuestionTypeId(Integer questionTypeId) {
		this.questionTypeId = questionTypeId;
	}

	public Integer getRequireFlag() {
		return requireFlag;
	}

	public void setRequireFlag(Integer requireFlag) {
		this.requireFlag = requireFlag;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getQuestionSubtext() {
		return questionSubtext;
	}

	public void setQuestionSubtext(String questionSubtext) {
		this.questionSubtext = questionSubtext;
	}

	public ArrayList<ChoiceForm> getChoiceFormList() {
		return choiceFormList;
	}

	public void setChoiceFormList(ArrayList<ChoiceForm> choiceFormList) {
		this.choiceFormList = choiceFormList;
	}

}
