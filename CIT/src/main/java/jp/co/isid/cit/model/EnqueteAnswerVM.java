package jp.co.isid.cit.model;

import java.awt.Choice;
import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.QuestionDto;
import jp.co.isid.cit.entity.Enquete;
import jp.co.isid.cit.entity.QuestionAnswer;

public class EnqueteAnswerVM implements Serializable{
	private static final long serialVersionUID = 1L;

	private Enquete enquete;
	private String userName;
	private List<QuestionAnswerVM> questionAnswerVMList;
	
	public EnqueteAnswerVM(){
		
	}

	public EnqueteAnswerVM(Enquete enquete, String userName, List<QuestionAnswerVM> questionAnswerVMList) {
		super();
		this.enquete = enquete;
		this.userName = userName;
		this.questionAnswerVMList = questionAnswerVMList;
	}

	public Enquete getEnquete() {
		return enquete;
	}

	public void setEnquete(Enquete enquete) {
		this.enquete = enquete;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<QuestionAnswerVM> getQuestionAnswerVMList() {
		return questionAnswerVMList;
	}

	public void setQuestionAnswerVMList(List<QuestionAnswerVM> questionAnswerVMList) {
		this.questionAnswerVMList = questionAnswerVMList;
	}

}
