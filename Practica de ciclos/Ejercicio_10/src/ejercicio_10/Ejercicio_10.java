
package ejercicio_10;
import java.util.*;

public class Ejercicio_10 {

    public static void main(String[] args) {
        // Ejercicio 10
        Scanner keyboard = new Scanner(System.in);
        String string;
        
        System.out.println("Ingrese una cadena: ");
        string = keyboard.nextLine();
        
        if (isNumeric(string)) {
            System.out.println("Es un numero válido.");
        } else {
            System.out.println("No es numero válido");
        }
    }
    
    public static boolean isNumeric(String c) {
        boolean r;

        try {
            Integer.parseInt(c);
            r = true;
        } catch (NumberFormatException excepcion) {
            r = false;
        }

        return r;
    }
    
}
