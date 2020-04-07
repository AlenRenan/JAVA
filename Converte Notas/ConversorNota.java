/**
 * Escreva a descrição da classe ConversorNota aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ConversorNota {

    public double converterNota (String notaLetra) {
        //Cria a variavel notaNumero
        double notaNumero = 0;
        //Converte a notaLetra para notaNumerica
        switch(notaLetra){  //Funciona da mesma forma que o if"
            
            case "A": //Caso seja A
                notaNumero = 4.0;
                break; //Para a ação caso o case seja
            case "A+":
                notaNumero = 4.0;
                break;
            case "A-":
                notaNumero = 3.7;
                break;
            case "B":
                notaNumero = 3.0;
                break;
            case "B+":
                notaNumero = 3.3;
                break;
            case "B-":
                notaNumero = 2.7;
                break;
            case "C":
                notaNumero = 2.0;
                break;
            case "C+":
                notaNumero = 2.3;
                break;
            case "C-":
                notaNumero = 1.7;
                break;
            case "D":
                notaNumero = 1;
                break;
            case "D+":
                notaNumero = 1.3;
                break;
            case "D-":
                notaNumero = 0.7;
                break;
            case "E":
                notaNumero = 0.0;
                break; 
        }
        return notaNumero;
    }
}