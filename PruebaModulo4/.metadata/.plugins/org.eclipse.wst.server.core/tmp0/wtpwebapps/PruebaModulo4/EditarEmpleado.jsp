<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Empleado</title>
</head>
<body>

<h1>Editar Empleado</h1>
<c:if test="${eemensaje != null}">
	<h3><c:out value="${eemensaje}"></c:out></h3>
</c:if>

<form method="get" action="EditarEmpleado">
	Nombre: <input type="text" name="nombre" value="${regemp.getNombreempleado()}" /><br/><br/>
	Especialidad: <input type="text" name="especialidad"  value="${regemp.getEspecialidad()}" /><br/><br/>

	<input type="hidden" name="idempleado" value="${regemp.getIdempleado()}" />
	<input type="submit"  value="Agregar empleado" value="${regemp.getNombreempleado()}" />
</form>

</body>
</html>