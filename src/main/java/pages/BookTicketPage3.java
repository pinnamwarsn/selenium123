package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookTicketPage3
{   
	By seat1=By.xpath("(//li[contains(@class,'seat')])[1]");
	By seat2=By.xpath("(//li[contains(@class,'seat')])[2]");
	By continueBooking=By.xpath("(//span[contains(text(),'Continue Booking')])[4]");
	
	
	
	
	
	
	
	WebDriver driver;

	 public BookTicketPage3(WebDriver driver) 
	 {
		 this.driver=driver;
		 
	 }
	
	public void enterseats() throws InterruptedException
	{   
		Thread.sleep(4000);
		driver.findElement(seat1).click();
		Thread.sleep(4000);
		driver.findElement(seat2).click();
		Thread.sleep(4000);
		driver.findElement(continueBooking).click();
		Thread.sleep(4000);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
