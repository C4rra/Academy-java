import java.util.Scanner;

public class Esarray {
    public static void main(String[] args) {
        double valore=0;
        Scanner scannerS= new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);

        System.out.println("Inserisci numero di mesi");

        int mesi=scannerN.nextInt();
        System.out.println("Inserisci il valore delle tasse");

        int tasse=scannerN.nextInt();

        for(int i=0;i<mesi;i++){
            
            System.out.println("Inserisci il tuo stipendio");
            int stipendio=scannerN.nextInt();

            valore=valore + stipendio;





        }
        double media;
        double mediaTassata;
        
         media=valore/mesi;
         System.out.println("Media dello stipendio:"+ media);
         mediaTassata=valore/mesi - (valore*tasse/100)/mesi;

         System.out.println("Media dello stipendio tassata:"+ mediaTassata);
         

        
    }
    
}
