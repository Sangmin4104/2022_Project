package di_sample1;

public class Juggler implements Performer {
	// 멤버 변수 = 속성
	private int beanBags;
	
	// 기본생성자
	public Juggler() {
		super();
	}
	
	// 매개변수가 있는 생성자
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
	}
		
	@Override
	public void perform() {
		System.out.println("정글링." + beanBags + "생성자를 통해 값 넣음");
		

	}


	}


