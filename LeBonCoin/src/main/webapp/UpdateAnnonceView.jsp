<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
		<meta charset="ISO-8859-1">
		<title>Update View</title>
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
	
    	<h1>Modifier une annonce :</h1>
    
   		 <form method="post">
   		 	<label for="txtId">Id</label>
			<input type="number" name="txtId" disabled="disabled" value="${annonce.id}"><br/>
			
	        <label for='txtTitre'>Titre</label>
	        <input type='text' name='txtTitre' value="${annonce.titre}"> <br/>
	        
	            <label>Categorie</label>
	            <select name = "categorie">
	            <option value="immobilier">Immobilier</option>
	            <option value="voiture">Voiture</option>
	            <option value="divers">Divers</option>
	            </select>

	        
	        <br/>
	        
	        <label for='urlPhoto'>Photo</label>
	        <input type='text' name='urlPhoto' value="${annonce.photos}"> <br/>
	        
	        <label for='prix'>Prix</label>
	        <input type='number' name='prix' value="${annonce.prix}"> <br/>
	        
	        <label for='description'>Description</label>
	        <input type='text' name='description' value="${annonce.description}"> <br/>
	        
	        <input type='submit' value='Confirmer'>
    	</form>
    
	</body>
</html>