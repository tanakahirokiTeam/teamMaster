package jp.co.isid.cit.dto;

import java.util.ArrayList;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import jp.co.isid.cit.entity.EsqUser;

public class LoginUser extends User {

    private static final long serialVersionUID = 1L;

    public String username;

    public String password;
    
    public String esqid;
    
    public int deptid;

    // 独自で必要な項目
  //  public String memo;

    public LoginUser(EsqUser uinfo) {
        super(uinfo.getUserName(), uinfo.getPassword(), true, true, true, true, new ArrayList<GrantedAuthority>());
        username = uinfo.getUserName();
        password = uinfo.getPassword();
        esqid = uinfo.getEsqId();
        deptid= uinfo.getDeptId();
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEsqid() {
		return esqid;
	}

	public void setEsqid(String esqid) {
		this.esqid = esqid;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
    
	
}
