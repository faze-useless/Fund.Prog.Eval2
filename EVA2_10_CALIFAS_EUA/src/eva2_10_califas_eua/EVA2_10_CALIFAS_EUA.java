package eva2_10_califas_eua;
import java.util.*;
/**
 *
 * @author invitado
 */
public class EVA2_10_CALIFAS_EUA {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int score;
        
        System.out.println("Ingrese una calificación: ");
        score = keyboard.nextInt();
        
        if (score >= 1 && score <= 100) {
            if (score >= 90 && score <= 100) {System.out.println("Tiene una A");} else
            if (score >= 80 && score <= 89) {System.out.println("Tiene una B");} else
            if (score >= 70 && score <= 79) {System.out.println("Tiene una C");} else
            if (score >= 60 && score <= 69) {System.out.println("Tiene una D");} else
            if (score <= 60) {System.out.println("Tiene una F. Reprobado");}
        } else {
            System.out.println("[!] NÚMERO INVALIDO");
        }
        
    }
    
}
