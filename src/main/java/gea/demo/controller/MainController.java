package gea.demo.controller;

import gea.demo.DTO.*;
import gea.demo.base.GeaProduct;
import gea.demo.base.ExcelReader;
import gea.demo.base.ProduktDoWyceny;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@Controller
public class MainController {

    ExcelReader excelReader = new ExcelReader();
    //List<GeaProduct> geaProductList = excelReader.wczytajZExcela("src\\main\\resources\\static\\lista.xlsx");
    List<GeaProduct> geaProductList = excelReader.wczytajZExcela("C:\\GeaCalculator\\lista.xlsx");


    List<List<ProduktDoWyceny>> productlistLists = new ArrayList<>();

    @GetMapping("/gea")
    public String showStronaGlowna(Model model){
        return "stronaGlowna";
    }
    @GetMapping("/konfigurator")
    public String showKonfigurator(Model model){
        return "konfigurator";
    }
    @GetMapping("/kontakt")
    public String showKontakt(Model model){
        return "kontakt";
    }
    @GetMapping("/podsumowanie")
    public String showPodsumowanie(Model model) {
        model.addAttribute("productlistLists", productlistLists);
        return "podsumowanie";
    }
    @GetMapping("/legowiska")
    public String showLegowiska(Model model){
        model.addAttribute("wygrodzenia2Doptima", new Wygrodzenia2Doptima());
        model.addAttribute("materaceLegowiskowe", new MateraceLegowiskowe());
        return "legowiska";
    }
    @PostMapping("/submitWygrodzenia2Doptima")
    public String submitWygrodzenia2Doptima(@ModelAttribute("wygrodzenia2Doptima") Wygrodzenia2Doptima wygrodzenia2Doptima, BindingResult bindingResult) {
        // Odczytaj dane z obiektu FormData
        if (bindingResult.hasErrors()){
            return "stronaGlowna";
        }
        else {
            String typ_pałąka = wygrodzenia2Doptima.getTyp_palaka();
            int liczba_legowisk = wygrodzenia2Doptima.getLiczba_legowisk();
            int ilość_rzędów = wygrodzenia2Doptima.getIlość_rzędów();
            int szerokość_legowiska = wygrodzenia2Doptima.getSzerokość_legowiska();
            int szerokość_skrajnego_legowiska = wygrodzenia2Doptima.getSzerokość_skrajnego_legowiska();
            String rodzaj_rury_karkowej = wygrodzenia2Doptima.getRodzaj_rury_karkowej();
            int ilość_rzędów_z_nieparzystą_liczbą_legowisk = wygrodzenia2Doptima.getIlość_rzędów_z_nieparzystą_liczbą_legowisk();

            //TODO logika

            List<ProduktDoWyceny> produktDoWycenyList = new ArrayList<>();
            List<ProduktDoWyceny> produktDoWycenyList2 = new ArrayList<>();
            GeaProduct geaProduct3 = geaProductList.get(6);
            GeaProduct geaProduct4 = geaProductList.get(7);
            GeaProduct geaProduct5 = geaProductList.get(8);
            GeaProduct geaProduct = geaProductList.get(4);
            GeaProduct geaProduct2 = geaProductList.get(2);
            geaProduct.setIlosc(2);
            geaProduct2.setIlosc(5);
            ProduktDoWyceny produktDoWyceny = getReadyProduktDoWyceny(geaProduct);
            ProduktDoWyceny produktDoWyceny3 = getReadyProduktDoWyceny(geaProduct3);
            ProduktDoWyceny produktDoWyceny4 = getReadyProduktDoWyceny(geaProduct4);
            ProduktDoWyceny produktDoWyceny5 = getReadyProduktDoWyceny(geaProduct5);
            ProduktDoWyceny produktDoWyceny2 = getReadyProduktDoWyceny(geaProduct2);
            produktDoWycenyList2.add(produktDoWyceny3);
            produktDoWycenyList2.add(produktDoWyceny4);
            produktDoWycenyList2.add(produktDoWyceny5);
            produktDoWycenyList.add(produktDoWyceny);
            produktDoWycenyList.add(produktDoWyceny2);
            productlistLists.add(produktDoWycenyList);
            productlistLists.add(produktDoWycenyList2);
        }
        return "redirect:/podsumowanie"; // Przekieruj użytkownika do strony po pomyślnym przesłaniu formularza

    }

