package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import LIbraryFiles.Utility_Class1;

public class BookTicketM 
{    
	By ClickOnFrom=By.xpath("//input[@class=\"autoFlll input_city ac_input ui-autocomplete-input\"]");
	By ClickOnTo=By.xpath("(//input[@class='autoFlll input_city ac_input ui-autocomplete-input'])[2]");
	By ClickOnDate=By.xpath("//input[@class='input_cld']");
	By ClickOnTraveller=By.xpath("//a[@class='dropbtn_n9']");
	By ClickOnAdult=By.xpath("(//input[@class='plus_box1'])[1]");
	By ClickonTravellerDone=By.xpath("(//a[contains(text(),'Done')])[1]");
	By ClickOnClass=By.xpath("//a[@class='dropbtn_n10']");
	By ClickOnSubClass=By.xpath("(//span[@class='chk_flt'])[3]");
	By ClickOnClassDone=By.xpath("(//a[contains(text(),'Done')])[2]");
	By ClickOnSearch=By.xpath("(//input[@class='src_btn'])[1]");
	

	
	
	 WebDriver driver;
	
	public BookTicketM(WebDriver driver)
	{
		this.driver=driver;
	}
	
     public void enterFromToBookTicket(String from) throws FileNotFoundException, IOException, InterruptedException
     {
    	 driver.findElement(ClickOnFrom).click();
    	 Thread.sleep(4000);
    	 driver.findElement(By.xpath("(//span[contains(text(),'"+from+"')])[1]")).click();
    	 
    	 
     }
	 
     public void enterToToBookTicket(String to) throws FileNotFoundException, IOException, InterruptedException
     { 
    	 Thread.sleep(4000);
    	 driver.findElement(ClickOnTo).click();
    	 Thread.sleep(4000);
    	 driver.findElement(By.xpath("(//span[contains(text(),'"+to+"')])[2]")).click();
    	 
    	 
     }
	
     public void enterDateToBookTicket(String date) throws FileNotFoundException, IOException, InterruptedException
     {
    	 driver.findElement(ClickOnDate).click();
    	 Thread.sleep(4000);
    	 
    	
        driver.findElement(By.xpath("//span[@id='"+date+"']")).click();
//        
// 	   JavascriptExecutor js=(JavascriptExecutor)driver;
//		  js.executeScript("arguments[0].click();",datedata);
//		  Thread.sleep(4000);


    	 
     }
     
     public void enterTravellerToBookTicket() throws InterruptedException
     {
    	 driver.findElement(ClickOnTraveller).click();
    	 Thread.sleep(4000);
    	 driver.findElement(ClickOnAdult).click();
    	 Thread.sleep(4000);
    	 driver.findElement(ClickonTravellerDone).click();
    	 
    	 
    	 
     }
     
     public void clickOnClassTobookTicket() throws InterruptedException
     {
    	 driver.findElement(ClickOnClass).click();
    	 Thread.sleep(4000);
    	 driver.findElement(ClickOnSubClass).click();
    	 Thread.sleep(4000);
    	 driver.findElement(ClickOnClassDone).click();
    	 

     }
     
     public void clickOnSearchToBookTicket() throws InterruptedException
     
     {
    	 Thread.sleep(4000);
    	 driver.findElement(ClickOnSearch).click();
    	 Thread.sleep(4000);
    		 
     }
     


     
     
	     
	   
     
	
	
	
	
	
	
	
	
	
	
	
	
}
