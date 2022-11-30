package Ui;

import java.util.Scanner;

import Dto.RegisterRequest;
import Service.ChangePasswordService;
import Service.DeleteService;
import Service.MemberListPrinterService;
import Service.MemberRegisterService;

public class MemberUI {
	private MemberRegisterService memberRegisterService; //멤버 변수 선언
	
	private MemberListPrinterService memberListPrinterService;//출력서비스
	
	private ChangePasswordService changePasswordService; //비번변경서비스
	
	private DeleteService deleteService;

	
	public ChangePasswordService getChangePasswordService() {
		return changePasswordService;
	}
	public void setChangePasswordService(ChangePasswordService changePasswordService) {
		this.changePasswordService = changePasswordService;
	}
	
	
	public MemberListPrinterService getMemberListPrinterService() {
		return memberListPrinterService;
	}
	public void setMemberListPrinterService(MemberListPrinterService memberListPrinterService) {
		this.memberListPrinterService = memberListPrinterService;
	}

	public DeleteService getDeleteService() {
		return deleteService;
	}
	public void setDeleteService(DeleteService deleteService) {
		this.deleteService = deleteService;
	}
	
	
	//기본 생성자
	public MemberUI() {
		super();
	}
	
	
	//setter /getter
	public MemberRegisterService getMemberRegisterService() {
		return memberRegisterService;
	}

	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
	//사용자 정의 메뉴 (사용한 메뉴 역할)
	public void showmenu() {
		Scanner scan = new Scanner(System.in);
		String command="";
		
		while(true) {
			System.out.println("명령어를 입력하세요");
			command = scan.nextLine();
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			else if (command.toLowerCase().startsWith("new")) {
				processNewCommand(command.split(" "));
				continue;
			} else if (command.equalsIgnoreCase("list")) {
				processListCommand();
				continue;
			} 
			else if (command.toLowerCase().startsWith("change")) {
				processChangeCommand(command.split(" "));
				continue;
			}	
			else if (command.toLowerCase().startsWith("delete")) {
				processDeleteCommand(command.split(" "));
				continue;
			}
		}
	}
		private void processDeleteCommand(String[] args) {
			 if(args.length != 2) {
				 return;
			 }
			 
			try {
				deleteService.removeMember(args[1]);
				System.out.println("삭제했습니다.");
			}catch(Exception e) {
				System.out.println("이메일이 일치하지 않음");
			}
		
	}
		private void processChangeCommand(String[] args) {
		 if(args.length != 4) {
			 return;
		 }
		 
		 try {
			 changePasswordService.changePassword(args[1], args[2], args[3]);
			 System.out.println("암호를 변경했습니다");
		 }catch(Exception e) {
			 System.out.println("이메일이나 비번이 일치하지 않음");
		 }
		
	}
		private void processListCommand() {
			memberListPrinterService.printAll();
		
	}
		private void processNewCommand(String[] args) {
			if(args.length !=5) {
				return;
			}
			RegisterRequest req = new RegisterRequest();
			req.setEmail(args[1]);
			req.setName(args[2]);
			req.setPassword(args[3]);
			req.setConfirmPassword(args[4]);
			
			if(!req.isPasswordEqual()) {
				System.out.println("확인암호가 틀림");
				return;
			}
			try {
				memberRegisterService.regist(req);
				System.out.println("성공");
				
			}catch(Exception e) {
				System.out.println("이미 존재하는 이메일입니다");
				
			}
		}
}
