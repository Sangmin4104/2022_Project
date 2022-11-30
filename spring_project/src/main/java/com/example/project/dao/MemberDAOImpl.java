package com.example.project.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.project.dto.MemberVO;

@Repository // 데이터 저장을 위한 빈 생성
public class MemberDAOImpl implements MemberDAO {
	
	@Inject // 주입 -> setter 메소드 통한 주입으로 이해
	SqlSession sqlSession;
	// 주입공간 -> 생성자 혹은 setter메소드
	
	
	@Override
	public List<MemberVO> memberList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("member.memberList");
		// member: 매펴의 네임스페이스 이름
		// memberList : <select id="memberList">
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert("member.insertMember", vo);

	}

	@Override
	public MemberVO viewMember(String userId) {
		return sqlSession.selectOne("member.viewMember", userId);
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
