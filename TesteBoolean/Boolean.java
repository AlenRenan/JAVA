public class Boolean {
    public static void main (String args []){
        //Apenas variar as combinações entre true ou false 
        boolean p = true; 
        boolean q = true;
        boolean r = false;

        if ((p && q) || !r){
            System.out.println ("True");
        }else {
            System.out.println ("False");
        }
        if (!(p && (q || !r))){
            System.out.println ("True");
        }else {
            System.out.println ("False");
        }
    }
}