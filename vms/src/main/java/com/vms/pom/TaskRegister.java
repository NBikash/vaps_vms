package com.vms.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskRegister {
	@FindBy(xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[1]")
	private WebElement dept;
	@FindBy(xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[2]")
	private WebElement project;
	@FindBy(xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[3]")
	private WebElement client;
	@FindBy(xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[4]")
	private WebElement category;
	@FindBy(xpath="//div[text()='Software']")
	private WebElement softwareopsfordept;
	@FindBy(xpath="//div[text()='VAPS - GENERAL']")
	private WebElement generalopsforproject;
	@FindBy(xpath="//div[text()='General']")
	private WebElement generalopsforcategory;
	@FindBy(xpath="//div[text()='HO']")
	private WebElement hoforclent;
	@FindBy(name="taskname")
	private WebElement tasktitle;
	@FindBy(xpath="(//textarea[@placeholder='Description .... '])[1]")
	private WebElement description;
	@FindBy(xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[5]")
	private WebElement module;
	@FindBy (xpath="//div[text()='All']")
	private WebElement allopsformodule;
	@FindBy(xpath="//select[@name='priority']")
	private WebElement prioritydd;
	@FindBy(id="save-btn")
	private WebElement createbtn;
	public TaskRegister(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void getdept() {
		dept.click();
	}
	public void getsoftwareopsfordept() {
		softwareopsfordept.click();
	}
	public void getproject() {
		project.click();
	}
	public void getgeneralopsforproject() {
		generalopsforproject.click();
	}
	public void getclient() {
		client.click();
	}
	public void gethoforclent() {
		hoforclent.click();
	}
	public void getcategory() {
		category.click();
	}
	public void getgeneralopsforcategory() {
		generalopsforcategory.click();
	}
	public void gettasktitle() {
		tasktitle.sendKeys("automation testing");
	}
	public void getdescription() {
		description.sendKeys("automation testing description");
	}
	public void getmodule() {
		module.click();
	}
	public void getallopsformodule() {
		allopsformodule.click();
	}
	public void setcreatebtn() {
		createbtn.click();
	}

}
