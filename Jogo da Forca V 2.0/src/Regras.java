
public class Regras {
	// Construtores:
	Palavras gerador = new Palavras();

	// Variáveis:
	String respostas = gerador.geraPalavras();
	String tamanhoString = respostas;
	String entradaLetras = "";
	String vitoriaDerrota;
	int tentativas = gerador.geraPalavras().length();

	public String Vitoria() { // Parâmetro que retorna se o jogador venceu

		if (entradaLetras == respostas) {

			vitoriaDerrota = "VITÓRIA";

		}

		return vitoriaDerrota;
	}

	public String Derrota() { // Parâmetro que retorna se o jogador perdeu

		if (entradaLetras.length() > respostas.length()) {

			vitoriaDerrota = "PERDEU, A RESPOSTA ERA:  " + respostas;

		}

		return vitoriaDerrota;
	}

}
