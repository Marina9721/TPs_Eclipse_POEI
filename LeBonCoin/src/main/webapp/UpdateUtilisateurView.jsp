<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Update Utilisateur View</title>
	</head>
	
	<body>
		<h1>Modifier un utilisateur :</h1>
		
		<form method="post" >
			<label for="txtId">Id</label>
			<input type="number" name="txtId" disabled="disabled" value="${utilisateur.id}"><br/>
			
			<label for='nomUtilisateur'>Nom utilisateur : </label>
			<input type='text' name='nomUtilisateur' value="${utilisateur.nomUtilisateur}"> <br/>
				
			<label for='txtNom'>Nom : </label>
			<input type='text' name='txtNom' value="${utilisateur.nom}"> <br/>
				
			<label for='txtPrenom'>Prenom: </label>
			<input type='text' name='txtPrenom' value="${utilisateur.prenom}"> <br/>
				
			<label for='email'>Email : </label>
			<input type='text' name='email' value="${utilisateur.email}"> <br/>
				
			<label for='motDePasse'>Mot de passe: </label>
			<input type='password' name='motDePasse' value="${utilisateur.motDePasse}"> <br/>
				
			<input type='submit' value='Valider'>
		</form>
	
	</body>
</html>