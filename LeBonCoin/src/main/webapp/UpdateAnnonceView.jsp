<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update View</title>
</head>
<body>
    <h1>Update Annonce View</h1>
    
    <form action="/LeBonCoin/addannonce" method="post">
        <label for='txtTitre'>titre</label>
        <input type='text' name='txtTitre'> <br/>
        
            <label>categories</label>
            <select name = "categorie">
            <option value="immobilier">Immobilier</option>
            <option value="voiture">Voiture</option>
            <option value="divers">Divers</option>
            </select>
            
        </input>
        
        <br/>
        
        <label for='urlPhoto'>Photo</label>
        <input type='text' name='urlPhoto' value="${annonce.photos}"> <br/>
        
        <label for='prix'>Prix</label>
        <input type='number' name='prix' value="${annonce.prix}"> <br/>
        
        <label for='description'>Description</label>
        <input type='text' name='description' value="${annonce.description}"> <br/>
        
        <input type='submit' value='Valider'>
    </form>
    
</body>
</html>