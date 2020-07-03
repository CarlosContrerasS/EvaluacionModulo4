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
<h1>Agregar cliente</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<form method="post" action="AgregarCliente">
	Rut: <input type="text" name="rut" /><br/>
	Nombre: <input type="text" name="nombre" /><br/>
	Telefono: <input type="text" name="telefono" /><br/>
	Correo electrónico: <input type="text" name="correo" /><br/>
	Rubro: <input type="text" name="rubro" /><br/>
	Dirección: <input type="text" name="direccion" /><br/>
	<input type="submit" value="Agregar cliente" />
</form>

</body>
</html>