
package eva2_27_busqueda_arreglos;
import java.util.*;

public class EVA2_27_BUSQUEDA_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        // crear arreglo
        int[] array = new int[15];
        // llenarlo todo con valores aleatorios xd
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
            System.out.print("["+array[i]+"]");
        }
        System.out.println("");
        int value;
        System.out.println("Qué numero quieres buscar? (0-99)");
        value = keyboard.nextInt();
        
        for (int i = 0; i <= array.length; i++) {
            if (i == array.length) { // no encontro
                System.out.println("[!] No se encuentra el numero");
                break;
            } else
            if (array[i] == value) { // encontro el valor
                System.out.println("Está en la posición "+i);
                break;
            }
            
        }
    }
    
}
