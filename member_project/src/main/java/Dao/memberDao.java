package Dao;

import java.util.Collection;

import Dto.MemberVo;

//주역할 : insert, update, select를 위한 메서드 정의
public interface memberDao {
	public MemberVo selectByEmail(String email);
	//이메일을 기준으로 데이터 조회 ==> 데이터 하나 조회
		
	public void insert(MemberVo member);
	//삽입
	
	public void update(MemberVo member);
	//수정
	
	public Collection<MemberVo> selectAll();
	//전체보기
	
	public void delete(String email);
	//삭제 역할을 할 메서드
}
