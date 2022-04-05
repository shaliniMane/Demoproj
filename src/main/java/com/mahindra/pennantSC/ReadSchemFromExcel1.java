package com.mahindra.pennantSC;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ReadSchemFromExcel1 extends Login {
	 String firstColumnCell="";
	 public String str1="";
	String schemeName="";
	 String blk ="";
	 String Tenor="";
	 String MINAmount="";
	 String MAXAmount="";
	 String DBD="";
	 String AdvEMI="";
	 String startDate="";
	 String endDate ="";
	 public String IRR="";
	 String ROI="";
	@Test(priority = 4)
	public void readExcel() throws Exception {

		// Create an object of File class to open xlsx file
		File file = new File("D:\\TestDataScheme8080\\SchemesCreationOn8080-21022022.xlsx");

		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("8080");
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		DataFormatter formatter = new DataFormatter();
		// Create a loop over all the rows of excel file to read it
		System.out.println(rowCount);
		for (int i = 0; i < rowCount + 1; i++) {

			Row row = sheet.getRow(i);

			// Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum(); j++) {

				// Print Excel data in console

				System.out.print(formatter.formatCellValue(row.getCell(j)) + "                           || ");

			}

			System.out.println();
			
		}
		System.out.println("fetching records");
		
		for (int i = 1; i < rowCount; i++) 
		{ 
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
			//driver.findElement(By.xpath("//*[contains(text(),'Refresh')]")).click();
				//System.out.println("Rows=="+rowCount);
				  XSSFRow row = (XSSFRow) sheet.getRow(i);
				  firstColumnCell =formatter.formatCellValue(row.getCell(1)); 
				  schemeName=formatter.formatCellValue(row.getCell(2));
				  startDate= formatter.formatCellValue(row.getCell(8));  
				  Tenor=formatter.formatCellValue(row.getCell(3));
				  MAXAmount=formatter.formatCellValue(row.getCell(10));
				  MINAmount=formatter.formatCellValue(row.getCell(11));
				  endDate= formatter.formatCellValue(row.getCell(9));
				  IRR=formatter.formatCellValue(row.getCell(4));
				  ROI=formatter.formatCellValue(row.getCell(5));
				  AdvEMI=formatter.formatCellValue(row.getCell(6));
				  DBD=formatter.formatCellValue(row.getCell(7));
				  System.out.println(firstColumnCell);
				  System.out.println(startDate.toString());
				  System.out.println(endDate);
				  Thread.sleep(3000);
				   driver.findElement(By.xpath("//input[@type='text' and @class='z-textbox' and @maxlength='8']")).sendKeys(firstColumnCell);
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[contains (text(),'Filter')]")).click();
					Thread.sleep(4000);
					 blk=driver.findElement(By.xpath("//div[@class='z-listbox-emptybody-content']")).getText();
					System.out.println("BLANK==="+blk);
					Thread.sleep(3000);
					if(blk.equalsIgnoreCase("No Records Available"))
						 testingdemo();
					else
					{
						System.out.println("I value=="+i);
	                str1=driver.findElement(By.xpath("//div[@class='z-listcell-content']/following::td[@class='z-listcell']/div")).getText();
											   
	              //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	                Thread.sleep(4000);
		   			driver.findElement(By.xpath("//*[contains(text(),'Refresh')]")).click();
	               System.out.println("String1===="+str1);
	            
				   String checkvalue=	driver.findElement(By.xpath("//div[@class='z-listbox-body']")).getText();
				   //System.out.println("Checkvalue listbox="+checkvalue);
				 // testingdemo();
				 System.out.println("logs for end for loop");
					}
				 }
			
		}
	public void testingdemo() throws Exception 
	{
		System.out.println("first col="+firstColumnCell+"Str1="+str1);
		//if(firstColumnCell.equalsIgnoreCase(str1))
			if(blk.equalsIgnoreCase("No Records Available"))
		{
				System.out.println("scheme not already present");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				boolean eleSelected= driver.findElement(By.xpath("//*[contains(text(),'New' and @class='z-toolbarbutton z-button')]")).isEnabled();
				System.out.println("ele Selected"+eleSelected);
				if(eleSelected)
					//driver.findElement(By.xpath("//*[contains(text(),'New' and @class='z-toolbarbutton z-button')]")).click();
					Thread.sleep(4000);
					driver.findElement(By.xpath("//button[contains(text(), 'New')]")).click();
					System.out.println("clicking new");
					Thread.sleep(4000);
				//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[3]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/table/tbody/tr/td/table/tbody/tr/td[5]/div/div[1]/button[1]")).click();
					
		}
		else
		{
			
				
				//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
				driver.findElement(By.xpath("//*[contains(text(),'Refresh')]")).click();
		}

	}
	
}
