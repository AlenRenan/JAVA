public class Imc {
    //Atributos
    double peso, altura;
    //Construtor
    Imc (double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    //Conta para calcular o IMC
    double calcularImc (){
        double imc = peso/(Math.pow(altura, 2));
        return imc;
    }
    //Imprime o resultado do imc chamando o calcularImc
    public String toString(){
        return ("IMC = " + calcularImc());
    }
    //Verifica o imc e dá um aviso para o usuário
    String verificarImc(){
        String resultado = "";
        double imc = calcularImc();
        if (imc <= 18.5){
            resultado = "abaixo do seu peso recomendado (VÁ A UM MÉDICO URGENTE!!)";
        }else if (imc > 18.6 && imc <=24.9){
            resultado = " com seu peso normal (PARABENS!!)";
        }else if (imc > 25.0 && imc <= 29.9){
            resultado = "levemente acima do peso";
        }else if (imc > 30.0 && imc <=34.9){
            resultado = " com obesidade grau I (CUIDADO!!)";
        }else if (imc > 35.0 && imc <=39.9){
            resultado = "com obesidade grau II (CUIDE DA SUA SAÚDE!!)";
        }else if (imc >= 40){
            resultado = "com obesidade mórbida (VÁ A UM MÉDICO URGENTE!!)";
        }  
        return resultado;
    }
}
