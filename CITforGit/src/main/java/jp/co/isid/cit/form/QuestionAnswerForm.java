package jp.co.isid.cit.form;

import java.io.Serializable;
import java.util.ArrayList;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class QuestionAnswerForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	private Integer questionAnswerId;
	@NotNull
	private Integer enqueteAnswerId;
	@NotNull
	private Integer questionId;
	private String answerText;
	@NotBlank
	private ArrayList<ChoiceAnswerForm> choiceAnswerFormList;

	public QuestionAnswerForm() {

	}

	public QuestionAnswerForm(Integer questionAnswerId, Integer enqueteAnswerId, Integer questionId, String answerText,
			ArrayList<ChoiceAnswerForm> choiceAnswerFormList) {
		super();
		this.questionAnswerId = questionAnswerId;
		this.enqueteAnswerId = enqueteAnswerId;
		this.questionId = questionId;
		this.answerText = answerText;
		this.choiceAnswerFormList = choiceAnswerFormList;
	}

	public Integer getQuestionAnswerId() {
		return questionAnswerId;
	}

	public void setQuestionAnswerId(Integer questionAnswerId) {
		this.questionAnswerId = questionAnswerId;
	}

	public Integer getEnqueteAnswerId() {
		return enqueteAnswerId;
	}

	public void setEnqueteAnswerId(Integer enqueteAnswerId) {
		this.enqueteAnswerId = enqueteAnswerId;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public ArrayList<ChoiceAnswerForm> getChoiceAnswerFormList() {
		return choiceAnswerFormList;
	}

	public void setChoiceAnswerFormList(ArrayList<ChoiceAnswerForm> choiceAnswerFormList) {
		this.choiceAnswerFormList = choiceAnswerFormList;
	}

}
