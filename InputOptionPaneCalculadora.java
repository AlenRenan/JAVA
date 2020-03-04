import javax.swing.JOptionPane;
public class Calculadora{
    public static void main (String arg[]){
        //Entrada via teclado
        String s1 =  JOptionPane.showInputDialog("Forneca o valor 1: ");
        String s2 = JOptionPane.showInputDialog("Forneca o valor 2: ");

        // Converte para valor numérico
        int valor1 = Integer.parseInt(s1);
        int valor2 = Integer.parseInt(s2);
        //Declara a variável
        int som = valor1 + valor2;
        int div = valor1 / valor2;
        int mult = valor1 * valor2;
        int sub = valor1 - valor2;
       
        System.out.println("A soma dos numeros da: " + som);
        System.out.println("A divisao dos numeros da: " + div);
        System.out.println("A multiplicacao dos numeros da: " + mult);
        System.out.println("A subtracao dos numeros da: " + sub);

         

    }
}