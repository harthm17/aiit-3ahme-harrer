package kapitel8_OOP1;

/**
 *
 * @author Thomas Harrer
 */
public class kapitel8_parameter {
    public static void registerKassa(Object... args) {
        double zwischensumme = 0;  
        double gesamtsumme = 0;
        for (int i = 0; i < args.length; ++i) {
            if (args[i] instanceof Number) {
                zwischensumme += ((Number)args[i]).doubleValue();
            } else {
                System.out.println(args[i] + " : " + zwischensumme);
                gesamtsumme += zwischensumme;
                zwischensumme = 0;
            }
        } 
        System.out.println("Gesamtsumme: " + gesamtsumme);
    }
    public static void main(String[] args) {
        registerKassa(
            7.49, 19.99, 34.99, "Ware",
            -3.00, 1.50, "Pfand",
            -20, "Gutschein"
        );
    }  
    /*
      Es kommen Fehler wenn Zwischensumme und Gesamtsumme nicht mit 0
      intialisiert wird. Ich glaube es ist deswegen so, weil es eine Rechnung ist
      und es einen Anfangswert braucht.
    */
    
    /*
      Eine Waring in Zeile 12
      instanceof ... ist mir nicht gant klar
      woher kommt doubleValue() ???
    */
}