    @PostMapping("/submitMateraceLegowiskowe")
    public String submitMateraceLegowiskowe(@ModelAttribute("materaceLegowiskowe") MateraceLegowiskowe materaceLegowiskowe, BindingResult bindingResult) {
        // Odczytaj dane z obiektu FormData
        if (bindingResult.hasErrors()) {
            return "stronaGlowna";
        } else {
            String rodzajMateraca = materaceLegowiskowe.getRodzajMateraca();
            int iloscMB = materaceLegowiskowe.getIloscMB();
            String rodzajMateraca2 = materaceLegowiskowe.getRodzajMateraca2();
            int iloscMB2 = materaceLegowiskowe.getIloscMB2();

            //TODO logika

            return "redirect:/podsumowanie"; // Przekieruj użytkownika do strony po pomyślnym przesłaniu formularza
        }
    }


            @GetMapping("/stolyIpoidla")
    public String showStolyIpoidla(Model model){
        model.addAttribute("stolPaszowyRuraKarkowa", new StolPaszowyRuraKarkowa());
        model.addAttribute("stolPaszowySwistLock", new StolPaszowySwistLock());
        model.addAttribute("stolPaszowyDrabinaDiagonalna", new StolPaszowyDrabinaDiagonalna());
        model.addAttribute("poidla", new Poidla());
        return "stolyIpoidla";
    }
    @PostMapping("/submitStolPaszowyRuraKarkowa")
    public String submitStolPaszowyRuraKarkowa(@ModelAttribute("stolPaszowyRuraKarkowa") StolPaszowyRuraKarkowa stolPaszowyRuraKarkowa, BindingResult bindingResult) {
        // Odczytaj dane z obiektu FormData
        if (bindingResult.hasErrors()) {
            return "stronaGlowna";
        } else {
            int dlugoscObory = stolPaszowyRuraKarkowa.getDlugoscObory();
            int iloscMurkowPaszowych = stolPaszowyRuraKarkowa.getIloscMurkowPaszowych();
            String slupyKonstrukcyjneWstole = stolPaszowyRuraKarkowa.getSlupyKonstrukcyjneWstole();
            int ilośćRzędówSłupowKonstrukcyjnych = stolPaszowyRuraKarkowa.getIlośćRzędówSłupowKonstrukcyjnych();
            String slupki2_5 = stolPaszowyRuraKarkowa.getSlupki2_5();
            int rozstawSlupkow2_5 = stolPaszowyRuraKarkowa.getRozstawSlupkow2_5();
            int iloscPrzejscBezpieczenstwa = stolPaszowyRuraKarkowa.getIloscPrzejscBezpieczenstwa();
            String rodzajDystansu = stolPaszowyRuraKarkowa.getRodzajDystansu();

            //TODO logika

            return "redirect:/podsumowanie"; // Przekieruj użytkownika do strony po pomyślnym przesłaniu formularza
        }
    }

    @PostMapping("/submitStolPaszowySwistLock")
    public String submitStolPaszowySwistLock(@ModelAttribute("stolPaszowySwistLock") StolPaszowySwistLock stolPaszowySwistLock, BindingResult bindingResult) {
        // Odczytaj dane z obiektu FormData
        if (bindingResult.hasErrors()) {
            return "stronaGlowna";
        } else {
            String rodzajDrabinyTL = stolPaszowySwistLock.getRodzajDrabinyTL();
            int iloscDrabinTL = stolPaszowySwistLock.getIloscDrabinTL();
            String rodzajUchwytuMontazowego = stolPaszowySwistLock.getRodzajUchwytuMontazowego();
            int iloscUchwytuMontazowego = stolPaszowySwistLock.getIloscUchwytuMontazowego();
            int iloscSlupkow2_5 = stolPaszowySwistLock.getIloscSlupkow2_5();
            int iloscPrzejscBezpieczenstwa = stolPaszowySwistLock.getIloscPrzejscBezpieczenstwa();
            int iloscZestawKoncowych = stolPaszowySwistLock.getIloscZestawKoncowych();
            int iloscZestawowBramowych = stolPaszowySwistLock.getIloscZestawowBramowych();
            int iloscDzwigniObslugowych = stolPaszowySwistLock.getIloscDzwigniObslugowych();

            //TODO logika

            return "redirect:/podsumowanie"; // Przekieruj użytkownika do strony po pomyślnym przesłaniu formularza
        }
    }

