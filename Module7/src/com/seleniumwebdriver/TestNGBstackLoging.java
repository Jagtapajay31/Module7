package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBstackLoging {
	WebDriver driver;
	@BeforeTest
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bstackdemo.com/");
		Thread.sleep(2000);	
	}
	@Test
	public void LoginAccount() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"signin\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]/div/div[1]/div[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='demouser']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div/div[1]/div[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='testingisfun99']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
	}
	@AfterTest
	public void closebroswer() throws InterruptedException {
		Thread.sleep(2000);	
		driver.close();	
		}
	}
