package jp.co.isid.cit.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EnqueteAdminUserListForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<EnqueteAdminUserForm> enqueteAdminUserFormList;

	public EnqueteAdminUserListForm() {
		this.enqueteAdminUserFormList = new ArrayList<EnqueteAdminUserForm>();
	}

	public List<EnqueteAdminUserForm> getEnqueteAdminUserFormList() {
		return enqueteAdminUserFormList;
	}

	public void setEnqueteAdminUserFormList(List<EnqueteAdminUserForm> enqueteAdminUserFormList) {
		this.enqueteAdminUserFormList = enqueteAdminUserFormList;
	}

}
