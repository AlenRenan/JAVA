import javax.swing.JOptionPane;
public class Programa {
    public static void main (String args []){
        // Entrada de dados da pessoa (nome, idade, peso e altura)
        String nome = JOptionPane.showInputDialog ("Qual o seu nome ? ");
        int idade = Integer.parseInt (JOptionPane.showInputDialog ("Qual a sua idade ? "));
        double altura = Double.parseDouble (JOptionPane.showInputDialog ("Qual a sua altura ? "));
        double peso = Double.parseDouble (JOptionPane.showInputDialog ("Qual o seu peso ? "));
        //Instanciar um objeto da classe Pessoa
        Pessoa p = new Pessoa ("" + nome, idade, peso, altura);
        //Instanciar um objeto de Imc (criar objeto)
        Imc indice = new Imc(p.getPeso(), p.getAltura());
        System.out.println("Olá " + nome);
        System.out.println("Seu imc é " + indice);
        System.out.println("Você está " +indice.verificarImc());
    }
}