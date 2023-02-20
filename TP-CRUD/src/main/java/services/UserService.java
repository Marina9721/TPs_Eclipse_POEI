package services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import dao.Database;
import entity.User;

public class UserService {
	
	//public void createUser(User u) {
		//Database.users.add(u);
	//}
	
	public boolean createUser(User u) {
		boolean found = false;
		for(User user: Database.users) {
			if(user.getId() == u.getId()) {
				found = true;
			}
		}
		
		if (found==false) {
			Database.users.add(u);
			return true;
		}else {
			return false;
		}
	}
	
	public User getUserById(int id) {
		for(User u : Database.users) {
			if(u.getId() == id) {
				return u;
			}
		}
		return null;
	}
	
	public ArrayList<User> getAllUser(){
		return Database.users;
	}
	
	public boolean updateUser(User u) {
		for(User user : Database.users) {
			if(u.getId() == user.getId()) {
				user.setAge(u.getAge());
				user.setName(u.getName());
				user.setEmail(u.getEmail());
				user.setPassword(u.getPassword());
				user.setNbArticles(u.getNbArticles());
				return true;
			}
		}
		return false;
	}
	 
	public boolean deleteUser(int id) {
		User found = null;
		for(User u : Database.users) {
			if(u.getId() == id) {
				found = u;
				Database.users.remove(found);
				break;
			}
		}
		
		if(found == null) {
			return false;
		}else {
			return true;
		}
	}

	public User createUserFromRequest(HttpServletRequest request) {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			int age = Integer.parseInt(request.getParameter("age"));
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			int nbArticles = Integer.parseInt(request.getParameter("nbArticles"));
			
			return new User(id, age, name, email, password, nbArticles);

		}catch(NumberFormatException e){
			System.out.println("Error in createUserFromRequest");
			return null;
		}

	}

	public static void main(String[] args) {
		UserService service = new UserService();
		
		System.out.println("Tous les utilisateurs : " + service.getAllUser());
		
		service.deleteUser(4);
		System.out.println("Remove user from db : " + service.getAllUser());
		
	}
	

}
