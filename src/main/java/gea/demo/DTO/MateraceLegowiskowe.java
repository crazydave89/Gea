package gea.demo.DTO;

public class MateraceLegowiskowe {
   private String rodzajMateraca;
   private int iloscMB;
   private String rodzajMateraca2;
   private int iloscMB2;

   public MateraceLegowiskowe(String rodzajMateraca, int iloscMB, String rodzajMateraca2, int iloscMB2) {
      this.rodzajMateraca = rodzajMateraca;
      this.iloscMB = iloscMB;
      this.rodzajMateraca2 = rodzajMateraca2;
      this.iloscMB2 = iloscMB2;
   }

   public MateraceLegowiskowe() {
   }

   public String getRodzajMateraca() {
      return rodzajMateraca;
   }

   public void setRodzajMateraca(String rodzajMateraca) {
      this.rodzajMateraca = rodzajMateraca;
   }

   public int getIloscMB() {
      return iloscMB;
   }

   public void setIloscMB(int iloscMB) {
      this.iloscMB = iloscMB;
   }

   public String getRodzajMateraca2() {
      return rodzajMateraca2;
   }

   public void setRodzajMateraca2(String rodzajMateraca2) {
      this.rodzajMateraca2 = rodzajMateraca2;
   }

   public int getIloscMB2() {
      return iloscMB2;
   }

   public void setIloscMB2(int iloscMB2) {
      this.iloscMB2 = iloscMB2;
   }
}
