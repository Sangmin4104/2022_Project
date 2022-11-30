package Service;

import Dto.MemberVo;

public class MemberPrinterServiceImpl implements MemberPrinterService {

	@Override
	public void print(MemberVo member) {
		System.out.printf("회원정보 : 아이디=%d  이메일=%s  이름=%s  등록일=%tF   비번=%s  \n" , member.getId(), member.getEmail(), member.getName(), member.getRegisterDate(), member.getPassword());
		
		//new 등록 --> setter메서드에 저장

	}

}
