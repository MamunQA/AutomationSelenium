package pageFlows;

import org.openqa.selenium.WebDriver;

import data.Constants;
import infrastructure.Operations;
import pageObjects.BookFlightObj_old;
import utils.PropertyUtils;

public class BookFlightPage_old {
	Operations op = new Operations();

	public void summary(WebDriver driver) throws Exception {
		op.implicitlyWait(driver, 60);
		// leneiar way essy way
		// String departPrice =
		// driver.findElement(By.xpath(BookAFlightObj.table_DepartPrice)).getText();
		System.out.println("================BookingPrice===========================");
		String departPrice = op.getText(driver, BookFlightObj_old.table_DepartPrice);
		//Write to Property File
		PropertyUtils.propertyFile_Write(Constants.TESTDATAOUTPUT_PATH, "departPrice", departPrice);
		String returnPrice = op.getText(driver, BookFlightObj_old.table_ReturnPrice);
		String noofPassenger = op.getText(driver, BookFlightObj_old.table_NoofPassenger);
		String taxes = op.getText(driver, BookFlightObj_old.table_Texes);
		String totalPrice = op.getText(driver, BookFlightObj_old.table_TotalPrice);
		System.out.println("DepartPrice =" + departPrice + "\n" + "ReturnPrice= " + returnPrice + "\n"
				+ "NoofPassenger= " + noofPassenger + "\n" + "texes= " + taxes + "\n" + "TotalPrice= " + totalPrice);
		// modifing value or price
		System.out.println("===============ModifiedPrice======================");
		taxes = taxes.substring(1); // $96
		System.out.println("Modified tax = " + taxes);
		totalPrice = totalPrice.replaceAll("[$]", ""); // 1264
		System.out.println("Modified total price = " + totalPrice);
		// Parsing
		int departPriceInt = Integer.parseInt(departPrice);
		int returnPriceInt = Integer.parseInt(returnPrice);
		int noOfPassengersInt = Integer.parseInt(noofPassenger);
		int taxesInt = Integer.parseInt(taxes);
		int totalPriceInt = Integer.parseInt(totalPrice);
		// double taxesDouble = Double.parseDouble(taxes);
		// long totalPriceLong = Long.parseLong(totalPrice);
		// Validation
		System.out.println("===============PriceValidation======================");
		int expectedTotalPrice = (departPriceInt + returnPriceInt) * noOfPassengersInt + taxesInt; // Requirement :
																									// totalprice=
																									// (departprice+returnprice)*totalnoofpassengers+taxes
		int actualTotalPrice = totalPriceInt;

		if (expectedTotalPrice == actualTotalPrice)
			System.out.println("Pass - expectedTotalPrice == actualTotalPrice" + "\n" + "expectedTotalPrice= "
					+ expectedTotalPrice + "\n" + "actualTotalPrice= " + actualTotalPrice);
		else
			System.out.println("Fail - expectedTotalPrice NOT equal to actualTotalPrice");

		System.out.println("================PassengerInfo===========================");
		op.setText(driver, BookFlightObj_old.textbox_FirstName, "MD");
		op.setText(driver, BookFlightObj_old.textbox_LastName, "Mamun");
		op.selectDropdown(driver, BookFlightObj_old.dropdown_Meal, "Vegetarian");
		System.out.println("================PassengerCardInfo===========================");
		op.selectDropdown(driver, BookFlightObj_old.dropdown_CardType, "MasterCard");
		op.setText(driver, BookFlightObj_old.textbox_Number, "235765434638098");
		op.selectDropdown(driver, BookFlightObj_old.dropdown_ExpirationMonth, "12");
		op.selectDropdown(driver, BookFlightObj_old.dropdown_ExpirationYear, "2010");
		op.setText(driver, BookFlightObj_old.textbox_CardCarrierFirstName, "Md");
		op.setText(driver, BookFlightObj_old.textbox_CardCarrierMiddleName, "N");
		op.setText(driver, BookFlightObj_old.textbox_CardCarrierLastName, "Mamun");
		op.clickLink(driver, BookFlightObj_old.Checkbox_TicketLess);
		System.out.println("================BillingAddress===========================");
		op.setText(driver, BookFlightObj_old.textbox_BillingAddress1, "100 main st");
		op.setText(driver, BookFlightObj_old.textbox_BillingCity, "New York City");
		op.setText(driver, BookFlightObj_old.textbox_BillingPostalCode, "10002");
		op.selectDropdown(driver, BookFlightObj_old.dropdown_BillingCountry, "UNITED STATES");
		System.out.println("================DeleveryAddress===========================");
		op.setText(driver, BookFlightObj_old.textbox_DelAddress, "100 main st");
		op.setText(driver, BookFlightObj_old.textbox_DelCity, "New York City");
		op.setText(driver, BookFlightObj_old.textbox_DelState, "New York");
		op.setText(driver, BookFlightObj_old.textbox_DelPostalcode, "10002");
		op.selectDropdown(driver, BookFlightObj_old.dropdown_DelCountry, "UNITED STATES");
		op.clickLink(driver, BookFlightObj_old.Link_SecurePurchase);

	}

}
