
package eva2_19_validar_usuario;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_19_VALIDAR_USUARIO {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi = Math.PI;
        String usuario,password;
        Scanner keyboard = new Scanner(System.in);
        //System.out.println(NOMBRE_USUARIO);
        
        do{
            System.out.print("Usuario: ");
            usuario = keyboard.nextLine();
            System.out.print("Contraseña: ");
            password = keyboard.nextLine();
            if(!usuario.equals(NOMBRE_USUARIO) || !password.equals(PASSWORD)){System.out.println("[!] Denegado");}
        }while(!usuario.equals(NOMBRE_USUARIO) || !password.equals(PASSWORD));
        
        System.out.println("[!] Acceso concedido.");
    }
    
}
