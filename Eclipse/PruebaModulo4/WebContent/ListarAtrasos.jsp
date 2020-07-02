<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>

	<tr>
		<th>rut</th>
		<th>nombre</th>
		<th>idpago</th>
		<th>mesanio</th>
		<th>montoregular</th>
		<th>montoadicionales</th>
	</tr>
	<c:forEach items="${listaAtrasos}" var="atrasos">
	<tr>
		<td>${atrasos.getRut()}</td>
		<td>${atrasos.getNombre()}</td>
		<td>${atrasos.getIdpago()}</td>
		<td>${atrasos.getMesanio()}</td>
		<td>${atrasos.getMontoregular()}</td>
		<td>${atrasos.getMontoAdicionales()}</td>

	</tr>
	</c:forEach>
</table>

</body>
</html>