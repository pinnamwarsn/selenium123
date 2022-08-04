package TestPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import LIbraryFiles.BasePage;
import LIbraryFiles.Utility_Class1;
import pages.BookTicketM;
import pages.BookTicketPage1;
import pages.BookTicketPage2;
import pages.BookTicketPage3;
import pages.BookTicketPage4;

public class BookTicketTestPage extends BasePage {

	@Test()
	public void BookTicketT() throws FileNotFoundException, IOException, InterruptedException {
		BookTicketM book = new BookTicketM(driver);
		String from = Utility_Class1.GetPfData(1, 0, "FlightBookData");

		book.enterFromToBookTicket(from);

		String to = Utility_Class1.GetPfData(1, 1, "FlightBookData");

		book.enterToToBookTicket(to);

		String date = Utility_Class1.GetPfData(1, 2, "FlightBookData");

		book.enterDateToBookTicket(date);

		book.enterTravellerToBookTicket();

		book.clickOnClassTobookTicket();

		book.clickOnSearchToBookTicket();

		BookTicketPage1 mb = new BookTicketPage1(driver);

		mb.bookTicket();

		mb.continueBooking1();

		mb.myTripWithInsurance();

		mb.clickOnEmailID();

		mb.ContinueBooking2();

		BookTicketPage2 page2 = new BookTicketPage2(driver);

		page2.enterTitleToBookTicket();
		page2.enterFirstName();
		page2.enterLastName();
		page2.addAdult();
		page2.addAdultDetails();
		page2.enterPhoneNumber();
		page2.continueBooking();

		BookTicketPage3 page3 = new BookTicketPage3(driver);

		page3.enterseats();

		BookTicketPage4 page4 = new BookTicketPage4(driver);

		page4.clickOnNetBanking();

	}
}
