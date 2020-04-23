package kapitel6_ausdruecke;

/**
 *
 * @author Thomas Harrer
 */
public class kapitel6_string_vergleichen {
    public static void main(String[] args) {
        String a;
        String b;
        String c;
        
        a = "Coronavirus";
        b = "Hallo";
        c = "Ausarbeitung";
        
        System.out.println("String a = " + a);
        System.out.println("String b = " + b);
        System.out.println("String c = " + c);
        
        System.out.println("");
        
        System.out.println("a.equals(a) liefert folgendes zurück = " + a.equals(a));
        System.out.println("a.equals(b) liefert folgendes zurück = " + a.equals(b));
        System.out.println("a.equals(c) liefert folgendes zurück = " + a.equals(c));
        
        /*
          Mit (Stringname1).equals(Stringname2) vergleicht man 2 String miteinander
          Wenn diese gleich sind, wird true zurückgegeben
          Wenn diese ungleich sind, wird false zurückgegeben
        */
        
        System.out.println("");
        
        System.out.println("a == b liefert folgendes zurück = " + (a == b));
        System.out.println("a != b liefert folgendes zurück = " + (a != b));
        
        /*
          Hier werden nicht die Strings verglichen sondern nur die Zeiger
        */
    }
}
