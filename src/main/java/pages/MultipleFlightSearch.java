package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import LIbraryFiles.Utility_Class;

public class MultipleFlightSearch
{
	WebDriver driver;
       By clickonfrom=By.xpath("//input[@id='FromSector_show']");
       
      // By.xpath("(//span[contains(@class,'"+Utility_Class.getpfdata(i, 0, "Flight")+"')])[1]"); 
       By clickonto=By.xpath("//input[@id='Editbox13_show']");
       By mumbaidest=By.xpath("(//span[text()='Mumbai(BOM)'])[1]");
       By bangloredest=By.xpath("(//span[text()='Bangalore(BLR)'])[2]");
       By delhidest=By.xpath("(//span[text()='Delhi(DEL)'])[1]");
       By clickondate=By.xpath("//input[@id='ddate']");
      // By datedata=By.xpath("//span[@id\"+Utility_Class.getpfdata(i, 2, \"Flight\")+\"]");
       By clickontraveller=By.xpath("//a[@class='dropbtn_n9']");
       By clickontravelleradult=By.xpath("(//input[@class='plus_box1'])[1]");
       By clickontravellerdone=By.xpath("(//a[@class='dn_btn'])[1]");
       By clickonclass=By.xpath("//span[@class='optclass-name']");
       By clickonbusiness=By.xpath("(//span[@class=\"chk_flt\"])[3]");
       By clickonclassdone=By.xpath("//a[@class='dn_btn mgtv4']");
       By clickonsearch=By.xpath("(//input[@class='src_btn'])[1]");
       By back=By.xpath("//i[@id='divLogo']");
       
       
       
       
     public MultipleFlightSearch(WebDriver driver)
     {
    	 this.driver=driver;
    	 
     }
       
       public void enterFromMul(int i ,String from) throws FileNotFoundException, IOException, InterruptedException
       {
    	    driver.findElement(clickonfrom).click();
    	    driver.findElement(By.xpath("(//span[contains(text(),'"+from+"')])[1]")).click();
    	   
    	    Thread.sleep(4000);
    	  
    	        
    	   }
       
       public void enterToMul(int i,String to) throws FileNotFoundException, IOException, InterruptedException
       {
    	   driver.findElement(clickonto).click();
    	 
    	   driver.findElement(By.xpath("(//span[contains(text(),'"+to+"')])[2]")).click();

       }
       public void enterDateMul(int i ,String date) throws FileNotFoundException, IOException, InterruptedException
       {
    	   driver.findElement(clickondate).click();
    	   Thread.sleep(4000);
    	   
   	    WebElement dates = driver.findElement(By.xpath("//span[@id='"+date+"']"));
    	   JavascriptExecutor js=(JavascriptExecutor)driver;
 		  js.executeScript("arguments[0].click();",dates);
 		  Thread.sleep(4000);
       }
       
       public void entertravellerMul() throws FileNotFoundException, IOException, InterruptedException
       {
    	   driver.findElement(clickontraveller).click();
    	   Thread.sleep(4000);
    	   
    	    driver.findElement(By.xpath("(//input[@class='plus_box1'])[1]")).click();
    	   
          //JavascriptExecutor js=(JavascriptExecutor)driver;
  		 // js.executeScript("arguments[0].click();",adult);

    	   driver.findElement(clickontravellerdone).click();
    	   
    	   
       }
        
        public void enterclassMul() throws InterruptedException
        {
        	driver.findElement(clickonclass).click();
        	Thread.sleep(4000);
        	driver.findElement(clickonbusiness).click();
       
        	driver.findElement(clickonclassdone).click();
        	
       

        
        	
        	
        	
        }
        
	    public void clickonsearchbuttonMul() throws InterruptedException
	    {
	    	Thread.sleep(4000);
	        driver.findElement(clickonsearch).click();
	    	
	    //	JavascriptExecutor js=(JavascriptExecutor)driver;
	    //    js.executeScript("arguments[0].click();",clickonsearchdata);
	        
	    	Thread.sleep(4000);
	    	
	    }
            
               
     public void clickonback() throws InterruptedException
     {
    	WebElement backpage=driver.findElement(back);
    	
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click();",backpage);
	        Thread.sleep(8000);
	    	
    	
    	//backpage.click();
  
    	 
    	
     }
	
	
	
	
	
	
	
	
	
	
	
}
