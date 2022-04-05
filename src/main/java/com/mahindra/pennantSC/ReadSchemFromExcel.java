/*
 * package com.mahindra.pennantSC;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.apache.poi.ss.usermodel.Cell; import
 * org.apache.poi.ss.usermodel.DataFormatter; import
 * org.apache.poi.ss.usermodel.Row; import org.apache.poi.ss.usermodel.Sheet;
 * import org.apache.poi.ss.usermodel.Workbook; import
 * org.apache.poi.ss.usermodel.WorkbookFactory; import
 * org.apache.poi.xssf.usermodel.XSSFCell; import
 * org.apache.poi.xssf.usermodel.XSSFRow; import org.openqa.selenium.By; import
 * org.openqa.selenium.JavascriptExecutor; import
 * org.openqa.selenium.NoSuchElementException; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.ui.ExpectedCondition; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait; import
 * org.testng.annotations.Test;
 * 
 * public class ReadSchemFromExcel extends Login {
 * 
 * @Test(priority = 5) public void newscheme() { driver.findElement(By.
 * xpath("//button[@class='z-toolbarbutton z-button' and  text()='New']")).click
 * (); }
 * 
 * @Test(priority = 4) public void readExcel() throws Exception {
 * 
 * // Create an object of File class to open xlsx file File file = new
 * File("D:\\TestDataScheme8080\\SchemesCreationOn8080-21022022.xlsx");
 * 
 * FileInputStream fis = new FileInputStream(file); Workbook workbook =
 * WorkbookFactory.create(fis); Sheet sheet = workbook.getSheet("8080"); int
 * rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum(); DataFormatter
 * formatter = new DataFormatter(); // Create a loop over all the rows of excel
 * file to read it System.out.println(rowCount); for (int i = 0; i < rowCount +
 * 1; i++) {
 * 
 * Row row = sheet.getRow(i);
 * 
 * // Create a loop to print cell values in a row
 * 
 * for (int j = 0; j < row.getLastCellNum(); j++) {
 * 
 * // Print Excel data in console
 * 
 * System.out.print(formatter.formatCellValue(row.getCell(j)) +
 * "                           || ");
 * 
 * }
 * 
 * System.out.println(); } String notfound=""; String str1="";
 * System.out.println("row count ="+rowCount); for (int i = 1; i <=rowCount;
 * i++) { XSSFRow row = (XSSFRow) sheet.getRow(i); String firstColumnCell =
 * formatter.formatCellValue(row.getCell(1)); Thread.sleep(2000);
 * driver.findElement(By.
 * xpath("//input[@type='text' and @class='z-textbox' and @maxlength='8']"))
 * .sendKeys(firstColumnCell); Thread.sleep(2000);
 * //driver.findElement(By.xpath("//button[contains (text(),'Filter')]")).click(
 * ); String
 * size=driver.findElement(By.xpath("//div[@class='z-listbox-body']")).getText()
 * ; //System.out.println("Size=="+size); Thread.sleep(3000); if(size== " ") {
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); str1 =
 * driver.findElement(By.
 * xpath("//div[@class='z-listcell-content' or @xpath='1']/following::td[1]/div[1]"
 * )).getText();
 * driver.findElement(By.xpath("//*[contains(text(),'Refresh')]")).click();
 * notfound=driver.findElement(By.
 * xpath("//*[contains(text(),'No Records Available')]")).getText();
 * //}catch(NoSuchElementException e) {
 * driver.findElement(By.xpath("//*[contains(text(),'Refresh')]")).click();
 * System.out.println("WebDriver couldn’t locate the element");
 * 
 * } else {
 * 
 * } System.out.println("String1  is=" + str1); System.out.println("Fircolcel="
 * + firstColumnCell); //try { notfound=driver.findElement(By.
 * xpath("//*[contains(text(),'No Records Available')]")).getText();
 * System.out.println("NOt found ele="+notfound);
 * //}catch(NoSuchElementException e) //{
 * driver.findElement(By.xpath("//*[contains(text(),'Refresh')]")).click();
 * //System.out.println("WebDriver couldn’t locate the element not scheme");
 * 
 * //} if (firstColumnCell.equalsIgnoreCase(str1)) {
 * System.out.println("Scheme already present"); } else
 * if(notfound.equalsIgnoreCase("No Records Available")) {
 * System.out.println("scheme not already present");
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * //driver.findElement(By.xpath("//*[contains(text(),'New')]")).click();
 * driver.findElement(By.
 * xpath("//*[contains(text(),'New' and @class='z-toolbarbutton z-button')]")).
 * click(); WebDriverWait wait = new WebDriverWait(driver, 10); WebElement
 * element = wait.until( ExpectedConditions.visibilityOfElementLocated(By.
 * xpath("//*[contains(text(),'New' and @class='z-toolbarbutton z-button')]")));
 * driver.findElement(By.
 * id("//*[contains(text(),'New' and @class='z-toolbarbutton z-button')]")).
 * click();
 * 
 * 
 * 
 * JavascriptExecutor executor = (JavascriptExecutor)driver;
 * executor.executeScript("arguments[0].click();", element);
 * 
 * Thread.sleep(4000);
 * 
 * //driver.findElement(By.
 * xpath("//button[@class='z-toolbarbutton z-button' and  text()='New']")).click
 * (); //waitForPageToLoad(20); System.out.println("clicked new button");
 * 
 * driver.findElement(By.xpath("//table/tbody/tr/td[3]/input")).sendKeys(
 * firstColumnCell); driver.manage().timeouts().implicitlyWait(20,
 * TimeUnit.SECONDS); driver.findElement(By.
 * xpath("//table/tbody/tr/td[1]/input[@class='z-textbox' and @maxlength='8']"))
 * .sendKeys("CDSUB");
 * driver.findElement(By.xpath("//*[contains(text(),'Proceed')]")).click();
 * 
 * 
 * //Thread.sleep(3000); //System.out.println(firstColumnCell); } } } public
 * static void waitForPageToLoad(long timeOutInSeconds) {
 * ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
 * public Boolean apply(WebDriver driver) { return ((JavascriptExecutor)
 * driver).executeScript("return document.readyState").equals("complete"); } };
 * try { WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
 * wait.until(expectation); } catch (Throwable error) { error.printStackTrace();
 * } } }
 * 
 * int rowCount = sheet.getPhysicalNumberOfRows(); String firstColumnCell =
 * null; DataFormatter formatter = new DataFormatter();
 * 
 * int firstColumnRowCount = 0; for (int i = 0; i <= rowCount; i++) { try {
 * XSSFRow row = (XSSFRow) sheet.getRow(i); firstColumnCell =
 * formatter.formatCellValue(row.getCell(1)); System.out.print(firstColumnCell
 * +"|| "); }
 * 
 * 
 * catch (NullPointerException nullPointerException) {
 * System.out.println("Cell is null at index: " + i); } System.out.println(); if
 * (firstColumnCell != null) if (firstColumnCell.length() > 0) {
 * firstColumnRowCount = i; } }
 * 
 * 
 * System.out.println(firstColumnRowCount); for (int j = 0; j <=
 * firstColumnRowCount; j++) { XSSFRow row = (XSSFRow) sheet.getRow(j); XSSFCell
 * cell = row.getCell(0); System.out.println(formatter.formatCellValue(cell)); }
 * 
 * // ((FileInputStream) workbook).close();
 * 
 * //Create a row object to retrieve row at index 2 Row row2=sheet.getRow(2);
 * 
 * //Create a cell object to retrieve cell at index 1 Cell cell=row2.getCell(1);
 * 
 * //Get the address in a variable String address=
 * formatter.formatCellValue(cell); //Printing the scheme
 * System.out.println("Scheme is =" + address);
 */