
package eva2_14_ciclo_for_2;
import java.util.*;
/**
 *
 * @author DELL
 */
public class EVA2_14_CICLO_FOR_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int nocalif;
        int sumacalif = 0;
        double promedio;
        
        System.out.println("Numero de calificaciones a capturar: ");
        nocalif = keyboard.nextInt();
        
        for(int i = 1; i <= nocalif; i++) {
            System.out.print("Introduce la calificacion ["+i+"]: ");
            int calif = keyboard.nextInt();
            sumacalif += calif;
        }
        promedio = sumacalif/(nocalif*1.0);
        System.out.println("El promedio es "+promedio);
    }
    
}
