import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scannerS= new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");

        String userName=scannerS.nextLine();
        System.out.println("Il tuo nome è:"+ userName);
        int punti=0;
        if(punti==0){
            System.out.println("Quanto fa 2+2?");
            int risposta=scannerN.nextInt();
            if(risposta==4){
                punti=punti+5;


            }else{
                punti=0;
                
            }
  
        if(punti<6){
            System.out.println("Quanto fa 3*3");
            int risposta2=scannerN.nextInt();
            if(risposta2==9){
                punti=punti+5;
            }else{
                punti=punti-5;
                if(punti<0){
                    punti=0;
                }

                
            }
        }
            

        if(punti<11){
            System.out.println("Quanto fa 10:5");
            int risposta3=scannerN.nextInt();
            if(risposta3==2){
                punti=punti+5;
            }else{
                punti=punti-5;
                if(punti<0){
                    punti=0;
                }
                
            }




        }


        System.out.println( userName + " il tuo punteggio finale è: " + punti + " punti");
        


        scannerN.close();
        scannerS.close();



    }













    }
    
}
