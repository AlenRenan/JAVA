import javax.swing.JOptionPane;
/**
 * Write a description of class Matrizes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matrizes {
    public static void main(String args[]) {
        int opcao; 
        // Define a Matriz
        int matA[][] = new int [2][2];
        int matB[][] = new int [2][2];
        int matC[][] = new int [2][2];
        int matD[][] = new int [2][2];
        do {
            // Cria um menu de opções ao usuário
            String escolha;
            escolha = "(0) Preencher Matrizes";
            escolha = escolha + "\n(1) Somar Matrizes";
            escolha = escolha + "\n(2) Subtrair Matrizes";
            escolha = escolha + "\n(3) Adicionar Constante";
            escolha = escolha + "\n(4) Mostrar Matrizes";
            escolha = escolha + "\n(5) Multiplicar Matrizes";
            escolha = escolha + "\n(6) Sair";
            escolha = escolha + "\n\nForneca a Opção";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(escolha));
            switch(opcao){
                case 0:
                // Preencher a Matriz A
                for(int linha = 0; linha < 2; linha++){
                    for (int coluna = 0; coluna < 2; coluna++){
                        // preencher via teclado cada elemento da matriz
                        matA[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Valor do elemento matA[" + linha + "][" + coluna + "]" ));
                    }
                }
                // Preencher a Matriz B
                for(int linha = 0; linha < 2; linha++){
                    for (int coluna = 0; coluna < 2; coluna++){
                        // preencher via teclado cada elemento da matriz
                        matB[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Valor do elemento matB[" + linha + "][" + coluna + "]" ));
                    }
                }
                break;
                case 1:
                //Soma as matrizes
                System.out.println ("Matriz A - Matriz B");
                for(int linha= 0; linha < 2; linha++){
                    for (int coluna = 0; coluna < 2; coluna++){
                        // preencher via teclado cada elemento da matriz
                        matC[linha][coluna] = matA[linha][coluna] + matB[linha][coluna];
                        System.out.print(matC[linha][coluna]+" ");
                    }
                    System.out.println();
                }
                break;
                case 2:
                //Subtrai as matrizes
                System.out.println("Matriz A - Matriz B");
                for(int linha= 0; linha < 2; linha++){
                    for (int coluna = 0; coluna < 2; coluna++){
                        // preencher via teclado cada elemento da matriz
                        matC[linha][coluna] = matA[linha][coluna] - matB[linha][coluna];
                        System.out.print(matC[linha][coluna]+ " ");
                    }
                    System.out.println();
                }
                break;
                case 3:
                System.out.println("Você escolheu a opção 3  !!!");
                break;
                case 4:
                // imprimir a matriz A
                System.out.println("Matriz A");
                for(int linha = 0; linha < 2; linha++){
                    for (int coluna = 0; coluna < 2; coluna++){
                        System.out.print(matA[linha][coluna] + " ");
                    }
                    System.out.println();
                }

                // imprimir a matriz B
                System.out.println("\nMatriz B");
                for(int linha = 0; linha < 2; linha++){
                    for (int coluna = 0; coluna < 2; coluna++){
                        System.out.print(matB[linha][coluna] +" ");
                    }
                    System.out.println();
                }
                case 5:
                //Mutiplica as Matrizes
                System.out.println ("Matriz A x Matriz B");
                for(int linha= 0; linha < 2; linha++){
                    for (int coluna = 0; coluna < 2; coluna++){
                        // preencher via teclado cada elemento da matriz
                        matD[linha][coluna] = matA[linha][coluna] * matB[linha][coluna];
                        System.out.print(matD[linha][coluna]+" ");
                    }
                    System.out.println();
                }
                break;
                case 6:
                System.out.println("\nSaindo do programa !!!");
                break;
                default:
                System.out.println("Opcão invalida!!");
            }
        }while(opcao != 6);
    }
}
