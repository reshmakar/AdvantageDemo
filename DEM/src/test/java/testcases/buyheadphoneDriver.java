package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testkeywords.buyheadphoneKeywords;

import testkeywords.loginKeywords;
import utilities.readexcelData;
import utilities.userData;

public class buyheadphoneDriver {
public static WebDriver driver;
	
	
	@Test
	public static void userlogin() throws IOException, InterruptedException
	
	{
		
		// declare to read excel data file 
		
		String path=userData.datafilepath;
		//declare the excel sheet name 
		
		String SheetName=readexcelData.setexcelData(path,"buyheadphones");
		
		
		for ( int i=1; i<=17; i++)
			
		{
			
			String keywords=readexcelData.readcellData(i, 3);
			
			if (keywords.equals("openBrowser"))
			{
				buyheadphoneKeywords.openBrowser();
				
			}
		 
		 else if ( keywords.equals("aut"))
		 {
			 buyheadphoneKeywords.aut();
		}
	
		
		 else if (keywords.equals("clickHd"))
		 {
			 buyheadphoneKeywords.clickHd();
		 
		 }
		 else if (keywords.equals("clickBeats"))
		 {
			 buyheadphoneKeywords.clickBeats();
		 
		 }		 
		 else if (keywords.equals("cart"))
		 {
			 buyheadphoneKeywords.cart();
		 
		 }
		 else if (keywords.equals("checkout"))
		 {
			 buyheadphoneKeywords.checkout();
		 
		 }
		 else if (keywords.equals("uid1"))
		 {
			 buyheadphoneKeywords.uid1();
		 
		 }		 
		 else if (keywords.equals("upw1"))
		 {
			 buyheadphoneKeywords.upw1();
		 
		 }
		 else if (keywords.equals("login1"))
		 {
			 buyheadphoneKeywords.login1();
		 
		 }
		 else if (keywords.equals("next"))
		 {
			 buyheadphoneKeywords.next();
		 
		 }
		 else if (keywords.equals("username_spay"))
		 {
			 buyheadphoneKeywords.username_spay();
		 
		 }
			
		 else if (keywords.equals("pwd_spay"))
		 {
			 buyheadphoneKeywords.pwd_spay();
		 
		 }
		 else if (keywords.equals("uncheck"))
		 {
			 buyheadphoneKeywords.uncheck();
		 
		 }
		 else if (keywords.equals("pay_now"))
		 {
			 buyheadphoneKeywords.pay_now();
		 
		 }
			 
		 else if (keywords.equals("clickDropdown"))
		 {
	       buyheadphoneKeywords.clickDropdown();
		 
		 }
		 
		 else if (keywords.equals("clickLogout"))
		 {
	       buyheadphoneKeywords.clickLogout();
		 
		 }
		 else if (keywords.equals("closeBrowser"))
		 {
			 buyheadphoneKeywords.closeBrowser();
		 
		 }
	}
	
}

}
