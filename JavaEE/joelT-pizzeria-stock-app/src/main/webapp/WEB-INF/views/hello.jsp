<%@page import="fr.model.Ingredient"%>
<%@page import="java.util.List"%>
<%@ page  isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste Pizzas</title>
<link
	href="<%= request.getContextPath() %>/css/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
</head>



<body>
	<header>
	<h1>Liste des ingredients :</h1>
	</header>
	<p>  <c:out value=" ${sessionScope.name} "/></p>
	<div>
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>nom</th>
					<th>prix</th>
					<th>quantité</th>
				</tr>
			</thead>
			<tbody>



				<c:forEach var="ingredients" items="${listIngredient}">
				<tr>
					<td>${ingredients.id}</td>
					<td>${ingredients.nom}</td>
					<td>${ingredients.prix}</td>
					<td>${ingredients.quantite}</td>
						<td><a href="/pizzeria-admin-app/api/pizza/edit?code=${pizza.code}"><button  type="button" class="btn btn-secondary">Modifier</button></a></td>
						
						<td><a href="/pizzeria-admin-app/api/pizza/delete?code=${pizza.code}"><button type="button" class="btn btn-secondary" >Supprimer</button> </a></td>
				</tr>				
				</c:forEach>
				
			</tbody>


		</table>
	</div>
</body>
</html>