package ue02_serienschaltung;

import java.util.Scanner;

/**
 *
 * @author Thomas Harrer
 */
public class SerienschaltungRechner {
    public static void main(String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.print("Strom [A]: ");
                final double strom = scanner.nextDouble();
                serienschaltung.setStrom(strom);
                break;
            } catch (java.util.InputMismatchException exception) {

            }
        }

        try {
            while(true) {
                System.out.print("Widerstand [Ohm]: ");
                final double widerstand = scanner.nextDouble();
                serienschaltung.addWiderstand(widerstand);
            }
        } catch(InvalidResistorValueException ex) {
        }
    }
}
