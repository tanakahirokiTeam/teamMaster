package jp.co.isid.cit.form;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

public class EnqueteAdminSearchUserForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer enqueteId;

	@Pattern(regexp = "li[0-9]{4}")
	private String esqId;

	private int deptId;

	private String userName;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getEnqueteId() {
		return enqueteId;
	}

	public void setEnqueteId(Integer enqueteId) {
		this.enqueteId = enqueteId;
	}

	public String getEsqId() {
		return esqId;
	}

	public void setEsqId(String esqId) {
		this.esqId = esqId;
	}

}
