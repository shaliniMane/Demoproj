package com.mahindra.pennantSC;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddNewScheme extends CreateNewscheme {
	@Test(priority = 6)
	public void addScheme() throws Exception
	{
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys(schemeName);
			// Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='z-datebox' ]//input[@class='z-datebox-input'][1]"))
					.sendKeys(startDate);
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("enddate===" + endDate);
			driver.findElement(By.xpath("(//input[@type='text'])[16]")).sendKeys(endDate);
			Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("helooo hiiiiiiiiiiii");
			System.out.println("IRR===" + IRR);
			driver.findElement(
					By.xpath("//input[@class='z-decimalbox' and @value='0.00' and @style='text-align:right;width:162px;']"))
					.clear();
			driver.findElement(
					By.xpath("//input[@class='z-decimalbox' and @value='0.00' and @style='text-align:right;width:162px;']"))
					.sendKeys(IRR);
			System.out.println("helooo  iiiii");
			Thread.sleep(4000);
			// Thread.sleep(3000);
			driver.findElement(By.xpath(" (//input[@value='0.00'])[4]")).clear();
			driver.findElement(By.xpath(" (//input[@value='0.00'])[4]")).sendKeys(MAXAmount);
			Thread.sleep(3000);
			driver.findElement(By.xpath(" (//input[@value='0.00'])[3]")).clear();
			driver.findElement(By.xpath(" (//input[@value='0.00'])[3]")).sendKeys(MINAmount);
			// String dateendxpath= links.get(1).toString();
			// System.out.println("date===>"+dateendxpath);
			// String [] myValue1 = dateendxpath.split("->");
			// System.out.println("---->"+myValue1[1]);
			driver.findElement(By.xpath("(//input[@value='0.00'])[8]")).clear();
			driver.findElement(By.xpath("(//input[@value='0.00'])[8]")).sendKeys(ROI);
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@value='0'])[3]")).clear();
			driver.findElement(By.xpath("(//input[@value='0'])[3]")).sendKeys(Tenor);
			// driver.findElement(By.xpath("//div[@class='z-row-content']/input[@class='z-textbox'
			// and @style='width:150px;']")).sendKeys("AAAAA");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//input[@value='0'])[4]")).clear();
			driver.findElement(By.xpath("(//input[@value='0'])[4]")).sendKeys(AdvEMI);
			driver.findElement(By.xpath("//span[contains(text(),'Subvention On Discount')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//parent::td[@class='z-row-inner']//preceding-sibling::td[@class='z-row-inner']//td//td[3]/span[@class='z-combobox z-combobox-readonly']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Periodicity')]")).click();
			/*
			 * driver.findElement(By.xpath(
			 * "//span[contains(text(),'DBD Fee Type')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//parent::td[@class='z-row-inner']//preceding-sibling::td[@class='z-row-inner']//td//td[2]//span//input"
			 * )) .click();
			 */
			

	}
	@Test(priority = 7)
	public void schemedatatwo() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Active')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//parent::td[@class='z-row-inner']//preceding-sibling::td[@class='z-row-inner']//td//td[3]//span//input")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'DBD Fee Type')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//parent::td[@class='z-row-inner']//preceding-sibling::td[@class='z-row-inner']//td//td[3]//span//input")).click();
		Thread.sleep(4000);
		System.out.println("clicked dbd checkbox");
		driver.findElement(By.xpath("//span[contains(text(),'MBD Fee Type')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//parent::td[@class='z-row-inner']//preceding-sibling::td[@class='z-row-inner']//td//td[3]//span//input")).click();
		System.out.println("Clicked mbd checkbox");
		
		driver.findElement(By.xpath("//*[contains(text(),'DBD Fee Type')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//following-sibling::td[@class='z-row-inner']/div[@class='z-row-content']/table[@class='ellipsis z-hbox']/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td[3]/button[@class='cssBtnSearch z-button']/img[@class='z-button-image']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'/ 5')]/following::li/a[@class='z-paging-button z-paging-next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'/ 5')]/following::li/a[@class='z-paging-button z-paging-next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'/ 5')]/following::li/a[@class='z-paging-button z-paging-next']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[contains(text(),'/ 5')]/following::li/a[@class='z-paging-button z-paging-next']")).click();
		Thread.sleep(4000);
		System.out.println("clicked 4 times");
		driver.findElement(By.xpath("//*[contains(text(),'MBD SAMS 123') and @class='z-listcell-content']/parent::td[@class='z-listcell']/preceding-sibling::td/div[@class='z-listcell-content']")).click();
		System.out.println("clicked samsung type");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'OK')]")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'MBD Fee Type')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//following-sibling::td[@class='z-row-inner']/div[@class='z-row-content']/table[@class='ellipsis z-hbox']/tbody/tr/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr/td[3]/button[@class='cssBtnSearch z-button']/img[@class='z-button-image']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'/ 5')]/following::li/a[@class='z-paging-button z-paging-next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'/ 5')]/following::li/a[@class='z-paging-button z-paging-next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'/ 5')]/following::li/a[@class='z-paging-button z-paging-next']")).click();
		Thread.sleep(2000);
			
		
		driver.findElement(By.xpath("//*[(contains(.,'MMFLMBD')) and not(contains(.,'MMFLMBD1')) and @class='z-listitem z-listbox-odd']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'DBD(%)')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//following-sibling::td[@class='z-row-inner']/div[@class='z-row-content']/table[@class='z-hbox']/tbody/tr/td/table/tbody/tr/td[3]/input[@class='z-decimalbox']"))
				.clear();
		driver.findElement(By.xpath("//*[contains(text(),'DBD(%)')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//following-sibling::td[@class='z-row-inner']/div[@class='z-row-content']/table[@class='z-hbox']/tbody/tr/td/table/tbody/tr/td[3]/input[@class='z-decimalbox']"))
		
				.sendKeys(DBD);
		driver.findElement(By.xpath("//span[contains(text(),'Manufacturer Cash back to the customer')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//following-sibling::td[@class='z-row-inner']/div[@class='z-row-content']/table[@class='z-hbox']/tbody/tr/td/table/tbody/tr/td[3]/input[@class='z-intbox']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Manufacturer Cash back to the customer')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//parent::td[@class='z-row-inner']//preceding-sibling::td[@class='z-row-inner']//td//td[3]/input[@class='z-intbox']")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'DBD(%)')]//parent::div[@class='z-row-content']//parent::td[@class='z-row-inner']//parent::td[@class='z-row-inner']//preceding-sibling::td[@class='z-row-inner']//td//td[3]/input[@class='z-intbox']")).sendKeys("1");
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Save') and @class='z-toolbarbutton z-button']")).click();
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//*[contains(text(),'CDSUB')]"));
		act.doubleClick(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='radio' and @value='Submitted']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Save') and @class='z-toolbarbutton z-button']")).click();
		Thread.sleep(8000);
	}

}
