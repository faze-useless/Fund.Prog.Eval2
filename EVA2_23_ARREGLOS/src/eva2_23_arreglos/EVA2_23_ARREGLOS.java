
package eva2_23_arreglos;
import java.util.*;

public class EVA2_23_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar el arreglo = Crear el arreglo
        int[] array = new int[10];
        //Como se usa? se accesa por indices, el primer dato va en el [0]
        array[0] = 100;
        array[1] = 199;
        array[2] = 200;
        array[3] = 299;
        
        System.out.println(array[3]);
        
        /// xd
        
        String[] stringarray = new String[5];
        stringarray[0] = "Dile";
        stringarray[1] = "adiós";
        stringarray[2] = "a";
        stringarray[3] = "la";
        stringarray[4] = "grasa :v:v xdxdxdd";
        
        for (int i = 0; i < 5; i++) {
            System.out.println(stringarray[i]);
        }
        
        stringarray = new String[10]; // se elimina el arreglo anterior y se crea uno nuevo con el mismo nombre
    }
    
}
