package gea.demo.DTO;

public class StolPaszowyRuraKarkowa {
    private int dlugoscObory;
    private int iloscMurkowPaszowych;
    private String slupyKonstrukcyjneWstole;
    private int ilośćRzędówSłupowKonstrukcyjnych;
    private String slupki2_5;
    private int rozstawSlupkow2_5;
    private int iloscPrzejscBezpieczenstwa;
    private String rodzajDystansu;

    public StolPaszowyRuraKarkowa(int dlugoscObory, int iloscMurkowPaszowych, String slupyKonstrukcyjneWstole, int ilośćRzędówSłupowKonstrukcyjnych, String slupki2_5, int rozstawSlupkow2_5, int iloscPrzejscBezpieczenstwa, String rodzajDystansu) {
        this.dlugoscObory = dlugoscObory;
        this.iloscMurkowPaszowych = iloscMurkowPaszowych;
        this.slupyKonstrukcyjneWstole = slupyKonstrukcyjneWstole;
        this.ilośćRzędówSłupowKonstrukcyjnych = ilośćRzędówSłupowKonstrukcyjnych;
        this.slupki2_5 = slupki2_5;
        this.rozstawSlupkow2_5 = rozstawSlupkow2_5;
        this.iloscPrzejscBezpieczenstwa = iloscPrzejscBezpieczenstwa;
        this.rodzajDystansu = rodzajDystansu;
    }

    public StolPaszowyRuraKarkowa() {
    }

    public int getDlugoscObory() {
        return dlugoscObory;
    }

    public void setDlugoscObory(int dlugoscObory) {
        this.dlugoscObory = dlugoscObory;
    }

    public int getIloscMurkowPaszowych() {
        return iloscMurkowPaszowych;
    }

    public void setIloscMurkowPaszowych(int iloscMurkowPaszowych) {
        this.iloscMurkowPaszowych = iloscMurkowPaszowych;
    }

    public String getSlupyKonstrukcyjneWstole() {
        return slupyKonstrukcyjneWstole;
    }

    public void setSlupyKonstrukcyjneWstole(String slupyKonstrukcyjneWstole) {
        this.slupyKonstrukcyjneWstole = slupyKonstrukcyjneWstole;
    }

    public int getIlośćRzędówSłupowKonstrukcyjnych() {
        return ilośćRzędówSłupowKonstrukcyjnych;
    }

    public void setIlośćRzędówSłupowKonstrukcyjnych(int ilośćRzędówSłupowKonstrukcyjnych) {
        this.ilośćRzędówSłupowKonstrukcyjnych = ilośćRzędówSłupowKonstrukcyjnych;
    }

    public String getSlupki2_5() {
        return slupki2_5;
    }

    public void setSlupki2_5(String slupki2_5) {
        this.slupki2_5 = slupki2_5;
    }

    public int getRozstawSlupkow2_5() {
        return rozstawSlupkow2_5;
    }

    public void setRozstawSlupkow2_5(int rozstawSlupkow2_5) {
        this.rozstawSlupkow2_5 = rozstawSlupkow2_5;
    }

    public int getIloscPrzejscBezpieczenstwa() {
        return iloscPrzejscBezpieczenstwa;
    }

    public void setIloscPrzejscBezpieczenstwa(int iloscPrzejscBezpieczenstwa) {
        this.iloscPrzejscBezpieczenstwa = iloscPrzejscBezpieczenstwa;
    }

    public String getRodzajDystansu() {
        return rodzajDystansu;
    }

    public void setRodzajDystansu(String rodzajDystansu) {
        this.rodzajDystansu = rodzajDystansu;
    }
}
