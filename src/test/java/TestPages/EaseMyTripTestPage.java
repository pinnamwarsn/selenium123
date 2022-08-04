package TestPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import LIbraryFiles.BasePage;
import LIbraryFiles.Utility_Class;
import pages.EaseMyTripPage;

public class EaseMyTripTestPage extends BasePage
{
    
	@Test
	public void searchtheflight() throws FileNotFoundException, IOException, InterruptedException
	{
		EaseMyTripPage home=new EaseMyTripPage(driver);
		
		String from=Utility_Class.getpfdata(1, 0, "Flight");
		
		home.enterfrom(from);
		
		String to=Utility_Class.getpfdata(1, 1, "Flight");
		
		
		home.enterTo(to);
		
		home.enterDate();
		
		//home.entertraveller();
		//home.enterclass();

		home.clickSearch();
		
		
		//driver.switchTo().alert().accept();
		
		
		
		
		
	}
	
	  
	
	
	
	
	
	
	
}
