public class Calculo {   
    double valor1, valor2; 
    Calculo(double v1, double v2){
        this.valor1 = v1;
        this.valor2 = v2;
    }

    double calcularImc (){
        double imc = valor2/(valor1 * valor1);
        return imc;
    }
}