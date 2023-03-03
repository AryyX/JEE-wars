<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculatrice en ligne</title>
</head>
<body>
<form action="CalculatriceServlet" method="POST">
	Premier chiffre : <input type="text" name="a" value=""></br>
	Second chiffre : <input type="text" name="b" value=""></br>
	Type d'opération :</br>
	+<input type="radio" id="op" name="radio" value="addition"></br>
	-<input type="radio" id="op" name="radio" value="soustraction"></br>
	*<input type="radio" id="op" name="radio" value="multiplication"></br>
	/<input type="radio" id="op" name="radio" value="division"></br>
	
	<input type="submit" name="BT_CALC" value="Calculer"/>

</form>
<h1>Résultat : </h1>
${resultat}

<h2>Historique : </h2>
${historique}
</body>
</html>