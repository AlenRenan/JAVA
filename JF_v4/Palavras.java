
/**
 * Representa as palavras e operacoes que podem ser feitas sobre elas.
 *
 * @author Julio Arakaki
 * @version 15/06/2020
 */
public class Palavras {
    // Guarda a linha selecionada
    int linha;
    // guarda a coluna selecionada
    int coluna; 

    // Matriz de palavras (coluna 1 = dicas)
    String dados[][] = {
            {"Time", "Corintians", "Santos", "Flamengo", "Remo"},
            {"Comida", "Feijoada", "Cuzcuz", "Sashimi", "Macarronada"},
            {"Carro", "Fusca", "Ferrari", "Mercedes", "Monza"},
            {"Nome", "Ze", "Julio", "Maria", "Ademir"},
            {"Linguagem", "Java", "C#", "Python", "Ruby"}
        };

    /**
     * Method gerarDica
     *
     */
    public void gerarDica(){
        // gera linha randomicamente da matriz
        linha = (int)(Math.random()*dados.length);
    }

    /**
     * Method retornarDica
     *
     * @return String a dica (palavra)
     */
    public String retornarDica(){
        return (dados[linha][0]);
    }

    /**
     * Method gerarPalavra
     *
     */
    public void gerarPalavra(){
        // gera palavra randomicamente da matriz (a partir da coluna 1)
        coluna = (int)(Math.random()*(dados[linha].length - 1)) + 1;
    }

    /**
     * Method retornarPalavraVisivel
     *
     * @return String a palavra da linha (comecando na segunda coluna)
     */
    public String retornarPalavraVisivel(){
        // retorna a palavra
        return (dados[linha][coluna]);  
    }

    /**
     * Method retornarPalavraInvisivel
     *
     * @return String palavra invisivel
     */
    public String retornarPalavraInvisivel(){
        String palavra = dados[linha][coluna];
        int tamPalavra = palavra.length();

        // Monta a string com - de acordo com o tamanho
        String s = "";
        for (int i = 0; i < tamPalavra; i++){
            s = s + "-";
        }
        return s;
    }
    /**
     * Method retornarPalavraIncompleta
     *
     * @param letra char letra a ser verificada (se existe na palavra)
     * @return String palavra incompleta
     */
    public String retornarPalavraIncompleta(char letra){
        String palavra = dados[linha][coluna];
        int tamPalavra = palavra.length();

        // Monta a string com - de acordo com o tamanho
        String s = "";
        for (int i = 0; i < tamPalavra; i++){
            if (palavra.charAt(i) == letra) {
                s = s + letra;
            } else {
                s = s + "-";
            }
        }
        return s;
    }

    /**
     * Method verificarLetra, verifica se existe a letra na string
     *
     * @param letra char letra a ser verificada
     * @return boolean (true - se existir letra na string, false - se nao existir)
     */
    public boolean verificarLetra(char letra){
        String palavra = dados[linha][coluna];
        int tamPalavra = palavra.length();
        
        boolean ret = false;
        
        // percorre a string caractere a caractere 
        for (int i = 0; i < tamPalavra; i++){ 
            if (palavra.charAt(i) == letra) { // se existir
                ret = true;
            } 
        }
        return ret;
    }

    /**
     * Method retornarPalavras
     *
     */
    public String retornarPalavras(){
        int nLinhas = dados.length; 
        int nColunas = dados[0].length;
        String s = "";

        for (int linha = 0; linha < nLinhas; linha++){
            for(int coluna = 0; coluna < nColunas; coluna++){
                s = s + "".format("%-13s", dados[linha][coluna]);
                //System.out.printf("%-13s", dados[linha][coluna]);
            }
            s = s + "\n";
            //System.out.println();
        }
        return s;
    }
}
