
package eva2_2_if;
import java.util.*;
public class EVA2_2_IF {

    public static void main(String[] args) {
        int calificacion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la calificacion gordo gamer Bv");
        calificacion = teclado.nextInt();
        
        if (calificacion >= 70) // if ("expresion a evaluar") {}
            System.out.println("Abrobó el paleopapu Bv"); // true
        else // else (se ejecuta si es falso)
            System.out.println("Reprobaste danksito >:v"); // false
        
    }
    
}
