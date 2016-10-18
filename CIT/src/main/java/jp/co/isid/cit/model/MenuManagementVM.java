package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.CreatorAndOpenStatusDto;
import jp.co.isid.cit.dto.CreatorDto;

public class MenuManagementVM implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<CreatorAndOpenStatusDto> creatorAndOpenStatusDtoList;
	private List<CreatorDto> creatorDtoList;
	
	//コンストラクタ
	public MenuManagementVM() {
	}
	public MenuManagementVM(List<CreatorAndOpenStatusDto> creatorAndOpenStatusDtoList,List<CreatorDto> creatorDtoList) {
		this.creatorAndOpenStatusDtoList = creatorAndOpenStatusDtoList;
		this.creatorDtoList = creatorDtoList;
	}

	public List<CreatorAndOpenStatusDto> getCreatorAndOpenStatusDtoList() {
		return creatorAndOpenStatusDtoList;
	}

	public void setCreatorAndOpenStatusDtoList(List<CreatorAndOpenStatusDto> creatorAndOpenStatusDtoList) {
		this.creatorAndOpenStatusDtoList = creatorAndOpenStatusDtoList;
	}

	public List<CreatorDto> getCreatorDtoList() {
		return creatorDtoList;
	}

	public void setCreatorDtoList(List<CreatorDto> creatorDtoList) {
		this.creatorDtoList = creatorDtoList;
	}
	
	
	
}
