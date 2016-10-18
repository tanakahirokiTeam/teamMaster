package jp.co.isid.cit.dto;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

import jp.co.isid.cit.entity.Question;


@Entity
public class QuestionDto extends Question {
	
	@Column(name = "QUESTION_TYPE")
    private String questionType;

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	

}
