package Service;

import Dto.RegisterRequest;

public interface MemberRegisterService {
	//UI 화면 new 명령을 눌렸을때
	//회원 등록 하는 메서드 정의
	
	public void regist(RegisterRequest req);
	//매개변수로 사용자가 입력한 정보가 들어옴
	

}
