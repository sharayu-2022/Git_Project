package com.sample.GitProject_With_Maven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test 
{
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
System.setProperty("webdriver.chrome.driver","C:\\SD-Selenium Drivers\\chromedriver.exe");
 driver=new ChromeDriver();
 System.out.println("Launching the browser");
	}
	
	@Test
	public void doLogin()
	{
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/");
		System.out.println("Logging in to Facebook");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 System.out.println("Entering Username"); 
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("shrudeshmukhmail.com");
		System.out.println("Entering Password");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		  System.out.println("Clicking on LogIn Button");
		driver.findElement(By.name("login")).click();
		System.out.println("Logging into facebook account");
	}
	
	@AfterTest
	public void QuitDriver()
		{
			//if (driver!=null)
				driver.close();
		}

	

}
