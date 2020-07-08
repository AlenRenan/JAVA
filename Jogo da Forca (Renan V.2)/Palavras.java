import java.lang.Math;

public class Palavras {

    int nAleatorio = 0 + (int) (Math.random() * 3);// Gera números aleatórios de 0 a 3 (contando o 0)
    String times[] = { "santos", "palmeiras", "flamengo","corinthians" }; // Array que armazena os time
    String comidas[] = { "feijoada", "coxinha","cannoli","pastel" }; // Array que armazena as comidas
    String carros[] = { "ferrari", "mustang", "audi","corola"}; // Array que armazena os carros
    int armazenanAleatorio;

    public String geraDicas() {

        String dicas[] = { "Times", "Comidas", "Carros" }; // Array que armazena as dicas
        return dicas[nAleatorio]; // Retorna as dicas de acordo com o número gerado
    }

    public String geraPalavras() {
        String palavra = null;

        if (nAleatorio == 0) {

            int nAleatorio = 0 + (int) (Math.random() * 3);// Gera um número para cada resposta
            armazenanAleatorio = nAleatorio;
            palavra = times[nAleatorio];
            //return times[nAleatorio]; // Retorna a resposta caso a dica seja time

        } else if (nAleatorio == 1) {

            int nAleatorio = 0 + (int) (Math.random() * 3); // Gera um número para cada resposta
            armazenanAleatorio = nAleatorio;
            palavra = comidas[nAleatorio];
            //return comidas[nAleatorio]; // Retorna a resposta caso a dica seja comidas

        } else if (nAleatorio == 2) {

            int nAleatorio = 0 + (int) (Math.random() * 3); // Gera um número para cada resposta
            armazenanAleatorio = nAleatorio;
            palavra = carros[nAleatorio];;
            //return carros[nAleatorio]; // Retorna a resposta caso a dica seja carros
        }

        return palavra;
    }
    
    public String verificaETrocaLetra(char letra) {

        String palavraTimes = times[armazenanAleatorio]; //Variavel que chama a matriz com respostas
        String palavraComidas = comidas[armazenanAleatorio];  //Variavel que chama a matriz com respostas
        String palavraCarros = carros[armazenanAleatorio];  //Variavel que chama a matriz com respostas
        int tamPalavraTimes = palavraTimes.length(); //Tamanho da string
        int tamPalavraComidas = palavraComidas.length();//Tamanho da string
        int tamPalavraCarros = palavraCarros.length();//Tamanho da string
        String s = "";
        //String stringLetra = Character.toString(letra); //Converte char para String
        String recebeAnterior = "";
        //Como utlizei 3 arrays para as respostas, não consegui juntar tudo em uma variável só, portanto tive que criar os cases para funcionar.
        switch (nAleatorio) {
            case 0:
            // Monta a string com "_" e a letra
            for (int i = 0; i < tamPalavraTimes; i++) {

                if (palavraTimes.charAt(i) == letra) {

                    s = s + letra;
                   
                } else {

                    s = s + " _ ";

                }
            }
            break;
            case 1:
            // Monta a string com - de acordo com o tamanho
            for (int i = 0; i < tamPalavraComidas; i++) {

                if (palavraComidas.charAt(i) == letra) {

                    s = s + letra;

                } else {

                    s = s + " _ ";

                }
            }
            break;
            case 2:
            // Monta a string com - de acordo com o tamanho
            for (int i = 0; i < tamPalavraCarros; i++) {

                if (palavraCarros.charAt(i) == letra) {

                    s = s + letra;

                } else {

                    s = s + " _ ";

                }
            }
            break;
        }
        return s;
    }
}
