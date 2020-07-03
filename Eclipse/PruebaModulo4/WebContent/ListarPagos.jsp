<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de pagos</title>
</head>
<body>

<h1>Listado de pagos</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<table>
	<tr>
		<th>Rut</th>
		<th>Fecha pago</th>
		<th>Monto regular</th>
		<th>Monto adicional</th>
		
		
	</tr>
	<c:forEach items="${listaPago}" var="pagos">
	<tr>
		<td>${pago.getRutcliente()}</td>
		<td>${pago.getMesanio()}</td>
		<td>${pago.getMontoregular()}</td>
		<td>${pago.getMontoadicionales()}</td>
		
		<td>
			<a href="${pageContext.request.contextPath}/EliminarCliente?id=${pago.getIdCliente()}">Eliminar</a>&nbsp;
			<a href="${pageContext.request.contextPath}/EditarCliente?id=${pago.getIdCliente()}">Editar</a>&nbsp;
		</td>
	</tr>
	</c:forEach>
</table>
<br/>
<a href="${pageContext.request.contextPath}/ListadoPagos">Listado</a>

</body>
</html>