package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookTicketPage1 
{
  
    By ClicOnBookWhole=By.xpath("(//div[@class='col-md-12 col-sm-12 main-bo-lis pad-top-bot ng-scope'])[1]");
	By ClickOnBook=By.xpath("(//button[contains(text(),'Book Now')])[1]");
	By ClickOnContinueBooking1=By.xpath("(//span[contains(text(),'Continue Booking')])[5]");
	By ClickOnInsurance=By.xpath("(//span[@class='checkmark-radio'])[5]");
	By ClickOnEmailIdColumn=By.xpath("//input[@id='txtEmailId']");
	By ClickOnContinueBooking2=By.xpath("(//span[contains(text(),'Continue Booking')])[2]");
	String emailid="pinnamwarsagar@gmail.com";
	
	
	WebDriver driver;
  
	public BookTicketPage1(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void bookTicket() throws InterruptedException
	{   
		
		driver.findElement(ClicOnBookWhole).click();
		driver.findElement(ClickOnBook).click();
		Thread.sleep(5000);
		
	}
	
	public void continueBooking1()
	{
		driver.findElement(ClickOnContinueBooking1).click();
	}
	
	public void myTripWithInsurance()
	{
		driver.findElement(ClickOnInsurance).click();
	}
	
	public void clickOnEmailID() throws InterruptedException
	{
		WebElement EnterEmailId = driver.findElement(ClickOnEmailIdColumn);
		
		EnterEmailId.click();
		EnterEmailId.sendKeys(emailid);
		Thread.sleep(2000);
			
	}
	
	public void ContinueBooking2() throws InterruptedException
	{
		driver.findElement(ClickOnContinueBooking2).click();
		Thread.sleep(2000);
		
	}
	
	
	
	
	
}
