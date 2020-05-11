package ue02_serienschaltung;

/**
 *
 * @author Thomas Harrer
 */
public class TestSerienschaltung {
    public static void main (String[] args) throws InvalidResistorValueException {
        final Serienschaltung serienschaltung = new Serienschaltung();
        
        try {
            System.out.println("1: " + serienschaltung);
            serienschaltung.addWiderstand(10);
        } catch (Exception exception) {
            System.out.println("Es ist ein Fehler aufgetreten");
            System.out.println(exception.getMessage());
            if (exception instanceof InvalidResistorValueException) {
               double v = ((InvalidResistorValueException)exception).getInvalidValue(); 
            }
            throw new TestFailedException(exception);
        }
        
        System.out.println("2: " + serienschaltung);
        serienschaltung.setStrom(0.5);
        
        try {
            System.out.println("3: " + serienschaltung);
            serienschaltung.addWiderstand(15);
        } catch (Exception exception) {
            System.out.println("Es ist ein Fehler aufgetreten");
            System.out.println(exception.getMessage());
        }
                 
        try {
            System.out.println("3: " + serienschaltung);
            serienschaltung.addWiderstand(20);
        } catch (Exception exception) {
            System.out.println("Es ist ein Fehler aufgetreten");
            System.out.println(exception.getMessage());
        }
        
        System.out.println("5: " + serienschaltung);
        
        serienschaltung.setStrom(0.5);
        System.out.println("6: " + serienschaltung);
    }
    
    public static class TestFailedException extends RuntimeException {
         public TestFailedException(Throwable cause) {
            super(cause);
        }
    } 
}
