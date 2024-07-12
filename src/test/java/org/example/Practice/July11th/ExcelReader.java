package org.example.Practice.July11th;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReader {


    public ExcelReader(String file) {
    }

    @Test
    public  void test() throws IOException {

        FileInputStream fls = new FileInputStream("src/test/java/org/example/TestData1.xlsx");

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fls);

        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);

        Iterator<Row> rowIterator = xssfSheet.iterator();

        while (rowIterator.hasNext()) {

            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();
                if(cell.getCellType()== CellType.NUMERIC){
                    System.out.println(cell.getNumericCellValue());
                }
                if(cell.getCellType()== CellType.STRING){
                    System.out.println(cell.getStringCellValue());
                }


            }


        }



    }
}
