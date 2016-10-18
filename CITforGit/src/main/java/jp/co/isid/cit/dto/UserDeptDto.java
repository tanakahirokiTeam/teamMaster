package jp.co.isid.cit.dto;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

import jp.co.isid.cit.entity.EsqUser;


@Entity
public class UserDeptDto extends EsqUser {
	
	@Column(name = "DEPT_NAME")
    private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}
