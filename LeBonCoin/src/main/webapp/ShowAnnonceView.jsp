<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="entity.Annonce" %>   
<%@ page import="services.AnnonceService" %>    
    
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Show View</title>
    </head>
    <body>
        <h1>Liste des annonces :</h1>
        
        <table>
            <thead>
                <tr> 
                    <th>titre</th>
                    <th>categorie</th>
                    <th>id_utilisateur</th> 
                    <th>DatePublication</th>
                    <th>photos</th>
                    <th>prix</th>
                    <th>description</th>
                    <th>update</th>
                    <th>delete</th>
                </tr>
            </thead>
            <tbody>
                <% for ( Annonce a : new AnnonceService().getAll() ) {%>
                    <tr>
                        <td> <%= a.getTitre() %> </td>
                        <td> <%= a.getCategorie() %> </td>
                        <td> <%= a.getId_utilisateur() %> </td>
                        <td> <%= a.getDatePublication() %> </td>
                        <td> <%= a.getPhotos() %> </td>
                        <td> <%= a.getPrix() %> </td>
                        <td> <%= a.getDescription() %> </td>
                        <td> <a href='/LeBonCoin/updateannonce?id=<%= a.getId() %>'>update</a> </td>
                        <td> <a href='/LeBonCoin/deleteannonce?id=<%= a.getId() %>'>delete</a> </td>
                    </tr>
                <% } %>
            </tbody>
        </table>
        
        <a href='/LeBonCoin/addannonce'>Create</a>
        
    </body>
</html>