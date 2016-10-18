package jp.co.isid.cit.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "ENQUETE_ADMIN_USER")
public class EnqueteAdminUser {

    /** */
    @Id
    @Column(name = "ENQUETE_ID")
    private Integer enqueteId;

    /** */
    @Id
    @Column(name = "ESQ_ID")
    private String esqId;

    /** */
    @Column(name = "DELETE_FLAG")
    private Integer deleteFlag;

    /** 
     * Returns the enqueteId.
     * 
     * @return the enqueteId
     */
    public Integer getEnqueteId() {
        return enqueteId;
    }

    /** 
     * Sets the enqueteId.
     * 
     * @param enqueteId the enqueteId
     */
    public void setEnqueteId(Integer enqueteId) {
        this.enqueteId = enqueteId;
    }

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
     * Returns the deleteFlag.
     * 
     * @return the deleteFlag
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /** 
     * Sets the deleteFlag.
     * 
     * @param deleteFlag the deleteFlag
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}