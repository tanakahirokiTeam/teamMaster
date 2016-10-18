package jp.co.isid.cit.dto;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

import jp.co.isid.cit.entity.Enquete;


@Entity
public class EnqueteAnswerUserDto extends Enquete {
	
	@Column(name = "USER_NAME")
    private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
