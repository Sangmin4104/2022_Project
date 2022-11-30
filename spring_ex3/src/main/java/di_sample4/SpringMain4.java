package di_sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain4 {
	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("bean4.xml");
		Inlist performer = ctx.getBean("kenny", Inlist.class);
		performer.perform();
	}

}
