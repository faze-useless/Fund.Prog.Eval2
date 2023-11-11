
package ejercicio_9;
import java.util.*;

public class Ejercicio_9 {

    public static void main(String[] args) {
        // Ejercicio 9
        Scanner keyboard = new Scanner(System.in);
        String string;
        String target;
        char[] arraystring;
        int cont = 0;
        
        System.out.println("Ingrese una cadena de texto: ");
        string = keyboard.nextLine();
        System.out.println("Ingrese el caracter a buscar: ");
        target = keyboard.nextLine();
        
        arraystring = string.toCharArray();
        
        for (int i = 0; i < arraystring.length; i++) {
            if (arraystring[i] == target.charAt(0)) {
                cont += 1;
            }
        }
        
        System.out.println("El caracter "+target+" aparece "+cont+" veces.");
    }
    
}
