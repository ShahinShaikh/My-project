package com.techcanvass.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lmsTechcanvasSelEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://shahin//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://lms.techcanvass.co.in/");
		driver.findElement(By.id("txtLoginid")).sendKeys("shahin89nayebali@gmail.com");
		driver.findElement(By.id("txtpassword")).sendKeys("1234");
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtLoginid")).clear();
		driver.findElement(By.id("txtpassword")).clear();
		
	}

}
