/**
 * A type of cargo representing life forms, that are on the ship as guests.
 *
 * @see Ladung
 */
public class Gast extends Ladung {
    private String sprache;
    private String herkunft;
    private Verpflegungsart verpflegungsart;

    public Gast(String bezeichnung, int menge, String sprache, String herkunft) {
        super(bezeichnung, menge);
        this.sprache = sprache;
        this.herkunft = herkunft;
        this.verpflegungsart = Verpflegungsart.OHNE;
    }

    public String getSprache() {
        return sprache;
    }
    public String getHerkunft() {
        return herkunft;
    }
    public Verpflegungsart getVerpflegungsart() {
        return verpflegungsart;
    }

    public void setSprache(String sprache) {
        this.sprache = sprache;
    }
    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }
    public void setVerpflegungsart(Verpflegungsart verpflegungsart) {
        this.verpflegungsart = verpflegungsart;
    }

    @Override
    public String toString() {
        return "Bezeichnung: " + this.getBezeichnung()
                + ", Menge: " + this.getMenge()
                + ", Sprache: " + this.getSprache()
                + ", Herkunft: " + this.getHerkunft();
    }
}
