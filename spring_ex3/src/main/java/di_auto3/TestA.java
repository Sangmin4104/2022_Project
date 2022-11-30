package di_auto3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="a")
public class TestA {
	private TestB b;
	private TestC c;
	
	//setter / getter 메소드
	public TestB getB() {
		return b;
	}
	
	@Autowired // 타입에서 맟춰서 자동 주입
	public void setB(TestB b) {
		this.b = b;
	}
	public TestC getC() {
		return c;
	}
	
	@Autowired // 타입에서 맟춰서 자동 주입
	public void setC(TestC c) {
		this.c = c;
	}
	
	
}
