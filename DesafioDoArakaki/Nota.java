
public class Nota { 
    double calcularMedia(double nota1, double nota2){
    Calculadora calc  =  new Calculadora ();
    
    double soma = calc.somar(nota1, nota2); //Chama a função da calculadora
    double media = calc.dividir(soma,2);  
    return (media);
}
}


