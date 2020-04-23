package kapitel8_OOP1;

/**
 *
 * @author Thomas Harrer
 */

class Auto {
    public String name;
    public int    erstzulassung;
    public int    leistung;

    public Auto(String name) {
        this.name = name;
    }

    public Auto(String name, int erstzulassung, int leistung) {
        this.name = name;
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
        
        /*
        Verkettung von Konstruktoren  
        this(name);
        this.erstzulassung = erstzulassung;
        this.leistung = leistung;
        +*/
    }
}

public class kapitel8_konstruktoren {
    public static void main(String[] args) {
        Auto meinAuto = new Auto("Porsche 911", 2018, 350);
        System.out.println("Name: " +  meinAuto.name);
        System.out.println("Erstzulassung: " + meinAuto.erstzulassung);
        System.out.println("Leistung: " + meinAuto.leistung);
    }
    /*
      this Zeiger wurde nicht ganz verstanden, sonst alles klar
    */
    
}
