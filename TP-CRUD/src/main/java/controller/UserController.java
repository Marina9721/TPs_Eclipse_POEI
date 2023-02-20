package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.User;
import services.UserService;

@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService service;

    public UserController() {
    	super();
    	service = new UserService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = -1;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		}catch(NumberFormatException e){
		}
		
		response.setContentType("application/json");
		String json="";
		
		if(id != -1) {
			json = new Gson().toJson(service.getUserById(id));
		}else {
			json = new Gson().toJson(service.getAllUser().toArray());
		}
		
		response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u = service.createUserFromRequest(request);
		
		if(u != null) {
			if(service.createUser(u) == true) {
				response.setStatus(201);
			}else {
				response.setStatus(405);
			}
		}else {
			response.setStatus(400);
		}
		
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User u = service.createUserFromRequest(request);
		
		if(u != null) {
			if(service.updateUser(u) == true) {
				response.setStatus(200);
			}else {
				response.setStatus(405);
			}
		}else {
			response.setStatus(400);
		}
	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			
			if(service.deleteUser(id) == true) {
				response.setStatus(200);
			}else {
				response.setStatus(405);
			}
		}catch(Exception e){
			response.setStatus(400);
		}
		
	}

}
