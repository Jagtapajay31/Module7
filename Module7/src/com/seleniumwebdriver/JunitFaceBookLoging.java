package com.seleniumwebdriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitFaceBookLoging {
	static 	WebDriver driver;
	
	@BeforeClass
		public static void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
	}
	
	
	@Test
    public void Login() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("don432@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("don432");
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(7000);
	}
	@Test
	public void Login1() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("don432@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("don432");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(7000);
	}
	
	@AfterClass
    public static void tearDown() {
		driver.close();
    }

}
