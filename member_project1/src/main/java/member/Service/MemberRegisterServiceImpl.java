package member.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import member.Dao.MemberDao;
import member.Dto.MemberVo;
import member.Dto.RegisterRequest;
@Component
public class MemberRegisterServiceImpl implements MemberRegisterService {

	private MemberDao memberDao;	//멤버 변수
	
	//생성자를 통한 주입
	//기본 생성자
	public MemberRegisterServiceImpl() {
		super();
	}
	//매개변수가 있는 생성자
	@Autowired
	public MemberRegisterServiceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

	//getter/setter (필요시 추가)
	@Override
	public void regist(RegisterRequest req) {
		
		MemberVo member = memberDao.selectByEmail(req.getEmail());
		if(member != null) {
			System.out.println("멤버가 등록되어 있습니다");
		}
		MemberVo newMember=new MemberVo(req.getEmail(), req.getPassword(),
				req.getName(), new Date());	//새 멤버값 구성
		memberDao.insert(newMember); //삽입
	}




}
