package jp.co.isid.cit.model;

import java.io.Serializable;
import java.util.List;

import jp.co.isid.cit.dto.CreatorAndAnswerStatusDto;

public class MenuAnswerVM implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<CreatorAndAnswerStatusDto> creatorAndAnswerStatusList;
	
	public MenuAnswerVM(List<CreatorAndAnswerStatusDto> creatorAndAnswerStatusList){
		this.creatorAndAnswerStatusList = creatorAndAnswerStatusList;
	}

	public List<CreatorAndAnswerStatusDto> getCreatorAndAnswerStatusList() {
		return creatorAndAnswerStatusList;
	}

	public void setCreatorAndAnswerStatusList(List<CreatorAndAnswerStatusDto> creatorAndAnswerStatusList) {
		this.creatorAndAnswerStatusList = creatorAndAnswerStatusList;
	}
	
	
}
