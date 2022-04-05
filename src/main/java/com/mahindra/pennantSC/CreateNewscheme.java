package com.mahindra.pennantSC;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateNewscheme extends ReadSchemFromExcel1 {
	@Test(priority=5)
	public void addnewscheme() throws Exception 
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[substring(@id, string-length(@id) - string-length('real') +1) = 'real']/tbody/tr/td[3]/input")).sendKeys(firstColumnCell);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='cssBtnSearch z-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'CDSUB')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'OK')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[contains(text(),'Proceed')]")).click();
		Thread.sleep(4000);
	}

}
