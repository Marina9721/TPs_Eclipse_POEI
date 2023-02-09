<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
		<meta charset="UTF-8">
		<title>Update Utilisateur View</title>
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
			
		<h1>Modifier un utilisateur :</h1>
		
		<form method="post" >
			<label for="txtId">Id</label>
			<input type="number" name="txtId" disabled="disabled" value="${utilisateur.id}"><br/>
			
			<label for='nomUtilisateur'>Nom d'utilisateur : </label>
			<input type='text' name='nomUtilisateur' value="${utilisateur.nomUtilisateur}"> <br/>
				
			<label for='txtNom'>Nom : </label>
			<input type='text' name='txtNom' value="${utilisateur.nom}"> <br/>
				
			<label for='txtPrenom'>Prénom: </label>
			<input type='text' name='txtPrenom' value="${utilisateur.prenom}"> <br/>
				
			<label for='email'>Email : </label>
			<input type='text' name='email' value="${utilisateur.email}"> <br/>
				
			<label for='motDePasse'>Mot de passe: </label>
			<input type='password' name='motDePasse' value="${utilisateur.motDePasse}"> <br/>
				
			<input type='submit' value='Confirmer'>
		</form>
	
	</body>
</html>