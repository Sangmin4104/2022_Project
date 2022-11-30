package di_sample5;

import java.util.List;

public class Calc {
	private List<Integer> valueList; // 멤버변수의 타입이 List
	// 자바 컬렉션 프레임워크
	// List<타입> 변수명 = new ArrayList<타입> ();

	
	// getter/setter
	public List<Integer> getValueList() {
		return valueList;
	}
	
	// 주입
	public void setValueList(List<Integer> valueList) {
		this.valueList = valueList;
	}
	
	// 사용자 정의 메소드 (합계연산)
	public void calculate() {
		int sum = 0;
		for(Integer i : valueList) {
				sum += i;
		}
		System.out.println("합계 결과 : " + sum);
	}

}
