package jp.co.isid.cit.form;

import java.io.Serializable;

import org.hibernate.validator.constraints.Range;

public class EnqueteDeptForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer enqueteid;

	@Range(min = 1, max = 11, groups = { Second.class })
	private Integer deptId;

	public EnqueteDeptForm() {

	}

	public Integer getEnqueteid() {
		return enqueteid;
	}

	public void setEnqueteid(Integer enqueteid) {
		this.enqueteid = enqueteid;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}
