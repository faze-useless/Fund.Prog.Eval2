
package eva2_24_arreglos_ciclos;
import java.util.*;

public class EVA2_24_ARREGLOS_CICLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[1000000];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = 10000;
            if ((i % 100000) == 0) {
                System.out.println("...");
            }
        }
        
        System.out.println("Becas listas!");
    }
    
}
