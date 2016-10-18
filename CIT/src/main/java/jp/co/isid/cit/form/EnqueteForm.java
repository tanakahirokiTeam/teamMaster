package jp.co.isid.cit.form;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class EnqueteForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotBlank(groups = { Second.class }, message = "タイトルは必ず入力してください")
	private String enqueteName;

	private Integer enqueteStateId;

	@NotNull(groups = { First.class })
	private String createUserId;

	// @DateTimeFormat(pattern="yy-MM-dd")
	private Date createDate;

	private String enqueteSubtext;

	public EnqueteForm() {

	}

	public String getEnqueteName() {
		return enqueteName;
	}

	public Integer getEnqueteStateId() {
		return enqueteStateId;
	}

	public void setEnqueteStateId(Integer enqueteStateId) {
		this.enqueteStateId = enqueteStateId;
	}

	public void setEnqueteName(String enqueteName) {
		this.enqueteName = enqueteName;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getEnqueteSubtext() {
		return enqueteSubtext;
	}

	public void setEnqueteSubtext(String enqueteSubtext) {
		this.enqueteSubtext = enqueteSubtext;
	}

}
