<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create View</title>
</head>
<body>
	<h1>Create</h1>
	
	<form action="/LeBonCoin/addannonce" method="post">
		<label for='txtTitre'>titre</label>
        <input type='text' name='txtTitre'> <br/>
        
        
            <label>categories</label>
            <select name = "categorie" id="categories">
            <option value="immobilier">Immobilier</option>
            <option value="voiture">Voiture</option>
            <option value="divers">Divers</option>
            </select>
            
        </input>
        
        <br/>
			
		<label for='txtDate'>date</label>
		<input type='date' name='txtDate'> <br/>
		
		<label for='urlPhoto'>Photo</label>
		<input type='text' name='urlPhoto'> <br/>
		
		<label for='prix'>Prix</label>
		<input type='number' name='prix'> <br/>
		
		<label for='description'>Description</label>
		<input type='text' name='description'> <br/>
		
		<label for='id'>id utilisateur</label>
		<input type='number' name='id'> <br/>
		
		<input type='submit' value='Valider'>
	</form>
	
</body>
</html>