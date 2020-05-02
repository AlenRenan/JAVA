/**
 * Escreva a descrição da classe contas aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Contas {
    double salario, horas, bruto, extras, quinze;

    public Contas (double salario, double horas){
        this.salario = salario;
        this.horas = horas;
        this.quinze = quinze; 
    }
    //Calculo do Salário
    double calcularBruto (){
        double bruto = salario * horas;
        return bruto;
    }
    //Calculo das Horas Extras
    double calcExtras (){
        double bruto = salario * horas;
        double quinze = bruto * 0.15;
        double extras = bruto + quinze;
        return extras;
    }
}