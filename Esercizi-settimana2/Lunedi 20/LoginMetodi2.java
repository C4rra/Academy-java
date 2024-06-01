import java.util.Scanner;

import java.util.ArrayList;




    public class LoginMetodi2 {
        static ArrayList<String> utente(String nome,String password) {
            ArrayList<String> user = new ArrayList<String>();
            user.add(nome);
            user.add(password);
            return user;
        }


        static void stampa( ArrayList<String> user) {
            System.out.println("Le tue credenziali sono: " + user);
            
    
    
    
            
        }

        static void modifica(ArrayList<String> user) {
            Scanner scannerS= new Scanner(System.in);
            Scanner scannerN= new Scanner(System.in);
            int scelta=0;
            
            System.out.println("Premi 1 per modificare il nome, premi 2 per modificare la password,o premi altro per uscire");
             
            
            scelta=scannerN.nextInt();
    
            
            
            if(scelta==1){
                System.out.println("Inserire nuovo nome");
                String newnome=scannerS.nextLine();
                user.set(0,newnome);
    
    
    
            }else if(scelta==2){
                System.out.println("Inserire nuova password");
                String newpassword=scannerS.nextLine();
                user.set(1,newpassword);
    
    
    
    
    
            }else{
                System.out.println("Arrivederci");
            }



    
    }
    public static void main(String[] args) {
        ArrayList<String> us = new ArrayList<String>();
        Scanner scannerS= new Scanner(System.in);
        System.out.println("inserire nome utente");

        String name =scannerS.nextLine();
        System.out.println("inserire  password");
        
        String pass=scannerS.nextLine();

        while(!(name.equals("tommaso")) || !(pass.equals("1234")) || name.isEmpty() || pass.isEmpty())
        {
            System.out.println("Nome utente o password errati");
            System.out.println("inserire nome utente");

            name =scannerS.nextLine();
            System.out.println("inserire  password");
        
            pass=scannerS.nextLine();
            






        }
        
        us=utente(name, pass);
        stampa(us);
        modifica(us);
            System.out.println("i tuoi nuovi dati:"+ us);
        

        










    }

}
    


