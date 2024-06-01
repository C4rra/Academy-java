import java.util.Scanner;

import java.util.ArrayList;




public class LoginMetodi {
    static void login() {
        Scanner scannerS= new Scanner(System.in);

        String nome =scannerS.nextLine();
        
        String password=scannerS.nextLine();
        

        


        
    }
    static ArrayList<String> utente(String nome,String password) {
        ArrayList<String> user = new ArrayList<String>();
        user.add(nome);
        user.add(password);
        return user;




        
    } 
    static void stampa( ArrayList<String> user) {

        System.out.println(user);



        
    }
    static void modifica(ArrayList<String> user) {
        Scanner scannerS= new Scanner(System.in);
        int scelta=0;
        
        System.out.println("Premi 1 per modificare il nome, premi 2 per modificare la password");

        
        
        if(scelta==1){
            String newnome=scannerS.nextLine();
            user.remove(0);
            user.set(0,newnome);



        }else if(scelta==2){
            String newpassword=scannerS.nextLine();
            user.remove(1);
            user.set(0,newpassword);





        }

    }




        
    
    public static void main(String[] args) {
        ArrayList<String> us = new ArrayList<String>();
        String name, pass;
        //login();
        utente(name, pass);
        stampa(us);
        modifica(us);




    }
    
}


