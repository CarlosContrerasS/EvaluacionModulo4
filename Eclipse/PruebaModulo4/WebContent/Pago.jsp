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
<h1>Agregar pago cliente</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

<form method="post" action="AgregarPago">
	RUT: <input type="text" name="rut" /><br/>
	Fecha pago: <input type="text" name="fecha" /><br/>
	Monto regular: <input type="text" name="montoregular" /><br/>
	Monto adicional: <input type="text" name="montoadicional" /><br/>
	
	<input type="submit" value="Agregar pago" />
</form>

</body>
</html>