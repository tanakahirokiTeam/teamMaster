package jp.co.isid.cit.entity;

import java.util.Date;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.Version;

/**
 */
@Entity
@Table(name = "ENQUETE")
public class Enquete {

    /** */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @SequenceGenerator(sequence="ENQUETE_SEQ")
    @Column(name = "ENQUETE_ID")
    private Integer enqueteId;

    /** */
    @Column(name = "ENQUETE_NAME")
    private String enqueteName;

    /** */
    @Column(name = "ENQUETE_STATE_ID")
    private Integer enqueteStateId;

    /** */
    @Column(name = "CREATE_USER_ID")
    private String createUserId;

    /** */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /** */
    @Column(name = "START_DATE")
    private Date startDate;

    /** */
    @Column(name = "FINISH_DATE")
    private Date finishDate;

    /** */
    @Column(name = "ENQUETE_SUBTEXT")
    private String enqueteSubtext;

    /** */
    @Version
    @Column(name = "VERSION")
    private Long version;

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
     * Returns the enqueteName.
     * 
     * @return the enqueteName
     */
    public String getEnqueteName() {
        return enqueteName;
    }

    /** 
     * Sets the enqueteName.
     * 
     * @param enqueteName the enqueteName
     */
    public void setEnqueteName(String enqueteName) {
        this.enqueteName = enqueteName;
    }

    /** 
     * Returns the enqueteStateId.
     * 
     * @return the enqueteStateId
     */
    public Integer getEnqueteStateId() {
        return enqueteStateId;
    }

    /** 
     * Sets the enqueteStateId.
     * 
     * @param enqueteStateId the enqueteStateId
     */
    public void setEnqueteStateId(Integer enqueteStateId) {
        this.enqueteStateId = enqueteStateId;
    }

    /** 
     * Returns the createUserId.
     * 
     * @return the createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /** 
     * Sets the createUserId.
     * 
     * @param createUserId the createUserId
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /** 
     * Returns the createDate.
     * 
     * @return the createDate
     */
    public Date getCreateDate() {
        return createDate;
    }

    /** 
     * Sets the createDate.
     * 
     * @param createDate the createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /** 
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the finishDate.
     * 
     * @return the finishDate
     */
    public Date getFinishDate() {
        return finishDate;
    }

    /** 
     * Sets the finishDate.
     * 
     * @param finishDate the finishDate
     */
    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    /** 
     * Returns the enqueteSubtext.
     * 
     * @return the enqueteSubtext
     */
    public String getEnqueteSubtext() {
        return enqueteSubtext;
    }

    /** 
     * Sets the enqueteSubtext.
     * 
     * @param enqueteSubtext the enqueteSubtext
     */
    public void setEnqueteSubtext(String enqueteSubtext) {
        this.enqueteSubtext = enqueteSubtext;
    }

    /** 
     * Returns the version.
     * 
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /** 
     * Sets the version.
     * 
     * @param version the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }
}