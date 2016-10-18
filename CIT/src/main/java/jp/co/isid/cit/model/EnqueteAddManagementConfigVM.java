package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.EnqueteAdminDeptDto;
import jp.co.isid.cit.dto.EnqueteDeptDto;

public class EnqueteAddManagementConfigVM implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<EnqueteDeptDto>	enqueteDeptDtoList;
	private List<EnqueteAdminDeptDto>	enqueteAdminDeptDtoList;
	
	public EnqueteAddManagementConfigVM(List<EnqueteDeptDto> enqueteDeptDtoList,
			List<EnqueteAdminDeptDto> enqueteAdminDeptDtoList) {
		super();
		this.enqueteDeptDtoList = enqueteDeptDtoList;
		this.enqueteAdminDeptDtoList = enqueteAdminDeptDtoList;
	}

	public List<EnqueteDeptDto> getEnqueteDeptDtoList() {
		return enqueteDeptDtoList;
	}

	public void setEnqueteDeptDtoList(List<EnqueteDeptDto> enqueteDeptDtoList) {
		this.enqueteDeptDtoList = enqueteDeptDtoList;
	}

	public List<EnqueteAdminDeptDto> getEnqueteAdminDeptDtoList() {
		return enqueteAdminDeptDtoList;
	}

	public void setEnqueteAdminDeptDtoList(List<EnqueteAdminDeptDto> enqueteAdminDeptDtoList) {
		this.enqueteAdminDeptDtoList = enqueteAdminDeptDtoList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
