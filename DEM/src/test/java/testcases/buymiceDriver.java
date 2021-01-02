package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testkeywords.buymiceKeywords;
import testkeywords.loginKeywords;
import utilities.readexcelData;
import utilities.userData;

public class buymiceDriver {
public static WebDriver driver;
	
	
	@Test
	public static void userlogin() throws IOException, InterruptedException
	
	{
		
		// declare to read excel data file 
		
		String path=userData.datafilepath;
		//declare the excel sheet name 
		
		String SheetName=readexcelData.setexcelData(path,"buymice");
		
		
		for ( int i=1; i<=17; i++)
			
		{
			
			String keywords=readexcelData.readcellData(i, 3);
			
			if (keywords.equals("openBrowser"))
			{
				buymiceKeywords.openBrowser();
				
			}
		 
		 else if ( keywords.equals("aut"))
		 {
			 buymiceKeywords.aut();
		}
	
		
		 else if (keywords.equals("clickMo"))
		 {
			 buymiceKeywords.clickMo();
		 
		 }
		 else if (keywords.equals("clickKen"))
		 {
			 buymiceKeywords.clickKen();
		 
		 }		 
		 else if (keywords.equals("cart"))
		 {
			 buymiceKeywords.cart();
		 
		 }
		 else if (keywords.equals("checkout"))
		 {
			 buymiceKeywords.checkout();
		 
		 }
		 else if (keywords.equals("uid1"))
		 {
			 buymiceKeywords.uid1();
		 
		 }		 
		 else if (keywords.equals("upw1"))
		 {
			 buymiceKeywords.upw1();
		 
		 }
		 else if (keywords.equals("login1"))
		 {
			 buymiceKeywords.login1();
		 
		 }
		 else if (keywords.equals("next"))
		 {
			 buymiceKeywords.next();
		 
		 }
		 else if (keywords.equals("username_spay"))
		 {
			 buymiceKeywords.username_spay();
		 
		 }
			
		 else if (keywords.equals("pwd_spay"))
		 {
			 buymiceKeywords.pwd_spay();
		 
		 }
		 else if (keywords.equals("uncheck"))
		 {
			 buymiceKeywords.uncheck();
		 
		 }
		 else if (keywords.equals("pay_now"))
		 {
			 buymiceKeywords.pay_now();
		 
		 }
			 
		 else if (keywords.equals("clickDropdown"))
		 {
	       buymiceKeywords.clickDropdown();
		 
		 }
		 
		 else if (keywords.equals("clickLogout"))
		 {
	       buymiceKeywords.clickLogout();
		 
		 }
		 else if (keywords.equals("closeBrowser"))
		 {
			 buymiceKeywords.closeBrowser();
		 
		 }
	}
	
}

}
