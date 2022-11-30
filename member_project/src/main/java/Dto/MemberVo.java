package Dto;

import java.util.Date;

//VO(DTO) : 사용자가 입력한 정보, 테이블의 컬럼정보
public class MemberVo {

	//멤버 변수(가입할때 필요한 정보)
	private Long id;
	private String email;
	private String password;
	private String name;
	private Date registerDate;
	//new email주소 이름 패스워드 

	//생성자
	//기본생성자
	public MemberVo() {
		super();
	}
	
	//매개변수 생성자(id를 뺀 나머지 매개변수)
	public MemberVo(String email, String password, String name, Date registerDate) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}

	//setter /getter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	
	//사용자 정의 메소드 ==> 비번변경확인 메소드
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			System.out.println("비번이 틀립니다");
		}
		else
			this.password=newPassword;
	}
			
}