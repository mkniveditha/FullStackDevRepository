package com.gentech.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class VegetablesName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteVegatbleName();

	}
	private static void WriteVegatbleName()
	{	FileOutputStream fout=null;
		Workbook wb=new XSSFWorkbook();
		Sheet sh=wb.createSheet("Fruits");
		try
		{

		String vegetable[]= {"Cucumber","Pumpkin","Tomato",
				"Peppers",
				 "Eggplant",
				 "String beans",
				 "Green peas",
				"Corn","Celery",
				"Lettuce",
				"Coriander leaves",
				"Mint",
				"Spring onion",
				"Bok choy",
				"Romaine lettuce",
				"Rapini",
				"Mustard greens",
				"Kale"};
		
		for(int i=0;i<vegetable.length;i++)
		{
			Row row=sh.createRow(i);
			
			Cell cell=row.createCell(4);
			cell.setCellValue(vegetable[i]);
			fout=new FileOutputStream("C:\\Example\\VegetablesName.xlsx");
			wb.write(fout);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
		
		
	}


}
