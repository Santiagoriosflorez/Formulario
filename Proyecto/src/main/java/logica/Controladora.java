
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
  ControladoraPersistencia ControlPersi = new ControladoraPersistencia ();
        
   public void CrearUsuario (Usuarios usu ) {
        ControlPersi.CrearUsuario(usu);  
   }
   
   public List<Usuarios> traerUsuarios (){
          return ControlPersi.traerUsuarios();
   }
  
   
}
