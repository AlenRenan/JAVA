/**
 * Escreva a descrição da classe ProgA aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Progressao {
    public static void main(String args []){
        //Entrada de dados
        int n = Integer.parseInt(JOptionPane.showInputDialog ("Qual o numero de termos ? ")); //n é o número de termo da progressão
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o primeiro termo ? "));//a1 é o primeiro termo da progressão
        double r = Double.parseDouble(JOptionPane.showInputDialog("Qual a razão ? "));//r é a razão da progressão
        double ax = a1;
        double somaTermos = 0;
        //Imprimir os termos da PA
        System.out.println ("[");
        for (int i = 1; i <= n ; i++ ){
            somaTermos += ax;
            System.out.printf ("%.2f",ax);
            ax = ax += r; //Equivalente a ax + r
        }
        System.out.println ("]");
        System.out.println ("A soma dos termos é (REPETIÇÃO): " +somaTermos);
        
        //Útimo termo
        double an = ax - r;
        //double somaTermosFormula = (n/2.0) * (a1 + an); No (n/2.0) teve que por o .0 pois não é possível dividir inteiro por ponto flutuante, portanto o .0 transforma int em ponto flutuante.
        double somaTermosFormula = ((double)n/2) * (a1 + an); //Usar o double é o mesmo que usar o .0
        System.out.println ("A soma de termos é: (FÓRMULA)" +somaTermosFormula);
    }
}