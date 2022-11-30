package Service;

import java.util.Collection;

import Dao.memberDao;
import Dto.MemberVo;

public class MemberListPrinterServiceImpl implements MemberListPrinterService {
	private memberDao memberDao;
	private MemberPrinterService memberPrinterService;
	
	public MemberListPrinterServiceImpl(Dao.memberDao memberDao, MemberPrinterService memberPrinterService) {
		super();
		this.memberDao = memberDao;
		this.memberPrinterService = memberPrinterService;
	}
	@Override
	public void printAll() {
		Collection<MemberVo> members = memberDao.selectAll();
		for(MemberVo member : members) {
			memberPrinterService.print(member);
		}
	}

}
