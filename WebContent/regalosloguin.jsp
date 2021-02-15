



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
            <p>Esta seccion es privada.</p>
            <p>Tendrás que loguearte para poder acceder. Una vez dentro puedes participar con los demás usuarios añadiendo regalos nuevos y seleccionado algunos de los que ya están incluidos como regalos tuyos.</p>

          </div>
      </main>
          
      <section>
	
		<div class="formuformu2">
    <div class="row"><div class="col">
            <div class="inscripcion">
                <form name="altausuario" action="Sv_usuarios" method="post">
                    <input class="datos" placeholder="Mail" type="mail" name="mail">
                    <input class="datos" placeholder="Contraseña" type="password" name="pass">
                    <!-- <input type="submit" value="Enviar" class="boton">-->
                    <a href="regalos.jsp">- De momento vamos a entrar sin validación-</a>	 
                </form>
            </div></div></div></div>		
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
