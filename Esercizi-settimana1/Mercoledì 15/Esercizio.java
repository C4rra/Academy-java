public class Esercizio {
    public static void main(String[] args) {
        int eta=50;
        if(eta<18){
            System.out.println("sei minorenne");
        }else if(eta>=18 && eta <25){
            System.out.println("sei maggiorenne ");

        }else if(eta>=25 && eta < 55){
            System.out.println("sei maggiorenne adulto ");

        
        }else{
            System.out.println("sei anziano");
        }

    }
}
