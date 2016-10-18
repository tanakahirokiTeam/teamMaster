package jp.co.isid.cit.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 */
@Entity
@Table(name = "QUESTION_TYPE")
public class QuestionType {

    /** */
    @Id
    @Column(name = "QUESTION_TYPE_ID")
    private Short questionTypeId;

    /** */
    @Column(name = "QUESTION_TYPE")
    private String questionType;

    /** 
     * Returns the questionTypeId.
     * 
     * @return the questionTypeId
     */
    public Short getQuestionTypeId() {
        return questionTypeId;
    }

    /** 
     * Sets the questionTypeId.
     * 
     * @param questionTypeId the questionTypeId
     */
    public void setQuestionTypeId(Short questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    /** 
     * Returns the questionType.
     * 
     * @return the questionType
     */
    public String getQuestionType() {
        return questionType;
    }

    /** 
     * Sets the questionType.
     * 
     * @param questionType the questionType
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }
}