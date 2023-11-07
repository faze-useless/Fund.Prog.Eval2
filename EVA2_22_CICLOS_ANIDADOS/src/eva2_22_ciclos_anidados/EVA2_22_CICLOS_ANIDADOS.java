
package eva2_22_ciclos_anidados;
import java.util.*;

public class EVA2_22_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número: ");
        num = keyboard.nextInt();
        System.out.println("");
        
        for(int i = 1; i <= num; i++) {
            System.out.print(i+" - ");
            for(int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println(""); // salto de linea
        }
        
        for(int i = num; i >= 1; i--) { // invertido
            System.out.print(i+" - ");
            for(int a = i; a >= 1; a--) {
                System.out.print("*");
            }
            System.out.println(""); // salto de linea
        /*
        for(int i = num; i >= 1; i--) { // invertido (tambien funciona así xd)
            System.out.print(i+" - ");
            for(int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println(""); // salto de linea
        */
        }
    }
    
}
