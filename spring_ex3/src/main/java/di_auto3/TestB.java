package di_auto3;

import org.springframework.stereotype.Component;

@Component(value="b")
public class TestB {
	
	public void display() {
		System.out.println("TEST B 출력");
		
	}
}
