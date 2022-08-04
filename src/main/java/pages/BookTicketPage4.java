package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import LIbraryFiles.Utility_Class1;

public class BookTicketPage4 
{  
	
	By NetBanking=By.xpath("(//div[contains(@class,'netbanking')])[1]");
	By SbiNetBanking=By.xpath("(//span[contains(@class,'ftn14')])[1]");
	By ClickOnPayment=By.xpath("(//div[contains(text(),'Make Payment')])[2]");
	
	
	
   WebDriver driver;
   
	public BookTicketPage4(WebDriver driver)
	{
		this.driver=driver;
	}
	 
	
	public void clickOnNetBanking() throws InterruptedException
	{
		
		driver.findElement(NetBanking).click();
		Thread.sleep(2000);
		driver.findElement(SbiNetBanking).click();
		Thread.sleep(4000);
		driver.findElement(ClickOnPayment).click();
		Thread.sleep(4000);		
	}
	  
	
	
	

	
	
	
	
	
}
