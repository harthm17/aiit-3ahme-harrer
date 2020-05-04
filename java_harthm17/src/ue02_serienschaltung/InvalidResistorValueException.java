package ue02_serienschaltung;

/**
 *
 * @author Thomas Harrer
 */
public class InvalidResistorValueException extends Exception {
    private final double invalidValue;

    public InvalidResistorValueException(double invalidValue) {
        super("Fehler aufgetreten = " + invalidValue);       
        this.invalidValue = invalidValue;
    }
    
    public double getInvalidValue() {
        return invalidValue;
    }
}
