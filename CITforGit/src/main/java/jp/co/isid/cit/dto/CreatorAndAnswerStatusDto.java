package jp.co.isid.cit.dto;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class CreatorAndAnswerStatusDto extends CreatorDto {

	@Column(name = "ENQUETE_ANSWER_ID")
	private Integer enqueteAnswerId;

	public CreatorAndAnswerStatusDto() {
	}

	public CreatorAndAnswerStatusDto(Integer enqueteAnswerId) {
		super();
		this.enqueteAnswerId = enqueteAnswerId;
	}

	public Integer getEnqueteAnswerId() {
		return enqueteAnswerId;
	}

	public void setEnqueteAnswerId(Integer enqueteAnswerId) {
		this.enqueteAnswerId = enqueteAnswerId;
	}

}
