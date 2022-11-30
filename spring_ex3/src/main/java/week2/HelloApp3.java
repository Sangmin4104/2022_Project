package week2;

import org.springframework.context.support.GenericXmlApplicationContext;



public class HelloApp3 {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beans1.xml");
		
		MessageBean1 bean = ctx.getBean("messageBean", MessageBean1.class);
		bean.sayHello("Spring");
	}

}
