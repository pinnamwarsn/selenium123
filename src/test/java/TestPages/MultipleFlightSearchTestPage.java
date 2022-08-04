//package TestPages;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.testng.annotations.Test;
//
//import LIbraryFiles.BasePage;
//import LIbraryFiles.Utility_Class;
//import pages.MultipleFlightSearch;
//
//public class MultipleFlightSearchTestPage extends BasePage
//{
//    
//	@Test
//	public void searchflight1() throws FileNotFoundException, IOException, InterruptedException
//	{
//		MultipleFlightSearch home=new MultipleFlightSearch(driver);
//		for(int i=1; i<Utility_Class.getrow("Flight");i++)
//		{
//			
//		String from =Utility_Class.getpfdata(i, 0, "Flight");
//		
//		home.enterFromMul(i,from);
//		
//		String to =Utility_Class.getpfdata(i, 1, "Flight");
//
//		home.enterToMul(i,to);
//		
//		String date=Utility_Class.getpfdata(i,2, "Flight");
//		
//		
//		home.enterDateMul(i,date);
//		
//		home.entertravellerMul();
//		
//		home.enterclassMul();
//		
//		home.clickonsearchbuttonMul();
//		
//		//driver.switchTo().alert().accept();
//		
//		
//		//home.enterclassMul();
//
//	    
//		
//		home.clickonback();
//		
//		
//		
//		
//		
//		
//		
//		}
//		
//	}
	
	
	
	
	
	
	
	
	
//}
