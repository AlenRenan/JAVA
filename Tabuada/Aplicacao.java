
/**
 * Escreva a descrição da classe Aplicacao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Aplicacao {
    public static void main (String args []){

        Tabuada chamaTabuada = new Tabuada (); //Chama a classe tabuada para usar no na classe Aplicação

        int numero = Integer.parseInt (JOptionPane.showInputDialog("Qual tabuada você quer ?"));
        chamaTabuada.mostrarTabuada(numero);
    }
}
