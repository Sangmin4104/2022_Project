package member.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.net.SyslogOutputStream;
import member.Dao.MemberDao;
import member.Dto.MemberVo;

@Component
public class ChangePaswordServiceImpl implements ChangePasswordService {
	//주입할 멤버 변수
	private MemberDao memberDao;
	
	@Override
	public void changePassword(String email, String oldPassword, String newPassword) {
		MemberVo member = memberDao.selectByEmail(email);
		//사용자가 입력한 이메일 정보를 가져와서 member에 저장
		if(member==null) {
			System.out.println("이메일이 존재하지 않음");
		}
		member.changePassword(oldPassword, newPassword);
		memberDao.update(member); //기존값에 덮어쓰기
	}

	@Autowired
	public ChangePaswordServiceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

	public ChangePaswordServiceImpl() {
		super();
	}

}
