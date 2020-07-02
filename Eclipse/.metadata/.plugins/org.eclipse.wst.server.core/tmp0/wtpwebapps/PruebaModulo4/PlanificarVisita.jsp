<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Planificar Visita</title>
</head>
<body>
<body>
<h1>Planificar Visita</h1>

<form method="post" action="PlanificarVisita">
	Rut Cliente: <input type="text" name="rut" /><br/><br/>
	Rut Empleado: <input type="text" name="rut_empleado" /><br/><br/>
	Dirección: <input type="text" name="direccion" /><br/><br/>
	fecha: <input type="text" name="fecha" /><br/><br/>
	suceso: <input type="text" name="suceso" /><br/><br/>
	<input type="submit" value="Ingresar" />
</form>

</body>
</html>

