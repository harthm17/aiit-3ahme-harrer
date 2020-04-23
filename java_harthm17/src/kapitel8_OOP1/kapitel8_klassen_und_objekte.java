package kapitel8_OOP1;

/**
 *
 * @author Thomas Harrer
 */
class Musik {
    public String name;
    public String Interpret; 
    public int laengeInSek;
    public int erscheinungsjahr;  
}

public class kapitel8_klassen_und_objekte {
    public static void main(String[] args) {
        Musik lied = new Musik();
        
        lied.name = "In your Eyes";
        lied.Interpret = "Robin Schulz";
        lied.laengeInSek = 208;
        lied.erscheinungsjahr = 2020;
        
        System.out.println("Name: " + lied.name);
        System.out.println("Interpret: " + lied.Interpret);
        System.out.println("Laenge [sek]: " + lied.laengeInSek);
        System.out.println("Erscheinungsjahr: " + lied.erscheinungsjahr); 
    }
    /*
      Alles wurde in diesem Programm verstanden.
    */
}
