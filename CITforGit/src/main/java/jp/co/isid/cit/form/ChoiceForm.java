package jp.co.isid.cit.form;

import java.io.Serializable;

public class ChoiceForm implements Serializable {
	private static final long serialVersionUID = 1L;

	// @NotBlank(message = "未入力の選択肢があります", groups = { First.class })
	private String choiceText;

	private int choiceId;

	public int getChoiceId() {
		return choiceId;
	}

	public void setChoiceId(int choiceId) {
		this.choiceId = choiceId;
	}

	public String getChoiceText() {
		return choiceText;
	}

	public void setChoiceText(String choiceText) {
		this.choiceText = choiceText;
	}
}
