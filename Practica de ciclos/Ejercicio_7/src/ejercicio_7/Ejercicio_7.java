
package ejercicio_7;
import java.util.*;

public class Ejercicio_7 {

    public static void main(String[] args) {
        // Ejercicio 7
        int num = 0, mayor = 0, menor = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: (positivo)(negativo para terminar) ");
        num = keyboard.nextInt();
        mayor = num;
        menor = num;
        
        while(true) {
            if (num >= 0) {
                if (num > mayor) {
                   mayor = num;
                }
                if (num < menor) {
                   menor = num;
                }
            }
            
            System.out.println("Ingrese un numero: (positivo)(negativo para terminar) ");
            num = keyboard.nextInt();
            
            if (num < 0) {break;}
        }
        
        System.out.println("El mayor fue: "+mayor);
        System.out.println("El menor fue: "+menor);
    }
    
}
