package ue02_serienschaltung;

import java.util.Scanner;

/**
 *
 * @author Thomas Harrer
 */
public class SerienschaltungRechner {
    public static void main (String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        try {
            System.out.print("Strom [A]: ");
            final double strom = new Scanner (System.in).nextDouble();
            //final double strom = 0.5;
            serienschaltung.setStrom(strom);
        } catch (Exception exception) {
            exception.printStackTrace(System.out);
            System.exit(1);
        }
        
        while (true) {
            System.out.print("Widerstand [Ohm]: ");
            double widerstand = new Scanner(System.in).nextDouble();
            try {
                serienschaltung.addWiderstand(widerstand);
            } catch (InvalidResistorValueException exception) {
                System.out.print("Ergebnis:");
                System.out.print(serienschaltung);
                return;
            }
        }
    }
}