package com.techcanvass.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techcanvass.page.ContactUsPage;
public class Test1 {
	WebDriver driver;
	ContactUsPage cpage =PageFactory.initElements(driver, ContactUsPage.class);
	Select myselect;
	@Test
	  public void Test(){
		
		cpage.setUserName("Shahin Nayab ali Shaikh");
		cpage.setEmail("shahin89nayebali@gmail.com");
		cpage.contactNo("9967891541");
		cpage.setSelect(myselect, "Webinar Enquiry");
		cpage.btnClick();
		/*ContactUsPage cpage = new ContactUsPage();
		cpage.setUserName(driver, "Shahin Nayab ali Shaikh");
		cpage.setEmail(driver,"shahin89nayebali@gmail.com");
		cpage.contactNo(driver, "9967891541");
		cpage.setSelect(driver, myselect, "Webinar Enquiry");
		cpage.btnClick(driver);*/
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
