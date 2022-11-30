package week2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {


		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		// 빈을 관리할 컨테이너 생성
		
		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("스프링2");
		System.out.println(msg);
	
		
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		System.out.println("(g==g1) : " + (g==g1));
		
		Greeter g2 = ctx.getBean("greeter1", Greeter.class);
		Greeter g3 = ctx.getBean("greeter2", Greeter.class);
		System.out.println("(g2==g3) : "+ (g2==g3));
		
		ctx.close();
	}

}
