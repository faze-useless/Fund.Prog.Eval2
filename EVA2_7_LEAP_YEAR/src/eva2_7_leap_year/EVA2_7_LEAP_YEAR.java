
package eva2_7_leap_year;

import java.util.*;

/**
 *
 * @author invitado
 */
public class EVA2_7_LEAP_YEAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // TODO code application logic here
        int year;
        double residuo1, residuo2, residuo3;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingrese un año: ");
        year = keyboard.nextInt();
        
        
        residuo1 = year % 4;
        residuo2 = year % 100;
        residuo3 = year % 400;
        
        if (residuo1 == 0 && ( residuo2 != 0 || residuo3 == 0 )) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("NO es bisiesto");
        } // EZ MONEEEEY
        /*
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
        }*/
    }
    
}
