/**
 * Write a description of class Aplicacao here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;
public class Aplicacao {
    public static void main(String args[]) {
        int opcao = 0;
        // Leitura da qtde de alunos pelo teclado
        int qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Forneca quantidade de alunos"));
        // instanciando um elemento da classe (criando)
        CadAlunos cad = new CadAlunos(qtdeAlunos);
        // menu
        String s = "";
        do {
            s = "";
            s = s + "\n1. Inserir";
            s = s + "\n2. Remover";
            s = s + "\n3. Listar";
            s = s + "\n4. Editar";
            s = s + "\n5. Sair";
            s = s + "\n\nForneca a opcao";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(s));

            switch(opcao){
                case 1: // Inserir
                if(cad.inserir()) {
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cadastro cheio!!");
                }

                break;
                case 2: // Remover
                // solicita o nome do aluno a ser removido
                String nomeRemov = JOptionPane.showInputDialog("Forneça o nome do aluno a ser removido");
                // remover
                if(cad.remover(nomeRemov)) {
                    JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Aluno nao encontrador!!");
                }
                break;
                case 3: // Lista
                cad.listar();
                break;
                case 4: // Editar
                String editar = JOptionPane.showInputDialog ("Forneça o nome do aluno a ser editado");
                
                break;
                case 5: // Sair
                break;
                default: // opcao invalida
                JOptionPane.showMessageDialog(null, "Opçao Invalida!! Forneça novamente");
                s = "";
                break;

            }

        } while (opcao != 5);
    }
}
