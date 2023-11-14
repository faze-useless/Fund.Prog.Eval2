
package eva2_28_arreglos_mdim;
import java.util.*;

public class EVA2_28_ARREGLOS_MDIM {

    public static void main(String[] args) {
        // TODO code application logic here
        // primeros [] fila, segundos [] columna
        int[][] matriz = new int[5][10];
        
        // asignar
        matriz[1][3] = 100;
        System.out.println("Valor en (1,3) = "+matriz[1][3]);
        System.out.println("matriz.length = "+matriz.length);
        
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
