package member.Service;

import member.Dao.MemberDao;
import member.Dto.MemberVo;

public class MemberDeleteServiceImpl implements MemberDeleteService {
	//멤버 변수 ==>MemberDAO
	private MemberDao memberDao;
	
	//생성자 주입
	public MemberDeleteServiceImpl() {
		super();
	}
	
	public MemberDeleteServiceImpl(MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

	@Override
	public void deleteMember(String email) {
	//DAO에서 email을 가져와 member에 넣기
		MemberVo member = memberDao.selectByEmail(email);
		if(member == null) {
			System.out.println("멤버가 아닙니다");
		}		
	//DAO에 있는 delete 메소드 호출
		member.deleteMember(email);
		memberDao.delete(member);
	//삭제할때
	//delete 이메일주소 ==> 삭제
	}


}
