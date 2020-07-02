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

<h1>Listado de clientes</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<table>
	<tr>
		<th>Nombre</th>
		<th>Telefono</th>
		<th>Correo electrónico</th>
		<th>Rubro</th>
		<th>Direccion</th>
		<th>Acciones</th>
	</tr>
	<c:forEach items="${listaclientes}" var="cliente">
	<tr>
		<td>${cliente.getNombre()}</td>
		<td>${cliente.getTelefono()}</td>
		<td>${cliente.getCorreoelectronico()}</td>
		<td>${cliente.getRubro()}</td>
		<td>${cliente.getDireccion()}</td>
		<td>
			<a href="${pageContext.request.contextPath}/EliminarCliente?id=${cliente.getIdCliente()}">Eliminar</a>&nbsp;
			<a href="${pageContext.request.contextPath}/EditarCliente?id=${cliente.getIdCliente()}">Editar</a>&nbsp;
		</td>
	</tr>
	</c:forEach>
</table>
<br/>
<a href="${pageContext.request.contextPath}/AgregarCliente">Agregar cliente</a>

</body>
</html>