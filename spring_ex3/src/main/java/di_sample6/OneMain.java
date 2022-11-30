package di_sample6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class OneMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("bean6.xml");
		
		OneManBand1 perfomer = ctx.getBean("one", OneManBand1.class);
		
		perfomer.perform();

	}

}
