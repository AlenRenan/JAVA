/**
 * Escreva a descrição da classe Selecao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class Entrada {
    public static void main (String args []){
        //Instancia um Scanner
        Scanner keyboard = new Scanner(System.in);
        //Apresentação
        System.out.println ("------------ Wellcome to Renan's website ------------");
        //Entradas via teclado
        System.out.println ("Inform your name: ");
        String name = keyboard.next();
        System.out.println ("Inform your gender: ");
        String gender = keyboard.next();
        
        System.out.println ("Inform your Age: ");
        int age = keyboard.nextInt();

        if (age <= 17){
            System.out.println ("------------ To continue you must be over 18 !!! ------------");
        }else {
        }
        switch (gender){
            case "Male":
            gender = "";
                System.out.println ("------------ Wellcome to the boys club  !!! ------------" );
            break;
            
            case "male":
            gender = "";
                 System.out.println ("------------ Wellcome to the boys club  !!! ------------" );
            break;
            
            case "Female":
            gender = "";
            System.out.println ("------------ Girls can't entry !!! ------------" );
            break;
            
            case "female":
            gender = "";
            System.out.println ("------------ Girls can't entry !!! ------------" );
            break;
        }
    }
}
