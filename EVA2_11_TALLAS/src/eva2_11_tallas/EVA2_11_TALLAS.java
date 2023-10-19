package eva2_11_tallas;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_11_TALLAS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int talla;
        
        System.out.println("Ingrese una talla: (29,42,44,48) ");
        talla = keyboard.nextInt();
        
        switch(talla) {
            case 29: System.out.println("La talla es small");
                break;
            case 42: System.out.println("La talla es medium");
                break;
            case 44: System.out.println("La talla es large");
                break;
            case 48: System.out.println("La talla es xLarge");
                break;
            default: System.out.println("[!] Eso no es una talla bro xd");
        }
        
    }
    
}
