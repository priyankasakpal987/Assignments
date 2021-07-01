package com_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\OneDrive\\Desktop\\Java Programs\\Programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement c=driver.findElement(By.xpath("//header/div[3]/nav[1]/div[1]/ul[1]/li[4]/a[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(c).build().perform();
		driver.findElement(By.linkText("Blog")).click();
		driver.close();
		
		

	}

}
