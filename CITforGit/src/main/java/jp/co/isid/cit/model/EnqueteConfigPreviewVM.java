package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.CreatorDto;
import jp.co.isid.cit.dto.EnqueteAdminDto;
import jp.co.isid.cit.dto.EnqueteDeptDto;

public class EnqueteConfigPreviewVM implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<EnqueteDeptDto>	enqueteDeptDtoList;
	private CreatorDto	creatorDto;
	private List<EnqueteAdminDto>	enqueteAdminDtoLsit;
	private List<QuestionVM> questionVMList;
	
	//コンストラクタ
	public EnqueteConfigPreviewVM() {}
	public EnqueteConfigPreviewVM(List<EnqueteDeptDto> enqueteDeptDtoList, CreatorDto creatorDto,
			List<EnqueteAdminDto> enqueteAdminDtoLsit, List<QuestionVM> questionVMList) {
		this.enqueteDeptDtoList = enqueteDeptDtoList;
		this.creatorDto = creatorDto;
		this.enqueteAdminDtoLsit = enqueteAdminDtoLsit;
		this.questionVMList = questionVMList;
	}

	public List<EnqueteDeptDto> getEnqueteDeptDtoList() {
		return enqueteDeptDtoList;
	}

	public void setEnqueteDeptDtoList(List<EnqueteDeptDto> enqueteDeptDtoList) {
		this.enqueteDeptDtoList = enqueteDeptDtoList;
	}

	public CreatorDto getCreatorDto() {
		return creatorDto;
	}

	public void setCreatorDto(CreatorDto creatorDto) {
		this.creatorDto = creatorDto;
	}

	public List<EnqueteAdminDto> getEnqueteAdminDtoLsit() {
		return enqueteAdminDtoLsit;
	}

	public void setEnqueteAdminDtoLsit(List<EnqueteAdminDto> enqueteAdminDtoLsit) {
		this.enqueteAdminDtoLsit = enqueteAdminDtoLsit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<QuestionVM> getQuestionVMList() {
		return questionVMList;
	}
	public void setQuestionVMList(List<QuestionVM> questionVMList) {
		this.questionVMList = questionVMList;
	}
	

}
