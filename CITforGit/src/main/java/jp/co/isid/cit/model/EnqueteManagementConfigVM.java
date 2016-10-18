package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.UserDeptDto;

public class EnqueteManagementConfigVM implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<UserDeptDto> userDeptDtoList;

	public EnqueteManagementConfigVM(List<UserDeptDto> userDeptDtoList) {
		super();
		this.userDeptDtoList = userDeptDtoList;
	}

	public List<UserDeptDto> getUserDeptDtoList() {
		return userDeptDtoList;
	}

	public void setUserDeptDtoList(List<UserDeptDto> userDeptDtoList) {
		this.userDeptDtoList = userDeptDtoList;
	}

}
