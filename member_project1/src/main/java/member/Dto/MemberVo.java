package member.Dto;

import java.util.Date;

public class MemberVo {
	//DTO : 객체 정보 관리 ==> 사용자가 입력한 정보와 데이터베이스의 테이블의 컬럼
	private Long id;	//아이디=>번호
	private String email;	//내가 이메일==>기준
	private String password;	//비밀번호
	private String name;	//이름
	private Date registerDate;  //멤버변수
	
	//기본생성자
	public MemberVo() {
		super();
	}
	
	//매개변수 생성자 ==> 주입해서 사용할 공간 (id는 빼고)

	public MemberVo(String email, String password, String name, Date registerDate) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}
	
	
	//setter/getter
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

	//추가 메서드 (비밀번호 수정)
	
	public void changePassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword)) {
			System.out.println("등록된 비밀번호가 틀립니다");
		}else {
			this.password=newPassword; //비번 변경
		}
	}
	//멤버 삭제
	public void deleteMember(String email) {

		}
	}	
