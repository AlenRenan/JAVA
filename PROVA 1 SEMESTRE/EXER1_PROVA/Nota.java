/**
 * Escreva a descrição da classe Nota aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Nota {
    public static void main (String args []){
        double p1 = 0;
        double p2 = 0;
        double ativ1 = 0;
        double ativ2 = 0;
        for (int i = 1; i <=20; i++){
            if (p1 < 0 || p2 < 0|| ativ1 < 0 || ativ2 < 0){
                System.out.println ("Notas inválidas !!!!");
            }else {
            }
            p1 = Double.parseDouble (JOptionPane.showInputDialog ("Informe A nota da Prova 1 do aluno "+i));
            p2 = Double.parseDouble (JOptionPane.showInputDialog ("Informe A nota da Prova 2 do aluno" +i));
            ativ1 = Double.parseDouble (JOptionPane.showInputDialog ("Informe A nota da Atividade 1 do aluno" +i));
            ativ2 = Double.parseDouble (JOptionPane.showInputDialog ("Informe A nota da Atividade 2 do aluno " +i));
            double nota1 = (p1 + (3 * ativ1))/4;
            double nota2 = (p2 + (3 * ativ2))/4;
            double notaFinal = (nota1 + nota2)/2;
            System.out.println ("A nota final do aluno " +i+ " foi: " +notaFinal);
        }
    }
}
