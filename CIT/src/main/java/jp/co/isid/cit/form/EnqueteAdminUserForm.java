package jp.co.isid.cit.form;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

public class EnqueteAdminUserForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Pattern(regexp = "li[0-9]{4}")
	private String esqId;
	private String userName;
	private int deptId;
	private String deptName;

	public EnqueteAdminUserForm(String esqId, String userName, int deptId, String deptName) {
		super();
		this.esqId = esqId;
		this.userName = userName;
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public EnqueteAdminUserForm() {
		super();
	}

	public String getEsqId() {
		return esqId;
	}

	public void setEsqId(String esqId) {
		this.esqId = esqId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
