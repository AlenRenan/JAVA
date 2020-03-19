import javax.swing.JOptionPane;
public class TestaEq2g {

    public static void main (String args []) {

        //Entrada de dados e a conversao de String para double
        double valorA = Double.parseDouble(JOptionPane.showInputDialog ("Foreneca o valor de a: "));
        double valorB = Double.parseDouble(JOptionPane.showInputDialog ("Foreneca ao valor de b: "));
        double valorC = Double.parseDouble(JOptionPane.showInputDialog ("Foreneca o valor de c: "));

        //Criar um objeto da classe Eq2g (Instanciar um objeto) - Criar uma equacao de 2 grau

        Eq2g eq = new Eq2g(valorA,valorB,valorC); // "eq" é um nome qualquer - A classe Eq2g será chamada e usará o valor de valorA,valorB e valorB nas contas  

        //Impede que o delta seja negativo
        double delta = eq.calcularDelta ();
        if (delta >= 0 ){
            System.out.println ("Existem raizes reais");
            System.out.println ("\nDelta = " + eq.calcularDelta());
            System.out.println ("\nx1 = " + eq.calcularRaiz1());
            System.out.println ("\nx2 = " + eq.calcularRaiz2());
        } else {
            System.out.println ("Nenhuma raiz real");
        }
    }
}
