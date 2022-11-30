package di_sample2;

public class WithoutMain2 {

	public static void main(String[] args) {
		Bar b = new Bar();
		Foo f = new Foo(b, "foo@aaa.com");
		f.foo();
	}

}
