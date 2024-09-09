package com.gentech.excel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CountryName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readAndWriteCountriesAndCapitals();
	}
	private static void readAndWriteCountriesAndCapitals() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        Workbook workbook = null;

        try {
            fis = new FileInputStream("C:\\Example\\CountryAndCapital.xlsx");
            workbook = new XSSFWorkbook(fis);
            Sheet firstSheet = workbook.getSheetAt(0);
            Sheet secondSheet = workbook.getSheet("Sheet2");
            if (secondSheet == null) {
                secondSheet = workbook.createSheet("Sheet2");
            }
            
            Row countryRow = secondSheet.createRow(3);
            Row capitalRow = secondSheet.createRow(4); 
            
            int rowCount = firstSheet.getLastRowNum();
            for (int i = 0; i <= rowCount && i < 20; i++) {
                Row sourceRow = firstSheet.getRow(i);
                if (sourceRow != null) {
                    Cell countryCell = sourceRow.getCell(0);
                    Cell capitalCell = sourceRow.getCell(1);
                    if (countryCell != null && capitalCell != null) {
                        String country = countryCell.getStringCellValue();
                        String capital = capitalCell.getStringCellValue();
                        
                        Cell countryTargetCell = countryRow.createCell(i);
                        countryTargetCell.setCellValue(country);
                        
                        Cell capitalTargetCell = capitalRow.createCell(i);
                        capitalTargetCell.setCellValue(capital);
                    }
                }
            }
            
            fos = new FileOutputStream("C:\\Example\\CountryAndCapital1.xlsx");
            workbook.write(fos);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
                if (workbook != null) {
                    workbook.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
