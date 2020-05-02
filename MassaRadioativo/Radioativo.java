/**
 * Escreva a descrição da classe Radioativo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Radioativo {
    public static void main (String args []){
        double massaInicial = Double.parseDouble(JOptionPane.showInputDialog("Informe a massa"));
        int tempo = 0;
        double massaFinal = massaInicial;
        //Armazenar as massas em uma lista
        double valores [] = new double [1000];
        int indice = 0;
        //Loop de calculo
        while (massaFinal > 0.1){
            System.out.println (massaFinal); //imprime todos os valores da massa apos perder 15%
            valores[indice] = massaFinal; 
            massaFinal = massaFinal - (0.15 * massaFinal);
            tempo += 20;
            indice++;
        }
        System.out.println ("Para atingir 0.1 grama, foram necessários: "+tempo+" segundos");
        System.out.println ("Em minutos seriam " +(tempo/60.0)+" minutos");
        System.out.println ("Valor na posição 10: " +valores[9]); //Escolhe na memoria o valor que está armazenado no "slot" 9 e imprime o valor na tela.
    } 
}