
package eva2_20_continue;
import java.util.*;

public class EVA2_20_CONTINUE {

    public static void main(String[] args) {
        // TODO code application logic here
        // break --> termina el ciclo
        for(int i = 1; i <= 15; i++){
            if (i == 10) {
                break;
            }
            System.out.print(i + " - ");
        }
        System.out.println("");
        // continue --> termina la iteracion actual
        for(int i = 1; i <= 15; i++){
            if (i == 10) {
                continue;
            }
            System.out.print(i + " - ");
        }
    }
    
}
