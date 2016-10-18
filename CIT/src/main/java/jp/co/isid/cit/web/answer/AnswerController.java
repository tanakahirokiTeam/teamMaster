package jp.co.isid.cit.web.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnswerController {
	
	@RequestMapping("/answer")
	public String enqueteAnswer(){
		return "answer/enquete_answer";
	}
	
	@RequestMapping("/answer/confirm")
	public String enqueteAnswerConfirm(){
		return "answer/enquete_answer_confirm";
	}

}
