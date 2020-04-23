package ue01_Taschenrechner;

/**
 *
 * @author Thomas Harrer
 */

public class Taschenrechner {
    public double a;
    public double b;
    
    public Taschenrechner (double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getAdditionResult() {
        return a + b;
    }
    
    public double getSubtractionResult() {
        return a - b;
    }
    
    public double getMultiplicationResult() {
        return a * b;
    }
    
    public double getDivisionResult() {
        return a / b;
    }
}

