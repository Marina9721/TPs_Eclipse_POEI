package ControllerAnnonce;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Annonce;
import services.AnnonceService;

@WebServlet("/updateannonce")
public class UpdateControllerAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	AnnonceService service;

    public UpdateControllerAnnonce() {
        super();
        service = new AnnonceService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String categorie  = "";
		try {
			categorie = request.getParameter("categorie");			
		} 
		catch (Exception e) {	
		}
		
		Annonce a = service.getByCategorie(categorie);		
		request.setAttribute("annonce", a);		
		request.getRequestDispatcher("UpdateAnnonceView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			int id = Integer.parseInt(request.getParameter("id"));
			String titre = request.getParameter("txtTitre");
			String photos = request.getParameter("photos");
			int prix = Integer.parseInt(request.getParameter("prix"));
			String description = request.getParameter("description");
			String categorie = request.getParameter("categorie");
			
			Annonce a = new Annonce(id, titre, photos, prix, description, categorie);
			service.update(a);
						
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/showannonce").forward(request, response);
		
	}

}