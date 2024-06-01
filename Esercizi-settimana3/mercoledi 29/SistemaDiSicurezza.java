import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDiSicurezza{

    ArrayList<DispositivoDiSicurezza> listaDiDispositivi;


    public SistemaDiSicurezza(ArrayList<DispositivoDiSicurezza> listaDiDispositivi) {
        this.listaDiDispositivi = listaDiDispositivi;
    }

    void aggiungiDispositivo(DispositivoDiSicurezza dispositivo){
        listaDiDispositivi.add(dispositivo);

    }

    void statoDispositivi(){
        for (DispositivoDiSicurezza dispositivo : listaDiDispositivi) {
            dispositivo.stato();
            
        }
    }



    public static void main(String[] args) {
        Scanner scannerN=new Scanner(System.in);
       
        ArrayList<DispositivoDiSicurezza> listaDiDispositivi= new ArrayList<>();

        Estintore estintore= new Estintore(false);
        AllarmeAntincendio allarme= new AllarmeAntincendio(false);
        SistemaDiVentilazione sistemaVentilazione = new SistemaDiVentilazione(false);
        KitProntoSoccorso kit= new KitProntoSoccorso(true);
    
        SistemaDiSicurezza sistema=new SistemaDiSicurezza(listaDiDispositivi);

        sistema.aggiungiDispositivo(estintore);
        sistema.aggiungiDispositivo(allarme);
        sistema.aggiungiDispositivo(sistemaVentilazione);
        sistema.aggiungiDispositivo(kit);
        System.out.println("Check dispositivi sicurezza");
        sistema.statoDispositivi();
        System.out.println("Quale sistema vuoi accendere?");
        boolean menu=true;
        while(menu){  
            System.out.println("Premi 1 per l'estintore,Premi 2 per l'allarme antincendio, Premi 3 per il sistema di ventilazione,4 per uscire");
            int scelta=scannerN.nextInt();

            switch(scelta){
                case 1:
                
                estintore.acceso();
                
                
                break;
                case 2:
                allarme.acceso();
                allarme.chiamaVigiliDelFuoco();
                
                
                break;
                case 3:
                sistemaVentilazione.acceso();
                break;
                case 4:
                System.out.println("Arrivederci");
                menu=false;
                break;
                default:
                System.out.println("scelta non valida");

            }

        
        
    }
}

}

 interface DispositivoDiSicurezza {
    public void acceso();
    public void spento();
    public void stato();

    
}







 class Estintore implements DispositivoDiSicurezza {
    boolean interruttore;

    public Estintore(boolean interruttore) {
        this.interruttore = false;
    }


    public void acceso(){
        interruttore=true;
        System.out.println("L'estintore è acceso");
    }
    public void spento(){
        interruttore=false;
        System.out.println("L'estintore è spento");
    }
    public void stato(){
        
        double funzionamento=(Math.random()*100+1);
        if(funzionamento<=50){
        System.out.println("L'estintore funziona");
            
        }else{
            System.out.println("L'estintore è guasto");
        }
        

    }
    

    
}
class AllarmeAntincendio implements DispositivoDiSicurezza {
    boolean interruttore;



    public AllarmeAntincendio(boolean interruttore) {
        this.interruttore = false;
    }
    public void acceso(){
        interruttore=true;
        System.out.println("L'allarme antincendio è acceso");
    }
    public void spento(){
        interruttore=false;
        System.out.println("L'allarme antincendio è spento");
    }
    public void stato(){
        double funzionamento=(Math.random()*100+1);
        if(funzionamento<=50){
        System.out.println("L' allarme antincendio funziona");
        }else{
            System.out.println("L'allarme antincendio è guasto");
        }
        

    }

    public void  chiamaVigiliDelFuoco(){
        
            System.out.println("Chiamata ai vigili del fuoco inoltrata");
        }
    


    
}
class SistemaDiVentilazione implements DispositivoDiSicurezza {
    boolean interruttore;
    public SistemaDiVentilazione(boolean interruttore) {
        this.interruttore = false;
    }
    public void acceso(){
        interruttore=true;
        System.out.println("Il sistema di ventilazione è acceso");
    }
    
    public void spento(){
        interruttore=false;
        System.out.println("Il sistema di ventilazione è spento");
    }
    public void stato(){
        double funzionamento=(Math.random()*100+1);
        if(funzionamento<=50){
        System.out.println("Il sistema di ventilazione funziona");
        }else{
            System.out.println("Il sistema di ventilazione è guasto");
        }
        

    }

    
}
class KitProntoSoccorso implements DispositivoDiSicurezza {
    boolean interruttore;
    public KitProntoSoccorso(boolean interruttore) {
        this.interruttore = true;
    }
    public void acceso(){
        interruttore=true;
        System.out.println("Il kit è presente");
    }
    public void spento(){
        interruttore=false;
        System.out.println("Il kit non è presente");
    }
    public void stato(){
        double funzionamento=(Math.random()*100+1);
        if(funzionamento<=50){
        System.out.println("Il kit è utilizzabile");
        }else{
            System.out.println("Nel kit ci sono farmaci scaduti");
        }
        

    }

    
}


