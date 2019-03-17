package test;

import org.openqa.selenium.WebDriver;

import data.Constants;
import data.TestDataPool;
import pageFlows.BookAFlightPage;
import pageFlows.FlightConfirmationPage;
import pageFlows.FlightFinderPage;
import pageFlows.HomePage;
import pageFlows.RegisterConfirmPage;
import pageFlows.RegisterPage;
import pageFlows.SelectFlightPage;
import setup.TestRunSetup;

// Test case for 1 passenger who is only travelling one way

public class DemoAutTest2_1Person1WayFlight {
	
	public static void main(String[] args) throws Exception {

	//Setup
		new TestDataPool(2);
		WebDriver driver = TestRunSetup.launch("firefox", Constants.BASE_URL);
		
	//Page flows
		new HomePage().registration(driver);
		new RegisterPage().registerDetails(driver);
		new RegisterConfirmPage().registerConfirm_Dear(driver);
		new RegisterConfirmPage().registerConfirm_UserName(driver);
		new FlightFinderPage().clickFlights(driver);
		new FlightFinderPage().flightDetails(driver);
		new FlightFinderPage().preferences(driver);
		new FlightFinderPage().continueButton(driver);
		new  SelectFlightPage().departReturnFlight(driver);
		new BookAFlightPage().summary(driver);
		new BookAFlightPage().passengers(driver);
		new BookAFlightPage().creditcard(driver);
		new FlightConfirmationPage().validation_Confirm(driver);
		new FlightConfirmationPage().logout(driver);

		driver.quit();
	
	}

}
