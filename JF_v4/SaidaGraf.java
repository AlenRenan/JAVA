import javax.swing.JOptionPane;
/**
 * Saida grafica do jogo da forca.
 *
 * @author Julio Arakaki
 * @version 17/06/2020
 */
public class SaidaGraf{
    /**
     * Method mostrarDica
     *
     * @param dica String palavra dica do jogo da forca
     */
    public void mostrarDica(String dica){
        JOptionPane.showMessageDialog(null, "DICA: " + dica);
    }
    /**
     * Method mostrarPalavra
     *
     * @param palavra String palavra a ser adivinhada do jogo da forca
     */
    public void mostrarPalavra(String palavra){
        JOptionPane.showMessageDialog(null, "PALAVRA: " + palavra);
    }

    /**
     * Method mostrarPalavras
     *
     * @param palavras String todas as palavras do jogo da forca
     */
    public void mostrarPalavras(String palavras){
        JOptionPane.showMessageDialog(null, palavras);
    }

    /**
     * Method mostrarTela
     *
     * @param dica String dica do jogo da forca
     * @param palavra String palavra a ser advinhada
     */
    public void mostrarTela(String dica, String palavra){
        String s = "";
        
        s = s + "DICA: " + dica;
        s = s + "\nPALAVRA: " + palavra;
        
        JOptionPane.showInputDialog(s);
    }
    
}
