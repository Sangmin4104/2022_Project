package member.Dao;

import java.util.Collection;

import member.Dto.MemberVo;

public interface MemberDao {
	//메서드 이름만 정의
	public MemberVo selectByEmail(String email); //이메일을 기준으로 조회-->select문
	public void insert(MemberVo member);	//삽입->insert문 연결
	public void update(MemberVo member); 	//수정 ->update문 연결
	public Collection<MemberVo> selectAll();//전체목록보기-->select문
	public void delete(MemberVo member);
		
}	
