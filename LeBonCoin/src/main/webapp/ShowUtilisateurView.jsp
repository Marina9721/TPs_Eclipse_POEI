<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="entity.Utilisateur" %>   
<%@ page import="services.UtilisateurService" %>    
    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Show View</title>
    </head>
    <body>
        <h1>Liste des utilisateurs :</h1>
        
        <table>
            <thead>
                <tr> 
                    <th>id Utilisateur</th>
                    <th>nom Utilisateur</th>
                    <th>nom</th> 
                    <th>prenom</th>
                    <th>email</th>
                    <th>mot de passe</th>
                    <th>update</th>
                    <th>delete</th>
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
                        <td> <a href='/LeBonCoin/updateutilisateur?id=<%= c.getId() %>'>update</a> </td>
                        <td> <a href='/LeBonCoin/deleteutilisateur?id=<%= c.getId() %>'>delete</a> </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        
        <a href='/LeBonCoin/addutilisateur'>Create</a>
        
    </body>
</html>