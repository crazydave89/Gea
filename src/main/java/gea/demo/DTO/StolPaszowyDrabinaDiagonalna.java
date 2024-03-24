package gea.demo.DTO;

public class StolPaszowyDrabinaDiagonalna {
    private String rodzajDrabinyDiagonalnej;
    private int iloscDrabinDiagonalnych;
    private String rodzajUchwytuMontazowego;
    private int iloscUchwytuMontazowego;
    private int iloscSlupkow2_5;
    private int iloscPrzejscBezpieczenstwa;
    private int iloscZestawKoncowych;
    private int iloscZestawowBramowych;

    public StolPaszowyDrabinaDiagonalna(String rodzajDrabinyDiagonalnej, int iloscDrabinDiagonalnych, String rodzajUchwytuMontazowego, int iloscUchwytuMontazowego, int iloscSlupkow2_5, int iloscPrzejscBezpieczenstwa, int iloscZestawKoncowych, int iloscZestawowBramowych) {
        this.rodzajDrabinyDiagonalnej = rodzajDrabinyDiagonalnej;
        this.iloscDrabinDiagonalnych = iloscDrabinDiagonalnych;
        this.rodzajUchwytuMontazowego = rodzajUchwytuMontazowego;
        this.iloscUchwytuMontazowego = iloscUchwytuMontazowego;
        this.iloscSlupkow2_5 = iloscSlupkow2_5;
        this.iloscPrzejscBezpieczenstwa = iloscPrzejscBezpieczenstwa;
        this.iloscZestawKoncowych = iloscZestawKoncowych;
        this.iloscZestawowBramowych = iloscZestawowBramowych;
    }

    public StolPaszowyDrabinaDiagonalna() {
    }

    public String getRodzajDrabinyDiagonalnej() {
        return rodzajDrabinyDiagonalnej;
    }

    public void setRodzajDrabinyDiagonalnej(String rodzajDrabinyDiagonalnej) {
        this.rodzajDrabinyDiagonalnej = rodzajDrabinyDiagonalnej;
    }

    public int getIloscDrabinDiagonalnych() {
        return iloscDrabinDiagonalnych;
    }

    public void setIloscDrabinDiagonalnych(int iloscDrabinDiagonalnych) {
        this.iloscDrabinDiagonalnych = iloscDrabinDiagonalnych;
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
}
