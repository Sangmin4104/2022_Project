package member.Dto;

public class RegisterRequest {
	//사용자가 입력하는 정보==>등록할때 사용할 클래스
	
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	//new 이메일 이름 비번1 비번2

	//기본생성자
	public RegisterRequest() {
		super();
	}

	
	//getter/setter 추가
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//추가 메서드
	public boolean isPasswordEqual() {
		return password.equals(confirmPassword);
		//비번1.equals(비번2) ==> 같으면 true/ 다르면 false
	}
}
