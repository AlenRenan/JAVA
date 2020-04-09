/**
 * Escreva a descrição da classe RepetiçãoDoWhile aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class RepetiçãoDoWhile {
    public static void main (String args []){
        String nome = JOptionPane.showInputDialog ("Informe seu nome completo: ");
        int i = 1;

        do {
                System.out.println ("Nome " + i + ": " + nome);
                i++;//i = i + 1
            }while ( i <=5);
    }
}
