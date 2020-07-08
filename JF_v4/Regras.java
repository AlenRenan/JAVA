
/**
 * IMplementaçao das regras para o jogo da forca.
 *
 * @author Julio 
 * @version 18/06/2020
 */
public class Regras {
    /**
     * Method verificarPalavra
     * Verifica se a palavra fornecida e igual a palavra a ser adivinhada
     *
     * @param palavra String palavra a ser adivinhada
     * @param palavraFornecida String palavra fornecida
     * @return boolean true - palavras iguais, false - palavras diferentes
     */
    boolean verificarPalavra(String palavra, String palavraFornecida){
        boolean ret = false;
        if(palavra.equals(palavraFornecida)){
            ret = true;
        }
        return ret;
    }
}
