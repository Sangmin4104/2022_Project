package Service;
import Dao.memberDao;
import Dto.MemberVo;
import ch.qos.logback.core.net.SyslogOutputStream;
public class ChangePaswordServiceImpl implements ChangePasswordService {
	//주입할 멤버 변수
	private memberDao memberDao;
	
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

	
	public ChangePaswordServiceImpl(memberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

	public ChangePaswordServiceImpl() {
		super();
	}

}
