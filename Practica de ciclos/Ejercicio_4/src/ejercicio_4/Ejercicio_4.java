
package ejercicio_4;
import java.util.*;

public class Ejercicio_4 {

    public static void main(String[] args) {
        // ejercicio 4
        int num1, a = 0;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println("Ingresa un numero: ");
            num1 = keyboard.nextInt();
            if (num1 > 0) {
                System.out.println("Este numero es positivo.");
            } else if (num1 == 0) {
                System.out.println("Este numero es 0 xd");
            } else if (num1 < 0) {
                System.out.println("Este numero es negativo.");
            }
            
            System.out.println("[!] Terminar programa?");
            System.out.println("    [1] Si.");
            System.out.println("    [0] No.");
            
            a = keyboard.nextInt();
        }while(a == 0);
    }
    
}
