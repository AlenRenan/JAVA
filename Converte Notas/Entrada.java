/**
 * Escreva a descrição da classe Entrada aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Entrada {
    public static void main (String args[]){
        //Scanner para inserir a letra
        String  nLetra = JOptionPane.showInputDialog ("Informe a letra para converter a nota em valor numérico:");
        //Construtor - Instanciar um objeto da classe ConversorNota
        ConversorNota result = new ConversorNota ();
        //Mostra o reultado na tela
        System.out.println ( "Letra escolhida: " + nLetra);
        System.out.println ("Nota equivalente à letra" + result);
    }
}
