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
<h1>Listado de accidentes</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<table>
	<tr>
		<th>Fecha</th>
		<th>Hora</th>
		<th>Suceso</th>
		<th>Lugar</th>
		<th>Rut</th>
		<th>Dias perdidos</th>
		<th>Numero trabajadores</th>
	</tr>
	<c:forEach items="${listaaccidentes}" var="accidente">
	<tr>
		<td>${accidente.getFecha()}</td>
		<td>${accidente.getHora()}</td>
		<td>${accidente.getSuceso()}</td>
		<td>${accidente.getLugar()}</td>
		<td>${accidente.getRut()}</td>
		<td>${accidente.getDias()}</td>
		<td>${accidente.getNum_trab()}</td>
	</tr>
	</c:forEach>
</table>
<br/>
</body>
</html>