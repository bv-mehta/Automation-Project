package com.cygent.utils;

import java.io.IOException;

public class PRA {


	public static void data()
	{
		try {
			ReadWriteExcel.readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String username = null;
		String Password = null;
		System.out.println(ReadWriteExcel.Sheet.getLastRowNum());
		System.out.println(ReadWriteExcel.Sheet.getFirstRowNum());

		int rowcount = ReadWriteExcel.Sheet.getLastRowNum() - ReadWriteExcel.Sheet.getFirstRowNum();
		System.out.println(rowcount);
		for (int i = 1; i <=rowcount; i++) 
		{
			int cellcount = ReadWriteExcel.Sheet.getRow(i).getLastCellNum();
			for (int j = 0; j <cellcount; j++) 
			{
				String cellvalue = ReadWriteExcel.Sheet.getRow(i).getCell(j).getStringCellValue();
				if(j == 0)
				{

					
					username = cellvalue;

				}
				if( j == 1)
				{
					
					Password = cellvalue;
				}

			}
			System.out.println("Username----"    + username);
			System.out.println("Password---" + Password);
			
		
		}

	}

	public static void main(String[] args) throws IOException {
		//data();
		ReadWriteExcel.readData();
		ReadWriteExcel.writeData();

	}

}
