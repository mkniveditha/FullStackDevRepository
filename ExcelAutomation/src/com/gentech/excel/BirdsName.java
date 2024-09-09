package com.gentech.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class BirdsName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteBirdsName();
	}
	private static void WriteBirdsName()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet("BirdsName");
			String[] flowers= {"Rose","Lilly","Lotus","Tulip","Voilet","Poppy","Orchid","Peony","carnation","gardenia",
					"Hydrangea","Snapdragan","Calla","Lilac","Garbera","Peony","Lavender","hibiscus","iris","Jasmine"};
			for(int i=0;i<flowers.length;i++)
			{
				Row row = sh.createRow(i);
				Cell cell=row.createCell(0);
				cell.setCellValue(flowers[i]);
			fout=new FileOutputStream("C:\\Example\\BirdsName.xlsx");
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
