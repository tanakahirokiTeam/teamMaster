package jp.co.isid.cit.entity;

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
@Table(name = "CHOICE")
public class Choice {

    /** */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @SequenceGenerator(sequence="CHOICE_SEQ")
    @Column(name = "CHOICE_ID")
    private Integer choiceId;

    /** */
    @Column(name = "QUESTION_ID")
    private Integer questionId;

    /** */
    @Column(name = "CHOICE_NUMBER")
    private Integer choiceNumber;

    /** */
    @Column(name = "CHOICE_TEXT")
    private String choiceText;

    /** */
    @Version
    @Column(name = "VERSION")
    private Long version;

    /** 
     * Returns the choiceId.
     * 
     * @return the choiceId
     */
    public Integer getChoiceId() {
        return choiceId;
    }

    /** 
     * Sets the choiceId.
     * 
     * @param choiceId the choiceId
     */
    public void setChoiceId(Integer choiceId) {
        this.choiceId = choiceId;
    }

    /** 
     * Returns the questionId.
     * 
     * @return the questionId
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /** 
     * Sets the questionId.
     * 
     * @param questionId the questionId
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /** 
     * Returns the choiceNumber.
     * 
     * @return the choiceNumber
     */
    public Integer getChoiceNumber() {
        return choiceNumber;
    }

    /** 
     * Sets the choiceNumber.
     * 
     * @param choiceNumber the choiceNumber
     */
    public void setChoiceNumber(Integer choiceNumber) {
        this.choiceNumber = choiceNumber;
    }

    /** 
     * Returns the choiceText.
     * 
     * @return the choiceText
     */
    public String getChoiceText() {
        return choiceText;
    }

    /** 
     * Sets the choiceText.
     * 
     * @param choiceText the choiceText
     */
    public void setChoiceText(String choiceText) {
        this.choiceText = choiceText;
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