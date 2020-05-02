/**
 * Escreva a descrição da classe Soldados aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Soldados {
    public static void main (String args []){ 
        //Entrada de valores
        int nSoldados = Integer.parseInt (JOptionPane.showInputDialog("Informe o número de soldados"));
        //Cria uma repetição de uma fila enquanto o numero de fila for menor ou igual ao de soldados
        int fila;
        for (fila = 1; fila <= nSoldados; fila++){
            nSoldados = nSoldados - fila; //Completa a fila com soldados
            System.out.println("Foram formadas "+fila+ " filas"); //informa o numero de filas completas
        }
        //Eu ia adicionar um if porém não ia dar tempo de finalizar 
            System.out.println ("Sobraram "+nSoldados+ " na fila incompleta"); //Informa o numero de solados na fila incompleta
        }
    }

