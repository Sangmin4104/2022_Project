package com.example.project.contrller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.dto.MemberVO;
import com.example.project.service.MemberService;

@Controller
public class MemberController {

	// 주입
	@Inject
	MemberService memberService;
	
	@RequestMapping("/member/list")
	public String memberList(Model model) {
		List<MemberVO> list = memberService.memberList();
		model.addAttribute("list", list);
		return "member/member_list";
	}
	
	// 등록 폼
	@RequestMapping("/member/write")
	public String memberWrite() {
		return "member/member_write";
	}
	
	// 등록
	@RequestMapping("/member/insert")
	public String memberInsert(@ModelAttribute MemberVO vo) {
		memberService.insertMember(vo);
		return "redirect:/member/list";
		// reponse.sendRedirect('url') ==> 페이지 이동
	}
	
	// 회원정보 상세보기
	@RequestMapping("/member/view")
	public String memberView(@RequestParam String userId, Model model) {
		model.addAttribute("dto", memberService.viewMember(userId));
		return "member/member_view";
		
	}
	
}
