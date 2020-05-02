/**
 * Escreva a descrição da classe Somadivisao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Somadedivisao {
    public static void main (String args []){
        double a1 = 1;
        double n = 1.98;
        double r = 0.5;
        double an = a1  + (n - 1)*r;
        double somaPa = 0; 
        System.out.println("O termo geral é: " +an);
        int i = 1;
        while(i <= 1.98){  
            somaPa = ((i + an) * n)/2;
            i++;
        }
        System.out.println ("A soma de 1/1 até 99/50 é: " +somaPa);
    }
}