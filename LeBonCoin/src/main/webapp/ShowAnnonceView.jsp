<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="entity.Annonce" %>   
<%@ page import="services.AnnonceService" %>    
    
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="style.css" type="text/css" media="screen" />
    
        <meta charset="ISO-8859-1">
        <title>Show View</title>
    </head>
    <body>
    		<div class="topnav">
				  <a class="active" href="index.html">Accueil</a>
				  <a href="ShowAnnonceView.jsp">Annonces</a>
				  <a href="ShowUtilisateurView.jsp">Liste des utilisateurs</a>
				  <a href="">A propos de nous</a>
				  <a href="CreateUtilisateur.jsp">Créer un compte</a>
				  <a href="">Se connecter</a>
			</div>
    
        <h1>Liste des annonces :</h1>
        
        <table>
            <thead>
                <tr> 
                	<th>Photo</th>
                    <th>Titre</th>
                    <th>Catégorie</th>
                   <!-- <th>id_utilisateur</th> -->
                    <th>Date de publication</th>
                    <th>Prix</th>
                    <th>Description</th>
                </tr>
            </thead>
            <tbody>
                <% for ( Annonce a : new AnnonceService().getAll() ) {%>
                    <tr>
                    	<td> <%= a.getPhotos() %> </td>
                        <td> <%= a.getTitre() %> </td>
                        <td> <%= a.getCategorie() %> </td>
                      <!-- <td> <%= a.getId_utilisateur() %> </td> -->
                        <td> <%= a.getDatePublication() %> </td>
                        <td> <%= a.getPrix() %> </td>
                        <td> <%= a.getDescription() %> </td>
                        <td> <a href='/LeBonCoin/updateannonce?id=<%= a.getId() %>'><button id="mybutton">Mettre à jour</button></a> </td>
                        <td> <a href='/LeBonCoin/deleteannonce?id=<%= a.getId() %>'><button id="mybutton">Supprimer</button></a> </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        
        <a href='/LeBonCoin/addannonce'><button id="mybutton">Déposer une annonce</button></a>
        
    </body>
</html>