package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGFaceBookParameter {
	WebDriver driver;
	@BeforeTest
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
	}
	
		@Test
		@Parameters({"email","password"})
		public void test(String email,String password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("don432@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("don432");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"u_0_9_6r\"]")).click();
		Thread.sleep(10000);
		driver.close();
		}
		
		@AfterTest
		public void after() {
		driver.close();
	}
}


