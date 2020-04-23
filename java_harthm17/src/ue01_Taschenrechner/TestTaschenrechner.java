package ue01_Taschenrechner;

/**
 *
 * @author Thomas Harrer
 */

import java.util.Scanner;

public class TestTaschenrechner {
        public static void main(String[] args) {    
            Scanner eingabe = new Scanner(System.in);
        
            System.out.print("Wert a: ");
            final double a = eingabe.nextDouble();
            System.out.print("Wert b: ");
            final double b = eingabe.nextDouble();
        
            Taschenrechner rechner = new Taschenrechner(a, b);
            
            System.out.format("  Addition: %.3f\n", rechner.getAdditionResult());
            System.out.format("  Subtraktion: %.3f\n", rechner.getSubtractionResult());
            System.out.format("  Multiplikation: %.3f\n", rechner.getMultiplicationResult());
            System.out.format("  Division: %.3f\n", rechner.getDivisionResult());
    }
}
