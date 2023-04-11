import java.util.ArrayList;

/**
 * Spaceship goes "BRR".
 *
 */
public class Raumschiff {
    private int photonentorpedoAnzahl;
    private int energieversorgungInProzent;
    private int schildeInProzent;
    private int huelleInProzent;
    private int lebenserhaltungssystemeInProzent;
    private int androidenAnzahl;
    private String schiffsname;
    private static final ArrayList<String> broadcastKommunikator = new ArrayList<>();
    private final ArrayList<Ladung> ladungsverzeichnis;

    /**
     * Standard constructor
     */
    public Raumschiff() {
        this.ladungsverzeichnis = new ArrayList<>();
    }

    /**
     * Proper constructor
     *
     * @param photonentorpedoAnzahl Amount of initially available photon torpedoes.
     * @param energieversorgungInProzent Initial state of ship's energy supply in %.
     * @param zustandSchildeInProzent Initial state of ship's shields in %.
     * @param zustandHuelleInProzent Initial state of ship's shell in %.
     * @param zustandLebenserhaltungssystemeInProzent Initial state of ship's life support system in %.
     * @param anzahlDroiden Initial number of droids.
     * @param schiffsname Initial ship's name.
     */
    public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int zustandSchildeInProzent,
                      int zustandHuelleInProzent, int zustandLebenserhaltungssystemeInProzent, int anzahlDroiden,
                      String schiffsname) {
        this.photonentorpedoAnzahl = photonentorpedoAnzahl;
        this.energieversorgungInProzent = energieversorgungInProzent;
        this.schildeInProzent = zustandSchildeInProzent;
        this.huelleInProzent = zustandHuelleInProzent;
        this.lebenserhaltungssystemeInProzent = zustandLebenserhaltungssystemeInProzent;
        this.androidenAnzahl = anzahlDroiden;
        this.schiffsname = schiffsname;
        this.ladungsverzeichnis = new ArrayList<>();
    }

    /**
     * Getter for attribute {@link Raumschiff#photonentorpedoAnzahl}.
     *
     * @return The current value of object's {@link Raumschiff#photonentorpedoAnzahl}.
     */
    public int getPhotonentorpedoAnzahl() {
        return this.photonentorpedoAnzahl;
    }

    /**
     * Setter for attribute {@link Raumschiff#photonentorpedoAnzahl}.
     *
     * @param photonentorpedoAnzahl The updated amount of photon torpedoes available to this ship.
     */
    public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahl) {
        this.photonentorpedoAnzahl = photonentorpedoAnzahl;
    }

    /**
     * Getter for attribute {@link Raumschiff#energieversorgungInProzent}.
     *
     * @return The current value of {@link Raumschiff#energieversorgungInProzent}.
     */
    public int getEnergieversorgungInProzent() {
        return this.energieversorgungInProzent;
    }

    /**
     * Setter for attribute {@link Raumschiff#energieversorgungInProzent}.
     *
     * @param energieversorgungInProzent The updated energy supply of the ship.
     */
    public void setEnergieversorgungInProzent(int energieversorgungInProzent) {
        this.energieversorgungInProzent = energieversorgungInProzent;
    }

    /**
     * Getter for attribute {@link Raumschiff#schildeInProzent}.
     *
     * @return The current value of {@link Raumschiff#schildeInProzent}.
     */
    public int getSchildeInProzent() {
        return this.schildeInProzent;
    }

    /**
     * Setter for attribute {@link Raumschiff#schildeInProzent}.
     *
     * @param schildeInProzent The updated value of the ship's shields.
     */
    public void setSchildeInProzent(int schildeInProzent) {
        this.schildeInProzent = schildeInProzent;
    }

    /**
     * Getter for attribute {@link Raumschiff#huelleInProzent}.
     *
     * @return The current value of {@link Raumschiff#huelleInProzent}.
     */
    public int getHuelleInProzent() {
        return this.huelleInProzent;
    }

    /**
     * Setter for attribute {@link Raumschiff#huelleInProzent}.
     *
     * @param huelleInProzent The updated value of ship's shell.
     */
    public void setHuelleInProzent(int huelleInProzent) {
        this.huelleInProzent = huelleInProzent;
    }

    /**
     * Getter for attribute {@link Raumschiff#lebenserhaltungssystemeInProzent}.
     *
     * @return The current value of {@link Raumschiff#lebenserhaltungssystemeInProzent}.
     */
    public int getLebenserhaltungssystemeInProzent() {
        return this.lebenserhaltungssystemeInProzent;
    }

    /**
     * Setter for attribute {@link Raumschiff#lebenserhaltungssystemeInProzent}.
     *
     * @param lebenserhaltungssystemeInProzent The updated value of ship's life support system.
     */
    public void setLebenserhaltungssystemeInProzent(int lebenserhaltungssystemeInProzent) {
        this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
    }

    /**
     * Getter for attribute {@link Raumschiff#androidenAnzahl}.
     *
     * @return The current value of {@link Raumschiff#androidenAnzahl}.
     */
    public int getAndroidenAnzahl() {
        return this.androidenAnzahl;
    }

    /**
     * Setter for attribute {@link Raumschiff#androidenAnzahl}
     *
     * @param androidenAnzahl The updated amount of available repair androids on the ship.
     */
    public void setAndroidenAnzahl(int androidenAnzahl) {
        this.androidenAnzahl = androidenAnzahl;
    }

    /**
     * Getter for attribute {@link Raumschiff#schiffsname}.
     *
     * @return The current value of {@link Raumschiff#schiffsname}.
     */
    public String getSchiffsname() {
        return this.schiffsname;
    }

    /**
     * Setter for attribute {@link Raumschiff#schiffsname}.
     *
     * @param schiffsname The updated name of the ship.
     */
    public void setSchiffsname(String schiffsname) {
        this.schiffsname = schiffsname;
    }

    /**
     * Adds a new cargo object to the ship's {@link Raumschiff#ladungsverzeichnis}.
     * @see Ladung for the cargo class.
     *
     * @param neueLadung The object that is added to the list.
     */
    public void addLadung(Ladung neueLadung) {
        this.ladungsverzeichnis.add(neueLadung);
    }

    /**
     * The ship attempts to fire a photon torpedo, if one is available.
     * If none is available, adds a "-=*Click*=-" message to the "broadcastKommunikator".
     * Else adds a "Photonentorpedo abgeschossen" message to the "broadcastKommunikator".
     *
     * @param r The enemy spaceship that is being fired at.
     */
    public void photonentorpedoSchiessen(Raumschiff r) {
        if (this.getPhotonentorpedoAnzahl() == 0) {
            nachrichtAnAlle("-=*Click*=-");
            System.out.println("(" + this.getSchiffsname() + " wollte einen Photonentorpedo abschießen, hatte aber keinen geladen.)");
        }
        else {
            nachrichtAnAlle("Photonentorpedo abgeschossen");
            this.setPhotonentorpedoAnzahl(this.getPhotonentorpedoAnzahl() - 1);
            this.treffer(r);
        }
    }

    /**
     * The ship attempts to fire its phaser cannon, if it has enough energy available.
     * If not, adds a "-=*Click*=-" message to the "broadcastKommunikator".
     * Else adds a "Phaserkanone abgeschossen" message to the "broadcastKommunikator" and reduces the ship's energy.
     *
     * @param r The enemy spaceship that is being fired at.
     */
    public void phaserkanoneSchiessen(Raumschiff r) {
        if (this.getEnergieversorgungInProzent() < 50) {
            nachrichtAnAlle("-=*Click*=-");
            System.out.println("(" + this.getSchiffsname() + " wollte mit der Phaserkanone schießen, hatte aber nicht ausreichend Energie.)");
        }
        else {
            nachrichtAnAlle("Phaserkanone abgeschossen");
            this.setEnergieversorgungInProzent(this.getEnergieversorgungInProzent() - 50);
            this.treffer(r);
        }
    }

    /**
     * Adds a hit message containing the target spaceship name to the "broadcastKommunikator".
     * Reduces the target's shields and potentially also the shell and energy upon hit (can't miss).
     * Adds a message to the "broadcastKommunikator" in case all life support attributes have been destroyed.
     *
     * @param r The spaceship being fired at.
     * @see #photonentorpedoSchiessen(Raumschiff)
     * @see #phaserkanoneSchiessen(Raumschiff)
     */
    private void treffer(Raumschiff r){
        System.out.println(r.getSchiffsname() + " wurde getroffen!");
        r.setSchildeInProzent(r.getSchildeInProzent() - 50);
        if (r.getSchildeInProzent() <= 0) {
            r.setHuelleInProzent(r.getHuelleInProzent() - 50);
            r.setEnergieversorgungInProzent(r.getEnergieversorgungInProzent() - 50);
            if(r.getHuelleInProzent() <= 0) {
                r.nachrichtAnAlle("Die Lebenserhaltungssysteme von " + r.getSchiffsname() + " wurden vernichtet!");
            }
        }
    }

    /**
     * Adds a new message string to the global chat log aka "broadcastKommunikator".
     *
     * @param message The message.
     */
    public void nachrichtAnAlle(String message) {
        broadcastKommunikator.add(message);
    }

    /**
     * Anyone can read the chat log with this method.
     *
     * @return The static ArrayList attribute "broadcastKommunikator".
     */
    public static ArrayList<String> eintraegeLogbuchZurueckgeben() {
        return broadcastKommunikator;
    }

    /**
     * Checks if torpedoes are in the cargo. If so, attempts to retrieve some or all, so they can be used as ammunition.
     * Uses all available torpedoes, if the desired amount > available amount.
     * If not, only uses desired amount.
     *
     * @param anzahlTorpedos The desired amount of torpedoes to be taken from cargo.
     */
    public void photonentorpedosLaden(int anzahlTorpedos) {
        boolean torpedoCargoExists = false;
        int torpedoCargoAmount = 0;
        int torpedoesUsed;
        for (Ladung ladung : this.ladungsverzeichnis) {
            if (ladung.getBezeichnung().equals("Photonentorpedo")) {
                torpedoCargoExists = true;
                torpedoCargoAmount = ladung.getMenge();
                break;
            }
        }

        // If torpedoes are found in cargo
        if (torpedoCargoExists) {
            // Use all torpedoes from cargo, when the desired amount is greater than the existing amount
            if (anzahlTorpedos > torpedoCargoAmount) {
                torpedoesUsed = torpedoCargoAmount;
                this.setPhotonentorpedoAnzahl(this.getPhotonentorpedoAnzahl() + torpedoesUsed);
                for (Ladung ladung : this.ladungsverzeichnis) {
                    if (ladung.getBezeichnung().equals("Photonentorpedo")) {
                        ladung.setMenge(0);
                        break;
                    }
                }
            }
            // Otherwise use only the desired amount of torpedoes from cargo.
            else {
                torpedoesUsed = anzahlTorpedos;
                this.setPhotonentorpedoAnzahl(this.getPhotonentorpedoAnzahl() + anzahlTorpedos);
                for (Ladung ladung : this.ladungsverzeichnis) {
                    if (ladung.getBezeichnung().equals("Photonentorpedos")) {
                        ladung.setMenge(ladung.getMenge() - torpedoesUsed);
                        break;
                    }
                }
            }
            // Prints the amount of actually used torpedoes to console.
            System.out.println(torpedoesUsed + " Photonentorpedo(s) eingesetzt");
        }
        else {
            System.out.println("Keine Photonentorpedos gefunden!");
            this.nachrichtAnAlle("-=*Click*=-");
        }
    }

    /**
     * Depending on params, androids will more or less successfully repair the spaceship's vitals.
     * The success rate is random (0-100%).
     * All androids are being used, when the desired amount is greater than the available amount, otherwise only the desired amount.
     *
     * @param schutzschilde Repair shields?
     * @param energieversorgung Restore energy?
     * @param schiffshuelle Repair shell?
     * @param anzahlDroiden Amount of androids for the job.
     */
    public void reperaturDurchfuehren(boolean schutzschilde, boolean energieversorgung, boolean schiffshuelle, int anzahlDroiden) {
        // Save the arguments in an array
        boolean[] args = new boolean[3];
        args[0] = schutzschilde;
        args[1] = energieversorgung;
        args[2] = schiffshuelle;

        // Calculate the random number for repair success
        int reparationParameter = (int) (Math.random() * 101);

        // Initialize helper variables
        int amountOfReparations = 0;

        // Compare the desired amount of androids with the available amount and take the lower value of both.
        int androidsPossible = Math.min(anzahlDroiden, this.getAndroidenAnzahl());

        // Go through the list of arguments and count the number of args set to true
        for (boolean arg : args) {
            if (arg) { amountOfReparations++; }
        }

        if (schutzschilde) {
            this.setSchildeInProzent(this.getSchildeInProzent() + (reparationParameter * androidsPossible)/(amountOfReparations));
        }
        if (energieversorgung) {
            this.setEnergieversorgungInProzent(this.getEnergieversorgungInProzent() + (reparationParameter * androidsPossible)/(amountOfReparations));
        }
        if (schiffshuelle) {
            this.setHuelleInProzent(this.getHuelleInProzent() + (reparationParameter * androidsPossible)/(amountOfReparations));
        }

    }

    /**
     * Print all attributes related to the ship's general state to console.
     */
    public void zustandRaumschiff() {
        System.out.println(this);
    }

    /**
     * Print every item in the ArrayList attribute "ladungsverzeichnis" to console.
     */
    public void ladungsverzeichnisAusgeben() {
        System.out.println("LADUNGSVERZEICHNIS:");
        for (Ladung ladung : this.ladungsverzeichnis) {
            System.out.println(ladung.toString());
        }
    }

    /**
     * Removes cargo with amount 0 from the cargo list.
     */
    public void ladungsverzeichnisAufraeumen() {
        this.ladungsverzeichnis.removeIf(ladung -> ladung.getMenge() == 0);
    }

    @Override
    public String toString() {
        return "Name: " + getSchiffsname() + "\n"
                + "------------------------------------\n"
                + "ANGRIFF:\n"
                + "Photonentorpedos: " + getPhotonentorpedoAnzahl() + "\n"
                + "------------------------------------\n"
                + "VERTEIDIGUNG:\n"
                + "Energieversorgung: " + getEnergieversorgungInProzent() + "%\n"
                + "Schilde: " + getSchildeInProzent() + "%\n"
                + "Hülle: " + getHuelleInProzent() + "%\n"
                + "Lebenserhaltungssysteme: " + getLebenserhaltungssystemeInProzent() + "%\n"
                + "Androiden: " + getAndroidenAnzahl();
    }
}
