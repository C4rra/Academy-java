import java.util.Scanner;
import java.util.ArrayList;



public class Esercizioarray {
    public static void main(String[] args) {
        Scanner scannerS= new Scanner(System.in);
        ArrayList<String> nomi = new ArrayList<String>();
    
        System.out.println("Inserisci 5 nomi");
        for(int i=0;i<5;i++){
            String arr=scannerS.nextLine();
            nomi.add(arr);
        
        }

        System.out.println("i nomi che hai inserito sono:"+ nomi);


        System.out.println("Che nome vuoi cercare?");

        String cerca=scannerS.nextLine();


        if(nomi.contains(cerca)){
            System.out.println("Il nome è presente");
            }else{ System.out.println("Il nome non è presente");
            
        }

        System.out.println("Che nome vuoi rimuovere?");


        String rimuovi=scannerS.nextLine();

        if(nomi.contains(rimuovi)){
            System.out.println("Il nome è presente");
            nomi.remove(rimuovi);
            System.out.println("Il nome è stato rimosso");

            System.out.println("i nuovi nomi sono:"+ nomi);

            }else{ System.out.println("Il nome non è presente");
                    System.out.println("i nomi presenti sono:"+ nomi);




    }
    scannerS.close();




        


           

    
        











    
}




}
