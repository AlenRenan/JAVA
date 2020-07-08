public class Regras {
    // Construtores:
    Palavras gerador = new Palavras();

    // Variáveis:
    String respostas = gerador.geraPalavras();
    String tamanhoString = respostas;
    String entradaLetras = "";
    String vitoriaDerrota;
    int tentativas = 6;

    public String VitoriaDerrota() { // Parâmetro que retorna se o jogador venceu ou perdeu

        if (entradaLetras.equals(respostas)){

            vitoriaDerrota = "VITÓRIA";

        }else if (entradaLetras != respostas || entradaLetras.length() < respostas.length()){

            vitoriaDerrota = "DERROTA. A RESPOSTA ERA: "+ respostas;
        }
        return vitoriaDerrota;
    }

    public String geraBoneco(){ //Gera o boneco

        //System.out.println ("O");

        return null; 
    }
}
