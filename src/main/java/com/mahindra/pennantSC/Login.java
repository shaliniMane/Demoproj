package com.mahindra.pennantSC;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static WebDriver driver;
	public FileInputStream fis;
	public Properties pro;

	@BeforeSuite
	public void Driverrun() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://10.10.128.97:8080/PFSWeb/loginDialog.zul");
		driver.manage().window().maximize();

		File src = new File(
				"C:\\Users\\100003228\\eclipse-workspace\\PennantSchemeCreation\\Repository\\Object.properties");
		fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
	}

	@Test(priority = 1)
	public void GetTitleTest() {
		String title = driver.getTitle();
		System.out.println("The page title is");
		AssertJUnit.assertEquals(title, "PFF - Login");
	}

	@Test(priority = 2)
	public void VerifyloginTest() throws Exception {

		driver.findElement(By.xpath(pro.getProperty("UserName"))).sendKeys("aaa");
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys("bbb");
		// Explict wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath(pro.getProperty("Loginbtn"))).click();
	}
	
	  @Test(priority = 3) public void VerifySolutionFactory() throws Exception 
	  { 
		  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[contains(text(),'Solution Factory')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[contains(text(),'Loan Setup')]")).click(); 
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[contains(text(),'CD Schemes')]")).click(); 
	  
	
	  }
	  

	 
	
	 @AfterClass public void closeBrowser() { driver.quit(); }
	 
}
