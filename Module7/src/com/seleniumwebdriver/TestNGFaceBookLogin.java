package com.seleniumwebdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNGFaceBookLogin {
	WebDriver driver;
	@BeforeTest
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
	}
	@org.testng.annotations.Test(priority = 1)
	public void username() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("don432@yopmail.com");
        Thread.sleep(2000);
	}
	@org.testng.annotations.Test
	public void password() throws InterruptedException {
        driver.findElement(By.id("pass")).sendKeys("don432");
        Thread.sleep(1000);
	}
	
	@org.testng.annotations.Test
    public void login() throws InterruptedException {
        driver.findElement(By.name("login")).click();
        Thread.sleep(7000);
    }
        
        @AfterTest
    	public void after() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.close();  
}
}
