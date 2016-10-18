package jp.co.isid.cit.entity;

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
@Table(name = "CHOICE_ANSWER")
public class ChoiceAnswer {

    /** */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @SequenceGenerator(sequence="CHOICE_ANSWER_SEQ")
    @Column(name = "CHOICE_ANSWER_ID")
    private Long choiceAnswerId;

    /** */
    @Column(name = "QUESTION_ANSWER_ID")
    private Long questionAnswerId;

    /** */
    @Column(name = "CHOICE_ID")
    private Integer choiceId;

    /** 
     * Returns the choiceAnswerId.
     * 
     * @return the choiceAnswerId
     */
    public Long getChoiceAnswerId() {
        return choiceAnswerId;
    }

    /** 
     * Sets the choiceAnswerId.
     * 
     * @param choiceAnswerId the choiceAnswerId
     */
    public void setChoiceAnswerId(Long choiceAnswerId) {
        this.choiceAnswerId = choiceAnswerId;
    }

    /** 
     * Returns the questionAnswerId.
     * 
     * @return the questionAnswerId
     */
    public Long getQuestionAnswerId() {
        return questionAnswerId;
    }

    /** 
     * Sets the questionAnswerId.
     * 
     * @param questionAnswerId the questionAnswerId
     */
    public void setQuestionAnswerId(Long questionAnswerId) {
        this.questionAnswerId = questionAnswerId;
    }

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
}