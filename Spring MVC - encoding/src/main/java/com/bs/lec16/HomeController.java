package com.bs.lec16;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("result", "home");
		model.addAttribute("result_kor", "홈페이지");
		return "home";
	}
	
	@RequestMapping("/success")
	public String success(Model model) {
		
		model.addAttribute("result", "success");
		model.addAttribute("result_kor", "성공 페이지");
		return "success";
	}
	
	@RequestMapping(value = "/fail", method = RequestMethod.GET)
	public String fail(Model model) {
		
		model.addAttribute("result", "fail");
		model.addAttribute("result_kor", "실패 페이지");
		return "fail";
	}
	
}
