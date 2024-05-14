package es.medac.ProyectoInterfaces;
/**
 * @author Michael Santiago Jara Castro DAW º1
 */
public class Logging {    
     
    public String Inicio_Usuario(String usuario, java.lang.Integer contra){
        if(usuario.equals("Admin")&& contra == 1111){
            return "Log Admin Correcto";
        } else if(usuario.equals("Juan")&& contra == 1234){
            return "Log Juan Correcto";
        } else if(usuario.equals("Diego")&& contra == 7777){
            return "Log Diego Correcto";
        } else if(usuario.equals("Kevin")&& contra == 9895){
            return "Log Kevin Correcto";
        } else {
            return "Log Incorrecto";
        }
    }
}
