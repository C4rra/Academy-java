public class Costruttori {
    int x; 
  public Costruttori () {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    Costruttori myObj = new Costruttori (); //  call the constructor
    System.out.println("\s\s"+myObj.x); // Print the value of x
 }
    
}
