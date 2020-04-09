/**
 * Escreva a descrição da classe ImparPar aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class SomaFracoes {
    public static void main (String args []){
        //Declaração de variáveis
        double numerador;
        double denominador; 
        double somaParcelas = 0; 

        for (numerador = 1, denominador = 1; numerador <=99  ; numerador += 1) { //O numerador aumenta de 2 em 2 numerador = numerador + 2
            somaParcelas = somaParcelas + (numerador/denominador);
            denominador++;
        }
        System.out.println ("Soma das parcelas: " + somaParcelas);
    }
}
