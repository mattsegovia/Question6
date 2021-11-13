package model.entities;

public class User {
	
	private static User user = new User();
	private String userName;
	private String password;
	
	
	private User() {
		
	}
	
	public static User getInstance() {
		
		return user;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
