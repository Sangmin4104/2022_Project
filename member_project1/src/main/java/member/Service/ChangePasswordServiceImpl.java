package member.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import member.Dao.MemberDao;
import member.Dto.MemberVo;

@Component
public class ChangePasswordServiceImpl implements ChangePasswordService {
	//멤버변수
	private MemberDao memberDao;
	
	//생성자 주입
	//기본생성자
	public ChangePasswordServiceImpl() {
		super();
	}
	//매개변수 생성자
	@Autowired
	public ChangePasswordServiceImpl(MemberDao mamberDao) {
		super();
		this.memberDao = mamberDao;
	}
	
	@Override
	public void changePassword(String email, String oldPassword, String newPassword) {
		MemberVo member = memberDao.selectByEmail(email);
		if(member==null) {
			System.out.println("멤버 아님");
		}
		member.changePassword(oldPassword, newPassword);
		memberDao.update(member);
	}




}
