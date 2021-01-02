package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testkeywords.buyspeakerKeywords;
import testkeywords.homeKeywords;
import testkeywords.loginKeywords;
import utilities.readexcelData;
import utilities.userData;

public class buyspeakerDriver {
public static WebDriver driver;
	
	
	@Test
	public static void userlogin() throws IOException, InterruptedException
	
	{
		
		// declare to read excel data file 
		
		String path=userData.datafilepath;
		//declare the excel sheet name 
		
		String SheetName=readexcelData.setexcelData(path,"buyspeaker");
		
		
		for ( int i=1; i<=17; i++)
			
		{
			
			String keywords=readexcelData.readcellData(i, 3);
			
			if (keywords.equals("openBrowser"))
			{
				buyspeakerKeywords.openBrowser();
				
			}
		 
		 else if ( keywords.equals("aut"))
		 {
			 buyspeakerKeywords.aut();
		}
	
		
		 else if (keywords.equals("clickSp"))
		 {
			 buyspeakerKeywords.clickSp();
		 
		 }
		 else if (keywords.equals("clickBose"))
		 {
			 buyspeakerKeywords.clickBose();
		 
		 }		 
		 else if (keywords.equals("cart"))
		 {
			 buyspeakerKeywords.cart();
		 
		 }
		 else if (keywords.equals("checkout"))
		 {
			 buyspeakerKeywords.checkout();
		 
		 }
		 else if (keywords.equals("uid1"))
		 {
			 buyspeakerKeywords.uid1();
		 
		 }		 
		 else if (keywords.equals("upw1"))
		 {
			 buyspeakerKeywords.upw1();
		 
		 }
		 else if (keywords.equals("login1"))
		 {
			 buyspeakerKeywords.login1();
		 
		 }
		 else if (keywords.equals("next"))
		 {
			 buyspeakerKeywords.next();
		 
		 }
		 else if (keywords.equals("username_spay"))
		 {
			 buyspeakerKeywords.username_spay();
		 
		 }
			
		 else if (keywords.equals("pwd_spay"))
		 {
			 buyspeakerKeywords.pwd_spay();
		 
		 }
		 else if (keywords.equals("uncheck"))
		 {
			 buyspeakerKeywords.uncheck();
		 
		 }
		 else if (keywords.equals("pay_now"))
		 {
			 buyspeakerKeywords.pay_now();
		 
		 }
			 
		 else if (keywords.equals("clickDropdown"))
		 {
	       buyspeakerKeywords.clickDropdown();
		 
		 }
		 
		 else if (keywords.equals("clickLogout"))
		 {
	       buyspeakerKeywords.clickLogout();
		 
		 }
		 else if (keywords.equals("closeBrowser"))
		 {
			 buyspeakerKeywords.closeBrowser();
		 
		 }
	}
	
}

}
