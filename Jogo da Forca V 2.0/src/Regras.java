
public class Regras {
	// Construtores:
	Palavras gerador = new Palavras();

	// Vari�veis:
	String respostas = gerador.geraPalavras();
	String tamanhoString = respostas;
	String entradaLetras = "";
	String vitoriaDerrota;
	int tentativas = gerador.geraPalavras().length();

	public String Vitoria() { // Par�metro que retorna se o jogador venceu

		if (entradaLetras == respostas) {

			vitoriaDerrota = "VIT�RIA";

		}

		return vitoriaDerrota;
	}

	public String Derrota() { // Par�metro que retorna se o jogador perdeu

		if (entradaLetras.length() > respostas.length()) {

			vitoriaDerrota = "PERDEU, A RESPOSTA ERA:  " + respostas;

		}

		return vitoriaDerrota;
	}

}
