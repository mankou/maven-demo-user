package mang.demo.maven.user.service;

import mang.demo.maven.user.core.User;
import mang.demo.maven.user.dao.UserDAO;

public class UserService {
	private UserDAO userDAO;
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void save(User user){
		userDAO.save(user);
	}
	
}
