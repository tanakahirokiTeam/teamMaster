package jp.co.isid.cit.form;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class EnqueteAnswerForm implements Serializable {
	private static final long serialVersionUID = 1L;

	 @NotNull(message="")
	    private Integer enqueteAnswerId;
	 @NotNull(message="")
	 private Integer enqueteId;
	 @NotEmpty(message="")
	 private String esqId;
	 @DateTimeFormat(pattern="yy-MM-dd")
	 private Date answerDate;
	 
	public Integer getEnqueteAnswerId() {
		return enqueteAnswerId;
	}
	public void setEnqueteAnswerId(Integer enqueteAnswerId) {
		this.enqueteAnswerId = enqueteAnswerId;
	}
	public Integer getEnqueteId() {
		return enqueteId;
	}
	public void setEnqueteId(Integer enqueteId) {
		this.enqueteId = enqueteId;
	}
	public String getEsqId() {
		return esqId;
	}
	public void setEsqId(String esqId) {
		this.esqId = esqId;
	}
	public Date getAnswerDate() {
		return answerDate;
	}
	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}
	 
	 
}
