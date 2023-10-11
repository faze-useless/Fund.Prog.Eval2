
package eva2_4_bisiesto;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_4_BISIESTO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year;
        double residuo;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingrese un año: ");
        year = keyboard.nextInt();
        
        
        residuo = year % 4;
        if (residuo == 0) {
            // true
            residuo = year % 100;
            if (residuo == 0) {
                // true
                residuo = year % 400;
                if (residuo == 0) {
                    // true 
                    System.out.println("Es bisiesto"); // divisible entre 100 y entre 400
                } else {
                    // false
                    System.out.println("NO es bisiesto"); // divisible entre 100 y no entre 400
                }
            } else {
                //false
                System.out.println("Es bisiesto"); // no divisible entre 100
            }
        } else {
            // false
            System.out.println("NO es bisiesto"); // no divisible entre 4
        }
    }
    
}
