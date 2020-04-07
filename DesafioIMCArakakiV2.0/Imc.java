public class Imc {
    // atributos
    double peso, altura;
    
    // Construtor
    Imc (double p, double a){
        peso = p;
        altura = a;
    }
    
    
    double calcularImc(){
        double imc = peso/(Math.pow(altura, 2)); 
        return (imc);
    }
    
    public String toString(){
        return ("IMC = " + calcularImc());
    }
    
    String verificarImc(){
        String ret = "";
        double imc = calcularImc();
        
        if (imc <= 18.5){
            ret = "Abaixo do peso";
        } else if(imc > 18.5 && imc <= 24.9){
            ret = "Peso Normal";
        } else {
            ret = "Obesidade grau 3";
        }
         return ret;
    }
}
