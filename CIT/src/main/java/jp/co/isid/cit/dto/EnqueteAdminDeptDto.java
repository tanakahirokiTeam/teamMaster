package jp.co.isid.cit.dto;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;


@Entity
public class EnqueteAdminDeptDto extends EnqueteAdminDto {
	
	@Column(name = "DEPT_NAME")
    private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}
