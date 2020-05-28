package ue05_TestKoerperGruppe;

/**
 *
 * @author Thomas Harrer
 */
public class KorperGruppe extends Koerper {
    private ArrayList<Koerper> koerperListe = new ArrayList<>();
    private double dichte;

    public KoerperGruppe(ArrayList koerperListe, double dichte) {
        this.koerperListe = koerperListe;
        this.dichte = dichte;
    }
}
