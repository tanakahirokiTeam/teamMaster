package jp.co.isid.cit.entity;

import java.time.LocalDate;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "ENQUETE_ANSWER")
public class EnqueteAnswer {

    /** */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @SequenceGenerator(sequence="ENQUETE_ANSWER_SEQ")
    @Column(name = "ENQUETE_ANSWER_ID")
    private Integer enqueteAnswerId;

    /** */
    @Column(name = "ENQUETE_ID")
    private Integer enqueteId;

    /** */
    @Column(name = "ESQ_ID")
    private String esqId;

    /** */
    @Column(name = "ANSWER_DATE")
    private LocalDate answerDate;

    /** 
     * Returns the enqueteAnswerId.
     * 
     * @return the enqueteAnswerId
     */
    public Integer getEnqueteAnswerId() {
        return enqueteAnswerId;
    }

    /** 
     * Sets the enqueteAnswerId.
     * 
     * @param enqueteAnswerId the enqueteAnswerId
     */
    public void setEnqueteAnswerId(Integer enqueteAnswerId) {
        this.enqueteAnswerId = enqueteAnswerId;
    }

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
     * Returns the answerDate.
     * 
     * @return the answerDate
     */
    public LocalDate getAnswerDate() {
        return answerDate;
    }

    /** 
     * Sets the answerDate.
     * 
     * @param answerDate the answerDate
     */
    public void setAnswerDate(LocalDate answerDate) {
        this.answerDate = answerDate;
    }
}