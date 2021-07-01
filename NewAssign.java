package com_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\OneDrive\\Desktop\\Java Programs\\Programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//driver.switchTo().alert().accept();
		WebElement c=driver.findElement(By.linkText("Admin"));
		Actions a=new Actions(driver);
		a.moveToElement(c).build().perform();
		WebElement c1=driver.findElement(By.linkText("UserManagement"));
		Actions a1=new Actions(driver);
		a1.moveToElement(c1).build().perform();
		driver.findElement(By.linkText("Users")).click();
		driver.close();
		

	}

}
