package com.seleniumwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandledAlert {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);	
		
		
		driver.findElement(By.name("cusid")).sendKeys("987");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		
//		a1.dismiss();
		a1.accept();
		
		
		Thread.sleep(2000);
		
		Alert a2=driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.accept();
		Thread.sleep(2000);
		driver.close();
	}
}
