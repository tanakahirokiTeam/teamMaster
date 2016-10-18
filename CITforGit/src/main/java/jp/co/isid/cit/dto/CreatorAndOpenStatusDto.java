package jp.co.isid.cit.dto;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;


@Entity
public class CreatorAndOpenStatusDto extends CreatorDto {
	
	@Column(name = "ENQUETE_STATE")
    private String	enqueteState;

	public String getEnqueteState() {
		return enqueteState;
	}

	public void setEnqueteState(String enqueteState) {
		this.enqueteState = enqueteState;
	}
	

}
