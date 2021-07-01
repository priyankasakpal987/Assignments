package com.Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\OneDrive\\Desktop\\Java Programs\\Programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		driver.findElement(By.id("useremail")).sendKeys("priyankasakpal987@gmail.com");
		driver.findElement(By.xpath("//button[@class='input-group-text']")).click();
		driver.close();
		

	}

}