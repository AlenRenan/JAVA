/**
 * O usuário fornece a entrada do tamanho do vetor, o valor do vetor é dividido por 2 para definir 0 (par) ou 1(impar).
 * 
 * @author Renan Alencar 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Vetor{
    public static void main (String args []){
        //Entrada do tamanho do vetor.
        int tamVetor = Integer.parseInt(JOptionPane.showInputDialog ("Informe o tamanho do vetor"));
        //Criação da variável do vetor do tamanho escolhido.
        int vetEscolhido [] = new int [tamVetor];
        int indice; //Variável de varredura do vetor;
        //Percorrer o Vetor
        for (indice = 0; indice < tamVetor; indice++){
            //Verifica se o número é par ou ímpar
            if ((indice%2)==0){
                vetEscolhido[indice] = 0;

            } else {
                vetEscolhido[indice] = 1;
            }
        }
        System.out.print ("\n[");
        for (indice = 0; indice < tamVetor; indice++){
            if (indice < (tamVetor - 1)){
                System.out.print (vetEscolhido[indice] + ",");
            } else {
                System.out.print (vetEscolhido[indice]);
            }
        }
        System.out.println ("]");
    }
}
