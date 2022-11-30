package com.example.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.project.dao.MemberDAO;
import com.example.project.dto.MemberVO;

@Service // 서비스 역할을 빈 객체생성
public class MemberServiceImpl implements MemberService {

	// 주입
	@Inject
	MemberDAO memberDao;
	
	
	@Override
	public List<MemberVO> memberList() {
		return memberDao.memberList();
	}

	@Override
	public void insertMember(MemberVO vo) {
		memberDao.insertMember(vo);

	}

	@Override
	public MemberVO viewMember(String userId) {
		return memberDao.viewMember(userId);
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMember(String userId) {
		// TODO Auto-generated method stub

	}

}
