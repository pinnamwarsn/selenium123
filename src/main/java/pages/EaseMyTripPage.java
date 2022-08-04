package pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import javax.net.ssl.HostnameVerifier;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import LIbraryFiles.Utility_Class;

public class EaseMyTripPage
{
	WebDriver driver;
  By clickonfrom=By.xpath("//input[@id='FromSector_show']");
  By from=By.xpath("//input[@id='FromSector_show']");
  By clickonenter=By.xpath("//input[@id='Editbox13_show']");
  By to=By.xpath("//input[@id='Editbox13_show']");
  By clickondate=By.xpath("//input[@id='ddate']");
// By date=By.id("//span[@id='"+Utility_Class.getpfdata(1, 2, "Flight")+"']");
 // By search=By.xpath("(//input[@class='src_btn'])[1]");
  //By traveller=By.xpath("(//input[@class='"+Utility_Class.getpfdata(r, c, Sheet)+"'])[1]");
  By clickontraveller=By.xpath("//a[@class='dropbtn_n9']");
  By addadult=By.xpath("(//input[@class='plus_box1'])[1]");
  By clickontravellerdone=By.xpath("(//a[contains(text(),'Done')])[1]");
  By clickonbusiness=By.xpath("(//label[@class='cont_flt'])[3]");
  By economy=By.xpath("//a[@class=\"dropbtn_n10\"]");
  By clickonbusinessdone=By.xpath("//a[@class='dn_btn mgtv4']");
  
  By search=By.xpath("(//input[@class='src_btn'])[1]");


	 public EaseMyTripPage(WebDriver driver)
	 {
		 this.driver=driver;
	 
	 }
	
	public void enterfrom(String from) throws FileNotFoundException, IOException
	{
	    driver.findElement(clickonfrom).click();
	   	driver.findElement(By.xpath("(//span[contains(text(),'"+from+"')])[1]")).click();
	   	
	}
	
	public void enterTo(String to) throws FileNotFoundException, IOException
	{ 
		driver.findElement(clickonenter).click();
		driver.findElement(By.xpath("(//span[contains(text(),'"+to+"')])[2]")).click();
	}
	
	public void enterDate() throws FileNotFoundException, IOException, InterruptedException
	{
		 WebElement sa = driver.findElement(clickondate);
		 sa.click();
		 Thread.sleep(5000);
//		 String date=Utility_Class.getpfdata(1,2,"Flight");
//		 System.out.println(date);
	  WebElement dates = driver.findElement(By.xpath("//span[@id='"+Utility_Class.getpfdata(1,2,"Flight")+"']"));
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();",dates);
        //   driver.findElement(By.xpath("//input[@id='ddate']").c
//		driver.findElement(date).sendKeys(Utility_Class.getpfdata(1, 2, "Flight"));
	}
	
//	public void entertraveller() throws FileNotFoundException, IOException, InterruptedException
//	{
//		driver.findElement(clickontraveller).click();
//		Thread.sleep(4000);
//		driver.findElement(addadult).click();
//		Thread.sleep(2000);
//		driver.findElement(clickontravellerdone).click();
//		
//        
//        
//		//sendKeys(Utility_Class.getpfdata(1, 3, "Flight"));
//	}
//	public void enterclass() throws InterruptedException
//	{
//		driver.findElement(economy).click();
//		Thread.sleep(4000);
//		driver.findElement(clickonbusiness).click();
//		Thread.sleep(4000);
//		driver.findElement(clickonbusinessdone).click();
//		Thread.sleep(4000);
//		
//	}
	
	
	
	public void clickSearch()
	{
		
		driver.findElement(search).click();
		
	}
	
	public void popUpHandle()
	{
		
		
		
	}
	
}
