package ue05_TestKoerperGruppe;

import java.util.Locale;


/**
 *
 * @author harthm17
 */
public class Wuerfel extends Koerper {
    
    private double a;


    public Wuerfel (double a, double dichte) throws IllegalArgumentException {
        super(dichte);
        this.a = a;
    }


    public double getA () {
        return a;
    }


    public void setA (double a) {
        this.a = a;
    }

    
    @Override
    public double oberflaeche () {
        return 6 * a * a;
    }

    
    @Override
    public double volumen () {
        return a * a * a;
    }


    @Override
    public String toString () {
        return String.format(Locale.ENGLISH, "{\"a\":%e,\"dichte\":%e}", a, dichte);
    }
    
    
   
}
