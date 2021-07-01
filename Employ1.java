package demo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Employ1 {
	WebDriver driver;
	
	  @Test(dataProvider = "getData")
	  public void Add(String f, String l) {
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.findElement(By.id("menu_pim_viewPimModule")).click();
		  driver.findElement(By.id("menu_pim_addEmployee")).click();
		  driver.findElement(By.id("firstName")).sendKeys(f);
		  driver.findElement(By.id("lastName")).sendKeys(l);
		  driver.findElement(By.id("btnSave")).click();
		  
		  
			driver.findElement(By.partialLinkText("Welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
	  }

	  @DataProvider
	  public Object[][] getData() {
		  
		  Object[] []data=new Object[2] [2];
		  data[0] [0]="Riya";
		  data[0] [1]="Singh";
		  
		   return data; 
	    
	     }
	  

	  @BeforeTest
	  public void beforeTest(){
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\PRIYANKA\\OneDrive\\Desktop\\Java Programs\\Programs\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
	  }



	@AfterTest
	public void afterClass() {
		
		
		driver.close();
	}
}


