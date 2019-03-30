package com.techcanvass.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myseleniumtechcanvascontactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://shahin//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"txtName\"]")).sendKeys("Shahin Nayab ali Shaikh");
		driver.findElement(By.id("txtEmail")).sendKeys("shahin89nayebali@gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9967891541");
		Select mySelect=new Select(driver.findElement(By.id("ddlSubject")));
		//mySelect.selectByIndex(1);
		//mySelect.selectByVisibleText("Webinar Enquiry");
		mySelect.selectByValue("Webinar Enquiry");
		driver.findElement(By.id("txtMessage")).sendKeys("selenium course fees");
		driver.findElement(By.name("btnSubmit")).click();
		
		
		//driver.close();
	}

}
