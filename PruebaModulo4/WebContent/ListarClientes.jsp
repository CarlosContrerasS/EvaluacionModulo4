<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="./css/stylesheet.css"/>
		<link rel="stylesheet" href="./css/menu.css"/>
		<link rel="stylesheet" href="./css/tabla.css"/>
		<link rel="stylesheet" href="./css/tablecss.css"/>
		<link rel="stylesheet" href="./css/fontello.css"/>
		<link rel="stylesheet" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"/>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
		<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.css">
		<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.js"></script>
		<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script> 
		
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
<br><br><br><br><br><br>
<h1 id="titulo">Listado de clientes</h1>
<br><br>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>
<br><br>
<table id="example" class="row-border" style="width:40%">
	<thead>
	<tr>
		<th> Rut Cliente</th>
		<th>Nombre</th>
		<th>Telefono</th>
		<th>Correo electronico</th>
		<th>Rubro</th>
		<th>Direccion</th>
		<th>Acciones</th>
	</tr>
</thead>
	<c:forEach items="${listaclientes}" var="cliente">
	<tbody>
	<tr>
		<td>${cliente.getRut()}</td>
		<td>${cliente.getNombre()}</td>
		<td>${cliente.getTelefono()}</td>
		<td>${cliente.getCorreoelectronico()}</td>
		<td>${cliente.getRubro()}</td>
		<td>${cliente.getDireccion()}</td>
		<td>
		
			
				
			<a href="${pageContext.request.contextPath}/EliminarCliente?rut=${cliente.getRut()}">Eliminar</a>&nbsp;
			<a href="${pageContext.request.contextPath}/EditarCliente?rut=${cliente.getRut()}">Editar</a>&nbsp;
		</td>
	</tr>
	</tbody>
</c:forEach>
</table>
<br/>
<a href="${pageContext.request.contextPath}/AgregarCliente">Agregar cliente</a>

<footer>
	<p>Dise�o - Talentosos Desarrolladores Jr - 2020</p>
</footer> 


<script>
	$(document).ready(function() {
		$('#example').DataTable();
	} );

	$('#example').DataTable( {
		language: {
			processing:     "Procesando...",
			search:         "Buscar:",
			lengthMenu:    "Mostrar _MENU_ registros",
			info:           "Mostrando registros del _START_ al _END_ de un total de _TOTAL_ registros",
			infoEmpty:      "Mostrando registros del 0 al 0 de un total de 0 registros",
			infoFiltered:   "(filtrado de un total de _MAX_ registros)",
			infoPostFix:    "",
			loadingRecords: "Cargando...",
			zeroRecords:    "No se encontraron resultados",
			emptyTable:     "Ning�n dato disponible en esta tabla",
			paginate: {
				first:      "Primero",
				previous:   "Anterior",
				next:       "Siguiente",
				last:       "�ltimo"
			},
			aria: {
				sortAscending:  ": Activar para ordenar la columna de manera ascendente",
				sortDescending: ": Activar para ordenar la columna de manera descendente"
			}
		}
	} );
</script>

</body>
</html>