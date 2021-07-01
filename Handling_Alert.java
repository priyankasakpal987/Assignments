package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\OneDrive\\Desktop\\Java Programs\\Programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String expMsg = "I am JavaScript Alert", actMsg=null;
		driver.get("file:///D:/Nedbank Training/SeleniumPrograms/New folder/alertExample.html");
		//driver.get("file:///C:/AdvancedSeleniumSoftwares/alertExample.html");
		driver.findElement(By.xpath(".//*[@id='btnAlert']")).click();
		
		org.openqa.selenium.Alert a = driver.switchTo().alert();
		
		actMsg = a.getText();
		
		if(actMsg.equals(expMsg))
		{
			System.out.println("Correct message \n " +actMsg);
		}
		else
			{ System.out.println("Wrong message \n " +actMsg);
	}

}
}