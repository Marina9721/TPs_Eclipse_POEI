<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Update view</title>
	</head>
	<body>
		<h1>Update View</h1>
		<form method="post">
			<label for="txtId">Id</label>
			<input type="number" name="txtId" disabled="disabled" value="${character.id}"></br>
			
			<label for="txtName">Nom</label>
			<input type="text" name="txtName" value="${character.name}"></br>
			
			<label for="txtLevel">Niveau</label>
			<input type="number" name="txtLevel" value="${character.level}"></br>
			
			<label for="txtSize">Taille</label>
			<input type="number" name="txtSize" value="${character.size}"></br>
			
			<label for="txtType">Type</label>
			<input type="text" name="txtType" value="${character.type}"></br>
			
			<input type="submit" value="Valider">
		</form>
	</body>
</html>