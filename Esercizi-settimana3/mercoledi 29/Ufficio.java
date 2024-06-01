public class Ufficio{


    public static void main(String[] args) {
        Amministrativo amm=new Amministrativo("tom", 2500);
        Tecnico tec=new Tecnico("mirko", 2000);
        Manager man=new Manager("susi",3150);
        System.out.println(amm.calcolaBonus());
        System.out.println(tec.calcolaBonus());
        System.out.println(man.calcolaBonus());


        
    }

}

abstract class Dipendente{
    String nome;
    double stipendio;
    abstract double calcolaBonus();
    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

}

 interface BonusCalcolabile {
    double calcolaBonus();

    
}
class Amministrativo extends Dipendente implements BonusCalcolabile{
    public Amministrativo(String nome,double stipendio){
        super(nome,stipendio);
    }

    @Override
    public double calcolaBonus() {
        double bonus=stipendio*0.1;
       
        return bonus;
    }



}
class Tecnico extends Dipendente implements BonusCalcolabile{
    public Tecnico(String nome,double stipendio){
        super(nome,stipendio);
    }

    @Override
    public double calcolaBonus() {
        double bonus=stipendio*0.15;
       
        return bonus;
        
    }
   


    
}
class Manager extends Dipendente implements BonusCalcolabile{
    public Manager(String nome,double stipendio){
        super(nome,stipendio);
    }
    @Override
    public double calcolaBonus() {
        double bonus=stipendio*0.2;
       
        return bonus;
        
    }
}