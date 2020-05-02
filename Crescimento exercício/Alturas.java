
/**
 * Escreva a descrição da classe Altura aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Alturas {
    public static void main (String args []){
        //Declaração de valores da altura em cm
        int altJuca = 110; 
        int altChico = 150;
        int qtdeAnos = 1;
        for (qtdeAnos = 1 ; altChico >= altJuca ; qtdeAnos++ ){
            altChico += 2;
            altJuca += 3;
        }   
        System.out.println("O Juca ultrapassa o Chico após " + qtdeAnos + " anos");
    }
}
