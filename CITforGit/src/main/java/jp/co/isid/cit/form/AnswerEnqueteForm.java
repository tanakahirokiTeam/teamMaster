package jp.co.isid.cit.form;

import java.io.Serializable;
import java.util.ArrayList;

import javax.validation.constraints.NotNull;

import jp.co.isid.cit.entity.EnqueteAnswer;
import jp.co.isid.cit.entity.QuestionAnswer;

public class AnswerEnqueteForm implements Serializable {
	private static final long serialVersionUID = 1L;

	 @NotNull(message="")
	    private EnqueteAnswer enqueteAnswer;
	 @NotNull(message="")
	 private ArrayList<QuestionAnswer> questionAnswerList;
	 
	public EnqueteAnswer getEnqueteAnswer() {
		return enqueteAnswer;
	}
	public void setEnqueteAnswer(EnqueteAnswer enqueteAnswer) {
		this.enqueteAnswer = enqueteAnswer;
	}
	public ArrayList<QuestionAnswer> getQuestionAnswerList() {
		return questionAnswerList;
	}
	public void setQuestionAnswerList(ArrayList<QuestionAnswer> questionAnswerList) {
		this.questionAnswerList = questionAnswerList;
	}
	
}
