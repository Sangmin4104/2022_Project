package member.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import member.Dto.MemberVo;

@Component
public class MemberDaoImpl implements MemberDao {
	private static long nextid=0;	//공유변수
	private Map<String, MemberVo> map=new HashMap<String, MemberVo>();
	//Map<키,값> 변수명 = new HashMap<키,값>();
	//map.put() 삽입, get() : 가져오기, values() 모든값 가져오기, keys() : 키값가져오기

	
	@Override
	public MemberVo selectByEmail(String email) {
		return map.get(email);	//email 기준으로 memberVo값 리턴
	}

	@Override
	public void insert(MemberVo member) {
		member.setId(++nextid);//id 증가
		map.put(member.getEmail(), member);	//email(키)에 member값 저장
	}

	@Override
	public void update(MemberVo member) {
		map.put(member.getEmail(), member);	//수정
	}

	@Override
	public Collection<MemberVo> selectAll() {
		return map.values();	//map에 저장된 모든 값 리턴
	}

	@Override
	public void delete(MemberVo member) {
		// TODO Auto-generated method stub
		
	}

}
