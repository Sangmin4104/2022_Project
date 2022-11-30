package Controller;

import Dao.memberDao;
import Dao.memberDaoImpl;
import Service.MemberRegisterService;
import Service.MemberRegisterServiceImpl;
import Ui.MemberUI;

public class WithoutMain {

	public static void main(String[] args) {
		// 스프링을 사용하지않는 경우
		memberDao memberDao = new memberDaoImpl();
		MemberRegisterService memberRegisterService = new MemberRegisterServiceImpl(memberDao);
		
		MemberUI memberUI = new MemberUI();
		memberUI.setMemberRegisterService(memberRegisterService);
		memberUI.showmenu();
	}

}
