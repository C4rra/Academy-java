import java.util.Scanner;


public class Login {

    public static void main(String[] args) {
        Scanner scannerS= new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        int profilo=0;
        int count=0;
        int operazione=1;
        System.out.println("Premere 1 per registrarsi, Premere 2 per effettuare il login");
        int scelta=scannerN.nextInt();
        if(scelta==1){

            System.out.println("Scegli il nome utente");
            String userName=scannerS.nextLine();
            System.out.println("Scegli la tua password");
            String password=scannerS.nextLine();
            System.out.println("Il tuo nome utente è "+ userName );
        

            profilo=1;

        }else if(scelta==2){
            System.out.println("Inserisci il tuo nome utente");
            String userName=scannerS.nextLine();
            System.out.println("Inserisci la tua password");
            String password=scannerS.nextLine();
            if(userName.contentEquals("Tommaso") && password.contentEquals("1234")){
                profilo=1;
                System.out.println("Bentornato"+ userName );

            
            }else{

                while(profilo!=1){
                System.out.println("Username o password errati");
                System.out.println("Inserisci il tuo nome utente");
                userName=scannerS.nextLine();
                System.out.println("Inserisci la tua password");
                password=scannerS.nextLine();
                if(userName.contentEquals("Tommaso") && password.contentEquals("1234")){
                    profilo=1;
                    System.out.println("Bentornato"+ userName );
                }
            }
                
               
                

            }



        }


        
        if(profilo==1){
            do{
                    System.out.println("Ora hai accesso ad una funzione per calcolare il quadrato di un numero");
                    System.out.println("Inserisci un numero intero a tua scelta");
                    int numero=scannerN.nextInt();
                    int risultato=numero*numero;
                    System.out.println("Il risultato dell'operazione che hai richiesto è: " + risultato);
                    System.out.println("Premi 1 per ripetere l'operazione o premi 2 per uscire");
                    int scelta2=scannerN.nextInt();
                    if(scelta2==1){
                        operazione=5;
                    }else{
                        operazione=0;
                    }








                }while(operazione !=0);
                System.out.println("Arrivederci");

           
        }
        scannerN.close();
        scannerS.close();
    }
}
