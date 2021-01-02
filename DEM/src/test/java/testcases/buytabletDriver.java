package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testkeywords.buytabletKeywords;
import testkeywords.homeKeywords;
import testkeywords.loginKeywords;
import utilities.readexcelData;
import utilities.userData;

public class buytabletDriver {
public static WebDriver driver;
	
	
	@Test
	public static void userlogin() throws IOException, InterruptedException
	
	{
		
		// declare to read excel data file 
		
		String path=userData.datafilepath;
		//declare the excel sheet name 
		
		String SheetName=readexcelData.setexcelData(path,"buytablet");
		
		
		for ( int i=1; i<=17; i++)
			
		{
			
			String keywords=readexcelData.readcellData(i, 3);
			
			if (keywords.equals("openBrowser"))
			{
				buytabletKeywords.openBrowser();
				
			}
		 
		 else if ( keywords.equals("aut"))
		 {
			 buytabletKeywords.aut();
		}
	
		
		 else if (keywords.equals("clickTab"))
		 {
			 buytabletKeywords.clickTab();
		 
		 }
		 else if (keywords.equals("clickHP"))
		 {
			 buytabletKeywords.clickHP();
		 
		 }		 
		 else if (keywords.equals("cart"))
		 {
			 buytabletKeywords.cart();
		 
		 }
		 else if (keywords.equals("checkout"))
		 {
			 buytabletKeywords.checkout();
		 
		 }
		 else if (keywords.equals("uid1"))
		 {
			 buytabletKeywords.uid1();
		 
		 }		 
		 else if (keywords.equals("upw1"))
		 {
			 buytabletKeywords.upw1();
		 
		 }
		 else if (keywords.equals("login1"))
		 {
			 buytabletKeywords.login1();
		 
		 }
		 else if (keywords.equals("next"))
		 {
			 buytabletKeywords.next();
		 
		 }
		 else if (keywords.equals("username_spay"))
		 {
			 buytabletKeywords.username_spay();
		 
		 }
			
		 else if (keywords.equals("pwd_spay"))
		 {
			 buytabletKeywords.pwd_spay();
		 
		 }
		 else if (keywords.equals("uncheck"))
		 {
			 buytabletKeywords.uncheck();
		 
		 }
		 else if (keywords.equals("pay_now"))
		 {
			 buytabletKeywords.pay_now();
		 
		 }
			 
		 else if (keywords.equals("clickDropdown"))
		 {
			 buytabletKeywords.clickDropdown();
		 
		 }
		 
		 else if (keywords.equals("clickLogout"))
		 {
			 buytabletKeywords.clickLogout();
		 
		 }
		 else if (keywords.equals("closeBrowser"))
		 {
			 buytabletKeywords.closeBrowser();
		 
		 }
	}
	
}

}
