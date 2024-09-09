package com.gentech.excel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadVeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readAndWriteVegetables();
	}
	 private static void readAndWriteVegetables() {
	        FileInputStream fis = null;
	        FileOutputStream fos = null;
	        Workbook workbook = null;

	        try {
	            fis = new FileInputStream("C:\\Example\\Vegetables.xlsx");
	            workbook = new XSSFWorkbook(fis);
	            Sheet firstSheet = workbook.getSheetAt(0);
	            Sheet secondSheet = workbook.getSheet("Sheet2");
	            if (secondSheet == null) {
	                secondSheet = workbook.createSheet("Sheet2");
	            }

	            int rowCount = firstSheet.getLastRowNum();
	            int rowIndex = 4;
	            for (int i = 0; i <= rowCount && i < 20; i++) {
	                Row sourceRow = firstSheet.getRow(i);
	                if (sourceRow != null) {
	                    Cell sourceCell = sourceRow.getCell(0);
	                    if (sourceCell != null) {
	                        String vegetable = sourceCell.getStringCellValue();
	                        Row targetRow = secondSheet.getRow(rowIndex);
	                        if (targetRow == null) {
	                            targetRow = secondSheet.createRow(rowIndex);
	                        }
	                        Cell targetCell = targetRow.createCell(i);
	                        targetCell.setCellValue(vegetable);
	                    }
	                }
	            }
	            fos = new FileOutputStream("C:\\Example\\Vegetables1.xlsx");
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
