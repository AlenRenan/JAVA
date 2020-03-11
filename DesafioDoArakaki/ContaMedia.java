import java.util.Scanner; 
public class ContaMedia {
 public static void main(String args[]){
    
        Nota nt = new Nota(); //Instancia (cria) um objeto da classe Nota 
   
        Scanner teclado = new Scanner(System.in);

        double ava1 = 0;
        double ava2 = 0;
        double media = 0;
        String nome;
        
        System.out.println ("Forenca seu nome: ");
        nome = teclado.nextLine();
        System.out.println ("Forneca Avaliacao1: ");
        ava1 = teclado.nextDouble();
        System.out.println ("Forneca Avaliacao2: ");
        ava2 = teclado.nextDouble();

        media = nt.calcularMedia(ava1, ava2);     
        if (media >= 5) {
        System.out.printf("%s voce foi aprovado com media %.2f", nome, media);
    } else {
      System.out.printf("%s voce foi reprovado com media %.2f", nome, media);
}
}
}
   
  
