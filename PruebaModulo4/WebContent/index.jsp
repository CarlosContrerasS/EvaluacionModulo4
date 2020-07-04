<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
            <h1 style="margin-top: 8%;">Bienvenidos a Securimax</h1>
            <br>
            <h3 style="margin-bottom: 3%;">Accesos rapidos</h3>
        </div>


            <div class="contenedor_img_box col-s-12 col-l-12 col-12">

            <div class="img_box col-s-12 col-l-4 col-4">
                <img src="./img/pagos.png"> <br>
                <h4><a href="${pageContext.request.contextPath}/AgregarPago">Ingresar Pagos</a></h4><br>
            </div>

            <div class="img_box col-s-12 col-l-4 col-4">
                <img src="./img/clientes.png"> <br>
                <h4><a href="${pageContext.request.contextPath}/AgregarCliente">Ingresar Cliente</a></h4><br>
            </div>

            <div class="img_box col-s-12 col-l-4 col-4">
                <img src="./img/profesionales.png"> 
                <h4><a href="${pageContext.request.contextPath}/AgregarEmpleado">Ingresar Profesional</a></h4><br>
            </div>
          
            </div>
            <div class="contenedor_img_box col-s-12 col-l-12 col-12">
                <div class="img_box col-s-12 col-l-6 col-4">
                    <img src="./img/accidente.png">
                    <h4><a href="${pageContext.request.contextPath}/AgregarAccidente">Ingreso Accidentes</a></h4><br>
                </div>
                <div class="img_box col-s-12 col-l-6 col-4">
                    <img src="./img/visita.png">
                    <h4><a href="${pageContext.request.contextPath}/AgregarVisita">Agendar Visita</a></h4><br>
                </div>
            </div>
            
           <div class="cont_aplicacion col-s-12 col-l-12 col-12">
            <div id="img_aplicacion" >
                <img src="./img/logo.png" title="Logo Segurimax" class="img_aplicacion">    
            </div>
            <div id="text_aplicacion" class="text_aplicacion">
                <h2>Securimax, una aplicaci�n web para su empresa</h2>
                <p>Es una soluci�n tecnol�gica que mejora la gesti�n, el control, la seguridad, y disponibilidad de informaci�n para la empresa y sus clientes.
                    Obtenga informe de los pagos realizados por sus clientes, administre las actividades de los profesionales de seguridad, as� como los informes de estos.
                    Tome las mejores decisiones e impulse el rendimiento de la empresa</p>
            </div>
        
        </div>
        <footer>
            <p>Dise�o - Talentosos Desarrolladores Jr - 2020</p>
        </footer>
    </body>

</html>