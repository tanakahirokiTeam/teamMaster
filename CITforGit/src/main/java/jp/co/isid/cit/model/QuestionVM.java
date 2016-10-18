package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jp.co.isid.cit.dto.QuestionDto;
import jp.co.isid.cit.entity.Choice;

public class QuestionVM implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private QuestionDto questionDto;
	private List<Choice> choiceList;
	
	public QuestionVM(){
		this.questionDto = new QuestionDto();
		this.choiceList = new ArrayList<Choice>();
	}
	
	public QuestionDto getQuestionDto() {
		return questionDto;
	}
	public void setQuestionDto(QuestionDto questionDto) {
		this.questionDto = questionDto;
	}
	public List<Choice> getChoiceList() {
		return choiceList;
	}
	public void setChoiceList(List<Choice> choiceList) {
		this.choiceList = choiceList;
	}
}