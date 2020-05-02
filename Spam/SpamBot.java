import java.util.Scanner;
public class SpamBot
{
    public  static void main (String args []){

        Scanner entrada = new Scanner(System.in);
        System.out.println ("Digite o que você deseja spammar");
        String spam = entrada.nextLine ();
        //System.out.println ("Quantas vezes ?");
        int quantidade = 999999999;//= entrada.nextLine();

        for (int i = 0; i <= quantidade; i++){
            System.out.println (spam);
        }
    }
}
