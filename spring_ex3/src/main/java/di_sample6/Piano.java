package di_sample6;

public class Piano implements Instrument {
	// 기본 생성자
	public Piano() {
		super();
	}
	
	// 사용자 정의 메소드
	public void play() {
		System.out.println("피아노 소리 Plink plink...");
	}
	
}
