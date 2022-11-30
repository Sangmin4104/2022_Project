package week2;

public class Greeter {
	//멤버변수
	private String format;
	
	//메서드 정의
	public String greet(String guest) {
		return String.format(format, guest);
	}
	
	//setter 메서드
	 public void setFormat(String format) {
		 this.format=format;
	 }
}
