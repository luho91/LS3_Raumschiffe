/**
 * This code will get me a 1+ grade.
 * I personally do not think that it is good practise to give students german object and method names.
 * The programming world is international.
 * Even if it may be easier for some students to program with german names in the beginning,
 * I do not think they should.
 * I know french companies who code almost exclusively in French.
 * Imagine their problems hiring non-french developers, even for only temporary collaboration.
 * Especially the name "broadcastKommunikator" is so, so bad. So bad. Bad.
 *
 * @author Lukas Holzheid
 * @version 1.0
 */
public class Main {
    /**
     * The main program.
     * It creates objects and calls theirs and the classes' methods.
     * The predefined 'screenplay' is being performed (the different ships are shooting each other).
     * I don't think the values for the ships' energy and the amount of available torpedoes are correct in the source.
     * This screenplay results in no torpedoes being fired.
     *
     * @see <a href="https://moodle.oszimt.de/mod/page/view.php?id=478987">Screenplay</a> (you need to be logged into OSZIMT's moodle)
     * @param args The program doesn't expect any command line parameters.
     */
    public static void main(String[] args) {

        String separator = "\n=========================================\n";

        // Initialize spaceships
        Raumschiff klingonen = new Raumschiff(0, 100, 50, 100, 100, 2, "IKS Hegh'ta");
        Raumschiff romulaner = new Raumschiff(2, 50, 50, 100, 100, 2, "IRW Khazara");
        Raumschiff vulkanier = new Raumschiff(0, (int) (Math.random() * 101), (int) (Math.random() * 101), (int) (Math.random() * 101), 100, 5, "Ni'Var");

        // Add cargo to klingon spaceship
        klingonen.addLadung(new Ladung("Ferengi Schneckensaft", 200));
        klingonen.addLadung(new Ladung("Bat'leth Klingonen Schwert", 200));

        // Add cargo to romulan spaceship
        romulaner.addLadung(new Ladung("Borg-Schrott", 5));
        romulaner.addLadung(new Ladung("Rote Materie", 2));
        romulaner.addLadung(new Ladung("Plasma-Waffe", 50));

        // Add cargo to vulcan spaceship
        vulkanier.addLadung(new Ladung("Forschungssonde", 35));

        // I added this despite it not being in the *** expert diagram, the other ** and * have it.
        vulkanier.addLadung(new Ladung("Photonentorpedo", 3));

        System.out.println(separator);
        System.out.println("Der Krieg beginnt!");
        System.out.println(separator);

        klingonen.photonentorpedoSchiessen(romulaner);
        System.out.println(separator);
        romulaner.phaserkanoneSchiessen(klingonen);
        System.out.println(separator);
        vulkanier.nachrichtAnAlle("Gewalt ist nicht logisch");

        klingonen.zustandRaumschiff();
        System.out.println(separator);
        klingonen.ladungsverzeichnisAusgeben();

        vulkanier.reperaturDurchfuehren(true, true, true, 999);

        vulkanier.photonentorpedosLaden(99);
        System.out.println(separator);
        vulkanier.ladungsverzeichnisAufraeumen();

        klingonen.photonentorpedoSchiessen(romulaner);
        System.out.println(separator);
        klingonen.photonentorpedoSchiessen(romulaner);
        System.out.println(separator);

        klingonen.zustandRaumschiff();
        System.out.println(separator);
        klingonen.ladungsverzeichnisAusgeben();
        System.out.println(separator);
        romulaner.zustandRaumschiff();
        System.out.println(separator);
        romulaner.ladungsverzeichnisAusgeben();
        System.out.println(separator);
        vulkanier.zustandRaumschiff();
        System.out.println(separator);
        vulkanier.ladungsverzeichnisAusgeben();
        System.out.println(separator);

        for (String m : Raumschiff.eintraegeLogbuchZurueckgeben()) {
            System.out.println(m);
        }
    }
}