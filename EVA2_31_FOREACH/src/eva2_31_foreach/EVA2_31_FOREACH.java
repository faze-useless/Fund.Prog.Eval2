
package eva2_31_foreach;
import java.util.*;

public class EVA2_31_FOREACH {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
        
        //for each -->> por y para arreglos (los lee)
        for (int value : array) {
            System.out.print("[ "+value+" ]");
        }
        
        System.out.println("");
        System.out.println("");
        // ejemplo 2
        String string[] = new String[5];
        string [0] = "Hola";
        string [1] = "_";
        string [2] = "mundo";
        string [3] = "_";
        string [4] = "!";
        
        for (String str_value : string) {
            System.out.print(str_value);
        }
    }
    
}
