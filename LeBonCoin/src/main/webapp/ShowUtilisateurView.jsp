<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="entity.Utilisateur" %>   
<%@ page import="services.UtilisateurService" %>    
    
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
    
    
        <h1>Liste des utilisateurs :</h1>
        
        <table>
            <thead>
                <tr> 
                    <th>id utilisateur</th>
                    <th>Nom utilisateur</th>
                    <th>Nom</th> 
                    <th>Prénom</th>
                    <th>Email</th>
                    <th>Mot de passe</th>
                </tr>
            </thead>
            
            <tbody>
                <% for ( Utilisateur c : new UtilisateurService().getAll() ) {%>
                    <tr>
                        <td> <%= c.getId() %> </td>
                        <td> <%= c.getNomUtilisateur() %> </td>
                        <td> <%= c.getNom() %> </td>
                        <td> <%= c.getPrenom() %> </td>
                        <td> <%= c.getEmail() %> </td>
                        <td> <%= c.getMotDePasse() %> </td>
                        <td> <a href='/LeBonCoin/updateutilisateur?id=<%= c.getId() %>'><button id="mybutton">Mettre à jour</button></a> </td>
                        <td> <a href='/LeBonCoin/deleteutilisateur?id=<%= c.getId() %>'><button id="mybutton">Supprimer</button></a> </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        
        <a href='/LeBonCoin/addutilisateur'><button id="mybutton">Créer un compte</button></a>
        
    </body>
</html>