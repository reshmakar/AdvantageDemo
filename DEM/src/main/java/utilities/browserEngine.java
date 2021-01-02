package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	public static WebDriver driver;
	
	public static WebDriver browsersetup() {
		System.setProperty("webdriver.chrome.driver","C:\\Devops\\My Projects\\AdvantageDemo\\DEM\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}
	

}