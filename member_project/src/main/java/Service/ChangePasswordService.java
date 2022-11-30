package Service;

public interface ChangePasswordService {
	public void changePassword(String email, String oldPassword, String newPassword);
	//사용자가 입력한 비번
}
