

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
        <section class="main_text">
          <div>
            <h1 class="amarilloPastel">BIENVENIDOS!!!</h1>
          </div>
          <div>
            <p>
              Bienvenidos a la página de regalos de la pequeña Sofía.
            </p>
            <p>
              Aquí podrás elegir entre una multitud de regalos para la pequeña Sofía y dejar una nota personalizada de quien lo regala. 
            </p>
            <p>
            La lista de regalos se irá actualizando poco a poco con las cosas que le hagan falta para sus primeros meses de vida y podrás elegir que quieres que sea de tu parte
            </p>
            <p>        
            Puedes darte de alta en de Las Cosas de Sofía, y una vez como usuario registrado podrás acceder al catálogo de regalos de la pequeña.
            <p>
            También tendrás acceso a la galería de fotos exclusivas para socios, que como el catálogo de regalos, se actualiza cada día.
            </p> 
          </div>
        </section>
        
        <section class="images">
          <img src="img/imagen1.png" /> <img src="img/imagen2.png" />
          <img src="img/imagen3.png" /> <img src="img/imagen4.png" />
          <img src="img/imagen9.png" /> <img src="img/imagen6.png" />
          <img src="img/imagen5.png" /> <img class="hidden" src="img/imagen2.png" />
          <img src="img/imagen7.png" />
        </section>
      </main>
      
      <section class="novedades">
        <h2 class="rosa">NOVEDADES</h2>
        <article>
          <h4 >1 de Diciembre</h3>
          <h3 class="rosa">Peluche abracito</h3>
          <p>
            Hemos añadido un nuevo artículo a la lista. Es un peluche rosa muy bonito que si lo abrazas te dice. Mama quiero comer
          </p>
        </article>
        <article>
          <h4>5 de Diciembre</h>
          <h3 class="rosa">Mantita de osito</h3>
          <p>
            WINTER IS COMING!! Por eso el nuevo artículo de la lista es una manta super calentida que le servirá para pasar el invierno que se acerca ya que laas noches son largaas y albergan horrores.
          </p>
        </article>
  
        <article>
          <h4>10 de Diciembre</h4>
          <h3 class="rosa">Disfraz Yosa</h3>
          <p>
            Para los momentos de risas, puedes ver el nuevo disfraz de Yoda disponible para regalar a Sofía con el que quedará super graciosa.
          </p>
        </article>
        
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
