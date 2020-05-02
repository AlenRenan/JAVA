/**
 * Escreva a descrição da classe Vogais aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Vogais {
    public void contarVogais (String textoEntrada){
        int nA = 0, nE = 0, nI = 0, nO = 0, nU = 0; //Quantidade de vogais (A,E,I,O,U)
        int outrasLetras = 0;
        char letra;

        for (int i = 0; i <= textoEntrada.length(); i++){ //Percorre a String caractere por caractere
            letra = textoEntrada.charAt(i); //Pega o caractere da posição 
            
            switch(letra){
                case 'a':
                case 'A':
                nA++;
                    break;
                case 'e':
                case 'E':
                nE++;
                    break; 
                case 'i':
                case 'I':
                nI++;
                    break; 
                case 'o':
                case 'O':
                nO++;
                    break; 
                case 'u':
                case 'U':
                nU++;
                    break; 
                case ' ':
                    break; 
                
                default: //Nenhum dos casos acima
                    outrasLetras++;
            }
        }
        System.out.println ("" + textoEntrada);
        System.out.println ("Número de \"A\" = "+ nA);
        System.out.println ("Número de \"E\" = "+ nE);
        System.out.println ("Número de \"I\" = "+ nI);
        System.out.println ("Número de \"O\" = "+ nO);
        System.out.println ("Número de \"U\" = "+ nU);
        System.out.println ("Número de outras letras = "+ outrasLetras);
    }
}