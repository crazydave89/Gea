package gea.demo.DTO;

public class Wygrodzenia2Doptima {

    private String typ_palaka;
    private int liczba_legowisk;
    private int ilość_rzędów;
    private int szerokość_legowiska;
    private int szerokość_skrajnego_legowiska;
    private String rodzaj_rury_karkowej;
    private int ilość_rzędów_z_nieparzystą_liczbą_legowisk;

    public Wygrodzenia2Doptima(String typ_pałąka, int liczba_legowisk, int ilość_rzędów, int szerokość_legowiska, int szerokość_skrajnego_legowiska, String rodzaj_rury_karkowej, int ilość_rzędów_z_nieparzystą_liczbą_legowisk) {
        this.typ_palaka = typ_pałąka;
        this.liczba_legowisk = liczba_legowisk;
        this.ilość_rzędów = ilość_rzędów;
        this.szerokość_legowiska = szerokość_legowiska;
        this.szerokość_skrajnego_legowiska = szerokość_skrajnego_legowiska;
        this.rodzaj_rury_karkowej = rodzaj_rury_karkowej;
        this.ilość_rzędów_z_nieparzystą_liczbą_legowisk = ilość_rzędów_z_nieparzystą_liczbą_legowisk;
    }

    public Wygrodzenia2Doptima() {
    }

    public String getTyp_palaka() {
        return typ_palaka;
    }

    public void setTyp_palaka(String typ_palaka) {
        this.typ_palaka = typ_palaka;
    }

    public int getLiczba_legowisk() {
        return liczba_legowisk;
    }

    public void setLiczba_legowisk(int liczba_legowisk) {
        this.liczba_legowisk = liczba_legowisk;
    }

    public int getIlość_rzędów() {
        return ilość_rzędów;
    }

    public void setIlość_rzędów(int ilość_rzędów) {
        this.ilość_rzędów = ilość_rzędów;
    }

    public int getSzerokość_legowiska() {
        return szerokość_legowiska;
    }

    public void setSzerokość_legowiska(int szerokość_legowiska) {
        this.szerokość_legowiska = szerokość_legowiska;
    }

    public int getSzerokość_skrajnego_legowiska() {
        return szerokość_skrajnego_legowiska;
    }

    public void setSzerokość_skrajnego_legowiska(int szerokość_skrajnego_legowiska) {
        this.szerokość_skrajnego_legowiska = szerokość_skrajnego_legowiska;
    }

    public String getRodzaj_rury_karkowej() {
        return rodzaj_rury_karkowej;
    }

    public void setRodzaj_rury_karkowej(String rodzaj_rury_karkowej) {
        this.rodzaj_rury_karkowej = rodzaj_rury_karkowej;
    }

    public int getIlość_rzędów_z_nieparzystą_liczbą_legowisk() {
        return ilość_rzędów_z_nieparzystą_liczbą_legowisk;
    }

    public void setIlość_rzędów_z_nieparzystą_liczbą_legowisk(int ilość_rzędów_z_nieparzystą_liczbą_legowisk) {
        this.ilość_rzędów_z_nieparzystą_liczbą_legowisk = ilość_rzędów_z_nieparzystą_liczbą_legowisk;
    }
}
