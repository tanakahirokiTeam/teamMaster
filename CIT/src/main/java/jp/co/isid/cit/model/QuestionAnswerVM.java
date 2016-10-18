package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.QuestionDto;
import jp.co.isid.cit.entity.Choice;
import jp.co.isid.cit.entity.QuestionAnswer;

public class QuestionAnswerVM implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private QuestionDto questionDto;
	private QuestionAnswer questionAnswer;
	private List<Choice> choicelist;
	
	public QuestionAnswerVM(){
		
	}
	public QuestionAnswerVM(QuestionDto questionDto, QuestionAnswer questionAnswer, List<Choice> choicelist) {
		super();
		this.questionDto = questionDto;
		this.questionAnswer = questionAnswer;
		this.choicelist = choicelist;
	}
	public QuestionDto getQuestionDto() {
		return questionDto;
	}
	public QuestionAnswer getQuestionAnswer() {
		return questionAnswer;
	}
	public List<Choice> getChoicelist() {
		return choicelist;
	}
	public void setQuestionDto(QuestionDto questionDto) {
		this.questionDto = questionDto;
	}
	public void setQuestionAnswer(QuestionAnswer questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public void setChoicelist(List<Choice> choicelist) {
		this.choicelist = choicelist;
	}
	
	
	
	
}