    @PostMapping("/submitStolPaszowyDrabinaDiagonalna")
    public String submitStolPaszowyDrabinaDiagonalna(@ModelAttribute("stolPaszowyDrabinaDiagonalna") StolPaszowyDrabinaDiagonalna stolPaszowyDrabinaDiagonalna, BindingResult bindingResult) {
        // Odczytaj dane z obiektu FormData
        if (bindingResult.hasErrors()) {
            return "stronaGlowna";
        } else {
            String rodzajDrabinyDiagonalnej = stolPaszowyDrabinaDiagonalna.getRodzajDrabinyDiagonalnej();
            int iloscDrabinDiagonalnych = stolPaszowyDrabinaDiagonalna.getIloscDrabinDiagonalnych();
            String rodzajUchwytuMontazowego = stolPaszowyDrabinaDiagonalna.getRodzajUchwytuMontazowego();
            int iloscUchwytuMontazowego = stolPaszowyDrabinaDiagonalna.getIloscUchwytuMontazowego();
            int iloscSlupkow2_5 = stolPaszowyDrabinaDiagonalna.getIloscSlupkow2_5();
            int iloscPrzejscBezpieczenstwa = stolPaszowyDrabinaDiagonalna.getIloscPrzejscBezpieczenstwa();
            int iloscZestawKoncowych = stolPaszowyDrabinaDiagonalna.getIloscZestawKoncowych();
            int iloscZestawowBramowych = stolPaszowyDrabinaDiagonalna.getIloscZestawowBramowych();

            //TODO logika

            return "redirect:/podsumowanie"; // Przekieruj użytkownika do strony po pomyślnym przesłaniu formularza
        }
    }

    @PostMapping("/submitPoidla")
    public String submitPoidla(@ModelAttribute("poidla") Poidla poidla, BindingResult bindingResult) {
        // Odczytaj dane z obiektu FormData
        if (bindingResult.hasErrors()) {
            return "stronaGlowna";
        } else {
            String rodzajPoidel = poidla.getRodzajPoidel();
            int iloscPoidel = poidla.getIloscPoidel();
            String rodzajUchwytuMontazowego = poidla.getRodzajUchwytuMontazowego();
            int iloscUchwytuMontazowego = poidla.getIloscUchwytuMontazowego();
            int iloscSlupkow2_5 = poidla.getIloscSlupkow2_5();
            int iloscPrzejscBezpieczenstwa = poidla.getIloscPrzejscBezpieczenstwa();
            int iloscZestawKoncowych = poidla.getIloscZestawKoncowych();
            int iloscZestawowBramowych = poidla.getIloscZestawowBramowych();

            //TODO logika

            return "redirect:/podsumowanie"; // Przekieruj użytkownika do strony po pomyślnym przesłaniu formularza
        }
    }

    @GetMapping("/wygrodzeniaIbramki")
    public String showWygrodzeniaIbramki(Model model){
        model.addAttribute("bramki3rurowe", new Bramki3rurowe());
        return "wygrodzeniaIbramki";
    }

    @PostMapping("/submitBramki3rurowe")
    public String submitBramki3rurowe(@ModelAttribute("bramki3rurowe") Bramki3rurowe bramki3rurowe, BindingResult bindingResult) {
        // Odczytaj dane z obiektu FormData
        if (bindingResult.hasErrors()) {
            return "stronaGlowna";
        } else {
            String modelBram = bramki3rurowe.getModelBram();
            int iloscBram = bramki3rurowe.getIloscBram();
            String rodzajSlupkow = bramki3rurowe.getRodzajSlupkow();
            int iloscSlupkow = bramki3rurowe.getIloscSlupkow();
            String rodzajZamka = bramki3rurowe.getRodzajZamka();
            int iloscPunktowZamkniecia = bramki3rurowe.getIloscPunktowZamkniecia();
            int iloscPunktowZamknieciaNaStolePasz = bramki3rurowe.getIloscPunktowZamknieciaNaStolePasz();
            int iloscZaczepowSciennychHaczyk = bramki3rurowe.getIloscZaczepowSciennychHaczyk();
            int iloscZestawowLaczacychDropOver = bramki3rurowe.getIloscZestawowLaczacychDropOver();
            int iloscKolWsporczychDoBram = bramki3rurowe.getIloscKolWsporczychDoBram();
            int iloscOdciagowLiniowych = bramki3rurowe.getIloscOdciagowLiniowych();

            //TODO logika

            return "redirect:/podsumowanie"; // Przekieruj użytkownika do strony po pomyślnym przesłaniu formularza
        }
    }

    @PostMapping("/removeList")
    public String removeList(@RequestParam("index") int index) {
        if (index >= 0 && index < productlistLists.size()) {
            productlistLists.remove(index);
        }
        return "redirect:/podsumowanie"; // Przekierowanie na stronę z listą produktów
    }
    public static ProduktDoWyceny getReadyProduktDoWyceny(GeaProduct geaProduct){
        return new ProduktDoWyceny(geaProduct.getSekcja(), geaProduct.getPodsekcja(), geaProduct.getNumer(), geaProduct.getIlosc(), geaProduct.getNazwa(), geaProduct.getCena(), geaProduct.getIlosc()* geaProduct.getCena(), geaProduct.getObrazek() );
    }

}
