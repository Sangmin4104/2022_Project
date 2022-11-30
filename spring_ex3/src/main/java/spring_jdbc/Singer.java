package spring_jdbc;

public class Singer {
	private String name;
	private int member;
	
	// 생성자
	
	public Singer() {
		super();
	}
	
	public Singer(String name, int member) {
		super();
		this.name = name;
		this.member = member;
	}
	
	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMember() {
		return member;
	}

	public void setMember(int member) {
		this.member = member;
	}
	
	
	
	
}
