<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="VerifAgeServlet" method="POST">
	date de naissance:<input type="number" name="a"></br>
	<input type="submit" name="BT_CALC" value="calculer">

</form>
<h1>resultat  :</h1>
${resultat}
</body>
</html>