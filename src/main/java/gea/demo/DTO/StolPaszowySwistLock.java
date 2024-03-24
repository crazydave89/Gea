package gea.demo.DTO;

public class StolPaszowySwistLock {
    private String rodzajDrabinyTL;
    private int iloscDrabinTL;
    private String rodzajUchwytuMontazowego;
    private int iloscUchwytuMontazowego;
    private int iloscSlupkow2_5;
    private int iloscPrzejscBezpieczenstwa;
    private int iloscZestawKoncowych;
    private int iloscZestawowBramowych;
    private int iloscDzwigniObslugowych;

    public StolPaszowySwistLock(String rodzajDrabinyTL, int iloscDrabinTL, String rodzajUchwytuMontazowego, int iloscUchwytuMontazowego, int iloscSlupkow2_5, int iloscPrzejscBezpieczenstwa, int iloscZestawKoncowych, int iloscZestawowBramowych, int iloscDzwigniObslugowych) {
        this.rodzajDrabinyTL = rodzajDrabinyTL;
        this.iloscDrabinTL = iloscDrabinTL;
        this.rodzajUchwytuMontazowego = rodzajUchwytuMontazowego;
        this.iloscUchwytuMontazowego = iloscUchwytuMontazowego;
        this.iloscSlupkow2_5 = iloscSlupkow2_5;
        this.iloscPrzejscBezpieczenstwa = iloscPrzejscBezpieczenstwa;
        this.iloscZestawKoncowych = iloscZestawKoncowych;
        this.iloscZestawowBramowych = iloscZestawowBramowych;
        this.iloscDzwigniObslugowych = iloscDzwigniObslugowych;
    }

    public StolPaszowySwistLock() {
    }

    public String getRodzajDrabinyTL() {
        return rodzajDrabinyTL;
    }

    public void setRodzajDrabinyTL(String rodzajDrabinyTL) {
        this.rodzajDrabinyTL = rodzajDrabinyTL;
    }

    public int getIloscDrabinTL() {
        return iloscDrabinTL;
    }

    public void setIloscDrabinTL(int iloscDrabinTL) {
        this.iloscDrabinTL = iloscDrabinTL;
    }

    public String getRodzajUchwytuMontazowego() {
        return rodzajUchwytuMontazowego;
    }

    public void setRodzajUchwytuMontazowego(String rodzajUchwytuMontazowego) {
        this.rodzajUchwytuMontazowego = rodzajUchwytuMontazowego;
    }

    public int getIloscUchwytuMontazowego() {
        return iloscUchwytuMontazowego;
    }

    public void setIloscUchwytuMontazowego(int iloscUchwytuMontazowego) {
        this.iloscUchwytuMontazowego = iloscUchwytuMontazowego;
    }

    public int getIloscSlupkow2_5() {
        return iloscSlupkow2_5;
    }

    public void setIloscSlupkow2_5(int iloscSlupkow2_5) {
        this.iloscSlupkow2_5 = iloscSlupkow2_5;
    }

    public int getIloscPrzejscBezpieczenstwa() {
        return iloscPrzejscBezpieczenstwa;
    }

    public void setIloscPrzejscBezpieczenstwa(int iloscPrzejscBezpieczenstwa) {
        this.iloscPrzejscBezpieczenstwa = iloscPrzejscBezpieczenstwa;
    }

    public int getIloscZestawKoncowych() {
        return iloscZestawKoncowych;
    }

    public void setIloscZestawKoncowych(int iloscZestawKoncowych) {
        this.iloscZestawKoncowych = iloscZestawKoncowych;
    }

    public int getIloscZestawowBramowych() {
        return iloscZestawowBramowych;
    }

    public void setIloscZestawowBramowych(int iloscZestawowBramowych) {
        this.iloscZestawowBramowych = iloscZestawowBramowych;
    }

    public int getIloscDzwigniObslugowych() {
        return iloscDzwigniObslugowych;
    }

    public void setIloscDzwigniObslugowych(int iloscDzwigniObslugowych) {
        this.iloscDzwigniObslugowych = iloscDzwigniObslugowych;
    }
}
