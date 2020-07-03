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


<h1>Eliminar Empleado</h1>

<c:if test="${eemensaje != null}">
	<h3><c:out value="${eemensaje}"></c:out></h3>
</c:if>

<form method="get" action="EliminarEmpleado">

	Rut Empleado: <input type="text" name="rut_empleado" /><br/><br/>
	
	<input type="submit" value="Eliminar empleado" />
	
</form>
</body>
</html>