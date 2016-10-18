package jp.co.isid.cit.web.result;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResultController {
	
	@RequestMapping("/result/status")
	public String answerStatusConfirm(){
		return "result/answer_status_confirm";
	}
	
	@RequestMapping("/result/answer")
	public String answerConfirm(){
		return "result/answer_confirm";
	}

}
