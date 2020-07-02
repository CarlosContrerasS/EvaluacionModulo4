<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Visita</title>
</head>
<body>
<body>
<h1>Agregar Visita</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<form method="post" action="AgregarVisita">
	Rut Cliente: <input type="text" name="rut" /><br/><br/>
	Rut Empleado: <input type="text" name="rut_empleado" /><br/><br/>
	Dirección: <input type="text" name="direccion" /><br/><br/>
	Ciudad: <input type="text" name="ciudad" /><br/><br/>
	fecha: <input type="text" name="fecha" /><br/><br/>
	Resumen: <input type="text" name="resumen" /><br/><br/>
	Observaciones: <input type="text" name="observaciones" /><br/><br/>
	<input type="submit" value="Ingresar" />
</form>

</body>
</html>