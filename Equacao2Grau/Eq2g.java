public class Eq2g {
    double a,b,c;

    //Construtor
    Eq2g(double aa, double bb, double cc){ //o this.a indica que está se referendo ao double de cima e comprar com o double do Eq2g
        this.a = aa;
        this.b = bb;
        this.c = cc;
        
    }
    
    double calcularDelta (){
        double delta = b*b - 4 * a * c ;
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
