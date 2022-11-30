package di_auto3;

import org.springframework.stereotype.Component;

@Component(value="c")
public class TestC {
	public void display() {
		System.out.println("TEST C 출력");
		
	}
}
