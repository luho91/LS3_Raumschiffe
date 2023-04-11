/**
 * A type of cargo representing transportation goods on the ship.
 *
 * @see Ladung
 */
public class Transportgut extends Ladung {
    private double laenge;
    private double breite;
    private double hoehe;

    /**
     * Parameterized constructor accepting only the minimum required arguments bezeichnung and menge
     * from parent class {@link Ladung}.
     *
     * @param bezeichnung The initial name of the cargo.
     * @param menge The initial amount of the cargo.
     */
    public Transportgut(String bezeichnung, int menge) {
        super(bezeichnung, menge);
        this.laenge = 0;
        this.breite = 0;
        this.hoehe = 0;
    }

    /**
     * (Fully) parameterized constructor requiring all attributes as arguments.
     *
     * @param bezeichnung The initial name of the cargo.
     * @param menge The initial amount of the cargo.
     * @param laenge The initial length dimension of the cargo.
     * @param breite The initial width dimension of the cargo.
     * @param hoehe The initial height dimension of the cargo.
     */
    public Transportgut(String bezeichnung, int menge, double laenge, double breite, double hoehe) {
        super(bezeichnung, menge);
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    /**
     * Getter for attribute laenge.
     *
     * @return The current value of objec't "laenge".
     */
    public double getLaenge() {
        return laenge;
    }

    /**
     * Getter for attribute breite.
     *
     * @return The current value of object's "breite".
     */
    public double getBreite() {
        return breite;
    }

    /**
     * Getter for attribute hoehe.
     *
     * @return The current value of object's "hoehe".
     */
    public double getHoehe() {
        return hoehe;
    }

    /**
     * Setter for attribute laenge.
     *
     * @param laenge The new length.
     */
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    /**
     * Setter for attribute breite.
     *
     * @param breite The new width.
     */
    public void setBreite(double breite) {
        this.breite = breite;
    }

    /**
     * Setter for attribute hoehe.
     *
     * @param hoehe The new height.
     */
    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    /**
     * @return A parsed string containing all (attribute) information about this object
     */
    @Override
    public String toString() {
        return "Bezeichnung: " + this.getBezeichnung()
                + ", Menge: " + this.getMenge()
                + ", Länge: " + this.getLaenge()
                + ", Breite: " + this.getBreite()
                + ", Höhe: " + this.getHoehe();
    }
}
