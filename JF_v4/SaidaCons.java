
/**
 * Saida para console/terminal.
 *
 * @author Julio
 * @version 17/06/2020
 */
public class SaidaCons{
    /**
     * Method mostrarDica
     *
     * @param dica String palavra dica do jogo da forca
     */
    public void mostrarDica(String dica){
        System.out.println("DICA: " + dica);
    }

    /**
     * Method mostrarPalavra
     *
     * @param palavra String palavra a ser adivinhada do jogo da forca
     */
    public void mostrarPalavra(String palavra){
        System.out.println("PALAVRA: " + palavra);
    }

    /**
     * Method mostrarTela
     *
     * @param dica String palavra dica
     * @param palavra String palavra a ser adivinhada
     */
    void mostrarTela(String dica, String palavra){
        mostrarDica(dica);
        mostrarPalavra(palavra);
    }

    /**
     * Method mostrarPalavras
     *
     * @param palavras String todas as palavras do jogo da forca
     */
    public void mostrarPalavras(String palavras){
        System.out.println(palavras);
    }

}
