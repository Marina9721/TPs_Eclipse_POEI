package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.CharacterService;
import entity.Character;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CharacterService service;

    public UpdateController() {
        super();
        service = new CharacterService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = -1;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		}catch(Exception e) {
			
		}
		Character c = service.getById(id);
		
		request.setAttribute("character", c);
		request.getRequestDispatcher("UpdateView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("txtName");
			int level = Integer.parseInt(request.getParameter("txtLevel"));
			int size = Integer.parseInt(request.getParameter("txtSize"));
			String type = request.getParameter("txtType");
			
			Character c = new Character(id, name, level, size, type);
			service.update(c);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/show").forward(request, response);
	}

}
