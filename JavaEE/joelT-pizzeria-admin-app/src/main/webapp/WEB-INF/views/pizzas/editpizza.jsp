<%@page import="fr.model.Pizza"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Pizza</title>
<link
	href="<%= request.getContextPath() %>/css/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<div>
<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Edition Pizza</legend>

<% Pizza p = (Pizza) request.getAttribute("PizzaAModifie");  %>


<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="codePizza">Code</label>  
  <div class="col-md-4">
  <input id="codePizza" name="codePizza" type="text" placeholder="<%p.getCode();%>" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="libellePizza">Libellé Pizza :</label>  
  <div class="col-md-4">
  <input id="libellePizza" name="libellePizza" type="text" placeholder="<%p.getNom();%>" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="prixPizza">Prix :</label>  
  <div class="col-md-4">
  <input id="prixPizza" name="prixPizza" type="text" placeholder="<%p.getPrix();%>" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="catPizza">Catégorie :</label>  
  <div class="col-md-4">
  <input id="catPizza" name="catPizza" type="text" placeholder="<%p.getCatPizza();%>" class="form-control input-md">
    
  </div>
</div>

<!-- File Button --> 
<div class="form-group">
  <label class="col-md-4 control-label" for="imgImport">Photos</label>
  <div class="col-md-4">
    <input id="imgImport" name="imgImport" class="input-file" type="file">
  </div>
</div>

<!-- Button (Double) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="buttonAdd"></label>
  <div class="col-md-8">
  <% p.setCode() ;  
  p.setCode(code) ;
  p.setCode(code) ;
  p.setCode(code) ;
  p.setCode(code) ;
  p.setCode(code) ;%>
    <button id="buttonAdd" name="buttonAdd" class="btn btn-success">Ajouter</button>
    <button id="buttonCancel" name="buttonCancel" class="btn btn-danger">Annuler</button>
  </div>
</div>

</fieldset>
</form>

</div>
<body>
</body>
</html>