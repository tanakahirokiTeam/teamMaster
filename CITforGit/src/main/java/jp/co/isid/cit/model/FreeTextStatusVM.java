package jp.co.isid.cit.model;

import java.io.Serializable;


import jp.co.isid.cit.entity.QuestionAnswer;

public class FreeTextStatusVM implements Serializable{
	private static final long serialVersionUID = 1L;

	private String AnswerText;
	private int EnqueteId;
	private String EsqId;
	

	public FreeTextStatusVM(String answerText, int enqueteId, String esqId) {
		super();
		AnswerText = answerText;
		EnqueteId = enqueteId;
		EsqId = esqId;
	}



	public FreeTextStatusVM() {
		// TODO Auto-generated constructor stub
	}



	public String getAnswerText() {
		return AnswerText;
	}



	public void setAnswerText(String answerText) {
		AnswerText = answerText;
	}



	public int getEnqueteId() {
		return EnqueteId;
	}



	public void setEnqueteId(int enqueteId) {
		EnqueteId = enqueteId;
	}



	public String getEsqId() {
		return EsqId;
	}



	public void setEsqId(String esqId) {
		EsqId = esqId;
	}


	
}
