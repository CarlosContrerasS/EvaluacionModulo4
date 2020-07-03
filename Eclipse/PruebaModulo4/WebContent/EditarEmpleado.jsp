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
<h1>Editar Empleado</h1>
<c:if test="${eemensaje != null}">
	<h3><c:out value="${eemensaje}"></c:out></h3>
</c:if>

<form method="post" action="EditarEmpleado">
	Nombre: <input type="text" name="nombre" value="${regcli.getNombreempleado()}" /><br/><br/>
	Especialidad: <input type="text" name="especialidad"  value="${regcli.getEspecialidad()}" /><br/><br/>

	<input type="hidden" name="rut_empleado" value="${regcli.getRut_empleado()}" />
	<input type="submit" value="Agregar empleado" value="${regcli.getNombreempleado()}" />
</form>
</body>
</html>