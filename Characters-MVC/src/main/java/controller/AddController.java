package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Character;
import services.CharacterService;

@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CharacterService service;

    public AddController() {
        super();
        service = new CharacterService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("CreateView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name = request.getParameter("txtName");
			int level = Integer.parseInt(request.getParameter("txtLevel"));
			int size = Integer.parseInt(request.getParameter("txtSize"));
			String type = request.getParameter("txtType");
			
			Character c = new Character(name, level, size, type);
			service.add(c);
			
			request.getRequestDispatcher("show").forward(request, response);
		}catch(Exception e) {
			doGet(request, response);
		}

	}

}
