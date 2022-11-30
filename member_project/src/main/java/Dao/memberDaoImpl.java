package Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import Dto.MemberVo;

//주역할 : 인터페이스 메서드를 통해서 실질적인 처리
public class memberDaoImpl implements memberDao {
	private static long nextId=0; //id값 자동 부여하기위해서 선언
	
	private Map<String, MemberVo> map = new HashMap<String,MemberVo>();

	//map.put(삽입), map.get(가져오기), amp.values(): 전체가져오기
	@Override
	public MemberVo selectByEmail(String email) {
		return map.get(email);
		//select * from 테이블 where email
	}

	@Override
	public void insert(MemberVo member) {
		member.setId(++nextId);  //아이디 자동부여 :1,2,3,4... autoincrement 같은느낌
		map.put(member.getEmail(), member);
		//insert문 이용
	}

	@Override
	public void update(MemberVo member) {
		map.put(member.getEmail(), member);
		//update문
	}

	@Override
	public Collection<MemberVo> selectAll() {
		return map.values();
	}

	@Override
	public void delete(String email) {
		map.remove(email);
		
	}
}
