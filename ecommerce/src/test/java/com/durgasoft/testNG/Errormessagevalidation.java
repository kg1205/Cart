package com.durgasoft.testNG;

import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Errormessagevalidation {
	public WebDriver driver;
	
  @Test
  public void login() throws Exception  {
	  Thread.sleep(5000);

	  driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("ganesh");
	  driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("12345678");
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	  String actual_result= driver.findElement(By.xpath("//span[@class='_2YULOR']")).getText();
	  String expected_result="Please enter valid Email ID/Mobile number";
	  system.out.println("ganesh is upcoming billionaire")
	  Assert.assertEquals(actual_result, expected_result);
	  System.out.println("mismatched results");
	  //ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
	  //driver.switchTo().window(a.get(0));
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File f2=new File("D:\\library\\gan.png");
	  FileUtils.copyFile(f1, f2);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(5000);
	  driver.manage().window().maximize();
  }

}
