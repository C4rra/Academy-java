import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int lezione=0;
        Scanner scannerS= new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");

        String userName=scannerS.nextLine();
        System.out.println("Inserisci la tua eta");

        int eta=scannerN.nextInt();


        System.out.println("Inserisci la tua sezione, utilizzando la lettera maiuscola ");

        String sezione=scannerS.nextLine();

        if(userName.equalsIgnoreCase("Mirko")&& eta==28 && sezione.equalsIgnoreCase("3A")){
            lezione=1;
        }else if(userName.equalsIgnoreCase("Tommaso")&& eta==28 && sezione.equalsIgnoreCase("5C")){
            lezione=2;
        }else if(userName.equalsIgnoreCase("Marco")&& eta==33 && sezione.equalsIgnoreCase("2B")){
            lezione=3;}
        else if(userName.equalsIgnoreCase("Tommaso")&& eta==28 && sezione.equalsIgnoreCase("5A")){
                lezione=4;}
                else{lezione=0;}


        








        
    switch(lezione){
        case 1:
        System.out.println("Bentornato, "+ userName + "di anni "+eta + " della sezione "+ sezione);
        System.out.println("Hai una lezione di chimica oggi");
        
        break;
        case 2:
        System.out.println("Bentornato, "+ userName + "di anni "+eta + " della sezione "+ sezione);
        System.out.println("Hai una lezione di cucina oggi");
        break;
        case 3:
        System.out.println("Bentornato, "+ userName + "di anni "+eta + " della sezione "+ sezione);
        System.out.println("Hai una lezione di padel oggi");
        break;
        case 4:
        System.out.println("Bentornato, "+ userName + "di anni "+eta + " della sezione "+ sezione);
        System.out.println("Hai una lezione di fisica oggi");
        break;
        default:
        System.out.println("Bentornato, "+ userName + "di anni "+eta + " della sezione "+ sezione);
        System.out.println("Mi dispiace,non hai lezione oggi");
    }




    scannerS.close();
    scannerN.close();


    }
    
}
