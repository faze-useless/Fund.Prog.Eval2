
package eva2_3_modulo;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_3_MODULO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a1;
        float residuo;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingrese el numero pa: ");
        a1 = keyboard.nextInt();

        residuo = a1 % 2;
        if(residuo == 0){ // <-- if anidado
            System.out.println("Efectivamente, es par");
        } else {
            System.out.println("NO ES PAR");
        }
    }
    
}
