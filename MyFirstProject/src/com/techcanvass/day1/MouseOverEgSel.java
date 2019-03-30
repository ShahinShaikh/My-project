package com.techcanvass.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverEgSel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://shahin//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techcanvass.com");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		WebElement ce=driver.findElement(By.linkText("Courses"));
		Thread.sleep(2000);
		action.moveToElement(ce).build().perform();
		WebElement ac=driver.findElement(By.linkText("Automation Testing Courses"));
		Thread.sleep(2000);
		action.moveToElement(ac).build().perform();
		WebElement bc=driver.findElement(By.linkText("Selenium Training"));
		bc.click();
		
	}

}
