package gea.demo.base;

public class GeaProduct {
    private String sekcja;
    private String podsekcja;
    private String numer;
    private double ilosc;
    private String nazwa;
    private double cena;
    private String obrazek;


    // Konstruktory, gettery, settery


    public GeaProduct(String sekcja, String podsekcja, String numer, double ilosc, String nazwa, double cena, String obrazek) {
        this.sekcja = sekcja;
        this.podsekcja = podsekcja;
        this.numer = numer;
        this.ilosc = ilosc;
        this.nazwa = nazwa;
        this.cena = cena;
        this.obrazek = obrazek;
    }

    public GeaProduct() {
    }

    @Override
    public String toString() {
        return "Config{" +
                "sekcja='" + sekcja + '\'' +
                ", podsekcja='" + podsekcja + '\'' +
                ", numer='" + numer + '\'' +
                ", ilosc=" + ilosc +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", obrazek='" + obrazek + '\'' +
                '}';
    }

    public void setSekcja(String sekcja) {
        this.sekcja = sekcja;
    }

    public void setPodsekcja(String podsekcja) {
        this.podsekcja = podsekcja;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setObrazek(String obrazek) {
        this.obrazek = obrazek;
    }

    public String getSekcja() {
        return sekcja;
    }

    public String getPodsekcja() {
        return podsekcja;
    }

    public String getNumer() {
        return numer;
    }

    public double getIlosc() {
        return ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public String getObrazek() {
        return obrazek;
    }
}
