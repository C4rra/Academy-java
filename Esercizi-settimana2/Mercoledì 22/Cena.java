import java.util.Scanner;



public class Cena {
    public static void main(String[] args) {
      Scanner scannerS= new Scanner(System.in);
      PiattoSpeciale piatto1= new PiattoSpeciale("pane");
      String ingrediente=scannerS.nextLine();
      piatto1.setIngrediente(ingrediente);
      int prezzo =piatto1.prezzoIniziale;
      int totale=prezzo+piatto1.getPrezzo(ingrediente);
      System.out.println(totale);
      

      

        
        
    }
    
   
}



 class PiattoSpeciale {
    
    String pane;
    int prezzoIniziale;
    private String ingr1;
    private int prezzoIgr1;
    public PiattoSpeciale(String pane){
        this.pane=pane;
        this.prezzoIniziale=1;
        




     }

     public String getIngrediente(){
        return ingr1;

     }
     public int getPrezzo(String ingr1){
        return prezzoIgr1=1;
     }

     public void setIngrediente(String ingr1){
      this.ingr1=ingr1;

     }

     



    


    
}

