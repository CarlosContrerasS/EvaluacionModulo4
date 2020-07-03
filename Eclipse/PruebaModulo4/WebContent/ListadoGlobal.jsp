<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado Global</title>
</head>
<body>
<h1>Listado Global</h1>

<table>
	<tr>
		<th>Rut Cliente</th>
		<th>Nombre Cliente</th>
		<th>Fecha de Visita</th>
		<th>Rut de Empleado</th>
		<th>Monto Regular</th>
		<th>Fecha de Accidente</th>
		<th>Fecha de Pago</th>
		<th>Suceso</th>
	</tr>
	<c:forEach items="${listaglobal}" var="listado">
	<tr>
		<td>${listado.getRut_cliente()}</td>
		<td>${listado.getNombre_cliente()}</td>
		<td>${listado.getFecha_visita()}</td>
		<td>${listado.getRut_empleado()}</td>
		<td>${listado.getMontoregular()}</td>
		<td>${listado.getFecha_accidente()}</td>
		<td>${listado.getMesanio()}</td>
		<td>${listado.getSuceso()}</td>
	</tr>
	</c:forEach>
</table>
<br/>


</body>
</html>

