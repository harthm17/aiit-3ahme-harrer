package ue05_TestKoerperGruppe;


/**
 *
 * @author harthm17
 */
public abstract class Koerper {
    
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;
    
    protected double dichte;


    public Koerper (double dichte) {
        if (dichte < 0) {
            throw new IllegalArgumentException("Invalid parameter dichte");
        }
        this.dichte = dichte;
    }


    public double getDichte () {
        return dichte;
    }


    public void setDichte (double dichte) {
        this.dichte = dichte;
    }
    
    public abstract double oberflaeche ();
    
    public abstract double volumen ();
        
    public double masse () {
        return volumen() * dichte;
    }
    
}