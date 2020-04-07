import javax.swing.JOptionPane;
/**
 * Write a description of class TestaEq2g here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestaEq2g {

    public static void main (String args[]){

        // Entrada de dados
        double a = Double.parseDouble(JOptionPane.showInputDialog("Forneca a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Forneca b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Forneca c: "));

        // Criar um objeto da classe Eq2q (instanciar um objeto) - criar uma euacao 2g
        Eq2g eq = new Eq2g(a, b, c);

        // Verifica se a equacao possui raizes reais
        double delta = eq.calcularDelta();
        if (delta >= 0){ 
            // existem raizes reais
            // Imprimir raizes reais
            System.out.println("x1 = " + eq.calcularRaiz1());
            System.out.println("x2 = " + eq.calcularRaiz2());
        } else {
            System.out.println("\nNao existem raizes reais!!");
        }

    }
}
