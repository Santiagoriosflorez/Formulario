package com.todoacademy.primerservlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuarios;




@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
Controladora control = new Controladora ();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
      throws ServletException , IOException {
        
    }
    
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response)
        throws ServletException, IOException{
        
        List<Usuarios> listaUsuario = new ArrayList<>();
        listaUsuario = control.traerUsuarios();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuario);
        
        response.sendRedirect("mostrarUsuarios.jsp");
  
    }

    @Override
protected void doPost(HttpServletRequest request , HttpServletResponse response)
        throws ServletException , IOException{
       
         String nombre_usuario = request.getParameter("Nombre");
         String correo_electronico = request.getParameter("email");
         String contrasena = request.getParameter("contrasena");
         
         Usuarios usu = new Usuarios ();
         usu.setNombre(nombre_usuario);
         usu.setemail(correo_electronico);
         usu.setcontrasena(contrasena);
         
         control.CrearUsuario(usu);
         
    
    request.setAttribute("Nombre" ,nombre_usuario);
    request.getRequestDispatcher("Registro.jsp").forward(request, response);
    }

 
    @Override
    public String getServletInfo(){
           return ("short description");
    }
    
}
