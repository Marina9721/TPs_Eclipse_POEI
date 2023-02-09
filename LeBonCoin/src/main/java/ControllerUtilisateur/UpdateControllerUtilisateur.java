package ControllerUtilisateur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Utilisateur;
import services.UtilisateurService;

@WebServlet("/updateutilisateur")
public class UpdateControllerUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UtilisateurService service;

    public UpdateControllerUtilisateur() {
        super();
        service = new UtilisateurService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = -1;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		}catch(Exception e) {
		}
		
		Utilisateur u = service.getById(id);
		
		request.setAttribute("utilisateur", u);
		request.getRequestDispatcher("UpdateUtilisateurView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String nomUtilisateur = request.getParameter("nomUtilisateur");
			String nom = request.getParameter("txtNom");
			String prenom = request.getParameter("txtPrenom");
			String email = request.getParameter("email");
			String motDePasse = request.getParameter("motDePasse");
			
			Utilisateur u = new Utilisateur(id, nomUtilisateur, nom, prenom, email, motDePasse);
			service.update(u);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/showutilisateur").forward(request, response);
	}

}
