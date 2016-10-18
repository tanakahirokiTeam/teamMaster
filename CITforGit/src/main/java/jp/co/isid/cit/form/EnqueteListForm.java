package jp.co.isid.cit.form;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EnqueteListForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int	enquateId;
	@DateTimeFormat(pattern="yy-MM-dd")
	private Date date;
	
	public int getEnquateId() {
		return enquateId;
	}
	public void setEnquateId(int enquateId) {
		this.enquateId = enquateId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
