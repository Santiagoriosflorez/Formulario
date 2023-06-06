
package persistencia;

import java.util.List;
import logica.Usuarios;


public class ControladoraPersistencia {
    
    UsuariosJpaController usuJpa = new UsuariosJpaController ();
         
    
    //Operacion create
    public void CrearUsuario (Usuarios usu ) {
        usuJpa.create(usu);
    
    }   
    
    // Operacion read 
    public List<Usuarios> traerUsuarios (){
           return usuJpa.findUsuariosEntities();
           
    
    }
    
}
