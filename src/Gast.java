/**
 * A type of cargo representing life forms, that are on the ship as guests.
 *
 * @see Ladung
 */
public class Gast extends Ladung {
    private String sprache;
    private String herkunft;
    private Verpflegungsart verpflegungsart;

    /**
     * Constructor requiring all attributes except verpflegungsart.
     *
     * @param bezeichnung The initial name of the guest type.
     * @param menge The initial amount of guests.
     * @param sprache The initial language the guest(s) speak.
     * @param herkunft The initial heritage of the guest(s).
     */
    public Gast(String bezeichnung, int menge, String sprache, String herkunft) {
        super(bezeichnung, menge);
        this.sprache = sprache;
        this.herkunft = herkunft;
        this.verpflegungsart = Verpflegungsart.OHNE;
    }

    /**
     * Getter for attribute sprache.
     *
     * @return The current value of object's "sprache".
     */
    public String getSprache() {
        return sprache;
    }

    /**
     * Getter for attribute herkunft.
     *
     * @return The current value of object's "herkunft".
     */
    public String getHerkunft() {
        return herkunft;
    }

    /**
     * Getter for attribute verpflegungsart.
     *
     * @return The current value of object's "verpflegungsart".
     */
    public Verpflegungsart getVerpflegungsart() {
        return verpflegungsart;
    }

    /**
     * Setter for attribute sprache.
     *
     * @param sprache The new language (but how?)
     */
    public void setSprache(String sprache) {
        this.sprache = sprache;
    }

    /**
     * Setter for attribute herkunft.
     *
     * @param herkunft The new heritage (but how?)
     */
    public void setHerkunft(String herkunft) {
        this.herkunft = herkunft;
    }

    /**
     * Setter for attribute verpflegungsart.
     *
     * @param verpflegungsart The new type of object's catering contract.
     */
    public void setVerpflegungsart(Verpflegungsart verpflegungsart) {
        this.verpflegungsart = verpflegungsart;
    }

    /**
     * @return A parsed string containing all (attribute) information about this object
     */
    @Override
    public String toString() {
        return "Bezeichnung: " + this.getBezeichnung()
                + ", Menge: " + this.getMenge()
                + ", Sprache: " + this.getSprache()
                + ", Herkunft: " + this.getHerkunft();
    }
}
