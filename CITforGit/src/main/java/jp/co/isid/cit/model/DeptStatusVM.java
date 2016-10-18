package jp.co.isid.cit.model;

import java.io.Serializable;

public class DeptStatusVM implements Serializable{
	private static final long serialVersionUID = 1L;

	private String	deptName;
	private int	deptAnswerNumber;
	private int	deptTotalNumber;
	private int	deptAnswerRate;
	
	public DeptStatusVM(String deptName, int deptAnswerNumber, int deptTotalNumber, int deptAnswerRate) {
		super();
		this.deptName = deptName;
		this.deptAnswerNumber = deptAnswerNumber;
		this.deptTotalNumber = deptTotalNumber;
		this.deptAnswerRate = deptAnswerRate;
	}
	
	public DeptStatusVM() {
		// TODO Auto-generated constructor stub
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptAnswerNumber() {
		return deptAnswerNumber;
	}
	public void setDeptAnswerNumber(int deptAnswerNumber) {
		this.deptAnswerNumber = deptAnswerNumber;
	}
	public int getDeptTotalNumber() {
		return deptTotalNumber;
	}
	public void setDeptTotalNumber(int deptTotalNumber) {
		this.deptTotalNumber = deptTotalNumber;
	}
	public int getDeptAnswerRate() {
		return deptAnswerRate;
	}
	public void setDeptAnswerRate(int deptAnswerRate) {
		this.deptAnswerRate = deptAnswerRate;
	}
	

}
