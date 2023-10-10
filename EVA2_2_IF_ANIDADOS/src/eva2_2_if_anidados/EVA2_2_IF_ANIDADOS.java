
package eva2_2_if_anidados;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_2_IF_ANIDADOS {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a1, a2;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingrese valor 1");
        a1 = keyboard.nextInt();
        System.out.println("Ingrese valor 2");
        a2 = keyboard.nextInt();
        
        if(a1 > a2){ // <-- if anidado
            System.out.println("El mayor es: "+a1);
        } else if (a1 == a2){ // = asignacion == asignacion
            System.out.println("Son iguales xd");
        } else {
            System.out.println("El mayor es: "+a2);
        }
    }
    
}
