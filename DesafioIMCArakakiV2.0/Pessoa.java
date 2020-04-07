public class Pessoa {
    // Atributos para uma pessoa
    String nome;
    int idade;
    double peso, altura;
    
    // Construtor
    Pessoa(String nome, int idade, double peso, double altura){
        
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    
    }
    
    double getPeso(){
        return this.peso;
    }
    
    double getAltura(){
        return this.altura;
    }
    
    public String toString(){
        return ("\nNome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura) ;
    }
}
