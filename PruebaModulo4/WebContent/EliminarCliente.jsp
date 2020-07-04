<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./css/stylesheet.css"/>
    <link rel="stylesheet" href="./css/menu.css"/>
    <link rel="stylesheet" href="./css/fontello.css.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>Segurimax - Seguridad Laboral</title>
    <script>
        $(".submenu").click(function(){
  $(this).children("ul").slideToggle();
})

$("ul").click(function(ev){
  ev.stopPropagation();
})
    </script>
    
</head>
    <body>
        <header>
            <input type="checkbox" id="btn-menu" />
    <label for="btn-menu"><i class="fa fa-bars"></i></label>
    <nav class="menu" style="z-index: 4;">
        <div id="logo"><a href="./index.jsp"><img src="./img/logo.png" title="Logo Segurimax"></a>
        </div>
<ul>
    <li><a href="./index.jsp">Inicio</a></li>
    <li class="submenu"><a href="#">Clientes <i class="fa fa-caret-down"></i></a>
      <ul>
        <li><a href="${pageContext.request.contextPath}/AgregarCliente">Crear Cliente</a></li>
        <li><a href="${pageContext.request.contextPath}/EditarCliente.jsp">Editar Cliente</a></li>
        <li><a href="${pageContext.request.contextPath}/EliminarCliente.jsp">Borrar Cliente</a></li>
        <li><a href="${pageContext.request.contextPath}/ListadoGlobal">Informe Cliente</a></li>
        <li><a href="${pageContext.request.contextPath}/ListadoClientes">Listado de Clientes</a></li>
      </ul>
    </li>
    <li class="submenu"><a href="#">Profesionales<i class="fa fa-caret-down"></i></a>
      <ul>
          <li><a href="#">Crear Profesional</a></li>
          <li><a href="${pageContext.request.contextPath}/AgregarEmpleado">Ingresar Profesional</a></li>
        <li><a href="${pageContext.request.contextPath}/EditarEmpleado.jsp">Editar Profesional</a></li>
        <li><a href="${pageContext.request.contextPath}/EliminarEmpleado.jsp">Borrar Profesional</a></li>
        <li><a href="${pageContext.request.contextPath}/ListadoEmpleados">Listado de Profesionales</a></li>
        <li><a href="${pageContext.request.contextPath}/AgregarVisita">Agendar Visita</a></li>
        <li><a href="${pageContext.request.contextPath}/ListarVisita">Vistas Agendas</a></li>
      </ul>
      
      
    </li>
    <li><a href="#">Accidentes</a>
        <ul>
            <li><a href="${pageContext.request.contextPath}/AgregarAccidente">Ingreso Accidente</a></li>
            <li><a href="${pageContext.request.contextPath}/ListadoAccidentes">Listado Accidentes</a></li>
        </ul></li>
   
    <li><a href="#">Pagos</a>
        <ul>
            <li><a href="${pageContext.request.contextPath}/AgregarPago.jsp">Ingreso Pago</a></li>
            <li><a href="${pageContext.request.contextPath}/ListadoPagos">Informe Pagos</a></li>
            <li><a href="${pageContext.request.contextPath}/ListarAtrasos.jsp">Pagos Atrasados</a></li>
        </ul></li>
        <li><a href="${pageContext.request.contextPath}/Global">Informe Global</a>
           </li>
            
  </ul>
        </nav>
    </header>
            <div id="titulo">
            <h1>Eliminar Clientes</h1>
            <h3 style ="text-align: center; ">Por favor, ingrese RUT sin puntos ni d�gito verificador</h3>
        </div>
            <div class="formulario">
                <c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>

                <form method="get" action="EliminarCliente">
                    <label for="rut">RUT </label><br/>
                    <input type="text" class="campo_formulario" name="rut" /><br/><br/>
                    <input type="submit" value="Eliminar cliente" />
                </form>
        </div>
        <footer>
            <p>Dise�o - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
    </body>

</html>