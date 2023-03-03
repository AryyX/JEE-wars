<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Voiture</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col">
			<form action="VoitureServlet" method="post" class="row g-3">
			
				<h1>Ajouter une voiture </h1></br> 
				
				<input type="hidden" name="idModify" value="${model.idModify}"/>
				
				<label for="marque" class="form-label">Marque</label>
				<input class="form-control" type="text" name="marque" id="marque" value="${model.current.marque}"/>
				
				<label for="modele" class="form-label">Modele</label>
				<input class="form-control" type="text" name="modele" id="modele" value="${model.current.modele}"/>
				
				<label for="nom" class="form-label">Nom</label>
				<input class="form-control" type="text" name="nom" id="nom" value="${model.current.nom}"/>
				
				<label for="prix" class="form-label">Prix</label>
				<input class="form-control" type="number" name="prix" id="prix" value="${model.current.prix}"/>
				
				<input type="submit" name="BT_VALID" class="btn btn-primary" value="Valider" />
					
			</form>
		</div>
	
		
		<div class="col" align="center">
			<h1>Liste des voiture </h1></br> 
			<c:forEach items="${model.list}" var="voiture">
				<p>${voiture.marque} ${voiture.modele} ${voiture.nom} ${voiture.prix}    
				<a class="btn btn-primary" href="VoitureServlet?BT_MODIFY=${voiture.id}">Modifier</a>
				<a class="btn btn-primary" href="VoitureServlet?BT_DELETE=${voiture.id}">Supprimer</a></p>
			</c:forEach>
		</div>
	</div>
</div>

</body>
</html>