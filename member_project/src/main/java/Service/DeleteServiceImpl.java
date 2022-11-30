package Service;

import Dao.memberDao;
import Dto.MemberVo;

public class DeleteServiceImpl implements DeleteService {
	private memberDao memberDao;
	@Override
	
	public void removeMember(String email) {
		MemberVo member = memberDao.selectByEmail(email);
		
		if(member==null) {
			System.out.println("이메일이 존재하지 않음");
		}
		memberDao.delete(email);
	}


	
	public DeleteServiceImpl() {
		super();
	}
	public DeleteServiceImpl(Dao.memberDao memberDao) {
		super();
		this.memberDao = memberDao;
	}

}
