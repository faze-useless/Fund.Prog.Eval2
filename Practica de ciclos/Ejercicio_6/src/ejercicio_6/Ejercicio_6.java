
package ejercicio_6;
import java.util.*;

public class Ejercicio_6 {

    public static void main(String[] args) {
        // Ejercicio 6
        double num1, result, res;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: (Positivo) ");
        num1 = keyboard.nextInt();
        result = num1;
        
        if (num1 > 0) {
            System.out.println("En binario es: ");
            while(result >= 1){
                result = result/2;
                
                if ((result % 1) == 0) {
                    System.out.println("0");
                } else {
                    System.out.println("1");
                    result -= 0.5;
                }
            }
        } else {
            System.out.println("[!] El numero no es positivo");
        }
        
        System.out.println("[!] Leer de arriba hacia abajo.");
    }
    
}
