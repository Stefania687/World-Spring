<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<form action="/details" method="get">
			<label>Inserisci città <input type="text" name="nomeCitta"></label>
			<input type="submit" name="submit">
		</form>
	</div>
	<div>
		<h3>Dettagli Città</h3>
		<p>${city.name}- ${city.countryCode} - ${city.district} -
			${city.population}</p>
	</div>

</body>
</html>