package di_sample7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di_sample6.OneManBand1;

public class BMIMain {

	public static void main(String[] args) {
ApplicationContext ctx = new GenericXmlApplicationContext("bean7.xml");
		
		MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
		
		// MyInfo myInfo = new MyInfo();
		
		myInfo.getInfo();

	}

}
