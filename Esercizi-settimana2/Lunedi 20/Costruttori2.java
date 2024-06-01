public class Costruttori2 {
    int modelYear;
  String modelName;
  public Costruttori2 (int year, String name) {
     modelYear = year;
     modelName = name;}

  public static void main(String[] args) {
    Costruttori2 myCar = new Costruttori2 (1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
 }
    
}
