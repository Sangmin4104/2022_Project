package com.example.project.dao;

import java.util.List;

import com.example.project.dto.MemberVO;

public interface MemberDAO {
 // sql 처리 메소드
	 // 회원목록
		public List<MemberVO> memberList();
		
	 // 회원등록
		public void insertMember(MemberVO vo);
		
	 // 상세보기
		public MemberVO viewMember(String userId);
		
	 // 수정
		public void updateMember(MemberVO vo);
		
	 // 삭제
		public void deleteMember(String userId);
}
