package gea.demo.base;

public class ProduktDoWyceny {
    private String sekcja;
    private String podsekcja;
    private String numer;
    private double ilosc;
    private String nazwa;
    private double cena;
    private double cenaCalkowita;
    private String obrazek;

    public ProduktDoWyceny(String sekcja, String podsekcja, String numer, double ilosc, String nazwa, double cena, double cenaCalkowita, String obrazek) {
        this.sekcja = sekcja;
        this.podsekcja = podsekcja;
        this.numer = numer;
        this.ilosc = ilosc;
        this.nazwa = nazwa;
        this.cena = cena;
        this.cenaCalkowita = cenaCalkowita;
        this.obrazek = obrazek;
    }

    public String getSekcja() {
        return sekcja;
    }

    public void setSekcja(String sekcja) {
        this.sekcja = sekcja;
    }

    public String getPodsekcja() {
        return podsekcja;
    }

    public void setPodsekcja(String podsekcja) {
        this.podsekcja = podsekcja;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public double getIlosc() {
        return ilosc;
    }

    public void setIlosc(double ilosc) {
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getCenaCalkowita() {
        return cenaCalkowita;
    }

    public void setCenaCalkowita(double cenaCalkowita) {
        this.cenaCalkowita = cenaCalkowita;
    }

    public String getObrazek() {
        return obrazek;
    }

    public void setObrazek(String obrazek) {
        this.obrazek = obrazek;
    }
}
