<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="intro.jpa.entity.Character" %>   
<%@ page import="services.CharacterService" %>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show View</title>
	</head>
	<body>
		<h1>Liste des personnages :</h1>
		
		<table>
			<thead>
				<tr> 
					<th>id</th> 
					<th>nom</th>
					<th>niveau</th>
					<th>type</th>
					<th>taille</th>
					<th>update</th>
					<th>delete</th>
				</tr>
			</thead>

			<tbody>
				<% for (Character c : new CharacterService().getAll() ) {%>
					<tr>
						<td> <%= c.getId() %> </td>
						<td> <%= c.getName() %> </td>
						<td> <%= c.getLevel() %> </td>
						<td> <%= c.getType() %> </td>
						<td> <%= c.getSize() %> </td>
						<td> <a href='/Characters-MVC/update?id=<%= c.getId() %>'>update</a> </td>
						<td> <a href='/Characters-MVC/delete?id=<%= c.getId() %>'>delete</a> </td>
					</tr>
				<% } %>
			</tbody>
		</table>
					
		<a href='/Characters-MVC/add'>Create</a>
		
	</body>
</html>