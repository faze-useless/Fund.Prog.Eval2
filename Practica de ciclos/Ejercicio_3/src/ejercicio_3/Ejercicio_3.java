
package ejercicio_3;
import java.util.*;

public class Ejercicio_3 {

    public static void main(String[] args) {
        // Ejercicico 3
        int num1, suma = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ");
        num1 = keyboard.nextInt();
        
        for(int i = 1; i <= num1; i++ ) {
            suma += i;
        }
        
        System.out.println("La suma de todos estos numeros del 1 al "+num1+" sumados es: "+suma);
    }
    
}
