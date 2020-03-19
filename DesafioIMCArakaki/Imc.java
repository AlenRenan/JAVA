import javax.swing.JOptionPane;
public class Imc {
    public static void main (String arg[]){
        //Entrada via teclado
        double valor1 =  Double.parseDouble(JOptionPane.showInputDialog ("Forneca sua altua: "));
        double valor2 =  Double.parseDouble(JOptionPane.showInputDialog ("Forneca seu peso: "));
        //Chama a classe Calculo
        Calculo calc = new Calculo(valor1, valor2);
        double imc = calc.calcularImc(); 
        //Impede que os valores sejam impossíveis
        if (valor1 <= 1.30 || valor1 >= 2.70){
            System.out.println("Sua Altura é INVÁLIDA");
        } else {
            if (valor2 <= 10 || valor2 >= 280){
                System.out.println("Seu Peso é INVÁLIDO");
            } else {
                //Mostra o resultado na tela
                System.out.printf("O seu imc é: %.2f ", imc);
                if (imc < 19) {
                    System.out.println ("\nVoce esta abaixo do peso"); 
                } else {
                    if (imc > 20) {
                        System.out.println ("\nVoce esta em seu peso normal ");
                    } else {
                        if ( imc > 25 ) {
                            System.out.println ("\nVoce esta com obesidade leve"); 
                        } else {
                            if ( imc > 30 ) {
                                System.out.println ("\nVoce esta com obesidade moderada"); 
                            } else {
                                if ( imc > 40 ) {
                                    System.out.println ("\nVoce esta com obesidade Morbida  "); 
                                } 
                            }
                        }
                    }
                }
            }
        }
    }
}
