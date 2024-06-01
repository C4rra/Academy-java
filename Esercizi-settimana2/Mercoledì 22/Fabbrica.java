import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fabbrica {
    ArrayList<PannaCotta> listPannaCottas;
    public Fabbrica(){
        listPannaCottas= new ArrayList<PannaCotta>();
    }
    public static void main(String[] args) {
        Scanner scannerN = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        boolean menu=true;
        Fabbrica bauli = new Fabbrica();
        
        while(menu){
            System.out.println("Buongiorno,premi 1 per inserire una pannacotta,premi 2 per visualizzare le pannacotte disponibili,premi 3 per cercare una pannacotta, premi altro per uscire");
            int caso=scannerN.nextInt();
            
            
            
            switch(caso){
                case 1:
                        System.out.print("Inserisci il nome: ");
                        String nome = scannerS.nextLine();
                        System.out.print("Scegli il prezzo ");
                        double prezzo = scannerN.nextDouble();
                        ArrayList<String> ingredienti = new ArrayList<>();
                        PannaCotta pannacotta = new PannaCotta(nome, ingredienti, prezzo);
                        pannacotta.aggiungiIngrediente("Latte");
                        pannacotta.aggiungiIngrediente("Zucchero");
                        pannacotta.aggiungiIngrediente("Gelatina");
                        System.out.println(pannacotta.listaIngredienti.toString());
                        System.out.print("Quanti ingredienti vuoi aggiungere? ");
                        int numeroIngredienti = scannerN.nextInt();
    
                        for (int i = 0; i < numeroIngredienti; i++) {
                            System.out.print("Inserisci l'ingrediente " + (i + 1) + ": ");
                            String ingrediente = scannerS.nextLine();
                            pannacotta.aggiungiIngrediente(ingrediente);
                        }

                        System.out.println(pannacotta.listaIngredienti.toString());


                        System.out.print("Digita 1 se la vuoi con la frutta,Digita 2 se la vuoi con il cioccolato");
                        int scelta = scannerN.nextInt();
                        if (scelta == 1) {
                            System.out.print("Tipo di Frutta: ");
                            String tipoFrutta = scannerS.nextLine();

                            bauli.aggiungiPannaCotta(new PannaCottaFrutta(nome, prezzo,pannacotta.listaIngredienti, tipoFrutta));
                            
                        } else if (scelta == 2) {
                            System.out.print("Percentuale di Cioccolato: ");
                            double percentualeCioccolato = scannerN.nextDouble();
                            bauli.aggiungiPannaCotta(new PannaCottaCioccolato(nome,prezzo,pannacotta.listaIngredienti, percentualeCioccolato));
                        }

                        break;
                    case 2:


                            bauli.stampaPannaCotta();

                        break;


                    case 3:
                        
                        System.out.println("inserisci il nome da ricercare");
                        String ricerca=scannerS.nextLine();
                        bauli.ricercaPannaCotta(ricerca);



                        break;


                    default:
                        System.out.println("Arriverci");
                        menu=false;


                   





                    }

        }




        
    }
    
 void aggiungiPannaCotta(PannaCotta pannacotta){
    this.listPannaCottas.add(pannacotta);
 }
 

 

 void stampaPannaCotta(){
    for (PannaCotta pannacotta: listPannaCottas) {

        System.out.println("Nome: " + pannacotta.getNome() + ", Prezzo: " + pannacotta.getPrezzo() + " euro");
        ArrayList<String> ingredienti = pannacotta.getListaIngredienti();
        System.out.println("Ingredienti:");
        for (String ingrediente : ingredienti) {
            System.out.println("- " + ingrediente);
        }
        
    }
    
 }

 void ricercaPannaCotta(String ricerca){
    for (int i=0;i< listPannaCottas.size();i++) {
        if(listPannaCottas.get(i).getNome().equals(ricerca)){
            System.out.println("trovata");
            
        }else{
            System.out.println("non trovata");
        }

    }

 }





}

class PannaCotta{
    String nome;
    double prezzo;
    ArrayList<String> listaIngredienti;
    public PannaCotta(String nome, ArrayList<String> listaIngredienti, double prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
        this.listaIngredienti= new ArrayList<String>();
        
        




    }
    public void aggiungiIngrediente(String nuovoIngrediente){
        this.listaIngredienti.add(nuovoIngrediente);
        
    }

    public ArrayList<String> getListaIngredienti() {
        return listaIngredienti;}
    
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }

    public void setListaIngredienti(ArrayList<String> listaIngredienti) {
        this.listaIngredienti = listaIngredienti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    
    


 

}

class PannaCottaFrutta extends PannaCotta{
    String tipodiFrutta;
    public PannaCottaFrutta(String nome,double prezzo, ArrayList<String> listaIngredienti,String tipodiFrutta){
        super(nome,listaIngredienti,prezzo);
        this.tipodiFrutta=tipodiFrutta;
    }
    


    public void setTipodiFrutta(String nuovoFrutto){
        this.tipodiFrutta=nuovoFrutto;

    }
    public String getTipodiFrutta(){
        return tipodiFrutta;
    }



    }

class PannaCottaCioccolato extends PannaCotta{
    double percentualeCioccolato;
    public PannaCottaCioccolato(String nome,double prezzo, ArrayList<String> listaIngredienti,double percentualeCioccolato){
        super(nome, listaIngredienti, prezzo);
        this.percentualeCioccolato=percentualeCioccolato;
    }

    public void setPercentualeCioccolato(double percentualeCioccolato){
        this.percentualeCioccolato=percentualeCioccolato;
    }
    public double getPercentualeCioccolato(){
        return percentualeCioccolato;
    }

   
    

}

