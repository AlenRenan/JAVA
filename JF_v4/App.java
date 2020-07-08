import javax.swing.JOptionPane;
/**
 * APlicacao: Jogo da forca.
 *
 * @author Julio
 * @version 17/06/2020
 */
public class App {
    public static void main(String args[]) {        
        // Criacao de uma variavel com o novo tipo (Dados)
        Palavras palavras = new Palavras();

        // Cria um novo tipo Saidacons
        //SaidaCons saida = new SaidaCons();
        SaidaGraf saida = new SaidaGraf();

        // gera dica
        palavras.gerarDica();
        
        // gera palavra
        palavras.gerarPalavra();

        // Mostra palavras
        //saida.mostrarPalavras(palavras.retornarPalavras());

        // Mostra a dica
        saida.mostrarDica(palavras.retornarDica());
  
        // Mostra a palavra invisivel
        saida.mostrarPalavra(palavras.retornarPalavraInvisivel());
        
        // Entrada da letra
        char letra = JOptionPane.showInputDialog("Forneca a letra").charAt(0);
        if (palavras.verificarLetra(letra)){
            System.out.println("Tem a letra.");
        } else {
            System.out.println("Nao Tem a letra.");
        }
        

        // mostra tela do jogo
        //saida.mostrarTela(palavras.retornarDica(), palavras.retornarPalavraIncompleta('a'));
       
       
        //Mostra a palavra visivel
        saida.mostrarPalavra(palavras.retornarPalavraVisivel());
        
        //Mostra a palavra visivel
        //saida.mostrarPalavra(palavras.retornarPalavraIncompleta('a'));

    }
}
