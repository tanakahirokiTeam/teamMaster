package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.QuestionDto;

public class QuestionStatusVM implements Serializable{
	private static final long serialVersionUID = 1L;

	private QuestionDto questionDto;
	private List<ChoiceStatusVM> choiceStatusVM;
	private List<FreeTextStatusVM> freeTextStatusVM;
	
	public QuestionStatusVM(QuestionDto questionDto, List<ChoiceStatusVM> choiceStatusVM,
			List<FreeTextStatusVM> freeTextStatusVM) {
		super();
		this.questionDto = questionDto;
		this.choiceStatusVM = choiceStatusVM;
		this.freeTextStatusVM = freeTextStatusVM;
	}

	public QuestionStatusVM() {
		// TODO Auto-generated constructor stub
	}

	public QuestionDto getQuestionDto() {
		return questionDto;
	}

	public void setQuestionDto(QuestionDto questionDto) {
		this.questionDto = questionDto;
	}

	public List<ChoiceStatusVM> getChoiceStatusVM() {
		return choiceStatusVM;
	}

	public void setChoiceStatusVM(List<ChoiceStatusVM> choiceStatusVM) {
		this.choiceStatusVM = choiceStatusVM;
	}

	public List<FreeTextStatusVM> getFreeTextStatusVM() {
		return freeTextStatusVM;
	}

	public void setFreeTextStatusVM(List<FreeTextStatusVM> freeTextStatusVM) {
		this.freeTextStatusVM = freeTextStatusVM;
	}
	

}
