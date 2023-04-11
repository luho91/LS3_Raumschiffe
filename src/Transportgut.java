/**
 * A type of cargo representing transportation goods on the ship.
 *
 * @see Ladung
 */
public class Transportgut extends Ladung {
    private double laenge;
    private double breite;
    private double hoehe;

    // in case you don't want to set dimensions on a transportation good
    public Transportgut(String bezeichnung, int menge) {
        super(bezeichnung, menge);
        this.laenge = 0;
        this.breite = 0;
        this.hoehe = 0;
    }
    public Transportgut(String bezeichnung, int menge, double laenge, double breite, double hoehe) {
        super(bezeichnung, menge);
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double getLaenge() {
        return laenge;
    }
    public double getBreite() {
        return breite;
    }
    public double getHoehe() {
        return hoehe;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }
    public void setBreite(double breite) {
        this.breite = breite;
    }
    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public String toString() {
        return "Bezeichnung: " + this.getBezeichnung()
                + ", Menge: " + this.getMenge()
                + ", Länge: " + this.getLaenge()
                + ", Breite: " + this.getBreite()
                + ", Höhe: " + this.getHoehe();
    }
}
