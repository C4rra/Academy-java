import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scannerN= new Scanner(System.in);

        System.out.println("inserisci 1 o 2 o 3 ");
         int scelta=scannerN.nextInt();
         




        switch (scelta) {
            case 1:
                System.out.println("bella scelta");
                break;

            case 2:
                 System.out.println("brutta scelta");
                break;


            case 3:
                System.out.println("nella media");
                break;

        
            default:
            System.out.println("scelta sbagliata");
                break;
        }
    }
    
    
}
