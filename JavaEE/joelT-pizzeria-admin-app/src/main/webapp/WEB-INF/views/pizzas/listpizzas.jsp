<%@page import="fr.model.Pizza"%>
<%@page import="java.util.List"%>
<%@page import="fr.dao.PizzaDaoBaseJPA"%>
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
	<h1>Liste des Pizzas :</h1>
	</header>
	<div>
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>Reference</th>
					<th>Nom</th>
					<th>Prix</th>
				</tr>
			</thead>
			<tbody>


				<% List<Pizza> list = (List<Pizza>) request.getAttribute("listPizza");
        for (Pizza p : list) {    %>

				<tr>
					<td><%=p.getId() %></td>
					<td><%=p.getCode() %></td>
					<td><%=p.getNom() %></td>
					<td><%=p.getPrix() %></td>
					<td><img class="img-responsive"
						src="<%= request.getContextPath() %><%=p.getUrl() %>"
						style="width: 15%" /></td>
						<td><a href="/pizzeria-admin-app/api/servlet/edit?code=<%=p.getCode() %>"><button  type="button" class="btn btn-secondary">Modifier</button></a></td>
						
						<td><a href="/pizzeria-admin-app/api/servlet/delete?code=<%=p.getCode() %>"><button type="button" class="btn btn-secondary" >Supprimer</button> </a></td>
				</tr>
				<%
        }
    %>
			</tbody>


		</table>
	</div>
</body>
</html>