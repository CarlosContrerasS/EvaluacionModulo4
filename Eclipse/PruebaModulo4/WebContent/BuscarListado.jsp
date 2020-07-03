<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscar El Rut</title>
</head>
<body>
<h1>Listado de Rut</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>
<h2> Ingrese el rut de cliente para realizar el reporte global</h2><br/><br/>

<form method="post" action="ListadoGlobal">
	Rut Cliente: <input type="text" name="rut" /><br/><br/>
	<input type="submit" value="Ingresar" />
</form>

</body>
</html>
