package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testkeywords.searchKeywords;

import testkeywords.loginKeywords;
import utilities.readexcelData;
import utilities.userData;

public class searchrunDriver {
public static WebDriver driver;
	@Test
	public static void userlogin() throws IOException, InterruptedException
	
	{
		
		// declare to read excel data file 
		
		String path=userData.datafilepath;
		//declare the excel sheet name 
		
		String SheetName=readexcelData.setexcelData(path,"search");
		
		
		for ( int i=1; i<=18; i++)
			
		{
			
			String keywords=readexcelData.readcellData(i, 3);
			
			if (keywords.equals("openBrowser"))
			{
				searchKeywords.openBrowser();
				
			}
		 
		 else if ( keywords.equals("aut"))
		 {
			 searchKeywords.aut();
		}
	
		
		 else if (keywords.equals("clickSr"))
		 {
			 searchKeywords.clickSr();
		 
		 }
		 else if (keywords.equals("laptopSr"))
		 {
			 searchKeywords.laptopSr();
		 
		 }
		 else if (keywords.equals("clickEnvy"))
		 {
			 searchKeywords.clickEnvy();
		 
		 }		 
		 else if (keywords.equals("cart"))
		 {
			 searchKeywords.cart();
		 
		 }
		 else if (keywords.equals("checkout"))
		 {
			 searchKeywords.checkout();
		 
		 }
		 else if (keywords.equals("uid1"))
		 {
			 searchKeywords.uid1();
		 
		 }		 
		 else if (keywords.equals("upw1"))
		 {
			 searchKeywords.upw1();
		 
		 }
		 else if (keywords.equals("login1"))
		 {
			 searchKeywords.login1();
		 
		 }
		 else if (keywords.equals("next"))
		 {
			 searchKeywords.next();
		 
		 }
		 else if (keywords.equals("username_spay"))
		 {
			 searchKeywords.username_spay();
		 
		 }
			
		 else if (keywords.equals("pwd_spay"))
		 {
			 searchKeywords.pwd_spay();
		 
		 }
		 else if (keywords.equals("uncheck"))
		 {
			 searchKeywords.uncheck();
		 
		 }
		 else if (keywords.equals("pay_now"))
		 {
			 searchKeywords.pay_now();
		 
		 }
			 
		 else if (keywords.equals("clickDropdown"))
		 {
	       searchKeywords.clickDropdown();
		 
		 }
		 
		 else if (keywords.equals("clickLogout"))
		 {
	       searchKeywords.clickLogout();
		 
		 }
		 else if (keywords.equals("closeBrowser"))
		 {
			 searchKeywords.closeBrowser();
		 
		 }
	}
	
}

}
