<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Peux-tu voter ?</title>
</head>
<body>
<form action="MajeurServlet" method="POST">
	Nom : <input type="text" name="nom" value="${votant.nom }"></br>
	Prénom : <input type="text" name="prenom" value="${votant.prenom }"></br>
	Date de naissance : <input type="date" name="ddn" value="${votant.ddn }"></br>
	
	Nationalité : <select id="nationalite" name="nationalite" value="${votant.nationalite }">
		<option id="France">FRANCAIS</option>
		<option id="Suisse">SUISSE</option>
		<option id="Belgique">BELGE</option>
	</select> </br>
	
	<input type="checkbox" id="casier" name="casier" required>
	<label for="casier">Je certifie avoir un casier judiciaire vierge</label>
	</br>
	
	<fieldset>
		Homme : <input type="radio" id="radioH" name="radio" ></br>
		
		Femme : <input type="radio" id="radioF" name="radio" ></br>
		
	</fieldset>
	</br>
	
	<input type="submit" name="BT_VALID" value="Valider"/>

</form>
<h1>Peux-tu voter ? </h1>
${resultat}
</body>
</html>