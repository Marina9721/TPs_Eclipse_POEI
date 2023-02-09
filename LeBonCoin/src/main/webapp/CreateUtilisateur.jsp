<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
		<title>Create View</title>
	</head>
		<body>
			<h1>Create Utilisateur</h1>
			<form action="/LeBonCoin/addutilisateur" method="post">
				<label for='nomUtilisateur'>Nom utilisateur : </label>
				<input type='text' name='nomUtilisateur'> <br/>
				
				<label for='txtNom'>Nom : </label>
				<input type='text' name='txtNom'> <br/>
				
				<label for='txtPrenom'>Prenom: </label>
				<input type='text' name='txtPrenom'> <br/>
				
				<label for='email'>Email : </label>
				<input type='text' name='email'> <br/>
				
				<label for='motDePasse'>Mot de passe: </label>
				<input type='password' name='motDePasse'> <br/>
				
				<input type='submit' value='Valider'>
			</form>
		</body>
</html>