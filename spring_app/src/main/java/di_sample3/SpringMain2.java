package di_sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("bean3.xml");
		
		Foo f = ctx.getBean("foo", Foo.class);
		f.foo();

	}

}
