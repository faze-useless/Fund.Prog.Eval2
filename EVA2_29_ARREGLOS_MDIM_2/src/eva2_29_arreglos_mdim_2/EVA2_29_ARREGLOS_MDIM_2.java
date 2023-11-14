
package eva2_29_arreglos_mdim_2;
import java.util.*;

public class EVA2_29_ARREGLOS_MDIM_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][];
        // se puede definir el tamaño de cada fila (manual)
        matriz[0] = new int[10]; // <-- la primer fila tendra 10 espacios
        matriz[1] = new int[5]; // <-- la segunda tendra 5
        matriz[2] = new int[3]; // <-- la ultima 3, en total 18
        
        // llenar
        for (int i = 0; i < matriz.length; i++) { // filas (matriz.length)
            for (int j = 0; j < matriz[i].length; j++) { // columnas (matriz[i].length)
                matriz[i][j] = (int)(Math.random()*100);
            }
        }
        // leer
        for (int i = 0; i < matriz.length; i++) { // filas (matriz.length)
            for (int j = 0; j < matriz[i].length; j++) { // columnas (matriz[i].length)
                if(matriz[i][j] >= 10) {
                    System.out.print("| "+matriz[i][j]+" ");
                } else {
                    System.out.print("| 0"+matriz[i][j]+" ");
                }
            }
            System.out.print("|");
            System.out.println("");
        }
    }
    
}
