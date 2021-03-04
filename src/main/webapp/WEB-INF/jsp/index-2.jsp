<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="/country" method="get">
			<label>Inserisci Nazione: <input type="text" name="nome" placeholder="es_italia" /></label>
			<label>Inserisci Continente: <input type="text" name="continente" placeholder="es_europa" /></label>
			<input type="submit" name="submit">
		</form>

		<div>
			<h2>Dettagli nazione:</h2>
			<table border=1>

				<tr>
					<td>Codice Nazione</td>
					<td>Nome Nazione</td>
					<td>Continente</td>
					<td>Popolazione</td>
					<td>Estensione geografica</td>
				</tr>

				<c:forEach items="${countries}" var="country">
					<tr>
						<td>${country.codiceNazione}</td>
						<td>${country.nomeNazione}</td>
						<td>${country.continente}</td>
						<td>${country.popolazione}</td>
						<td>${country.estensioneGeografica}</td>
					</tr>
				</c:forEach>

			</table>
		</div>

	</div>
</body>
</html>