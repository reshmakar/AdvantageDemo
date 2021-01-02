package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testkeywords.homeKeywords;
import testkeywords.loginKeywords;
import utilities.readexcelData;
import utilities.userData;

public class homerunDriver {
public static WebDriver driver;
	
	
	@Test
	public static void userlogin() throws IOException, InterruptedException
	
	{
		
		// declare to read excel data file 
		
		String path=userData.datafilepath;
		//declare the excel sheet name 
		
		String SheetName=readexcelData.setexcelData(path,"home");
		
		
		for ( int i=1; i<=5; i++)
			
		{
			
			String keywords=readexcelData.readcellData(i, 3);
			
			if (keywords.equals("openBrowser"))
			{
				homeKeywords.openBrowser();
				
			}
		 
		 else if ( keywords.equals("aut"))
		 {
			 homeKeywords.aut();
		}
	
		
		 else if (keywords.equals("titlec"))
		 {
	       homeKeywords.titlec();
		 
		 }
		 else if (keywords.equals("labelc"))
		 {
			 homeKeywords.labelc();
		 
		 }		 
		 else if (keywords.equals("closeBrowser"))
		 {
	       homeKeywords.closeBrowser();
		 
		 }
		 else if (keywords.equals("closeBrowser"))
		 {
	       loginKeywords.closeBrowser();
		 
		 }
	
	}
	
}
}
