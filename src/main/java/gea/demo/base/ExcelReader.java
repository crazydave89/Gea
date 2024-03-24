package gea.demo.base;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    public static List<GeaProduct> wczytajZExcela(String filePath) {
        List<GeaProduct> geaProductList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(fis)) {

            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                String sekcja = cellIterator.next().getStringCellValue();
                String podsekcja = cellIterator.next().getStringCellValue();
                String numer = cellIterator.next().getStringCellValue();
                double ilosc = cellIterator.next().getNumericCellValue();
                String nazwa = cellIterator.next().getStringCellValue();
                double cena = cellIterator.next().getNumericCellValue();
                String obrazek = cellIterator.next().getStringCellValue();


                GeaProduct geaProduct = new GeaProduct(sekcja, podsekcja, numer, ilosc, nazwa, cena, obrazek);
                geaProductList.add(geaProduct);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return geaProductList;
    }

}
