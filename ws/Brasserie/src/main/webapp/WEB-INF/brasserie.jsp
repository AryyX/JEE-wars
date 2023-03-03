<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Brasserie</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col">
			<form action="BrasserieServlet" method="POST" class="row g-3">
		
				<h1>Ajouter une brasserie </h1></br> 
				<label for="idBr" class="form-label">Identifiant</label>
				<input class="form-control" type="text" name="idBr" id="idBr" />
				
				<label for="nomBr" class="form-label">Nom</label>
				<input class="form-control" type="text" name="nomBr" id="nomBr" />
			
				<label for="cp" class="form-label">Code Postal</label>
				<input class="form-control" type="text" name="cp" id="cp"/>
				
				<label for="region" class="form-label">Region</label>
				<input class="form-control" type="text" name="region" id="region"/>
				
				<label for="adresse" class="form-label">Adresse</label>
				<input class="form-control" type="text" name="adresse" id="adresse"/>
				
				<input type="submit" name="BT_VALIDBR" class="btn btn-primary" value="Valider" />
					
				<h1>Ajouter une bière </h1></br> 
				
				<label for="idBi" class="form-label">Identifiant</label>
				<input class="form-control" type="text" name="idBi" id="idBi" />
				
				<label for="nomBi" class="form-label">Nom</label>
				<input class="form-control" type="text" name="nomBi" id="nomBi"/></br> 
				
				<label for="c" class="form-label">Brasserie</label>
				<select class="form-select" id="c">
					<c:forEach items="${model.historiqueBr}" var="brasserie">
						<option value="${brasserie.id}" >${brasserie.nom}</option>
					</c:forEach>
				</select>
				
				<label for="type" class="form-label">Type</label>
				<input class="form-control" type="text" name="type" id="type"/></br> 
				
				<label for="note" class="form-label">Note</label>
				<input class="form-control" type="text" name="note" id="note"/></br> 
				
				<label for="dateIns" class="form-label">Date d'insertion</label>
				<input class="form-control" type="date" name="dateIns" id="dateIns"/></br> 
				
				<input type="submit" name="BT_VALIDBI" class="btn btn-primary" value="Valider" />
		
			</form>
		</div>
	
		
		<div class="col" align="center">
			<h1>Liste des brasseries </h1></br> 
			<!--  <h4>${model.message}</h4>-->
			<c:forEach items="${model.historiqueBr}" var="brasserie">
				<p>${brasserie.nom} ${brasserie.region} ${brasserie.cp}</p>
			</c:forEach>
			
			<h1>Liste des bières </h1></br> 
			<!--  <h4>${model.message}</h4>-->
			<c:forEach items="${model.historiqueBi}" var="biere">
				<p>${biere.nom} ${biere.brasserie} ${biere.type} ${biere.note} ${biere.dateIns}</p>
			</c:forEach>
		</div>
	</div>
</div>
</body>
</html>