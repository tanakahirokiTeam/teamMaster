package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.UserDeptDto;
import jp.co.isid.cit.entity.Dept;

public class EnqueteManagementSearchUserVM implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<UserDeptDto> userDeptDtoList;

	private List<Dept> deptList;

	public EnqueteManagementSearchUserVM(List<UserDeptDto> userDeptDtoList, List<Dept> deptList) {
		super();
		this.userDeptDtoList = userDeptDtoList;
		this.deptList = deptList;
	}

	public List<UserDeptDto> getUserDeptDtoList() {
		return userDeptDtoList;
	}

	public void setUserDeptDtoList(List<UserDeptDto> userDeptDtoList) {
		this.userDeptDtoList = userDeptDtoList;
	}

	public List<Dept> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Dept> deptList) {
		this.deptList = deptList;
	}

}
