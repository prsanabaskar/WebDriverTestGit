package com.tests;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MyTestNGMavenClass {
	WebDriver driver;
	String url = "http://www.google.co.in/";
  @Test
  public void navigateToMethod() {
	  driver.get(url);
  }
  @Test
  public void getTitleMethod() {
	  System.out.println(driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
