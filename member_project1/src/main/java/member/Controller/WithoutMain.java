package member.Controller;

import member.Dao.MemberDao;
import member.Dao.MemberDaoImpl;
import member.Service.MemberRegisterService;
import member.Service.MemberRegisterServiceImpl;
import member.UI.MemberUI;

public class WithoutMain {

	public static void main(String[] args) {
		//스프링을 사용하지 않은 메인
		MemberDao memberDao = new MemberDaoImpl();
		MemberRegisterService memreg = new MemberRegisterServiceImpl(memberDao);
		MemberUI memberUI = new MemberUI();
		memberUI.setMemberRegisterService(memreg);
		memberUI.showMenu();	//최종 실행
	}

}
