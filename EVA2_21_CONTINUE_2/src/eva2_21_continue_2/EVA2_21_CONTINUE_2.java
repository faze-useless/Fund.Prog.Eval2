
package eva2_21_continue_2;
import java.util.*;

public class EVA2_21_CONTINUE_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i <= 15; i++){
            /*
            int par;
            par = i%2;
            // si par != 0 --> impar
            // si par == 0 --> par
            if (par != 0) {
                continue;
            }
            System.out.print(i + " - ");
            */
            if ((i%2) != 0) {
                continue;
            }
            // si (i%2) != 0 --> impar
            // si (i%2) == 0 --> par
            System.out.print(i + " - ");
        }
    }
    
}
