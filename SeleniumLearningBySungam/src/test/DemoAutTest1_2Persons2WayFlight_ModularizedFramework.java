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
import pageFlows.RegisterTitleValidationPage;
import pageFlows.SelectFlightPage;
import setup.TestRunSetup;

public class DemoAutTest1_2Persons2WayFlight_ModularizedFramework {
	
	public static void main(String[] args) throws Exception {
		
			WebDriver driver = null;
			try {
			// Global variables
			String browser = Constants.BROWSER_TYPE;
			String url = Constants.BASE_URL;

			// Setup
			
			new TestDataPool(1);
			 driver = TestRunSetup.launch(url);
			
			
			//Page Flows
			// Home Page - Registration click
			new HomePage().registration(driver);
			// Register - Filling in the registration details
			RegisterPage.registerDetails(driver);
			// Title Validation for Registration page
			new RegisterTitleValidationPage().Register_Title(driver);
			// Register - Confirmation Valiation
			new RegisterConfirmPage().registerConfirm_Dear(driver);
			// Homework: Capture and Validation - Note: Your user name is automationuser.
			// Flight Finder
			new FlightFinderPage().clickFlights(driver);
			new FlightFinderPage().flightDetails(driver);
			new FlightFinderPage().preferences(driver);
			new FlightFinderPage().continueButton(driver);
			// Selecting Airlines
			new SelectFlightPage().departReturnFlight(driver);
			new SelectFlightPage().continueButton(driver);
			// TODO book a flight and Validation
			new BookAFlightPage().summary(driver);
			new BookAFlightPage().passengers(driver);
			new BookAFlightPage().creditcard(driver);
			
			// Booking confirmation and Signout
			new FlightConfirmationPage().validation_Confirm(driver);
			// Sign out
			new FlightConfirmationPage().logout(driver);
		} catch (Exception e) {
			e.printStackTrace();
			//throw e;// Stop the execution
		}

		finally{
			driver.close();
			System.out.println("######## Test Case Ends - DemoAutTest_ModularizedFramework #########");

		}
	}
}
