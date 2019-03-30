package com.techcanvass.day1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDataDrivenEg1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://shahin//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://lms.techcanvass.co.in/");
		FileInputStream fs=new FileInputStream("D://shahin/Example1.xls");
		HSSFWorkbook xw = new HSSFWorkbook(fs);
		HSSFSheet xs = xw.getSheetAt(0);
		for(int i=1;i<=xs.getLastRowNum();i++)
		{
			int j=1;
			HSSFCell id,pwd;
			id=xs.getRow(i).getCell(j);
			pwd=xs.getRow(i).getCell(j+1);
			//System.out.println(id.toString());
			//System.out.println(pwd.toString());
			driver.findElement(By.id("txtLoginid")).sendKeys(id.toString());
			driver.findElement(By.id("txtpassword")).sendKeys(pwd.toString());
			driver.findElement(By.name("btnLogin")).click();
			driver.switchTo().alert().accept();
			driver.findElement(By.id("txtLoginid")).clear();
			driver.findElement(By.id("txtpassword")).clear();
		}
		
	}

}
