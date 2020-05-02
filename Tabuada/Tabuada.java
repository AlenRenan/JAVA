/**
 * Escreva a descrição da classe Tabuada aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Tabuada {
    public void mostrarTabuada (int numTabuada){ //é void pq nao tem return
        //for (int i = 1 ; i <= 10 ; i++){
        //System.out.println (i + "x" +numTabuada + "=" + (i * numTabuada));

        //}
        int i = 1;
        while ( i <= 10){ //Dentro do parentese do while é apenas a condição
            System.out.println (i + "x" +numTabuada + "=" + (i * numTabuada));
            i++;
        }
    }
}
