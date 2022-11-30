package di_sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain1 {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("bean1.xml");
		// IOC 컨테이너에 있는 bean1.xml 문서 불러오기
		
		Performer performer = ctx.getBean("duke1", Performer.class);
		//getBean("가져올 빈 이름", "클래스명")
		performer.perform();

	}

}
