package model;

public abstract class Boot implements VrijVerhuurbaar, Comparable<Boot> {

    // attributen

    private static int lastId;
    private final int id;
    private String naam;
    private int lengte;

    // constructors

    protected Boot(String naam, int lengte) {
        this.naam = naam;
        this.setLengte(lengte);
        lastId++;
        this.id = lastId;

    }

    // methoden

    public abstract double berekenHuurprijs();

    @Override
    public int compareTo(Boot andereBoot) {
        return this.naam.compareTo(andereBoot.naam);
    }

    @Override
    public String toString() {
        return "Boot " + id + " met naam " + naam;
    }

    // getters en setters

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        final int NUL = 0;
        final int DEFAULT_LENGTE = 5;

        if (lengte < NUL) {
            this.lengte = DEFAULT_LENGTE;
            System.out.printf("%d is negatief en daardoor een ongeldige lengte!%nLengte van '%s' is op 5 meter gezet.%n", lengte, naam);
        } else {
            this.lengte = lengte;
        }
    }

}
