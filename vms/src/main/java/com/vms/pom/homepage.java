package com.vms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement logoutoption;
	@FindBy(xpath="//button[text()='Log Out']")
	private WebElement logoutbtn;
	@FindBy(xpath="(//a[@ng-click='setModuleName(module.ivrmM_ModuleName);'])[1]")
    private WebElement issuemanager;
	@FindBy(xpath="(//a[contains(@ng-click,'setSubMenuName(moduleCategory.ivrmM_ModuleName,moduleCategory')])[1]")
	private WebElement transactionbtn;
	@FindBy(xpath="(//a[@class='ng-binding'])[2]")
	private WebElement taskregisterbtn;
	
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void getlogout() throws InterruptedException {
		Thread.sleep(5000);
		logoutoption.click();
		Thread.sleep(3000);
		logoutbtn.click();
	}
	public void setissuemanager()
	{
		issuemanager.click();
	}
	public void settransaction()
	{
		transactionbtn.click();
	}
	public void gettaskregister()
	{
		taskregisterbtn.click();
	}
	public WebElement issuemanager()
	{
		return issuemanager;
	}

}
