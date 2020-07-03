<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Empleado</title>
</head>
<body>

<h1>Agregar Empleado</h1>
<c:if test="${cemensaje != null}">
	<h3><c:out value="${cemensaje}"></c:out></h3>
</c:if>

<form method="post" action="AgregarEmpleado">
	Rut: <input type="text" name="rut_empleado" /><br/><br/>
	Nombre: <input type="text" name="nombre" /><br/><br/>
	Especialidad: <input type="text" name="especialidad" /><br/><br/>
	<input type="submit" value="Agregar empleado" />
</form>
</body>
</html>