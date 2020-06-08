package ue05_TestKoerperGruppe;

import java.util.Locale;


/**
 *
 * @author harthm17
 */
public class Kugel extends Koerper {
    private double r;


    public Kugel (double r, double dichte) throws IllegalArgumentException {
        super(0.0);
        if (r <= 0) {
            throw new IllegalArgumentException("Invalid parameter r");
        }
        this.r = r;
    }

    public double getR () {
        return r;
    }


    public void setR (double r) {
        this.r = r;
    }


    public double getDichte () {
        return dichte;
    }


    public void setDichte (double dichte) {
        this.dichte = dichte;
    }
    
    
    @Override
    public double oberflaeche () {
        return 4 * r * r * Math.PI;
    }
    
    @Override
    public double volumen () {
        return 4 / 3 * Math.PI * Math.pow(r, 3);
    }

    @Override
    public String toString () {
        return String.format(Locale.ENGLISH, "{\"r\":%e,\"dichte\":%e}", r, dichte);
    }
    
}
