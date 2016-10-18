package jp.co.isid.cit.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "ESQ_USER")
public class EsqUser {

    /** */
    @Id
    @Column(name = "ESQ_ID")
    private String esqId;

    /** */
    @Column(name = "DEPT_ID")
    private Integer deptId;

    /** */
    @Column(name = "USER_NAME")
    private String userName;

    /** */
    @Column(name = "PASSWORD")
    private String password;

    /** 
     * Returns the esqId.
     * 
     * @return the esqId
     */
    public String getEsqId() {
        return esqId;
    }

    /** 
     * Sets the esqId.
     * 
     * @param esqId the esqId
     */
    public void setEsqId(String esqId) {
        this.esqId = esqId;
    }

    /** 
     * Returns the deptId.
     * 
     * @return the deptId
     */
    public Integer getDeptId() {
        return deptId;
    }

    /** 
     * Sets the deptId.
     * 
     * @param deptId the deptId
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /** 
     * Returns the userName.
     * 
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /** 
     * Sets the userName.
     * 
     * @param userName the userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /** 
     * Returns the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /** 
     * Sets the password.
     * 
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}