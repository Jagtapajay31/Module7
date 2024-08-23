package com.seleniumwebdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookJunit {
	WebDriver driver;
	
	@Before
	public void before() throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);	
	}

	@Test
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("jayshah@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("jayshah123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		Thread.sleep(2000);
	}

	@After
	public void after() {
		driver.close();
	}
}
