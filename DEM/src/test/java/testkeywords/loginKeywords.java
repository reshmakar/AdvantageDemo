package testkeywords;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;
import utilities.logCollector;
import utilities.userData;

public class loginKeywords {

	
public static WebDriver driver;
	
	@BeforeMethod
	//TS_001	Open the Browser
	  public static void openBrowser() throws MalformedURLException {
		
		driver=browserEngine.browsersetup();
		
	  }
	
	@Test
 
	//TS_002 Navigate to the application 
	public static void aut() throws InterruptedException {
	driver.get(userData.appurl);
	
	Thread.sleep(6000);
	}
  
	//TS_003 click user icon
	
	public  static void clickUser() throws InterruptedException {
	
		driver.findElement(By.xpath(userData.userIcon)).click();
		Thread.sleep(6000);
		
	}

	public static void uid() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(userData.userID);
		Thread.sleep(5000);
		
	}

//TS_004 send the pw 
	
public static void upw() throws InterruptedException
{
	driver.findElement(By.name("password")).sendKeys(userData.userPW);
	Thread.sleep(6000);
	
}

//TS_005 Click signin
	
public static void signin() throws InterruptedException

{
	driver.findElement(By.id(userData.signinbtn)).click();

	Thread.sleep(6000);
}

// TS_006 

public static void clickDropdown() throws InterruptedException

{
	driver.findElement(By.xpath(userData.userIcon)).click();

	Thread.sleep(6000);
}

//t007 

public static void clickLogout() throws InterruptedException
{
	driver.findElement(By.xpath(userData.logout)).click();
	logCollector.debug("login page validated");
	Thread.sleep(6000);
}
 


@AfterMethod
  public static void closeBrowser() 
  
  {
	  //TS_008 closing the browser 
	  driver.close();
	  
  }

}
