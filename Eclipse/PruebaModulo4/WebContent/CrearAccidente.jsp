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
<h1>Agregar accidente</h1>
<c:if test="${camensaje != null}">
	<h3><c:out value="${camensaje}"></c:out></h3>
</c:if>

<form method="post" action="AgregarAccidente">
	
	Fecha: <input type="text" name="fecha" /><br/>
	Hora: <input type="text" name="hora" /><br/>
	Suceso: <input type="text" name="suceso" /><br/>
	Lugar: <input type="text" name="lugar" /><br/>
	Rut: <input type="text" name="rut" /><br/>
	Dias perdidos: <input type="text" name="dias_perdidos" /><br/>
	Numero trabajadores: <input type="text" name="num_trab" /><br/>
	<input type="submit" value="Agregar accidente" />
</form>
</body>
</html>