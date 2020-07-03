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
<nav class="menu">
<div id="logo"><img src="./img/logo.png" title="Logo Segurimax">
</div>
<ul>
<li><a href="#">Inicio</a></li>
<li class="submenu"><a href="#">Clientes <i class="fa fa-caret-down"></i></a>
  <ul>
	<li><a href="#">Crear Cliente</a></li>
	<li><a href="#">Editar Cliente</a></li>
	<li><a href="#">Borrar Cliente</a></li>
	<li><a href="#">Informe Cliente</a></li>
	<li><a href="#">Listado de Clientes</a></li>
  </ul>
</li>
<li class="submenu"><a href="#">Profesionales<i class="fa fa-caret-down"></i></a>
  <ul>
	  <li><a href="#">Crear Profesional</a></li>
	<li><a href="#">Editar Profesional</a></li>
	<li><a href="#">Borrar Profesional</a></li>
	<li><a href="#">Informe Profesional</a></li>
	<li><a href="#">Listado de Profesionales</a></li>
  </ul>
</li>
<li><a href="#">Pagos</a>
	<ul>
		<li><a href="#">Ingreso Pago</a></li>
	</ul></li>
	<li><a href="#">Informe Global</a>
	   </li>
</ul>
	</nav>
</header>
<h1 style="text-align: center; margin-top: 5%;">Listado de Pagos clientes</h1>
<c:if test="${ccmensaje != null}">
	<h3><c:out value="${ccmensaje}"></c:out></h3>
</c:if>
<div class="tabla">
<table id="example" class="row-border" style="width:50%">
    <thead>
        <tr>
            <th>RUT</th>
			<th>Nombre</th>
			<th>Nº Factura</th>
			<th>Fecha</th>
			<th>Monto Regular</th>
			<th>Adicionales</th>
        </tr>
    </thead>
   
    <tbody>
     <c:forEach items="${listapagos}" var="pagos">
        <tr>
		<td>${pago.getRut()}</td>
		<td>${pago.getNombre()}</td>
		<td>${pago.getIdpago()}</td>
		<td>${pago.getMesanio()}</td>
		<td>${pago.getMontoregular()}</td>
		<td>${pago.getMontoAdicionales()}</td>
		
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<footer>
	<p>Diseño - Talentosos Desarrolladores Jr - 2020</p>
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
			emptyTable:     "Ningún dato disponible en esta tabla",
			paginate: {
				first:      "Primero",
				previous:   "Anterior",
				next:       "Siguiente",
				last:       "Último"
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