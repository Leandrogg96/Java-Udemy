package enumeration;

public enum Continent {
    AFRICA(53),
    AMERICA(34),
    ASIA(44),
    EUROPE(46),
    OCEANIA(14);

    private final int numberCountries;

    Continent(int countries) {
        this.numberCountries = countries;
    }

    public int getNumberCountries() {
        return this.numberCountries;
    }
}
