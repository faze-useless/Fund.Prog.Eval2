
package eva2_6_and_or;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR {

    public static void main(String[] args) {
        // TODO code application logic here
        // Operadores and or not
        Scanner keyboard = new Scanner(System.in);
        int calif;
        
        System.out.println("Ingrese una calificación: ");
        calif = keyboard.nextInt();
        
        // VALIDACION
        
        if (calif >= 0 && calif <= 100) { //valida califa (mayor a 0 y menor que 100)
            if (calif >= 70) {
                System.out.println("Aprobó Bv");
            } else {
                System.out.println("Reprobó :'v");
            }
        } else {
            System.out.println("[!] VALOR INVALIDO ("+calif+")");
        }
        
        
    }
    
}
