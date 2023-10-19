package eva2_12_carreras;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_12_CARRERAS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String carrera;
        
        System.out.println("Ingrese las iniciales de una carrera: (ISC,INF,IND,IDI,LA,IGE,ARQ) ");
        carrera = keyboard.nextLine();
        
        switch(carrera) {
            case "ISC": System.out.println("Ingeniería en Sistemas Computacionales");
                break;
            case "INF": System.out.println("Ingeniería en Informatica");
                break;
            case "IND": System.out.println("Ingeniería Industrial");
                break;
            case "IDI": System.out.println("Ingeniería en Diseño Industrial");
                break;
            case "LA": System.out.println("Licenciatura en Administración");
                break;
            case "IGE": System.out.println("Ingeniería en Gestión Empresarial");
                break;
            case "ARQ": System.out.println("Arquitectura");
                break;
            default: System.out.println("[!] Eso no es una carrera bro xd");
        }
    }
    
}
