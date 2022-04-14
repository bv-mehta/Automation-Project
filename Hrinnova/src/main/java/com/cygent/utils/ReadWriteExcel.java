package com.cygent.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadWriteExcel 
{

	public static XSSFWorkbook workbookdata;
	public static XSSFSheet Sheet;
	static String XLSXFilePAth ="src\\test\\resources\\Config\\d1.xlsx";
	static String SheetName = "j11";
	public static void readData() throws IOException
	{
		

		FileInputStream fs = new FileInputStream(XLSXFilePAth);
		workbookdata = new XSSFWorkbook(fs);
		Sheet = workbookdata.getSheet(SheetName);
		/*
		 * System.out.println(Sheet.getLastRowNum() );
		 * System.out.println(Sheet.getFirstRowNum());
		 */
		//int rowcount = Sheet.getLastRowNum() - Sheet.getFirstRowNum();
		//System.out.println(rowcount);

		//		for (int i = 1; i <=rowcount; i++) 
		//	{
		//	int cellcount = Sheet.getRow(i).getLastCellNum();
		//System.out.println("Row"+ i+" data is :");

		//			for (int j = 0; j < cellcount; j++) 
		//	{
		//System.out.println(Sheet.getRow(i).getCell(j).getStringCellValue());
		//		}
		//}
	}
	public static void writeData() throws IOException
	{

		FileOutputStream fo = new FileOutputStream(XLSXFilePAth);
		workbookdata.write(fo);
		
	}





}
