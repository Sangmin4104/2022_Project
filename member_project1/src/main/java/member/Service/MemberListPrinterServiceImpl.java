package member.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import member.Dao.MemberDao;
import member.Dto.MemberVo;

@Component
public class MemberListPrinterServiceImpl implements MemberListPrinterService {
	private MemberDao memberDao;
	private MemberPrinterService memberPrinter;
	
	//생성자를 이용한 주입

	//기본 생성자 => 필요하면 넣기
	public MemberListPrinterServiceImpl() {
		super();
	}
	
	//매개변수 2개가 있는 생성자 추가
	@Autowired
	public MemberListPrinterServiceImpl(MemberDao memberDao, MemberPrinterService memberPrinter) {
		super();
		this.memberDao = memberDao;
		this.memberPrinter = memberPrinter;
	}
	
	@Override
	public void printAll() {
		Collection<MemberVo> members = memberDao.selectAll();
		for(MemberVo member:members) {
			memberPrinter.print(member);	//메소드 호출해서 프린트
		}
	}
}
