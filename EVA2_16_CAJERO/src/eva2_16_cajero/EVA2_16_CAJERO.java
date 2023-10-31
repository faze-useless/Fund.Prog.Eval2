
package eva2_16_cajero;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_16_CAJERO {

    public static void main(String[] args) {
        // TODO code application logic here
        int cuenta = 1200;
        int retiro;
        Scanner keyboard = new Scanner(System.in);
        
        while(cuenta > 0){
            System.out.println("Cuanto quiere retirar?");
            retiro = keyboard.nextInt();
            if (retiro <= cuenta) {
                cuenta -= retiro;
                System.out.println("Quedan "+cuenta);
            } else {
                System.out.println("[!] Numero invalido. Saldo insuficiente");
            }
            
        }
        System.out.println("Ya no hay plata pa");
    }
    
}
