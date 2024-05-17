


public class Es2 {
    public static void main(String[] args) {
        int i=0;
        int somma=0;
        while(i<51){
            int modulo=i%2;
            if(modulo==0){
                System.out.println(i);
                somma=somma+i;
            }
            i++;
        

        }
        System.out.println(somma);
    }
    
}
