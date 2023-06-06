<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- confirmacion.jsp -->
<!DOCTYPE html>
<html>
<head>
  <title>Confirmación de registro</title>
</head>
<body>
  <h1>¡Registro exitoso!</h1>
  <p>Gracias por registrarte, <%= request.getAttribute("Nombre") %>!</p>
  
  <h1>Ver lista de usuarios Registrados</h1>
          <p>Para ver los datos de los usuarios cargados haga click en el siguiente boton</p>
          <form action="SvUsuarios" method="Get">
           <button type="submit" > Mostrar Usuarios </button> 
          </form>
</body>
</html>