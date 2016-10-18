package jp.co.isid.cit.dto;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

import jp.co.isid.cit.entity.EsqUser;

@Entity
public class EnqueteAdminDto extends EsqUser {
	
	@Column(name = "ENQUETE_ID")
    private int enqueteId;

	public int getEnqueteId() {
		return enqueteId;
	}

	public void setEnqueteId(int enqueteId) {
		this.enqueteId = enqueteId;
	}
	
}
