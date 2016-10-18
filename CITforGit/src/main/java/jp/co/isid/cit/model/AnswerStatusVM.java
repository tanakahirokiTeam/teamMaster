package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;



public class AnswerStatusVM implements Serializable{
	private static final long serialVersionUID = 1L;

	private String	enqueteName;
	private List<DeptStatusVM> deptStatusVMList;
	private List<QuestionStatusVM> questionStatusVMList;
	
	public AnswerStatusVM(String enqueteName, List<DeptStatusVM> deptStatusVMList,
			List<QuestionStatusVM> questionStatusVMList) {
		super();
		this.enqueteName = enqueteName;
		this.deptStatusVMList = deptStatusVMList;
		this.questionStatusVMList = questionStatusVMList;
	}

	public AnswerStatusVM() {
		// TODO Auto-generated constructor stub
	}

	public String getEnqueteName() {
		return enqueteName;
	}

	public void setEnqueteName(String enqueteName) {
		this.enqueteName = enqueteName;
	}

	public List<DeptStatusVM> getDeptStatusVMList() {
		return deptStatusVMList;
	}

	public void setDeptStatusVMList(List<DeptStatusVM> deptStatusVMList) {
		this.deptStatusVMList = deptStatusVMList;
	}

	public List<QuestionStatusVM> getQuestionStatusVMList() {
		return questionStatusVMList;
	}

	public void setQuestionStatusVMList(List<QuestionStatusVM> questionStatusVMList) {
		this.questionStatusVMList = questionStatusVMList;
	}
	
	

}
