package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Verhuur {

    // attributen

    private Klant klant;
    private List<Boot> boten;
    private LocalDate startDatum;
    private int aantalDagen;

    // constructors

    public Verhuur(Klant klant, LocalDate datum, int aantalDagen) {
        this.klant = klant;
        this.startDatum = datum;
        this.aantalDagen = aantalDagen;
        this.boten = new ArrayList<>();
    }

    // methoden

    public void voegBootToe(Boot boot) {

        if (magVerhuurd(boot)) {
            boten.add(boot);
        } else {
            System.out.printf("%s%nMag niet verhuurd worden aan %s! Toevoegen mislukt.%n", boot, klant);
        }

    }

    public double berekenHuurBedrag() {
        double huurprijs = 0;

        for (Boot boot : boten) {
            huurprijs += (boot.berekenHuurprijs() * aantalDagen);
        }

        return huurprijs;
    }

    private boolean magVerhuurd(Boot boot) {
        boolean magHuren = false;

        if (boot.isVaarbewijsPlichtig()) {
            if (klant.isVaarVaardig()) {
                magHuren = true;
            }
        } else if (!boot.isVaarbewijsPlichtig()) {
            magHuren = true;
        }

        return magHuren;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(boten);

        if (this.boten.isEmpty()) {
            sb.append(String.format("De verhuur aan %s op %s is mislukt, geen boten toegevoegd.%n", klant, startDatum));
            return sb.toString();
        } else {
            sb.append(String.format("De verhuur aan %s van %s tot %s kost %.2f euro:%n", klant, startDatum, startDatum.plusDays(aantalDagen), berekenHuurBedrag()));
            for (Boot boot : boten) {
                sb.append(boot);
                sb.append("\n");
            }
            return sb.toString();
        }

    }

}
