
package ejercicioxd_1;
import java.util.*;

public class Ejercicioxd_1 {

    public static void main(String[] args) {
        // Ejercicio 1
        int num1, num2;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: (Positivo) ");
        num1 = keyboard.nextInt();
        System.out.println("Ingresa otro numero xd: (Positivo)(Mayor que el primero)");
        num2 = keyboard.nextInt();
        
        if (num1 > 0 && num2 > 0) {
            System.out.println("Entre estos numeros estan:");
            for(int i = num1+1; i < num2; i++) {
                System.out.print(i+" - ");
            } 
        } else {
            System.out.println("[!] Los numeros no son positivos");
        }
    }
    
}
