package com.durgasoft.testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Practice_link {
	public WebDriver driver;
  @Test
  public void Practice() {
	  driver.findElement(By.id("name")).sendKeys("ganesh");
	  driver.findElement(By.id("phone")).sendKeys("3216545354");
	  driver.findElement(By.id("email")).sendKeys("hdbjbzfhdszhkb@gkjenkje");
	  driver.findElement(By.id("password")).sendKeys("asdfghjkl");
	  driver.findElement(By.id("address")).sendKeys("qwertyuiop lkjhgfdsa");

	  driver.findElement(By.id("male")).click();
	  driver.findElement(By.id("monday")).click();
	  driver.findElement(By.id("tuesday")).click();
	  driver.findElement(By.id("wednesday")).click();
	  driver.findElement(By.id("thursday")).click();
	  driver.findElement(By.id("friday")).click();
	  driver.findElement(By.id("saturday")).click();
	  driver.findElement(By.id("sunday")).click();
	  WebElement s= driver.findElement(By.xpath("//select[@class='custom-select']"));
	  Select sel=new Select(s);
	  sel.selectByIndex(1);
	  driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
	  driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();
	  driver.findElement(By.id("inputGroupFile02")).sendKeys("D:\\library\\cart.png");
	  driver.findElement(By.xpath("//span[@class='input-group-text']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://itera-qa.azurewebsites.net/home/automation");
	  driver.manage().window().maximize();
  }

}
