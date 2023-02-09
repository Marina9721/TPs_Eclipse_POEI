<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
		<meta charset="ISO-8859-1">
		<title>Create View</title>
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
		
			<h1>Créer un compte</h1>
			<form method="post">
				<label for='nomUtilisateur'>Nom d'utilisateur : </label>
				<input type='text' name='nomUtilisateur'> <br/>
				
				<label for='txtNom'>Nom : </label>
				<input type='text' name='txtNom'> <br/>
				
				<label for='txtPrenom'>Prénom: </label>
				<input type='text' name='txtPrenom'> <br/>
				
				<label for='email'>Email : </label>
				<input type='text' name='email'> <br/>
				
				<label for='motDePasse'>Mot de passe: </label>
				<input type='password' name='motDePasse'> <br/>
				
				<input class='button' type='submit' value='Créer'>
			</form>
	</body>
</html>