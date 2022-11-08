import java.util.HashMap;

public class IDandPasswords {
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	IDandPasswords() {
		loginInfo.put("testuser", "1234");
		loginInfo.put("admin", "admin");
	}
	
	HashMap getLoginInfo() {
		return loginInfo;
	}

}
