import javax.swing.JOptionPane;
/**
 * Write a description of class Matrizes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matrizes {
    public void realizarOperacoes() {
        int opcao; 

        int tamMatriz = Integer.parseInt(JOptionPane.showInputDialog("Forneca a dimensao das matrizes"));

        // definicao de matrizes
        int matA[][] = new int [tamMatriz][tamMatriz];
        int matB[][] = new int [tamMatriz][tamMatriz];
        int matC[][] = new int [tamMatriz][tamMatriz];

        do {
            // criar menu
            String s;
            s = "\n(0) preencher matrizes";
            s = s + "\n(1) somar matrizes";
            s = s + "\n(2) subtrair matrizes";
            s = s + "\n(3) adicionar constante";
            s = s + "\n(4) multiplicar matrizes";
            s = s + "\n(5) mostrar matrizes";
            s = s + "\n(6) sair";

            s = s + "\n\nForneca a opcao";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(s));

            switch(opcao){
                case 0: // Preencher matrizes
                // preencher a matriz A
                for(int i = 0; i < tamMatriz; i++){
                    for (int j = 0; j < tamMatriz; j++){
                        // preencher via teclado cada elemento da matriz
                        matA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor do elemento matA[" + i + "][" + j + "]" ));
                    }
                }

                // preencher a matriz B
                for(int i = 0; i < tamMatriz; i++){
                    for (int j = 0; j < tamMatriz; j++){
                        // preencher via teclado cada elemento da matriz
                        matB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor do elemento matB[" + i + "][" + j + "]" ));
                    }
                }

                break;
                case 1: // Somar matrizes e criar matriz C: C = A + B
                // preencher a matriz C com a soma de A com B
                for(int i = 0; i < tamMatriz; i++){
                    for (int j = 0; j < tamMatriz; j++){
                        // preencher matriz C
                        matC[i][j] = matA[i][j] + matB[i][j];
                    }
                }
                break;
                case 2: // Subtrair matrizes e criar matriz C: C = A - B
                // preencher a matriz C com a subtracao de A com B
                for(int i = 0; i < tamMatriz; i++){
                    for (int j = 0; j < tamMatriz; j++){
                        // preencher matriz C
                        matC[i][j] = matA[i][j] - matB[i][j];
                    }
                }
                break;
                case 3:
                System.out.println("opcao 3");
                break;
                case 4:// Multiplicar matrizes
                // for (int i = 0; i < matA.length; i++){
                // for (int j = 0; j < matB[0].length; j++) {
                // int somatoria = 0;
                // for (int k = 0; k < matA[0].length; k++) {
                // int produto = matA[i][k] * matB[k][j];
                // somatoria += produto;
                // }
                // matC[i][j] = somatoria ;
                // }
                // }
                for (int i = 0; i < tamMatriz; i++){
                    for (int j = 0; j < tamMatriz; j++) {
                        //int somatoria = 0;
                        matC[i][j] = 0;
                        for (int k = 0; k < tamMatriz; k++) {
                            int produto = matA[i][k] * matB[k][j];
                            //    somatoria += produto;
                            matC[i][j] += produto; 
                        }
                        //matC[i][j] = somatoria ;
                    }
                }
                break;               
                case 5:
                    // imprimir a matriz A
                    System.out.println("\nMatriz A");
                    imprimirMatriz(matA);
    
                    // imprimir a matriz B
                    System.out.println("\nMatriz B");
                    imprimirMatriz(matB);
                    
                    // imprimir a matriz C
                    System.out.println("\nMatriz C");
                   imprimirMatriz(matC);
                break;

                case 6:
                System.out.println("Sair");
                break;
                default:
                System.out.println("Opcao invalida!!");

            }

        }while(opcao != 6);

    }

    
    void imprimirMatriz(int mat[][]){
         for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
    }
}
