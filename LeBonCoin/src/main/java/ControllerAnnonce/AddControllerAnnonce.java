package ControllerAnnonce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Annonce;
import services.AnnonceService;

@WebServlet("/addannonce")
public class AddControllerAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AnnonceService service;
	
	public AddControllerAnnonce() {
		super();
		service = new AnnonceService();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("CreateAnnonce.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String titre = request.getParameter("txtTitre");
			String date = request.getParameter("txtDate");
			String urlPhoto = request.getParameter("urlPhoto");
			int prix = Integer.parseInt(request.getParameter("prix"));
			String categorie = request.getParameter("categorie");
			String description = request.getParameter("description");
			int id_utilisateur = Integer.parseInt(request.getParameter("id_utilisateur"));

			Annonce a = new Annonce(titre, date, urlPhoto, prix, categorie, description, id_utilisateur);
			service.create(a);
			
			request.getRequestDispatcher("show").forward(request, response);
			
		} catch (Exception e) {
			 doGet(request, response);
		}
		
		
		
	}
}