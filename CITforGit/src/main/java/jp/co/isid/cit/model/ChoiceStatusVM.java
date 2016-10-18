package jp.co.isid.cit.model;

import java.io.Serializable;

public class ChoiceStatusVM implements Serializable{
	private static final long serialVersionUID = 1L;

	private int choiceNumber;
	private String	choiceText;
	private int	answerNumber;
	private int	totalNumber;
	private int	answerRate;

	public ChoiceStatusVM(int choiceNumber, String choiceText, int answerNumber, int totalNumber, int answerRate) {
		super();
		this.choiceNumber = choiceNumber;
		this.choiceText = choiceText;
		this.answerNumber = answerNumber;
		this.totalNumber = totalNumber;
		this.answerRate = answerRate;
	}

	public ChoiceStatusVM() {
		// TODO Auto-generated constructor stub
	}

	public int getChoiceNumber() {
		return choiceNumber;
	}

	public void setChoiceNumber(int choiceNumber) {
		this.choiceNumber = choiceNumber;
	}

	public String getChoiceText() {
		return choiceText;
	}

	public void setChoiceText(String choiceText) {
		this.choiceText = choiceText;
	}

	public int getAnswerNumber() {
		return answerNumber;
	}

	public void setAnswerNumber(int answerNumber) {
		this.answerNumber = answerNumber;
	}

	public int getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

	public int getAnswerRate() {
		return answerRate;
	}

	public void setAnswerRate(int answerRate) {
		this.answerRate = answerRate;
	}

	
}
