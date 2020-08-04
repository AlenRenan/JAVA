import java.lang.Math;

public class Palavras {

	int nAleatorio = 0 + (int) (Math.random() * 3);// Gera números aleatórios de 0 a 3 (contando o 0)
	String times[] = { "santos", "palmeiras", "flamengo" }; // Array que armazena os time
	String comidas[] = { "feijoada", "coxinha", "carne" }; // Array que armazena as comidas
	String carros[] = { "ferrari", "mustang", "audi" }; // Array que armazena os carros
	int armazenanAleatorio;

	public String geraDicas() {

		String dicas[] = { "Times", "Comidas", "Carros" }; // Array que armazena as dicas
		return dicas[nAleatorio]; // Retorna as dicas de acordo com o número gerado
	}

	public String geraPalavras() {

		if (nAleatorio == 0) {

			int nAleatorio = 0 + (int) (Math.random() * 3);// Gera um número para cada resposta
			armazenanAleatorio = nAleatorio;
			return times[nAleatorio]; // Retorna a resposta caso a dica seja time

		} else if (nAleatorio == 1) {

			int nAleatorio = 0 + (int) (Math.random() * 3); // Gera um número para cada resposta
			armazenanAleatorio = nAleatorio;
			return comidas[nAleatorio]; // Retorna a resposta caso a dica seja comidas

		} else if (nAleatorio == 2) {

			int nAleatorio = 0 + (int) (Math.random() * 3); // Gera um número para cada resposta
			armazenanAleatorio = nAleatorio;
			return carros[nAleatorio]; // Retorna a resposta caso a dica seja carros
		}

		return null;
	}

	public String verificaETrocaLetra(char letra) {// Aula teams 18/06/20 Às 8:00 minutos char.At

		String palavraTimes = times[armazenanAleatorio];// Preciso adicionar as outra matrizes
		String palavraComidas = comidas[armazenanAleatorio];
		String palavraCarros = carros[armazenanAleatorio];
		int tamPalavraTimes = palavraTimes.length();
		int tamPalavraComidas = palavraComidas.length();
		int tamPalavraCarros = palavraCarros.length();
		String s = "";

		switch (nAleatorio) {

		case 0:
			// Monta a string com - de acordo com o tamanho
			for (int i = 0; i < tamPalavraTimes; i++) {

				if (palavraTimes.charAt(i) == letra) {

					s = s + letra;

				} else {

					s = s + "_ ";
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

					s = s + "_ ";
				}
			}
			break;
		}

		return s;

	}

}
