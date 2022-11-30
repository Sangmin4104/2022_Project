package Service;

import Dto.MemberVo;
import Dto.RegisterRequest;

import java.util.Date;

import Dao.memberDao;

public class MemberRegisterServiceImpl implements MemberRegisterService {
	private memberDao memberDao;
	
	//생성자 : 주입해서 사용할 공간
	//기본생성자
	public MemberRegisterServiceImpl() {
		super();
	}

	//매개변수가 있는 생성자	
	public MemberRegisterServiceImpl(Dao.memberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

	// setter /getter
	
	
	@Override
	public void regist(RegisterRequest req) {
		MemberVo member = memberDao.selectByEmail(req.getEmail());
		//기존 등록된 멤버가 있는 경우
		if(member != null) {
			System.out.println("등록된 멤버 입니다.");
		}
		MemberVo newmember = new MemberVo(req.getEmail(), req.getPassword(), req.getName(), new Date());
		
		//새로운 멤버 만들기
		//이메일 비번 이름 현재 시스템 날짜
		memberDao.insert(newmember);
		//새로운 멤버 저장공간에 등록
	}

	
}
