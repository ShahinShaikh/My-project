package com.techcanvass.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

	@FindBy(xpath="//*[@id=\"txtName\"]")
	WebElement txtname;
	
	@FindBy(id="txtEmail")
	WebElement txtemail;
	
	@FindBy(id="txtContact")
	WebElement txtcontact;
	
	@FindBy(name="btnSubmit")
	WebElement btnsubmit;
	
	@FindBy(id="ddlSubject")
	WebElement ddlsubject;
	
	
	
	public void setUserName(String name)
	{
		txtname.sendKeys(name);
	}

	public void setEmail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void contactNo(String num)
	{
		txtcontact.sendKeys(num);
	}
	
	public void btnClick()
	{
		btnsubmit.click();
	}
	
	public void setSelect(Select myselect,String text)
	{
		Select mySelect=new Select(ddlsubject);
		mySelect.selectByValue(text);
	}
	/*By xpathvar = By.xpath("//*[@id=\"txtName\"]");
	By emailvar = By.id("txtEmail");
	By contactvar = By.id("txtContact");
	By btnvar = By.name("btnSubmit");
	By ddlsubvar = By.id("ddlSubject");	
	
	public void setUserName(WebDriver driver,String name)
	{
		driver.findElement(xpathvar).sendKeys(name);
	}

	public void setEmail(WebDriver driver,String email)
	{
		driver.findElement(emailvar).sendKeys(email);
	}
	
	public void contactNo(WebDriver driver,String num)
	{
		driver.findElement(contactvar).sendKeys(num);
	}
	
	public void btnClick(WebDriver driver)
	{
		driver.findElement(btnvar).click();
	}
	
	public void setSelect(WebDriver driver,Select myselect,String text)
	{
		Select mySelect=new Select(driver.findElement(ddlsubvar));
		mySelect.selectByValue(text);
	}*/
}
