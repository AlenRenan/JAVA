/**
 * Escreva a descrição da classe Seqfibonacci aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Seqfibonacci {
    public static void main (String args []){
        int posicao;
        //Entrada do número de termos
        int nTermos = Integer.parseInt (JOptionPane.showInputDialog ("Informe o numero de termos da sequência"));
        //O usuário escolhe qual a posição do elemento e o impede de escolher um número fora da faixa do array de número de termos
        do {
            posicao = Integer.parseInt (JOptionPane.showInputDialog ("Qual a posição"));
            if (posicao > nTermos || posicao <= 0){
                System.out.println ("Posição inválida...Forneça outra posição !!!");
            }
        } while (posicao > nTermos || posicao <= 0);
        //Cria o Array do tamanho de termos forneceido pelo usuário
        int termos [] = new int [nTermos];
        //Preenche o vetor
        termos [0] = 1;
        termos [1] = 1;
        //Preenche com os outros termos
        for (int i= 2; i < nTermos; i++){
            termos[i] = termos[i-1] + termos [i-2];
        }
        for (int i= 0; i < nTermos; i++){
            System.out.print (termos[i] + " ");
        }
        //Imprime o numero da posição escolhida
        System.out.printf ("\nO elemento da posição %d é %d", posicao, termos[posicao-1]);
    }
}
