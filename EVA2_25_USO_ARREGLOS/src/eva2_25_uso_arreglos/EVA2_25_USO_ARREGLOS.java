
package eva2_25_uso_arreglos;
import java.util.*;

public class EVA2_25_USO_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String[] platillos = new String[10];
        platillos[0] = "Tacos";
        platillos[1] = "Tortas";
        platillos[2] = "Tamales";
        platillos[3] = "Tamarindos";
        platillos[4] = "Tripitas";
        platillos[5] = "Tlacuache";
        platillos[6] = "Tlayadas";
        platillos[7] = "Tlacoyos";
        platillos[8] = "Tchilaquiles";
        platillos[9] = "T-bone";
        
        double[] precios = {20, 50, 60, 25, 80, 90, 55, 30, 100, 400};
        
        System.out.println("Menú:");
        for (int i = 0; i < platillos.length; i++) {
            System.out.print("["+i+"] - "+platillos[i]+" ...... $"+precios[i]);
            System.out.println("");
        }
        
        int selec, cant;
        double cuenta;
        System.out.println("-----------------------------");
        System.out.println("Qué quiere del menú? (Escriba el identificador del platillo.)");
        selec = keyboard.nextInt();
        System.out.println("Cuantas unidades?");
        cant = keyboard.nextInt();
        
        cuenta = precios[selec]*cant;
        
        System.out.println("Su cuenta es: $"+cuenta);
        
    }
    
}
