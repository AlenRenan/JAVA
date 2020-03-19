import javax.swing.JOptionPane; //Importa Diretórios (nesse caso importa a janela para o input)
public class CalculoBaskara {
    public static void main (String args []){

        double valorA  , valorB  , valorC , valorXum , valorXdois , delta, raiz, resultEqucao;

        valorA =Double.parseDouble(JOptionPane.showInputDialog ("Foreneca o valor de a: "));
        valorB =Double.parseDouble(JOptionPane.showInputDialog ("Foreneca ao valor de b: "));
        valorC =Double.parseDouble(JOptionPane.showInputDialog ("Foreneca o valor de c: "));

        //Calcula o valor de delta
        delta = (valorB * valorB) - (4 * valorA * valorC);
        //Impede que delta de um valor abaixo de 0 (zero)
        if (delta < 0){
            System.out.println ("ERRO: Nenhuma raiz real. O valor de delta nao pode ser negativo");
        } else {
            //Calcula a raiz
            raiz = Math.sqrt(delta);
            //Calcula o valor do X1
            valorXum = (- valorB + raiz)/2 * valorA;
            //Calcula o valor do X2
            valorXdois = (- valorB - raiz)/2 * valorA;

            //Mostra os resultados
            System.out.println ("O valor de delta e: " + delta);
            System.out.println("x1 = " + valorXum);
            System.out.println("x2 = " + valorXdois);       
        }
    }
}
