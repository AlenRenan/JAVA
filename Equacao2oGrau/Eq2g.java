
/**
 * Write a description of class Eq2g here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eq2g {
    // atributos
    double a, b, c;
    
    // Construtor
    Eq2g(double aa, double bb, double cc){
        a = aa;
        b = bb;
        c = cc;
    }
    
    double calcularDelta(){
        double delta = b*b - 4 * a * c;
        return delta;
    }

    double calcularRaiz1(){
        double x1 = (-b + Math.sqrt(calcularDelta()))/(2*a);
        return x1;
    }
    
    double calcularRaiz2(){
        double x2 = (-b - Math.sqrt(calcularDelta()))/(2*a);
        return x2;
    }
}
