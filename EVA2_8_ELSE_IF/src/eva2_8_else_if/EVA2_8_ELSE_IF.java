
package eva2_8_else_if;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_8_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int month;
        System.out.println("Introduzca un numero de mes: ");
        month = keyboard.nextInt();
        
        //if (month >= 1 && month <= 12) {
            if (month == 1) {System.out.println("Es enero xd");}
            else if (month == 2) {System.out.println("Es febrero xd");}
            else if (month == 3) {System.out.println("Es marzo xd");}
            else if (month == 4) {System.out.println("Es abril xd");}
            else if (month == 5) {System.out.println("Es mayo xd");}
            else if (month == 6) {System.out.println("Es junio xd");}
            else if (month == 7) {System.out.println("Es julio xd");}
            else if (month == 8) {System.out.println("Es agosto xd");}
            else if (month == 9) {System.out.println("Es septiembre xd");}
            else if (month == 10) {System.out.println("Es octubre xd");}
            else if (month == 11) {System.out.println("Es noviembre xd");}
            else if (month == 12) {System.out.println("Es Diciembre xd");}
        //} 
            else {
            System.out.println("[!] NO ES UN MES VALIDO");
        }
    }
    
}
