package com.exam.mvc;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	// �޼ҵ� ���� ��� �ο�
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("greeting",getGreeting());
		mav.setViewName("hello");
		return mav;
	}
	
	private String getGreeting() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour>=12 && hour <= 17) {
			return "점심";
		}else if(hour >=18 && hour <=22){
			return "저녁";
		}
		return "아침";
	}
	
}
