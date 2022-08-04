package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookTicketPage2
{
  WebDriver driver;
  
    By ClickOnTitle=By.xpath("(//select[@class='select_trvl'])[1]");
    
    By ClickOnFirstName=By.xpath("(//input[@class='input_trvl'])[1]");
    By ClickOnLastName=By.xpath("(//input[@class='input_trvl'])[2]");
    By ClickOnPhoneNumber=By.xpath("(//input[contains(@class,'pristine ')])[14]");
    By ClickOnAdult=By.xpath("//a[contains(text(),'+ Add Adult')]");
    By ClicOnTitle1=By.xpath("(//select[contains(@class,'trvl')])[4]");
    By ClickOnFirstName1=By.xpath("(//input[contains(@class,'trvl')])[14]");
    By ClickOnLastName1=By.xpath("(//input[contains(@class,'trvl')])[15]");
    By ClickOnContinueBooking3=By.xpath("(//span[contains(text(),'Continue Booking')])[3]");
    
    
    String num="7822048856";
    String Fname="Sagar";
    String Lname="Pinnamwar";
    String Fname1="Pankaj";
    String Lname1="Arora";
    
    
  
	public BookTicketPage2(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterTitleToBookTicket()
	{
	   WebElement title = driver.findElement(ClickOnTitle);
	   
       
	  Select s=new Select(title);
	  s.selectByIndex(1);
	  
	   
	}
	
	public void enterFirstName() throws InterruptedException
	{
		WebElement FirstName = driver.findElement(ClickOnFirstName);
		
		FirstName.click();
		Thread.sleep(2000);
		FirstName.sendKeys(Fname);
	}
	
	public void enterLastName() throws InterruptedException
	{
		WebElement EnterLastName = driver.findElement(ClickOnLastName);
		
		EnterLastName.click();
		Thread.sleep(2000);
		EnterLastName.sendKeys(Lname);
		
	}
	
	public void addAdult()
	{
		driver.findElement(ClickOnAdult).click();
		
	}
	
	public void addAdultDetails() throws InterruptedException
	{
		WebElement details = driver.findElement(ClicOnTitle1);
		
		details.click();
		Select s1=new Select(details) ;
		s1.selectByIndex(1);
		
		WebElement namedetails = driver.findElement(ClickOnFirstName1);
		
		namedetails.click();
		Thread.sleep(4000);
		namedetails.sendKeys(Fname1);
		
		WebElement lastnamedetails1 = driver.findElement(ClickOnLastName1);
		lastnamedetails1.click();
		Thread.sleep(4000);
		lastnamedetails1.sendKeys(Lname1);
		
		
		
		
	}	
	public void enterPhoneNumber() throws InterruptedException
	{
		WebElement ClickOnNumber = driver.findElement(ClickOnPhoneNumber);
		
		ClickOnNumber.click();
		Thread.sleep(4000);
		ClickOnNumber.sendKeys(num);
		Thread.sleep(5000);
		
		
		
		
	}
	
	public void continueBooking() throws InterruptedException
	{
		
		Thread.sleep(4000);
		
	    driver.findElement(ClickOnContinueBooking3).click();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
