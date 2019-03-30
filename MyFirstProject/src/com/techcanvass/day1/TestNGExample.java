package com.techcanvass.day1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
public class TestNGExample {
	WebDriver driver;
	@Test
	  public void Test(){
		
		driver.findElement(By.xpath("//*[@id=\"txtName\"]")).sendKeys("Shahin Nayab ali Shaikh");
		driver.findElement(By.id("txtEmail")).sendKeys("shahin89nayebali@gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9967891541");
		Select mySelect=new Select(driver.findElement(By.id("ddlSubject")));
		//mySelect.selectByIndex(1);
		//mySelect.selectByVisibleText("Webinar Enquiry");
		mySelect.selectByValue("Webinar Enquiry");
		driver.findElement(By.id("txtMessage")).sendKeys("selenium course fees");
		driver.findElement(By.name("btnSubmit")).click();
	  }
	@Test
	public void Test1() throws InterruptedException{
		
		driver.get("https://techcanvass.com");
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
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","D://shahin//chromedriver.exe");
		  driver = new ChromeDriver();
			driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
			driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();

	  }

}
