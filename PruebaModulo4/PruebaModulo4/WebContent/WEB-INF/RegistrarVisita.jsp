<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de visita</title>
</head>
<body>
<h1>Registro de Visita</h1>
<c:if test="${eemensaje != null}">
	<h3><c:out value="${eemensaje}"></c:out></h3>
</c:if>


<br/>


</body>
</html>

