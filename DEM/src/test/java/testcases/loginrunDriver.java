package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testkeywords.loginKeywords;
import utilities.readexcelData;
import utilities.userData;

public class loginrunDriver {
	
	public static WebDriver driver;
	
	
	@Test
	public static void userlogin() throws IOException, InterruptedException
	
	{
		
		// declare to read excel data file 
		
		String path=userData.datafilepath;
		//declare the excel sheet name 
		
		String SheetName=readexcelData.setexcelData(path,"login");
		
		
		for ( int i=1; i<=9; i++)
			
		{
			
			String keywords=readexcelData.readcellData(i, 3);
			
			if (keywords.equals("openBrowser"))
			{
				loginKeywords.openBrowser();
				
			}
		 
		 else if ( keywords.equals("aut"))
		 {
			 loginKeywords.aut();
		}
	
		
		 else if (keywords.equals("clickUser"))
		 {
	       loginKeywords.clickUser();
		 
		 }
		 else if (keywords.equals("uid"))
		 {
			 loginKeywords.uid();
		 
		 }
		 else if (keywords.equals("upw"))
		 {
	       loginKeywords.upw();
		 
		 }
		 else if (keywords.equals("sigin"))
		 {
	       loginKeywords.signin();
		 
		 }
		 
		 else if (keywords.equals("clickDropdown"))
		 {
	       loginKeywords.clickDropdown();
		 
		 }
		 
		 else if (keywords.equals("clickLogout"))
		 {
	       loginKeywords.clickLogout();
		 
		 }
		 
		 else if (keywords.equals("closeBrowser"))
		 {
	       loginKeywords.closeBrowser();
		 
		 }
	
	}
	
 }
}


