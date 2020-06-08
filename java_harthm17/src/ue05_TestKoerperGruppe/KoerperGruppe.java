package ue05_TestKoerperGruppe;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 *
 * @author harthm17
 */
public class KoerperGruppe {
    private final List<Koerper> koerperListe = new ArrayList();
    private double dichte;
    
    public KoerperGruppe() {
    }
    
    public KoerperGruppe (Collection<Koerper> koerperListe, double dichte) {
        this.koerperListe.addAll(koerperListe);
        this.dichte = dichte;
        for (Koerper k : this.koerperListe)  {
            k.setDichte(dichte);
        }
    }


    public int size () {
        return koerperListe.size();
    }


    public boolean contains (Koerper k) {
        return koerperListe.contains(k);
    }


    public Object[] toArray () {
        return koerperListe.toArray();
    }


    public boolean add (Koerper k) {
        return koerperListe.add(k);
    }


    public boolean remove (Object k) {
        return koerperListe.remove(k);
    }
    
    
}
