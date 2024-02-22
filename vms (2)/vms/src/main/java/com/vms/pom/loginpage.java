package com.vms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(id="form2")
	private WebElement untbx;
	@FindBy(id="form4")
	private WebElement pwdtbx;
	@FindBy(xpath="//button[@ng-if='!twofactor']")
	private WebElement signinbtn;
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setlogin(String un,String pwd)
	{
		untbx.sendKeys(un);
		pwdtbx.sendKeys(pwd);
		signinbtn.click();
	}

}
