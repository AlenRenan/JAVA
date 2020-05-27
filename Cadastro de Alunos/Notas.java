/**
 * Manipula notas
 *
 * @author Julio
 * @version 06/05/2020
 */
import javax.swing.JOptionPane;
public class Notas {
    /**
     * Ler nota pelo teclado
     *
     * @param s texto 
     * @return float nota lida pelo teclado
     */
    float lerNota(String s){
        float nota;
        do {
            nota = Float.parseFloat(JOptionPane.showInputDialog("Forneca " + s));

            if (nota < 0 || nota > 10) { // valida a nota
                JOptionPane.showMessageDialog(null, "Nota (" + s + ") invalida. Forneca novamente");
            }
        } while (nota < 0 || nota > 10); // enquanto for invalida solicita novamente
        return nota;
    }

    /**
     * Calcular notas N1 e N2
     *
     * @param p float nota da prova
     * @param a float nota da atividade
     * @return float avalicao resultante
     */
    float calcularN(float p, float a){
        float n = 0;
        n = (p + 3*a)/4;
        return n;
    }

    /**
     * Calcula media final
     *
     * @param n1 float nota n1
     * @param n2 float nota n2
     * @return float media final
     */
    float calcularNF(float n1, float n2){
        float nf = 0;
        nf = (n1 + n2)/2;
        return nf;
    }

    /**
     * Mostrar as notas
     *
     * @param p1 float nota p1
     * @param a1 float nota a1
     * @param p2 float nota p2
     * @param a2 float nota p2
     * @return String todas as notas
     */
    public String retornarNotas(float p1, float a1, float n1, float p2, float a2, float n2, float nf){
        //float n1 = calcularN(p1, a1);  // Calculo do N1
        //float n2 = calcularN(p2, a2);  // Calculo do N2
        //float nf = calcularNF(n1, n2); // Calculo da NF
        return String.format("%6.1f %6.1f %6.1f %6.1f %6.1f %6.1f %6.1f", p1, a1, n1, p2, a2, n2, nf);
    }

    /**
     * Method imprimirCab
     *  Imprime o cabecalho do relatorio
     */
    void imprimirCab(){
        System.out.printf("\n=============================================================================");
        System.out.printf("\n%28s ", "Nome do Aluno");
        System.out.printf("%6s %6s %6s %6s %6s %6s %6s", "P1", "A1", "N1", "P2", "A2", "N2", "NF");
        System.out.printf("\n=============================================================================");

    }

    /**
     * Method imprimirRod
     *  Imprime o rodape do relatorio
     */
    void imprimirRod(){
        System.out.printf("\n=============================================================================");
    }

    /**
     * Mostra nome e notas
     *
     * @param p1 float nota p1
     * @param a1 float nota a1
     * @param p2 float nota p2
     * @param a2 float nota p2
     * @return String todas as notas
     */
    void imprimirNotas(String nome, float p1, float a1, float n1, float p2, float a2, float n2, float nf){
        //        imprimirCab();
        System.out.printf("\n%28s ", nome);
        System.out.print(retornarNotas(p1, a1, n1, p2, a2, n2, nf));
        //        imprimirRod();
    }
}
