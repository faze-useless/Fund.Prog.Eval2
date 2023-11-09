
package eva2_25_arreglos_2;
import java.util.*;

public class EVA2_25_ARREGLOS_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int[] arraycalif;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Cuantas calificaciones? ");
        num = keyboard.nextInt();
        
        arraycalif = new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese la calificación: ["+i+"]");
            arraycalif[i] = keyboard.nextInt();
        }
        System.out.println("Las calificaciones fueron:");
        System.out.print("| ");
        for (int i = 0; i < num; i++) {
            System.out.print(arraycalif[i]+" | ");
        }
    }
    
}
