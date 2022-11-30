package member.Service;

import org.springframework.stereotype.Component;

import member.Dto.MemberVo;
@Component
public class MemberPrinterServiceImpl implements MemberPrinterService {

	@Override
	public void print(MemberVo member) {
		System.out.printf(" | 회원 정보 | 아이디 : %d, 이메일 : %s, 비번  : %s, 이름  : %s, 등록일  : %tF\n", 
				member.getId(), member.getEmail(),member.getPassword(), member.getName(), member.getRegisterDate());
	}
}
