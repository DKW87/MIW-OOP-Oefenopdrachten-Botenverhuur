package model;

public class Klant {

    // attributen

    private String naam;
    private String emailadres;
    private boolean vaarVaardig;

    // constructors

    public Klant() {
        this("onbekend");
    }

    public Klant(String naam) {
        this(naam, "onbekend", false);
    }

    public Klant(String naam, String emailadres, boolean vaardig) {
        this.naam = naam;
        this.emailadres = emailadres;
        this.vaarVaardig = vaardig;
    }

    // methoden

    public boolean isVaarVaardig() {
        return vaarVaardig;
        // addmore
    }

    @Override
    public String toString() {
        return "Klant " + naam;
    }

}
