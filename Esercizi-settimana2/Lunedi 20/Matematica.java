import java.util.Scanner;


public class Matematica {
    public static void main(String[] args) {
        Scanner scannerS= new Scanner(System.in);
        Scanner scannerN = new Scanner(System.in);
        int count=0;
        int add=0;
        int sott=0;
        int molt=0;
        int div=0;

        System.out.println("Premere 1 eseguire delle operazioni, Premere 2 per uscire");
        int scelta=scannerN.nextInt();
        while(scelta==1){
            System.out.println("Premere 1 per l'addizione, Premere 2 per la moltiplicazione, Premere 3 per la divisione, Premere 4 per la sottrazione");
            int operazione=scannerN.nextInt();
            switch (operazione) {
                case 1: 
                    System.out.println("Inserisci il primo addendo");
                    float addendoa=scannerN.nextFloat();
                    System.out.println("Inserisci il secondo addendo");
                    float addendoa2=scannerN.nextFloat();
                    float risultato=addendoa+addendoa2;
                    System.out.println("Risultato: "+ risultato);
                    System.out.println("Risultato random: "+ risultato*Math.random());
                    count++;
                    add++;
                    System.out.println("Premi 1 per uscire , premi qualunque numero per ripetere un operazione");
                    float uscita=scannerN.nextInt();
                    if(uscita==1){
                        scelta=0;
                    }
                    break;

                case 2:
                    System.out.println("Inserisci il primo addendo");
                    float addendom=scannerN.nextFloat();
                    System.out.println("Inserisci il secondo addendo");
                    float addendom2=scannerN.nextFloat();
                    float risultato2=addendom*addendom2;
                    System.out.println("Risultato: "+ risultato2);
                    System.out.println("Risultato random: "+ risultato2*Math.random());
                    count++;
                    molt++;
                    System.out.println("Premi 1 per uscire , premi qualunque numero per ripetere un operazione");
                    float uscita2=scannerN.nextInt();
                    if(uscita2==1){
                        scelta=0;
                    }
                    
                    break;
                
                case 3:
                    System.out.println("Inserisci il primo addendo");
                    float addendod=scannerN.nextFloat();
                    System.out.println("Inserisci il secondo addendo");
                    float addendod2=scannerN.nextFloat();
                    float risultato3=addendod/addendod2;
                    System.out.println("Risultato: "+ risultato3);
                    System.out.println("Risultato random: "+ risultato3*Math.random());
                    count++;
                    div++;
                    System.out.println("Premi 1 per uscire , premi qualunque numero per ripetere un operazione");
                    float uscita3=scannerN.nextInt();
                    if(uscita3==1){
                        scelta=0;
                    }
                    break;

                case 4:
                    System.out.println("Inserisci il primo addendo");
                    float addendos=scannerN.nextFloat();
                    System.out.println("Inserisci il secondo addendo");
                    float addendos2=scannerN.nextFloat();
                    float risultato4=addendos-addendos2;
                    System.out.println("Risultato: "+ risultato4);
                    System.out.println("Risultato random: "+ risultato4*Math.random());
                    count++;
                    sott++;
                    System.out.println("Premi 1 per uscire , premi qualunque numero per ripetere un operazione");
                    float uscita4=scannerN.nextInt();
                    if(uscita4==1){
                        scelta=0;
                    }
                    
                    break;
                
            
                default:

                    System.out.println("Non hai scelto un operazione valida");
                    break;

            }
            }
            if(scelta==0){
            System.out.println("Hai effettuato " + count+" operazioni");
            System.out.println("Di cui "+ add + " addizioni");
            System.out.println("Di cui "+ molt + " moltiplicazioni");
            System.out.println("Di cui "+ div+ " divisioni");
            System.out.println("Di cui "+ sott + " sottrazioni");
            }else{
                System.out.println("Non hai effettuato operazioni");
                System.out.println("Arrivederci");

            }

            scannerN.close();
            scannerS.close();
            
            
            
            



        
    
        
        













    }
    
}
