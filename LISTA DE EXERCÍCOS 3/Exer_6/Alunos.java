/**
 * Escreva a descrição da classe Alunos aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Alunos {
    public static void main (String args []){
        int quantidadeAlunos = Integer.parseInt (JOptionPane.showInputDialog ("Informe a quantidade de alunos")); 
        String nomeAluno [] = new String [quantidadeAlunos];

        for (int linha = 0; linha < quantidadeAlunos; linha++){
            nomeAluno [linha] = JOptionPane.showInputDialog("Informe o aluno "+linha);
            System.out.println ("Aluno " +linha+": "  +nomeAluno[linha]);
        }
        System.out.println ();
    }
}
