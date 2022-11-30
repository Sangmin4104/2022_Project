package com.exam.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentInfo {

	@RequestMapping("/studentForm")
	public String main() {
		return "studentForm";
	}
	
	@RequestMapping("/studentView")
	public String studentView(@ModelAttribute("info")StudentInformation studentinformation){
		
		return "studentView";
		
	}
}
