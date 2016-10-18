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
@Table(name = "QUESTION_ANSWER")
public class QuestionAnswer {

	/** */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "QUESTION_ANSWER_SEQ")
	@Column(name = "QUESTION_ANSWER_ID")
	private Long questionAnswerId;

	/** */
	@Column(name = "ENQUETE_ANSWER_ID")
	private Integer enqueteAnswerId;

	/** */
	@Column(name = "QUESTION_ID")
	private Integer questionId;

	/** */
	@Column(name = "ANSWER_TEXT")
	private String answerText;

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
	 * @param questionAnswerId
	 *            the questionAnswerId
	 */
	public void setQuestionAnswerId(Long questionAnswerId) {
		this.questionAnswerId = questionAnswerId;
	}

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
	 * @param enqueteAnswerId
	 *            the enqueteAnswerId
	 */
	public void setEnqueteAnswerId(Integer enqueteAnswerId) {
		this.enqueteAnswerId = enqueteAnswerId;
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
	 * @param questionId
	 *            the questionId
	 */
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	/**
	 * Returns the answerText.
	 * 
	 * @return the answerText
	 */
	public String getAnswerText() {
		return answerText;
	}

	/**
	 * Sets the answerText.
	 * 
	 * @param answerText
	 *            the answerText
	 */
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
}