/**
 * Cadastro de alunos e notas.
 *
 * @author Julio
 * @version 13/05/2020
 */
import javax.swing.JOptionPane;
public class CadAlunos {
    // Atributos
    // Declaracao da estrutura de dados para armazenar todos os dados
    String nomes[]; // array para os nomes dos alunos
    float notas[][]; // array para armazenar todas as notas

    // Instancia um elemento da classe Notas
    Notas nota = new Notas();

    /**
     * CadAlunos Constructor
     *
     * @param qtdeAlunos int quantidade de alunos
     */
    public CadAlunos(int qtdeAlunos) {
        nomes = new String[qtdeAlunos];
        notas = new float[qtdeAlunos][7];
        iniciarCadastro();
    }

    /**
     * Method iniciarCadastro
     * Inicia array de nomes com ""
     *
     */
    void iniciarCadastro(){
        for (int i = 0; i < nomes.length; i++){ 
            nomes[i] = "";
        }
    }

    /**
     * Method buscarPosicaoLivre
     * retorna o indice da posicao livre e -1 se nao achar.
     *
     * @return int - posicao livre ou -1 (nao achou)
     */
    int buscarPosicaoLivre(){
        int ret = -1;
        for (int i = 0; i < nomes.length; i++){ 
            if (nomes[i].equals("")){ // achou posicao livre
                ret = i;
                break;
            }
        }
        return ret;
    }

    /**
     * Inserir aluno no cadastro
     *
     */
    public boolean inserir(){
        boolean ret = false;
        int i;
        // buscar a prieira posicao livre
        i = buscarPosicaoLivre();

        if (i != -1){
            ret = true;
            // Nome do aluno
            nomes[i] = JOptionPane.showInputDialog("Forneca o nome do aluno");

            // entrada de dados p1 e a1
            notas[i][0] = nota.lerNota("P1 - " + nomes[i]);

            notas[i][1] = nota.lerNota("A1 - " + nomes[i]);

            // calculo do N1
            notas[i][2] = nota.calcularN(notas[i][0], notas[i][1]);

            //n1 = (p1 + 3*a1)/4;

            // entrada de dados p2 e a2
            // entrada de dados p1
            notas[i][3] = nota.lerNota("P2 - " + nomes[i]);

            notas[i][4] = nota.lerNota("A2 - " + nomes[i]);

            // calculo do N2
            notas[i][5] = nota.calcularN(notas[i][3], notas[i][4]);

            //n2 = (p2 + 3*a2)/4;

            // calculo da media final
            notas[i][6] = nota.calcularNF(notas[i][2], notas[i][5]);  

        }
        return ret;
    }

    /**
     * Method listar
     * Mostra todos os alunos e suas respectivas notas
     *
     */
    void listar(){
        nota.imprimirCab(); // imprime o cabecalho do relatorio
        for (int i = 0; i < nomes.length; i++){ 
            if (!nomes[i].equals("")){ // achou um aluno e imprime os dados
                nota.imprimirNotas(nomes[i], notas[i][0], notas[i][1], notas[i][2], notas[i][3], 
                    notas[i][4], notas[i][5], notas[i][6]);
            }
        }
        nota.imprimirRod(); // imprime o rodape do relatorio
    }

    /**
     * Method buscarAluno
     * retorna o indice do aluno encontrado e -1 se nao achar.
     *
     * @return int - indice do aluno encomtrado ou -1 (nao achou)
     */
    int buscarAluno(String nome){
        int ret = -1;
        for (int i = 0; i < nomes.length; i++){ 
            if (nomes[i].equals(nome)){ // achou posicao livre
                ret = i;
                break;
            }
        }
        return ret;
    }

    /**
     * Method remover
     * Remove aluno do cadastro
     *
     * @param nomeR Strin - nome do aluno a ser removido
     * @return boolean - true se conseguir e false se nao conseguir
     */
    public boolean remover(String nomeR){
        boolean ret = false;
        // buscar o aluno a ser removido
        int ind = buscarAluno(nomeR);

        if(ind != -1) {
            // limpa o nome do alno da posicao
            nomes[ind] = "";
            ret = true;
        }

        return ret;
    }

    public boolean editarAluno (){
        boolean ret = false;
        int i;
        // buscar a prieira posicao livre
        i = buscarPosicaoLivre();

        if (i != -1){
            ret = true;
            // entrada de dados p1 e a1
            notas[i][0] = nota.lerNota("P1 - " + nomes[i]);

            notas[i][1] = nota.lerNota("A1 - " + nomes[i]);

            // calculo do N1
            notas[i][2] = nota.calcularN(notas[i][0], notas[i][1]);

            //n1 = (p1 + 3*a1)/4;

            // entrada de dados p2 e a2
            // entrada de dados p1
            notas[i][3] = nota.lerNota("P2 - " + nomes[i]);

            notas[i][4] = nota.lerNota("A2 - " + nomes[i]);

            // calculo do N2
            notas[i][5] = nota.calcularN(notas[i][3], notas[i][4]);

            //n2 = (p2 + 3*a2)/4;

            // calculo da media final
            notas[i][6] = nota.calcularNF(notas[i][2], notas[i][5]);  

        }
        return ret;
    }
}
