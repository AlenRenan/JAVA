import javax.swing.JOptionPane;
public class Main {
    public static void main(String args[]) {

        // Construtores:
        Palavras gerador = new Palavras();
        Regras geraRegras = new Regras();

        // Variáveis:
        String dicas = gerador.geraDicas(); // Armazena as dicas geradas pelo parâmetro geraDicas
        String respostas = gerador.geraPalavras();// Armazena as palavras geradas pelo parâmetro geraPalavras
        String tamanhoString = respostas; // Le o tamanho de caracteres da resposta
        String trocaLetra = gerador.verificaETrocaLetra('s');
        String traco = "_ ";
        int tentativas = 0;
        // String substituiPelaLetra = gerador.verificaETrocaLetra('s');

        // Imprime
        JOptionPane.showMessageDialog(null, "DICA: " + dicas); // Imprime a dica que vem da função "geraDicas"
        JOptionPane.showMessageDialog(null, "Use apenas letra minúscula");
        for (int i = 0; i < tamanhoString.length(); i++) { // Gera a quantidade de linha da palavra
            System.out.print(traco);
        }

        System.out.println("\n\nA resposta tem " + tamanhoString.length() + " letras");
        System.out.println("\nRESPOSTA: " + respostas); //Imprime a resposta

        // Entrada com as letras ou resposta
        String entradaLetras;
        do {

            entradaLetras = JOptionPane.showInputDialog("Informe a LETRA, ou a RESPOSTA se já souber !!"); 
            tentativas += 1; //Contador para o número de tentativa
            System.out.println ("TENTATIVA: " + tentativas);//Imprime o numero de tentativa

            switch (entradaLetras) {

                case "a":

                System.out.println(gerador.verificaETrocaLetra('a'));
                break;

                case "b":

                System.out.println(gerador.verificaETrocaLetra('b'));

                break;
                case "c":

                System.out.println(gerador.verificaETrocaLetra('c'));

                break;
                case "d":

                System.out.println(gerador.verificaETrocaLetra('d'));

                break;
                case "e":

                System.out.println(gerador.verificaETrocaLetra('e'));

                break;
                case "f":

                System.out.println(gerador.verificaETrocaLetra('f'));

                break;
                case "g":

                System.out.println(gerador.verificaETrocaLetra('g'));

                break;
                case "h":

                System.out.println(gerador.verificaETrocaLetra('h'));

                break;
                case "i":

                System.out.println(gerador.verificaETrocaLetra('i'));

                break;
                case "j":

                System.out.println(gerador.verificaETrocaLetra('j'));

                break;
                case "k":

                System.out.println(gerador.verificaETrocaLetra('k'));

                break;
                case "l":

                System.out.println(gerador.verificaETrocaLetra('l'));

                break;
                case "m":

                System.out.println(gerador.verificaETrocaLetra('m'));

                break;
                case "n":

                System.out.println(gerador.verificaETrocaLetra('n'));

                break;
                case "o":

                System.out.println(gerador.verificaETrocaLetra('o'));

                break;
                case "p":

                System.out.println(gerador.verificaETrocaLetra('p'));

                break;
                case "q":

                System.out.println(gerador.verificaETrocaLetra('q'));

                break;
                case "r":

                System.out.println(gerador.verificaETrocaLetra('r'));

                break;
                case "s":

                System.out.println(gerador.verificaETrocaLetra('s'));

                break;
                case "t":

                System.out.println(gerador.verificaETrocaLetra('t'));

                break;
                case "u":

                System.out.println(gerador.verificaETrocaLetra('u'));

                break;
                case "v":

                System.out.println(gerador.verificaETrocaLetra('v'));

                break;
                case "w":

                System.out.println(gerador.verificaETrocaLetra('w'));

                break;
                case "x":

                System.out.println(gerador.verificaETrocaLetra('x'));

                break;
                case "y":

                System.out.println(gerador.verificaETrocaLetra('y'));

                break;
                case "z":

                System.out.println(gerador.verificaETrocaLetra('z'));

                break;
            }
        } while (!entradaLetras.equals(respostas) && tentativas <= 5); //Controla o loop

        if (tentativas < 6){
            JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ ACERTOU !!!");  //Mensagem de derrota
        } else {
            JOptionPane.showMessageDialog(null, "PERDEU! FIM DO JOGO\nRESPOSTA: " +respostas ); //Mensagem de vitória
        }
    }
}

