<!-- Importamos las clases que vamos a necesitar -->
<%@page import="modelo.DAOregalos" %>
<%@page import="modelo.Regalo" %>
<%@page import="java.util.ArrayList" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Las cositas de sofía</title>
    
	<!-- Hojas de estilos -->
    <link rel="stylesheet" type="text/css" href="css/stilos.css" />
    <link href="https://fonts.googleapis.com/css?family=Righteous" rel="stylesheet"/>

    <!-- Para el símbolo para mostrar el menú -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  </head>
  
  <body>
  
  	<!-- Contenedor principal donde tenemos nuestra web -->
    <div class="container">
      <header class="rosa">
        <h1>LAS COSITAS DE SOFÍA</h1>
        
	    <!-- Include de header -->
        <%@include file="includes/header.jsp" %>
      </header>
    
      <main>  
          <div class="formu">
            <p>Lista de regalos</p>
            <p>Esta es la página de la lista de regalos para Sofía. Actualmente en mantenimiento, todos los usuarios que entren podrán acceder a insertar nuevos regalos a la lista, en un futuro sólo podrá acceder a insertar nuevos regalos el administrador, que periodicamente irá actualizando este listado para todos los usuarios.</p>
            <p><li><a href="añadirRegalo.jsp">- Añadir regalo -</a></li></p>
          </div>
      </main>
      
      
       <section class="regalos">
       <!-- Llamamos a la clase Regalo para obtener los datos de la base de datos -->
        <%
        	ArrayList<Regalo> lista = new ArrayList<Regalo>();       	
        	lista = DAOregalos.getInstance().dao_listarRegalos();
        	for (Regalo r : lista){
        %>
         <article>
         	<div class="cajaregalo">
         	<p></p>
         	<h3 class="rosa"><%= r.getNombre() %></h3>
         	<p>Descripción:  <%= r.getDescripcion() %> </p>
         	<p>Precio: <%= r.getPrecio() %> €  </p>
         	<!-- <p><a href="Sv_regalos?opcion=1&id=<%=r.getId()%>">- Modificar -</a><a href="Sv_regalos?opcion=2&id=<%=r.getId()%>"> Borrar </a><a href="Sv_regalos?opcion=3&id=<%=r.getId()%>">- Ver -</a></p> -->
         	</div>
         	<p></p>
        </article> 
        <!-- Cerramos la llamada a la base de datos -->
        <%} %>
         
      </section>
      
      <footer class="rosa">
 	   <!-- Include de footer -->
       <%@include file="includes/footer.jsp" %>
      </footer>
      
    </div>
    <script>
	<!-- Función para el menú hamburguesa -->
        $(function() {
            //Captura del evento para mostrar u ocultar
            $(".icon").click(function() {
            $(".menu_item").toggle();
            });
            $(window).resize(function() {
            var anchura = $(this).width();
            if (anchura > 576) {
                $(".menu_item").show();
            }
            });
        });
    </script>
  </body>
</html>
