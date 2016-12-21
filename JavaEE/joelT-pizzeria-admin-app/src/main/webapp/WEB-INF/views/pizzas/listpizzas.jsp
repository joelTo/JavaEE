<%@page import="fr.model.Pizza"%>
<%@page import="java.util.List"%>
<%@page import="fr.dao.PizzaDaoBaseJPA"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste Pizzas</title>
<link
	href="<%= request.getContextPath() %>/css/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
</head>

	<script type="text/javascript">
	
 	function supprimerPizza(codePizza) {
 		<%PizzaDaoBaseJPA BasePizza =(PizzaDaoBaseJPA) request.getAttribute("PizzaBaseJPA"); 
 		BasePizza.delete(%>codePizza<%);%>
	}
	
	</script>

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
						style="width: 15%" /></th>
						<td><a href="/pizza/edit?code=<%=p.getCode() %>"><button> button type="button" class="btn btn-secondary">Modifier</button></a></td>
						<td><button type="button" class="btn btn-secondary" onclick='supprimerPizza(<%=p.getCode() %>)'>Supprimer</button></td>
				</tr>
				<%
        }
    %>
			</tbody>


		</table>
	</div>
</body>
</html>