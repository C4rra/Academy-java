public class Metodi {

    static void myMethod() {
        // code to be executed   
        System.out.println("Sono un metodo statico");   
    }
    int x=5;
    public static void main(String[] args) {

        Metodi myObj = new Metodi();
        System.out.println("l'oggetto è " +myObj.x);
        
        myMethod();
    }
    
}
