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
        if (valor1 <= 1.40 || valor1 > 2.30){
            System.out.println("Sua Altura é INVÁLIDA");
        } else {
            if (valor2 <= 35 || valor2 > 200){
                System.out.println("Seu Peso é INVÁLIDO");
            } else {
                //Mostra o resultado na tela
                System.out.printf("O seu imc é: %.2f ", imc);
                if (imc <= 19.9) {
                    System.out.println ("\nVoce esta abaixo do peso"); 
                } 
                else {
                   if (imc >= 24.9) {
                        System.out.println ("\nVoce esta em seu peso normal ");
                    } 
                    else {
                        if ( imc >= 25 ) {
                            System.out.println ("\nVoce esta com obesidade leve"); 
                        } 
                        else {
                            if ( imc >= 30 ) {
                                System.out.println ("\nVoce esta com obesidade moderada"); 
                            } 
                            else {
                                if ( imc >= 35.0 ) {
                                    System.out.println ("\nVoce esta com obesidade Severa  "); 
                                } 
                                else {
                                    if (imc >= 39.9) {
                                        System.out.println ("\nVoce esta com obesidade morbida"); 
                                    }
                                    else {

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
