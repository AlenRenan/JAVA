/**
 * Escreva a descrição da classe Entrada aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import javax.swing.JOptionPane;
public class Programa {
    public static void main (String args []){
        //Entrada de valores
        double salario =  Double.parseDouble (JOptionPane.showInputDialog ("Informe seu salário por hora"));
        int horas = Integer.parseInt (JOptionPane.showInputDialog ("Informe quantas horas de trabalho foram feitas"));

        Contas result = new Contas(salario,horas);

        if (horas > 40){
            System.out.println ("Seu extra será de R$" + result.calcExtras());
        }else {
            System.out.println ("Você não teve horas extras");
        }
        System.out.println ("Seu salario bruto é R$" + result.calcularBruto());
    }   
}

