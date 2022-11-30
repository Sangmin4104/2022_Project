package member.UI;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import member.Dto.RegisterRequest;
import member.Service.ChangePasswordService;
import member.Service.MemberDeleteService;
import member.Service.MemberListPrinterService;
import member.Service.MemberRegisterService;

@Component("memberUI")
public class MemberUI {
	@Autowired
	private MemberRegisterService memberRegisterService;
	
	@Autowired
	private MemberListPrinterService memberListPrinterService; //목록보기
	
	@Autowired
	private ChangePasswordService changePasswordService; //비번변경
	
	private MemberDeleteService memberDeleteService; //멤버삭제
	
	//기본생성자
	public MemberUI() {
		super();
	}

	//getter/setter 메서드 추가 ==> 주입할 공간
	public MemberRegisterService getMemberRegisterService() {
		return memberRegisterService;
	}

	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
	public MemberListPrinterService getMemberListPrinterService() {
		return memberListPrinterService;
	}

	public void setMemberListPrinterService(MemberListPrinterService memberListPrinterService) {
		this.memberListPrinterService = memberListPrinterService;
	}

	public ChangePasswordService getChangePasswordService() {
		return changePasswordService;
	}

	public void setChangePasswordService(ChangePasswordService changePasswordService) {
		this.changePasswordService = changePasswordService;
	}

	public MemberDeleteService getMemberDeleteService() {
		return memberDeleteService;
	}

	public void setMemberDeleteService(MemberDeleteService memberDeleteService) {
		this.memberDeleteService = memberDeleteService;
	}

	//추가 메서드 (메뉴 목록)
	public void showMenu() {
		Scanner scan = new Scanner(System.in);	//키보드를 통해 메뉴 입력
		String command="";
		while(true) {
			System.out.println("명령어를 입력하세요");
			command = scan.nextLine();
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else if(command.toLowerCase().startsWith("new ")) {
				processNewCommand(command.split(" "));
				continue;
			}else if(command.equalsIgnoreCase("list")) {
				processListCommand();
				continue;
			}else if(command.toLowerCase().startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			}else if(command.toLowerCase().startsWith("delete ")) {
				processDeleteCommand(command.split(" "));
				continue;
			}
		}
	}

	private void processDeleteCommand(String[] split) {
		if(split.equals("")) {
			return;
		}try {
			memberDeleteService.deleteMember(null);
		}catch(Exception e) {
			System.out.println("존재하지 않음");
		}
	}
	private void processChangeCommand(String[] args) {
		if(args.length !=4) {
			return;
			//change 이메일 비번1 비번2
		}try {
			changePasswordService.changePassword(args[1], args[2], args[3]);
			System.out.println("암호변경\n");
		}catch(Exception e) {
			System.out.println("존재하지 않음");
		}
	}
	
	private void processListCommand() {
		memberListPrinterService.printAll(); //전체목록보기 메소드 호출
	}

	private void processNewCommand(String[] args) {
		if(args.length != 5) {
			return;
		}
		RegisterRequest req = new RegisterRequest();
		req.setEmail(args[1]);
		req.setName(args[2]);
		req.setPassword(args[3]);
		req.setConfirmPassword(args[4]);
		
		if(!req.isPasswordEqual()) {
			System.out.println("비밀번호가 틀렸습니다");
			return;
		}
		try {
			memberRegisterService.regist(req);
			System.out.println("성공했습니다");
		}catch(Exception e) {
			System.out.println("존재하지 않습니다");
		}		
	}
}
