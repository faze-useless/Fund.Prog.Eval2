
package ejercicio_5;
import java.util.*;

public class Ejercicio_5 {

    public static void main(String[] args) {
        // Ejercicio 5
        int num1, num2, res;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: (Positivo) ");
        num1 = keyboard.nextInt();
        System.out.println("Ingresa otro numero xd: (Positivo))");
        num2 = keyboard.nextInt();
        
        res = num1;
        
        if (num1 > 0 && num2 > 0) {
           for(int i = 1; i < num2; i++) {
               res = res*num1;
           }
        } else {
            System.out.println("[!] Los numeros no son positivos");
        }
        
        System.out.println("El primer numero elevado al segundo es: "+res);
    }
    
}
