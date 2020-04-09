/**
 * Escreva a descrição da classe Repeticao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class RepeticaoFor {
    public static void main (String args []){

        String nome = JOptionPane.showInputDialog ("Informe seu nome completo: ");

        //Repetição usando o for

        //for (int i = 1; i <=5; i++){ //Até quando i for igual a 5 ele imprime. I++ adiciona mais um até chegar a 5
        //System.out.println ("Nome " + i + ": " + nome);

        //Repetição usando o while
        int i = 1;
        while ( i <=5){
            System.out.println ("Nome " + i + ": " + nome);
            i++;//i = i + 1
        }
    }
}