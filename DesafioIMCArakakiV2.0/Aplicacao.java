/**
 * In this class
 *
 * @author Renan Alencar
 * @version 2.0.0
 */
public class Aplicacao
{
    public static void main(String args[]){

        // Entrada de dados da pessoa (nome, idade, peso e altura)
        
        // Instanciar um objeto da classe pessoa
        Pessoa p = new Pessoa("Carlos da Silva Neto", 25, 75, 1.78);
        System.out.println(p);

        // Intanciar um objeto de Imc (criar objeto)
        Imc indice = new Imc(p.getPeso(), p.getAltura()); // Chama construtor
        System.out.println(indice);

        System.out.println("Parecer: " + indice.verificarImc());
    }
}
