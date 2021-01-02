package testkeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.browserEngine;

import utilities.logCollector;
import utilities.userData;

public class homeKeywords {
	public static WebDriver driver;
	public static void openBrowser() {
		// open browser TS_001
		driver=browserEngine.browsersetup();
		
	}

	public static void aut() throws InterruptedException {
		// load web-page TS_002 
		driver.get(userData.appurl);
		
		Thread.sleep(6000);
		
	}

	public static void titlec() {
		// Check title TS_003
		String homeatitle=driver.getTitle();
		
		Assert.assertEquals(homeatitle, userData.hometitle);
		
	}

	public static void labelc() {
		WebElement e= driver.findElement(By.xpath(userData.exphomelabel));
		Assert.assertEquals(e.getText(), userData.homelabel);
		logCollector.debug("home page title and label validated");
		
	}

	public static void closeBrowser() {
		// Close browser TS_005
		driver.close();
		
	}

}
