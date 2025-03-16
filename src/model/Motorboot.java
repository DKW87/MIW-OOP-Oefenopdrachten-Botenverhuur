package model;

public class Motorboot extends Boot {

    // attributen

    private int maxSnelheid;

    // constructors

    public Motorboot(String naam, int lengte, int snelheid) {
        super(naam, lengte);
        maxSnelheid = snelheid;
    }

    // methoden

    @Override
    public boolean isVaarbewijsPlichtig() {
        final int GRENS_LENGTE = 15;
        final int GRENS_SNELLHEID = 20;

        return this.getLengte() > GRENS_LENGTE || this.maxSnelheid > GRENS_SNELLHEID;
    }

    @Override
    public double berekenHuurprijs() {
        double huurprijs = 0;
        final int GRENS_LENGTE = 10;
        final double PRIJS_KLEINE_BOOT = 60.0;
        final double PRIJS_GROTE_BOOT = 90.0;

        if (this.getLengte() < GRENS_LENGTE) {
            huurprijs = PRIJS_KLEINE_BOOT;
        } else {
            huurprijs = PRIJS_GROTE_BOOT;
        }

        return huurprijs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String vaarbewijsPlichtig;

        if (this.isVaarbewijsPlichtig()) {
            vaarbewijsPlichtig = "Ja";
        } else {
            vaarbewijsPlichtig = "Nee";
        }

        sb.append(String.format("%s %n", super.toString().replace("Boot", "Motorboot")));
        sb.append(String.format("\tVaarbewijs vereist: %s %n\tHuurprijs: %.2f euro per dag", vaarbewijsPlichtig, this.berekenHuurprijs()));

        return sb.toString();
    }

}
