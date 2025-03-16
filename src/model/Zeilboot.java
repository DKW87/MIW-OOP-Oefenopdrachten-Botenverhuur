package model;

public class Zeilboot extends Boot {

    // constructors

    public Zeilboot(String naam, int lengte) {
        super(naam, lengte);
    }

    // methoden

    @Override
    public boolean isVaarbewijsPlichtig() {
        final int GRENS_LENGTE = 15;
        return this.getLengte() > GRENS_LENGTE;
    }

    @Override
    public double berekenHuurprijs() {
        double huurprijs = 0;
        final int GRENS_LENGTE = 7;
        final double PRIJS_KLEINE_BOOT = 40.0;
        final double PRIJS_GROTE_BOOT = 70.0;

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

        sb.append(String.format("%s %n", super.toString().replace("Boot", "Zeilboot")));
        sb.append(String.format("\tVaarbewijs vereist: %s %n\tHuurprijs: %.2f euro per dag", vaarbewijsPlichtig, this.berekenHuurprijs()));

        return sb.toString();
    }

}
