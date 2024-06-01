public class Veicolo {
 private String marca;
 private String modello;
 private String anno;




public Veicolo(String marca, String modello, String anno) {
    this.marca = marca;
    this.modello = modello;
    this.anno = anno;
}


public static void main(String[] args) {
    Auto auto1= new Auto("ford", "focus", "2005", "3");
    Moto moto1= new Moto("Ducati", "Daitona", "2010", "serrato");
    System.out.println(auto1.toString());
    System.out.println(moto1.toString());
}


public String toString() {
    return "Veicolo [marca=" + marca + ", modello=" + modello + ", anno=" + anno + "]";
}




public String getMarca() {
    return marca;
}




public void setMarca(String marca) {
    this.marca = marca;
}




public String getModello() {
    return modello;
}




public void setModello(String modello) {
    this.modello = modello;
}




public String getAnno() {
    return anno;
}




public void setAnno(String anno) {
    this.anno = anno;
}





    
}
class Auto extends Veicolo{
    private String numeroPorte;
    public Auto(String marca,String modello,String anno,String numeroPorte){
        super(marca, modello, anno);
        this.numeroPorte=numeroPorte;

    }
    public String getNumeroPorte() {
        return numeroPorte;
    }
    public void setNumeroPorte(String numeroPorte) {
        this.numeroPorte = numeroPorte;
    }
    @Override
    public String toString() {
        return "Auto [Marca=" + getMarca() + ", Modello" + getModello() + ", Anno" + getAnno()
                + ", NumeroPorte" + getNumeroPorte() + "]";
    }
    
    



}
class Moto extends Veicolo{
    private String tipoManubrio;
    public Moto(String marca,String modello,String anno,String tipoManubrio){
        super(marca, modello, anno);
        this.tipoManubrio=tipoManubrio;

}
    public String getTipoManubrio() {
        return tipoManubrio;
    }
    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }
    @Override
    public String toString() {
        return "Moto [Marca=" + getMarca() + ", Modello=" + getModello() + ", Anno=" + getAnno()
                + ", Tipo Manubrio=" + getTipoManubrio() + "]";
    }
    
}