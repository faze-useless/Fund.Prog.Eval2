
package eva2_5_operaciones;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int var1,var2;
        int res;
                
        var1 = 15;
        var2 = 7;
        
        // operador +
        // suma, concatena (une cadenas de texto)
        System.out.println("--Suma:--");
        res = var1+var2;
        
        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
        System.out.println("var1 + var2 = "+res);
        
        // operador -
        // resta
        System.out.println(""); // <-- Enter
        System.out.println("--Resta:--");
        res = var1-var2;
        
        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
        System.out.println("var1 - var2 = "+res);
        
        // operador *
        // multiplica
        System.out.println(""); // <-- Enter
        System.out.println("--Multiplicación:--");
        res = var1*var2;
        
        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
        System.out.println("var1 x var2 = "+res);
        
        // operador /
        // divide
        // los datos a dividir deben double y el resultado tambien para
        // tener una division exacta
        System.out.println(""); // <-- Enter
        System.out.println("--División:--");
        res = var1/var2;
        
        System.out.println("var1 = "+var1);
        System.out.println("var2 = "+var2);
        System.out.println("var1 ÷ var2 = "+res);
        //division exacta
        System.out.println("--División exacta:--");
        double var3, var4, exact_res;
        
        var3 = var1;
        var4 = var2;
        
        exact_res = var3/var4;
        
        System.out.println("var3 = "+var3);
        System.out.println("var4 = "+var4);
        System.out.println("var3 ÷ var4 = "+exact_res);
        
        int num = 7;
        double numdouble = 7.0;
        
        double divididicidici = 100 / 10; // <-- se toma el divisor entero
        // double divididicidici = 100 / 10; <-- se toma el divisor flotante
        
        //precedencia de operaciones (orden)
        System.out.println(""); // <-- Enter
        System.out.println("Precedencia");
        
        int a = 5, b = 3, c = 2;
        int res2 = (a*b)+(a-c)*(b-a);// (15)+(3)*(-2) = 15-6 = 9
        
        System.out.println("RESULTADOTE: "+res2);
        
        // potencias y raises
        System.out.println(""); // <-- Enter
        System.out.println("Potencias y Raices");
        
        double potencia;
        potencia = Math.pow(100, 1/3);
        
        System.out.println("Potencia xd: "+ potencia);
    }
    
}
