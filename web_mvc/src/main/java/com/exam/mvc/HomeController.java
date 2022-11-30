package com.exam.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/board/content")
	public String content(Model model) {
		model.addAttribute("id", 30);
		return "board/content"; 
		// 뷰리졸버 : 디렉토리 + 리턴값 + jsp
		// board/content.jsp - 파일을 찾음
		
	}
	
	@RequestMapping("/w")
	public String selcome(Model model) {
		model.addAttribute("greeting", "Welcome To Web Store");
		model.addAttribute("tagline", "아무내용이나..");
		return "index";
	}
	
	
}
