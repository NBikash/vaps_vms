package com.vms.generic;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class filelib {
	public String readproperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/vms2.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	/*public String readExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Data/createcustomer.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String res = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return res;
	}*/
	public void listboxbyvalue(WebElement address,String value)
	{
		Select s=new Select(address);
		s.selectByValue(value);
		
	}
	/*public void explicitwait(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}*/


}
