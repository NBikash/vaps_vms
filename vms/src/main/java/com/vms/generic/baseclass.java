package com.vms.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.vms.pom.homepage;
import com.vms.pom.loginpage;

//import com.actitime.pom.HomePage;
//import com.actitime.pom.LoginPage;


public class baseclass {
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws IOException
	{
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		filelib f=new filelib();
		String url=f.readproperty("url");
		driver.get(url);
		
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		Reporter.log("login",true);
		filelib f=new filelib();
		String un = f.readproperty("un");
		String pw=f.readproperty("pwd");
		loginpage l=new loginpage(driver);
		l.setlogin(un, pw);
		Thread.sleep(5000);
		
	
		
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Reporter.log("logout",true);
		homepage h=new homepage(driver);
		h.getlogout();
				
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
		driver.close();
	}

}



