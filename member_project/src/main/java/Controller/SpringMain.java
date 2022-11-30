package Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import Ui.MemberUI;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("member.xml");
		MemberUI memberUI=ctx.getBean("memberUI",MemberUI.class);
		memberUI.showmenu();
	}

}
