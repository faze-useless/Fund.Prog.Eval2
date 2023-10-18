
package eva2_9_switch;
import java.util.*;

/**
 *
 * @author invitado
 */
public class EVA2_9_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int month;
        System.out.println("Introduzca un numero de mes: ");
        month = keyboard.nextInt();
        
        switch(month){
            case 1:
                System.out.println("Enero xd");
                break;
            case 2:
                System.out.println("Febrero xd");
                break;
            case 3:
                System.out.println("Marzo xd");
                break;
            case 4:
                System.out.println("Abril xd");
                break;
            case 5:
                System.out.println("Mayo xd");
                break;
            case 6:
                System.out.println("Junio xd");
                break;
            case 7:
                System.out.println("Julio xd");
                break;
            case 8:
                System.out.println("Agosto xd");
                break;
            case 9:
                System.out.println("Septiembre xd");
                System.out.println("Cumplo años xd");
                break;
            case 10:
                System.out.println("Octubre xd");
                break;
            case 11:
                System.out.println("Noviembre xd");
                System.out.println("Cumple del profe xd");
                break;
            case 12:
                System.out.println("Diciembre xd");
                break;
            default:
                System.out.println("[!] NÚMERO INVALIDO WACHIN");
        }
    }
    
}
