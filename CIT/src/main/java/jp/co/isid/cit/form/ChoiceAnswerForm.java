package jp.co.isid.cit.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class ChoiceAnswerForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "")
	private Integer choiceAnswerId;
	@NotNull(message = "")
	private Integer questionAnswerId;
	@NotNull(message = "")
	private Integer choiceId;

	public ChoiceAnswerForm() {

	}

	public ChoiceAnswerForm(Integer choiceAnswerId, Integer questionAnswerId, Integer choiceId) {
		super();
		this.choiceAnswerId = choiceAnswerId;
		this.questionAnswerId = questionAnswerId;
		this.choiceId = choiceId;
	}

	public Integer getChoiceAnswerId() {
		return choiceAnswerId;
	}

	public void setChoiceAnswerId(Integer choiceAnswerId) {
		this.choiceAnswerId = choiceAnswerId;
	}

	public Integer getQuestionAnswerId() {
		return questionAnswerId;
	}

	public void setQuestionAnswerId(Integer questionAnswerId) {
		this.questionAnswerId = questionAnswerId;
	}

	public Integer getChoiceId() {
		return choiceId;
	}

	public void setChoiceId(Integer choiceId) {
		this.choiceId = choiceId;
	}

}
