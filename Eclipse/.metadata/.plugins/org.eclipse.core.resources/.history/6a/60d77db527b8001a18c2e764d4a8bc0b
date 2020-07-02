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

<h1>Editar cliente</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<form method="post" action="EditarCliente">
	Nombre: <input type="text" name="nombre" value="${regcli.getNombre()}" /><br/>
	Telefono: <input type="text" name="telefono"  value="${regcli.getTelefono()}" /><br/>
	Correo electrónico: <input type="text" name="correo" value="${regcli.getCorreoelectronico()}" /><br/>
	Rubro: <input type="text" name="rubro" value="${regcli.getRubro()}" /><br/>
	Dirección: <input type="text" name="direccion" value="${regcli.getDireccion()}" /><br/>
	<input type="hidden" name="idcliente" value="${regcli.getIdCliente()}" />
	<input type="submit" value="Agregar cliente" value="${regcli.getNombre()}" />
</form>

</body>
</html>