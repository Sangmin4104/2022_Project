package di_sample2;

public class Foo {
	// 멤버변수
	private Bar bar;		// 객체
	private String email;	// 일반문자열 자료형

	
	// 기본 생성자
	public Foo() {
		super();
	}

	// 매개변수 생성자 ==> 외부에서 여기에 bar 객체를 넣어줌
	public Foo(Bar bar, String email) {
		super();
		this.bar = bar;
		this.email = email;
	}
	
	// 메서드( 출력메서드 )
	public void foo() {
		System.out.println("email : " + email);
		bar.bar();
	}
}
