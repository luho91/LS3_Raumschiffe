/**
 * Cargo on a ship.
 *
 * @see Raumschiff
 */
public abstract class Ladung {
    private String bezeichnung;
    private int menge;

    /**
     * Standard constructor
     */
    public Ladung() {}

    /**
     * (Fully) parameterized constructor
     *
     * @param bezeichnung The initial name of the cargo.
     * @param menge The initial amount of the cargo.
     */
    public Ladung(String bezeichnung, int menge) {
        this.bezeichnung = bezeichnung;
        this.menge = menge;
    }

    /**
     * Setter for attribute bezeichnung.
     *
     * @param bezeichnung The new name of the cargo.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Getter for attribute bezeichnung.
     *
     * @return The current value of object's "bezeichnung".
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Setter for attribute menge.
     *
     * @param menge The new amount of the cargo.
     */
    public void setMenge(int menge) {
        this.menge = menge;
    }

    /**
     * Getter for attribute menge.
     *
     * @return The current value of object's "menge".
     */
    public int getMenge() {
        return menge;
    }

    /**
     * @return A parsed string containing all (attribute) information about this object
     */
    @Override
    public String toString() {
        return "Bezeichnung: " + this.getBezeichnung() + ", Menge: " + this.getMenge();
    }
}
