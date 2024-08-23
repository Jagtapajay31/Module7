package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 *  W.A.J.script to register your self in Gmail.
 */
public class JunitGmailRegister {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.edge.driver","E:\\Tops 2024\\Selenium\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?ddm=0&dsh=S219863105:1724306476220674&flowEntry=SignUp&flowName=GlifWebSignIn&TL=AKeb6mzZiHgWN5ggu--H9A9iKotZM68ym01l8JpdFm0GjhsNfHjOsPtWDvzNVRHF");
		Thread.sleep(2000);	

		
		
		
		driver.findElement(By.name("firstName")).sendKeys("jay");
		Thread.sleep(1000);

		driver.findElement(By.name("lastName")).sendKeys("Patel");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("day")).sendKeys("1");
		Thread.sleep(1000);

		WebElement month= driver.findElement(By.id("month"));
		Select select= new Select(month);
		select.selectByValue("4");
		Thread.sleep(1000);

		driver.findElement(By.id("year")).sendKeys("1998");
		Thread.sleep(1000);

		WebElement gen= driver.findElement(By.id("gender"));
		Select selectt= new Select(gen);
		selectt.selectByValue("1");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.name("Username")).sendKeys("Jaypatel1212");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("Passwd")).sendKeys("Hello");
		Thread.sleep(1000);

		driver.findElement(By.name("PasswdAgain")).sendKeys("Hello");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button")).click();
		Thread.sleep(1000);

		driver.close();
	}

}
