package jp.co.isid.cit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(){
		return "login/login";
	}
	
	@RequestMapping("/index")
	public String login(){
		return "login/login";
	}
	
}
