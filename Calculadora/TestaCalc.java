import javax.swing.JOptionPane;
public class TestaCalc
{
   public static void main(String args[]){
       //Cria uma calculadora
       Calculadora calc; //Variável do tipo Calculadora
       
       //Instancia um objeto do tipo calculadora
       calc = new Calculadora();
       
       String s1 =  JOptionPane.showInputDialog("Forneca o valor 1: ");
       String s2 = JOptionPane.showInputDialog("Forneca o valor 2: ");
       int valor1 = Integer.parseInt(s1);
       int valor2 = Integer.parseInt(s2);
       
       
       double divi = calc.dividir(valor1, valor2);
       double multi = calc.multiplicar (valor1, valor2);
       double som = calc.somar (valor1, valor2);
       double sub = calc.subtrair (valor1, valor2);
       
      	System.out.printf ("A divisão ente %d e %d = %d", valor1 , valor2, calc.dividir(valor1,valor2));
	System.out.printf ("A soma ente %d e %d = %d", valor1, valor2, calc.somar(valor1,valor2));
	System.out.printf ("A multiplicacao ente %d e %d = %d", valor1, valor2, calc.multiplicar(valor1,valor2));
	System.out.printf ("A subtracao ente %d e %d = %d", valor1, valor2, calc.subtrair(valor1,valor2));
       
       
}
}




