<%@page import="java.util.List"%>
<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    
        <h1>Lista de usuarios registrados</h1>
        <%
            List<Usuarios> ListaUsuario = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for (Usuarios usu: ListaUsuario){
            %>
            
            <p><b>Usuario № <%=cont %> </b></p>
            <p>nombre_usuario: <%=usu.getNombre()%></p>
            <p>correo_electronico:<%=usu.getemail()%></p>
            <p>contrasena: <%=usu.getcontrasena()%></p>
            <p>-----------------------------------------------</p>
            <% cont = cont + 1 ; %>
            
            
            <% }%>

</html>
