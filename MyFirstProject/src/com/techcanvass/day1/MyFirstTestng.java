package com.techcanvass.day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MyFirstTestng {
  @Test
  public void fhhhhh() {
	  System.out.println("5");

  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("3");

  }

}
