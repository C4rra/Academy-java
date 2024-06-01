import java.util.Scanner;


class ContoBancario{
     private String numeroConto;
     private double saldo;
     private String titolare;
    private ContoBancario(String numeroConto, double saldo, String titolare) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
        this.titolare = titolare;
    }
    public String getNumeroConto() {
        return numeroConto;
    }
    public void setNumeroConto(String numeroConto) {
        this.numeroConto = numeroConto;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitolare() {
        return titolare;
    }
    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }
    
    static double  deposita(double importo, ContoBancario conto1 ){
        double deposito= importo + conto1.getSaldo();
      
        

        return deposito;
    }


      
    static double preleva(double importo, ContoBancario conto1 ){
        double prelievo = conto1.getSaldo()- importo;
      
        

        return prelievo;
    }


    public static void main(String[] args) {
        Scanner scannerN=new Scanner(System.in);
        ContoBancario conto= new ContoBancario("25", 50, "tom");
         System.out.println("quanto vuoi depositare?");
         double importo= scannerN.nextDouble();
         double deposito=deposita(importo, conto);
           conto.setSaldo(deposito);

           System.out.println("quanto vuoi prendere?");
           double importo2= scannerN.nextDouble();
           double prelevo=preleva(importo2, conto);
           conto.setSaldo(prelevo);

           System.out.println("saldo="+ conto.getSaldo());

         

    }

}