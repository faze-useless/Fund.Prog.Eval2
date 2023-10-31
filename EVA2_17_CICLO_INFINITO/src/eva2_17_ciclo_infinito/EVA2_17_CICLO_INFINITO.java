
package eva2_17_ciclo_infinito;
import java.util.*;

public class EVA2_17_CICLO_INFINITO {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 100;
        /*
        System.out.println("When haces tus momos en código");
        System.out.println("El futuro es hoy oiste biejo jiji xdxdxd");
        System.out.println("But te meten en un ciclo");
        while(true){
        System.out.println("Ohhh mi lente de contacto xdxdddxd");
        }*/
        Scanner keyboard = new Scanner(System.in);
        while(true){
            System.out.println("Introduce un numero que podria ser correcto: ");
            int num = keyboard.nextInt();
            if(num == a){
                System.out.println("Adivinaste papu Bvv");
                break;
            } else {
                System.out.println("Nop, otra vez");
            }
        }
        System.out.println("Fin del juego xd");
    }
    
}
