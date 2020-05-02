import javax.swing.JOptionPane;
/**
 * Write a description of class SimNaoVerificador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimNaoVerificador {
    public static void main(String args[]){
        String opcao = JOptionPane.showInputDialog("Continua??");
        
        boolean caso1 = (opcao.equals("s") || opcao.equals("ok"));
        boolean caso2 = (opcao.equals("n") || opcao.equals("nok"));
        
        if (caso1) {
            System.out.println("\nContnua!!");
        } else if(caso2){
            System.out.println("\nNao contnua!!");
        } else{
            System.out.println("\nEntrada invalida");
        }
    }
}
