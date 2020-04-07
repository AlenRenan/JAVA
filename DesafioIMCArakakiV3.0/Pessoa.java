public class Pessoa {
    //Atribuição de uma pessoa
    String nome;
    int idade;
    double peso;
    double altura;
    //Construtor
    Pessoa (String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    //Pega os valores atribuidos e mostra quando é selecionado com o botão direito e aparece os valores que foram atribuidos
    String getNome (){
        return this.nome;
    }
    int getIdade (){
        return this.idade;
    }
    double getPeso(){
        return this.peso;
    }
    double getAltura(){
        return this.altura;
    }
}
