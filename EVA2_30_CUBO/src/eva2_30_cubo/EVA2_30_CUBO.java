
package eva2_30_cubo;
import java.util.*;

public class EVA2_30_CUBO {

    public static void main(String[] args) {
        // TODO code application logic here
        // cubo
        int[][][] cubo = new int[3][4][5];
        
        for (int i = 0; i < cubo.length; i++) { // filas (matriz.length)
            for (int j = 0; j < cubo[i].length; j++) { // columnas (matriz[i].length)
                for (int k = 0; k < cubo[i][j].length; k++) { // columnas (matriz[i].length)
                    cubo[i][j][k] = (int)(Math.random()*100);
                } 
            }
        }
        
        for (int i = 0; i < cubo.length; i++) { // filas (matriz.length)
            for (int j = 0; j < cubo[i].length; j++) { // columnas (matriz[i].length)
                for (int k = 0; k < cubo[i][j].length; k++) { // columnas (matriz[i].length)
                    if(cubo[i][j][k] >= 10) {
                        System.out.print("| "+cubo[i][j][k]+" ");
                    } else {
                        System.out.print("| 0"+cubo[i][j][k]+" ");
                    }
                }
                System.out.print("|");
                System.out.println("");
            }
            System.out.println("--------------------------");
        }
    }
    
}
