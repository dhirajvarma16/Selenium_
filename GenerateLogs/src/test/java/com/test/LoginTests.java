package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTests {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Educational\\selenium\\Chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");
		
	}
	
	@Test(priority=1)
	public void freecrmTitleTest() {
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "xyz");
		}
		
	@Test(priority=2)
	public void freeCRMLogoTest() {
		boolean b=driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
	   Assert.assertTrue(b);
		
	}
}
