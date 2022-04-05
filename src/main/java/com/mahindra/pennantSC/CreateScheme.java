/*
 * package com.mahindra.pennantSC;
 * 
 * 
 * import org.testng.annotations.AfterClass; import org.testng.annotations.Test;
 * import org.openqa.selenium.By;
 * 
 * public class CreateScheme extends Login{ //CreateSchema cs = new
 * CreateSchema();
 * 
 * @Test(priority = 4) public void Createscheme() throws Exception {
 * Thread.sleep(2000); driver.findElement(By.xpath(
 * "/html/body/div[1]/div/div/div/div[3]/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/div[3]/table/tbody[1]/tr[1]/td[3]/div/table/tbody/tr/td/table/tbody/tr/td[1]/input"
 * )).sendKeys("10000008"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[contains (text(),'Filter')]")).click();
 * Thread.sleep(2000); String str= "10000008"; String
 * str1=driver.findElement(By.xpath("//*[contains(text(),'10000008')]")).getText
 * (); System.out.println(str1+ "OK" + str); if(str.equalsIgnoreCase(str1)) {
 * driver.findElement(By.xpath("//*[contains(text(),'Refresh')]")).click(); }
 * else { System.out.println("scheme not already present"); }
 * 
 * 
 * //cs.Driverrun(); //driver.findElement(By.xpath("")) }
 * 
 * @AfterClass public void closeBrowser() { driver.quit(); }
 * 
 * 
 * }
 */