package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jp.co.isid.cit.dto.CreatorDto;
import jp.co.isid.cit.dto.EnqueteAdminDto;
import jp.co.isid.cit.dto.EnqueteDeptDto;
import jp.co.isid.cit.entity.Dept;
import jp.co.isid.cit.entity.QuestionType;

public class EnqueteConfigVM implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String	enqueteName;
	private List<EnqueteDeptDto> enqueteDeptDtoList;
	private CreatorDto	creatorDto;
	private List<EnqueteAdminDto> enqueteAdminDtoList;
	private List<QuestionVM> questionVMList;
	private List<Dept> deptList;
	private List<QuestionType> questionTypeList;

	public EnqueteConfigVM() {
		this.enqueteDeptDtoList = new ArrayList<EnqueteDeptDto>();
		this.creatorDto = new CreatorDto();
		this.enqueteAdminDtoList = new ArrayList<EnqueteAdminDto>();
		this.questionVMList = new ArrayList<QuestionVM>();
		this.deptList = new ArrayList<Dept>();
		this.questionTypeList = new ArrayList<QuestionType>();
	}
	
	public EnqueteConfigVM(String enqueteName, List<EnqueteDeptDto> enqueteDeptDtoList, CreatorDto creatorDto,
			List<EnqueteAdminDto> enqueteAdminDtoList, List<QuestionVM> questionVMList,
			List<Dept> deptList, List<QuestionType> questionTypeList) {

		this.enqueteName = enqueteName;
		this.enqueteDeptDtoList = enqueteDeptDtoList;
		this.creatorDto = creatorDto;
		this.enqueteAdminDtoList = enqueteAdminDtoList;
		this.questionVMList = questionVMList;
		this.deptList = deptList;
		this.questionTypeList = questionTypeList;
	}
	public String getEnqueteName() {
		return enqueteName;
	}
	public void setEnqueteName(String enqueteName) {
		this.enqueteName = enqueteName;
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
	public List<EnqueteAdminDto> getEnqueteAdminDtoList() {
		return enqueteAdminDtoList;
	}
	public void setEnqueteAdminDtoList(List<EnqueteAdminDto> enqueteAdminDtoList) {
		this.enqueteAdminDtoList = enqueteAdminDtoList;
	}
	public List<QuestionVM> getQuestionVMList() {
		return questionVMList;
	}
	public void setQuestionVMList(List<QuestionVM> questionVMList) {
		this.questionVMList = questionVMList;
	}
	public List<Dept> getDeptList() {
		return deptList;
	}
	public void setDeptList(List<Dept> deptList) {
		this.deptList = deptList;
	}
	public List<QuestionType> getQuestionTypeList() {
		return questionTypeList;
	}
	public void setQuestionTypeList(List<QuestionType> questionTypeList) {
		this.questionTypeList = questionTypeList;
	}

}
