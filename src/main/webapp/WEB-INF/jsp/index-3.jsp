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
	<!-- CONTINENTI -->

	<c:forEach items="${continentList}" var="nameContinent">
		<a href="/countryList?continent=${nameContinent}">
			${nameContinent} </a>
	</c:forEach>

	<table border=1 class="table">
		<tr>
			<td>Nazione</td>
			<td>Popolazione</td>
		</tr>

		<c:forEach items="${countryList}" var="country">
			<tr>
				<td><a href="/cityList?country=${country.codiceNazione}">${country.nomeNazione}</a></td>
				<td>${country.popolazione}</td>
				<td>${country.codiceNazione}</td>

			</tr>
		</c:forEach>
	</table>

	<table border=1 class="table">
		<tr>
			<td>Città</td>
			<td>Popolazione</td>
		</tr>

		<c:forEach items="${cityList}" var="city">
			<tr>
				<td>${city.name}</td>
				<td>${city.population}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>