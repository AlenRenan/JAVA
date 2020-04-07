/**
 * Escreva a descrição da classe Ano aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Ano {

    public static void main (String args[]){
        //Entrada via Teclado de um valor inteiro ano
        int Ano = Integer.parseInt(JOptionPane.showInputDialog ("Insira o ano para descobir se ele é bissexto: "));  
        //Impede que o ano seja menor que 1500 
        if (Ano < 1500){ 
            System.out.println ("O ano informado é INVÁLIDO");

        } else {
        }
        //Criação de variáveis
        boolean ehBissexto = (Ano % 400 == 0)|| (Ano % 4 == 0 && Ano % 100 != 0); //Se o boolean for true o ano é bissexto, se for false o ano não é bissexto
        System.out.println (ehBissexto);

    }
}
