package gea.demo.DTO;

public class WygrodzeniaRuroweStale {
    private int iloscMBwygrodzeniaStalego;
    private int iloscRur;
    private String rodzajSlupkow;
    private int iloscSlupkow;
    private int iloscSlupkowNaroznych;
    private int iloscSlupkowSrodkowych;
    private int iloscSlupkowSkrajnych;
    private int iloscZakonczenDoMuru;
    private int iloscLacznikowRury2cale;

    public WygrodzeniaRuroweStale(int iloscMBwygrodzeniaStalego, int iloscRur, String rodzajSlupkow, int iloscSlupkow, int iloscSlupkowNaroznych, int iloscSlupkowSrodkowych, int iloscSlupkowSkrajnych, int iloscZakonczenDoMuru, int iloscLacznikowRury2cale) {
        this.iloscMBwygrodzeniaStalego = iloscMBwygrodzeniaStalego;
        this.iloscRur = iloscRur;
        this.rodzajSlupkow = rodzajSlupkow;
        this.iloscSlupkow = iloscSlupkow;
        this.iloscSlupkowNaroznych = iloscSlupkowNaroznych;
        this.iloscSlupkowSrodkowych = iloscSlupkowSrodkowych;
        this.iloscSlupkowSkrajnych = iloscSlupkowSkrajnych;
        this.iloscZakonczenDoMuru = iloscZakonczenDoMuru;
        this.iloscLacznikowRury2cale = iloscLacznikowRury2cale;
    }

    public WygrodzeniaRuroweStale() {
    }

    public int getIloscMBwygrodzeniaStalego() {
        return iloscMBwygrodzeniaStalego;
    }

    public void setIloscMBwygrodzeniaStalego(int iloscMBwygrodzeniaStalego) {
        this.iloscMBwygrodzeniaStalego = iloscMBwygrodzeniaStalego;
    }

    public int getIloscRur() {
        return iloscRur;
    }

    public void setIloscRur(int iloscRur) {
        this.iloscRur = iloscRur;
    }

    public String getRodzajSlupkow() {
        return rodzajSlupkow;
    }

    public void setRodzajSlupkow(String rodzajSlupkow) {
        this.rodzajSlupkow = rodzajSlupkow;
    }

    public int getIloscSlupkow() {
        return iloscSlupkow;
    }

    public void setIloscSlupkow(int iloscSlupkow) {
        this.iloscSlupkow = iloscSlupkow;
    }

    public int getIloscSlupkowNaroznych() {
        return iloscSlupkowNaroznych;
    }

    public void setIloscSlupkowNaroznych(int iloscSlupkowNaroznych) {
        this.iloscSlupkowNaroznych = iloscSlupkowNaroznych;
    }

    public int getIloscSlupkowSrodkowych() {
        return iloscSlupkowSrodkowych;
    }

    public void setIloscSlupkowSrodkowych(int iloscSlupkowSrodkowych) {
        this.iloscSlupkowSrodkowych = iloscSlupkowSrodkowych;
    }

    public int getIloscSlupkowSkrajnych() {
        return iloscSlupkowSkrajnych;
    }

    public void setIloscSlupkowSkrajnych(int iloscSlupkowSkrajnych) {
        this.iloscSlupkowSkrajnych = iloscSlupkowSkrajnych;
    }

    public int getIloscZakonczenDoMuru() {
        return iloscZakonczenDoMuru;
    }

    public void setIloscZakonczenDoMuru(int iloscZakonczenDoMuru) {
        this.iloscZakonczenDoMuru = iloscZakonczenDoMuru;
    }

    public int getIloscLacznikowRury2cale() {
        return iloscLacznikowRury2cale;
    }

    public void setIloscLacznikowRury2cale(int iloscLacznikowRury2cale) {
        this.iloscLacznikowRury2cale = iloscLacznikowRury2cale;
    }
}
