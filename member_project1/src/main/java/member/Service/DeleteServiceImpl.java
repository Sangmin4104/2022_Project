package member.Service;

import member.Dao.MemberDao;
import member.Dto.MemberVo;

public class DeleteServiceImpl implements DeleteService {
	private MemberDao memberDao;
	@Override
	
	public void removeMember(String email) {
		MemberVo member = memberDao.selectByEmail(email);
		
		if(member==null) {
			System.out.println("이메일이 존재하지 않음");
		}
	}


	
	public DeleteServiceImpl() {
		super();
	}
	public DeleteServiceImpl(member.Dao.MemberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

}
