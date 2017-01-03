<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client Pizzeria</title>
<script src="https://code.jquery.com/jquery-1.12.3.js"></script>
</head>


<body>
<div id = "stage" style = "background-color:#cc0;">
         Client
      </div>

<script>
(function() {
	   var flickerAPI = "http://localhost:8080/pizzeria-admin-app/api/clients";
	     $.getJSON( flickerAPI, {
	       format: "json"
	     })
	     .done(function( data ) {
	    	 data.forEach(function(elem){
	    		 $('#stage').html('<p> Nom: ' + elem.id + '</p>');
	             $('#stage').append('<p>Prenom : ' + elem.lastname+ '</p>');
	             $('#stage').append('<p>email : ' + elem.email+ '</p>');
	             $('#stage').append('<p>mot de passe : ' + elem.mdp+ '</p>');
	    	 })
	    	 

	     });
	 })();
</script>
</body>
</html>