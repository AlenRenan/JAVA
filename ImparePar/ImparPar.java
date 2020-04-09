/**
 * Escreva a descrição da classe ImparPar aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class ImparPar {
    public static void main (String args []){
        //Declaração de variáveis
        long somaPares = 0;//Variável para armazenar a soma dos numeros pares (Usou-se long pois armazena mais bytes)
        //Entrada de valores
        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Forneça o início"));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Forneça o fim"));
        //Repetição que recebe a variavel inicio e para de repetir até chegar no numero final informado
        for (int i = inicio; i <= fim; i++){

            if ((i%2) != 0){ //Se i tiver resto diferente de zero é impar
                System.out.println (i);
            }else { //Se i nao tiver resto diferente de zero é par
                somaPares = somaPares + i;
            }  
        }
        System.out.println ("A soma dos pares é: " + somaPares);
    }
}
