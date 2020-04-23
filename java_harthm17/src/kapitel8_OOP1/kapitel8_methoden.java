package kapitel8_OOP1;

/**
 *
 * @author Thomas Harrer
 */

class Song {
    public String name;
    public String Interpret; 
    public int laengeInSek;
    public int erscheinungsjahr;
    
    public double laengeInMin() { // Methode 
        return laengeInSek * 1.0 / 60;
    }
    
    public void printErscheinungsjahr (int anzahl) {
        while (anzahl-- > 0) {
            System.out.println("Alter = " + erscheinungsjahr);
        }
    }
}


public class kapitel8_methoden {
    public static void main(String[] args) {
        
        Song lied = new Song();
        lied.laengeInSek = 187;
        lied.erscheinungsjahr = 2017;
        
        System.out.println(lied.laengeInMin()); 
        
        /* 
          hier müssen bei lied.laengeInMin()
          die 2 Klammern sein weil es eine Methode ist
        */
        
        int a = 3;
        lied.printErscheinungsjahr(a);
    }
    /*
      Alles wurde in diesem Programm verstanden.
    */
}
