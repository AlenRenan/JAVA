/**
 * Escreva a descrição da classe Eleicoes aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Eleicoes {
    public static void main (String args []){
        //Entrada de dados 
      int eleiEsperados = Integer.parseInt (JOptionPane.showInputDialog ("Numero de eleitores esperados"));
      int nVotos = Integer.parseInt (JOptionPane.showInputDialog ("Numero de votos")); 
      int nNulos =Integer.parseInt (JOptionPane.showInputDialog ("Numero de votos nulos"));
      int nBrancos =Integer.parseInt (JOptionPane.showInputDialog ("Numero de votos em branco"));
      //Converte o numero de votos em porcentagem
      float porcentoVotos = nVotos / 100;
      float porcentoEleitores = eleiEsperados/100;
      //Realiza as contas para saber suas respectivas porcentagens
      float porcentEleit = nVotos /porcentoEleitores;
      System.out.println ("Compareceram na seção "+porcentEleit+"% dos eleitores");
      float porcentBranco =  nBrancos /porcentoVotos;
      System.out.println ("Os votos em branco são de: "+porcentBranco+"% dos eleitores");
      float porcentNulo =  nNulos/porcentoVotos;
      System.out.println ("Os votos nulos são de: "+porcentNulo+"%");
        
    }
}
