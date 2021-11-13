package model.business;

import java.sql.SQLException;

import model.dataccess.LoginDataAccess;
import model.entities.MessageException;
import model.entities.User;

public class LoginBusiness {
	private static LoginBusiness loginBusiness = new LoginBusiness();
	private LoginDataAccess loginDataAccess;
	
	private LoginBusiness() {
		this.loginDataAccess = new LoginDataAccess();
	}
	
	public static LoginBusiness getInstance() {
		return loginBusiness;
	}
	
	public boolean authenticateUser(User user) throws ClassNotFoundException, SQLException {
		String userName = user.getUserName();
		String password = user.getPassword();
		
		if (userName.equals("")) {
			throw new MessageException("Username not informed.");
		} else if (password.equals("")) {
			throw new MessageException("Password not informed.");
		}

		if(this.loginDataAccess.verifyCredentials(user)) {
			return true;
		} else {
			throw new MessageException("Invalid Credentials");
		}
	}
	
}
