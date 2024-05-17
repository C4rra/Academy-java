public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Ciao Mondo");
        System.out.print("Ciao Mondo ");  // print scrive tutto sulla stessa linea (prossima cosa che stamperai dopo quella che hai stampato sarà sulla linea)
        System.out.println("bello ");     // println la prossima cosa che stamperai dopo quella che hai stampato sarà a capo
        System.out.println(3+3);

        String testo="prova";               //concatenazione stringhe
        System.out.println(testo);
        testo="Mondo"; 
        System.out.println("Ciao"+ testo);

        String firstPart="Ciao";                
        String lastPart="Mondo";
        String fullPart= firstPart+lastPart ;
        System.out.println(fullPart);

        int x=5;                                //somma di numeri
        int y=6;
        System.out.println(x+y);


        int a=5, b=6, z=50;
        System.out.println(a+b+z);

        int u,v,n;
        u=v=n=50;
        System.out.println(u+v+n);



        int var1=10;
        int var2=9;
        System.out.println(var1>var2);



    }

}