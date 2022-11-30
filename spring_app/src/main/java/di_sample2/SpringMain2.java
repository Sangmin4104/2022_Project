package di_sample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("bean2.xml");
		
		Foo f = ctx.getBean("foo", Foo.class);
		f.foo();

	}

}
