package gea.demo.DTO;

public class BramkiOneWay {
    private String montażBramkiGrzebieniowej;
    private String szerokoscPrzejscia;
    private int iloscBram;
    private int iloscElementowStalychU;
    private int iloscBramekOneWay110NaSciane;
    private int iloscRozsuwanychBramekOW90_155;

    public BramkiOneWay(String montażBramkiGrzebieniowej, String szerokoscPrzejscia, int iloscBram, int iloscElementowStalychU, int iloscBramekOneWay110NaSciane, int iloscRozsuwanychBramekOW90_155) {
        this.montażBramkiGrzebieniowej = montażBramkiGrzebieniowej;
        this.szerokoscPrzejscia = szerokoscPrzejscia;
        this.iloscBram = iloscBram;
        this.iloscElementowStalychU = iloscElementowStalychU;
        this.iloscBramekOneWay110NaSciane = iloscBramekOneWay110NaSciane;
        this.iloscRozsuwanychBramekOW90_155 = iloscRozsuwanychBramekOW90_155;
    }

    public BramkiOneWay() {
    }

    public String getMontażBramkiGrzebieniowej() {
        return montażBramkiGrzebieniowej;
    }

    public void setMontażBramkiGrzebieniowej(String montażBramkiGrzebieniowej) {
        this.montażBramkiGrzebieniowej = montażBramkiGrzebieniowej;
    }

    public String getSzerokoscPrzejscia() {
        return szerokoscPrzejscia;
    }

    public void setSzerokoscPrzejscia(String szerokoscPrzejscia) {
        this.szerokoscPrzejscia = szerokoscPrzejscia;
    }

    public int getIloscBram() {
        return iloscBram;
    }

    public void setIloscBram(int iloscBram) {
        this.iloscBram = iloscBram;
    }

    public int getIloscElementowStalychU() {
        return iloscElementowStalychU;
    }

    public void setIloscElementowStalychU(int iloscElementowStalychU) {
        this.iloscElementowStalychU = iloscElementowStalychU;
    }

    public int getIloscBramekOneWay110NaSciane() {
        return iloscBramekOneWay110NaSciane;
    }

    public void setIloscBramekOneWay110NaSciane(int iloscBramekOneWay110NaSciane) {
        this.iloscBramekOneWay110NaSciane = iloscBramekOneWay110NaSciane;
    }

    public int getIloscRozsuwanychBramekOW90_155() {
        return iloscRozsuwanychBramekOW90_155;
    }

    public void setIloscRozsuwanychBramekOW90_155(int iloscRozsuwanychBramekOW90_155) {
        this.iloscRozsuwanychBramekOW90_155 = iloscRozsuwanychBramekOW90_155;
    }
}
