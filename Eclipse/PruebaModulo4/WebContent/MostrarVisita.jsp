<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar Visita Agendada</title>
</head>
<body>
<h1>Mostrar Visita Agendada</h1>

<table>
	<tr>
		<th>Dirección</th>
		<th>Ciudad</th>
		<th>Fecha</th>
		<th>Resumen</th>
		<th>Observaciones</th>
		<th>Rut Cliente</th>
		<th>Rut Empleado</th>
		<th>Acción</th>
	</tr>
	<c:forEach items="${listavisita}" var="visita">
	<tr>
		<td>${visita.getDireccion()}</td>
		<td>${visita.getCiudad()}</td>
		<td>${visita.getFecha()}</td>
		<td>${visita.getResumen()}</td>
		<td>${visita.getObservaciones()}</td>
		<td>${visita.getRut()}</td>
		<td>${visita.getRut_Empleado()}</td>
		<td>
			<a href="${pageContext.request.contextPath}/EliminarVisita?idvisita=${visita.getIdvisita()}">Eliminar</a>&nbsp;
		</td>
	</tr>
	</c:forEach>
</table>
<br/>
<a href="${pageContext.request.contextPath}/AgregarVisita">Agregar Visita</a>

</body>
</html>