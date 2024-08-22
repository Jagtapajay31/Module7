package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboard {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/" );
		driver.manage().window().maximize();
		Thread.sleep(2000);	
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement flight=driver.findElement(By.linkText("Flights"));
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
//		WebElement car rental=driver.findElement(By.linkText("Car Rentals"));
		
		Actions actions=new Actions(driver);
		
		Action a1=actions.moveToElement(home).build();
		a1.perform();
		Thread.sleep(2000);
		
		Action a2=actions.moveToElement(flight).build();
		a2.perform();
		Thread.sleep(2000);
		
		Action a3=actions.moveToElement(hotels).build();
		a3.perform();
		Thread.sleep(2000);
		
//		Action a4=actions.moveToElement(car rental).build();
//		a3.perform();
//		Thread.sleep(2000);
		
		WebElement name=driver.findElement(By.name("userName"));
		
		Actions actions1=new Actions(driver);
		
		Action a11=actions1.moveToElement(name)
				.click()
				.keyDown(name, Keys.SHIFT)
				.sendKeys("jay")
				.keyUp(name, Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		
		a11.perform();
		Thread.sleep(2000);
		driver.close();

		
		
		driver.close();
	}

}
