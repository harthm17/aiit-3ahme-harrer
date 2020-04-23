package kapitel9_OOP2;

/**
 *
 * @author Thomas Harrer
 */
public class kapitel9_statische_methoden_und_membervariablen {
    static private int objcnt = 0;

    public kapitel9_statische_methoden_und_membervariablen() {
        ++objcnt;
    }

    public void finalize() {
        --objcnt;
    }

    public static void main(String[] args) {
        kapitel9_statische_methoden_und_membervariablen auto1;
        kapitel9_statische_methoden_und_membervariablen auto2 = new kapitel9_statische_methoden_und_membervariablen();
        System.out.println
        ("Anzahl Testauto-Objekte: " + kapitel9_statische_methoden_und_membervariablen.objcnt);
    }
    /*
      Programm wurde verstanden
    */
    
    double x, y;
    for (x = 0.0; x <= 10.0; x = x + 1.0) {
        y = Math.sqrt(x);
        System.out.println("sqrt("+x+") = "+y);
    } 
    
    /*
      das Programm funktioniert nicht
      mit Absprache mit Herr Kogler wurde ebenso kein Problem gefunden
    */
}
