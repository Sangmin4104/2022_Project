package di_sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalcMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("bean5.xml");
			
		Calc service = ctx.getBean("cal", Calc.class);
		// Calc service = (Calc) cex.getBean("calc");
		service.calculate();
		

	}

}
