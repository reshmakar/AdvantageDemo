package testkeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.browserEngine;
import utilities.logCollector;
import utilities.userData;

public class searchKeywords {
	public static WebDriver driver; 
	public static void openBrowser() {
		// TS_015 Open Browser
		driver=browserEngine.browsersetup();
			
	}

	public static void aut() throws InterruptedException {
		// TS_016 navigate to browser
		driver.get(userData.appurl);
	
		Thread.sleep(8000);
	}

	public static void clickSr() throws InterruptedException {
		// TS_017 click headphone icon
		
		driver.findElement(By.id(userData.search_img)).click();
		Thread.sleep(10000);
		logCollector.debug("search button");
		//Thread.sleep(12000);
		
	}
	public static void laptopSr() throws InterruptedException {
		// TS_018 click Beats Icon
		
		
		driver.findElement(By.id(userData.searchbox_id)).sendKeys("Laptop");
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(userData.searchbox_name))));
		driver.findElement(By.id(userData.searchbox_id)).sendKeys(Keys.ENTER);;
		
		Thread.sleep(6000);
	}

	public static void clickEnvy() throws InterruptedException {
		// TS_018 click Beats Icon
		Thread.sleep(6000);
		driver.findElement(By.id(userData.envy_id)).click();
		
		Thread.sleep(6000);
	}

	public static void cart() throws InterruptedException {
		// TS_019 click add to cart
		driver.findElement(By.name(userData.addto_cart_name)).click();

		Thread.sleep(6000);
	
	}
	
	public static void checkout() throws InterruptedException {
		// TS_019 click add to cart
		driver.findElement(By.id("menuCart")).click();
		Thread.sleep(6000);
		driver.findElement(By.id("checkOutButton")).click();
		
	
		Thread.sleep(5000);
		
		
	}

	public static void uid1() {
		// TS_020 send uid
		driver.findElement(By.name("usernameInOrderPayment")).sendKeys(userData.userID);
	
		
	}

	public static void upw1() throws InterruptedException {
		// TS_021 send password
		driver.findElement(By.name("passwordInOrderPayment")).sendKeys(userData.userPW);
		Thread.sleep(5000);
		
	}
	public static void login1() throws InterruptedException {
		// TS_021 login
		driver.findElement(By.id(userData.loginbtn)).click();
	
		Thread.sleep(5000);

		
	}
	public static void next() throws InterruptedException {
		// TS_021 click next
		driver.findElement(By.id("next_btn")).click();
	
		Thread.sleep(5000);

		
	}
	public static void username_spay() throws InterruptedException {
		// TS_021 send username
		driver.findElement(By.name("safepay_username")).sendKeys(userData.spay_un);
		
		Thread.sleep(5000);

		
	}
	public static void pwd_spay() throws InterruptedException {
		// TS_021 send password
		driver.findElement(By.name("safepay_password")).sendKeys(userData.spay_pw);
		
		Thread.sleep(5000);

		
	}
	public static void uncheck() {
		// TS_022 send password
		
		driver.findElement(By.xpath(userData.uncheck)).click();
		

		
	}
	
	public static void pay_now() {
		// TS_023 send password
		driver.findElement(By.id("pay_now_btn_SAFEPAY")).click();
		

		
	}
	public static void clickDropdown() throws InterruptedException

	{
		driver.findElement(By.xpath(userData.userIcon)).click();
		
		Thread.sleep(6000);
	}

 

	public static void clickLogout() 
	{
		driver.findElement(By.xpath(userData.logout)).click();
		logCollector.debug("search successfull");
	
	}
	public static void closeBrowser() 
	{
		driver.close();
		logCollector.debug("search successfull");
	
	}
	

}
