package com.vms.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vms.generic.baseclass;
import com.vms.generic.filelib;
import com.vms.pom.TaskRegister;
import com.vms.pom.homepage;

public class TaskCreation extends baseclass{
	@Test
	public void taskRsister() throws InterruptedException {
		//Thread.sleep(5000);
	homepage hm=new homepage(driver);
	filelib f=new filelib();
	//f.explicitwait(driver,hm.issuemanager());
	Reporter.log("task register",true);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//button[text()='Close'])[24]")).click();
	hm.setissuemanager();
	Thread.sleep(3000);
	hm.settransaction();
	Thread.sleep(3000);
	hm.gettaskregister();
	Thread.sleep(3000);
	TaskRegister t=new TaskRegister(driver);
	t.getdept();
	Thread.sleep(2000);
	t.getsoftwareopsfordept();
	Thread.sleep(2000);
	t.getproject();
	Thread.sleep(2000);
	t.getgeneralopsforproject();
	Thread.sleep(2000);
	t.getclient();
	Thread.sleep(2000);
	t.gethoforclent();
	Thread.sleep(2000);
	t.getcategory();
	Thread.sleep(2000);
	t.getgeneralopsforcategory();
	Thread.sleep(2000);
	t.gettasktitle();
	Thread.sleep(2000);
	t.getdescription();
	Thread.sleep(4000);
	t.getmodule();
	Thread.sleep(2000);
	t.getallopsformodule();
	Thread.sleep(2000);
	WebElement add=driver.findElement(By.name("priority"));
	Thread.sleep(3000);
	f.listboxbyvalue(add,"126");
	Thread.sleep(2000);
	t.setcreatebtn();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='confirm']")).click();
	Thread.sleep(2000);
	
	
	
	
	
	
	}
}
