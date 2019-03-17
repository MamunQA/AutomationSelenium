package pageFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import data.TestDataPool;
import infrastructure.Operations;
import pageObjects.FlightFinderObj;
import utils.ReportingUtils;

public class FlightFinderPage {
	Operations op = new Operations();

	public void clickFlights(WebDriver driver) {
		op.implicitlyWait(driver, 30);
		op.clickLink(driver, FlightFinderObj.link_Flights);

	}

	public void flightDetails(WebDriver driver) throws Exception {
		// verification if radobtn is selected auto, verify true or false then click
		// again the btn
		boolean flag = driver.findElement(By.xpath(FlightFinderObj.RadioBtn_roundtrip)).isSelected();
		// if flag is true still click on radiobtn for this sign (!)
		if (!flag)
			op.ClickRadioBtn(driver, FlightFinderObj.RadioBtn_roundtrip);
		
		op.selectDropdown(driver, FlightFinderObj.dropdown_Passengers,TestDataPool.tcData.get("passengers"));
		op.selectDropdown(driver, FlightFinderObj.dropdown_DepartingFrom,TestDataPool.tcData.get("departingFromCity"));
		op.selectDropdown(driver, FlightFinderObj.dropdown_DepartingOnMonth,TestDataPool.tcData.get("departingMonth"));
		op.selectDropdown(driver, FlightFinderObj.dropdown_DepartingOnDate,TestDataPool.tcData.get("departingDay"));
		op.selectDropdown(driver, FlightFinderObj.dropdown_ArrivingIn,TestDataPool.tcData.get("arrivingInCity"));
		op.selectDropdown(driver, FlightFinderObj.dropdown_ReturningOnMonth,TestDataPool.tcData.get("returningMonth"));
		op.selectDropdown(driver, FlightFinderObj.dropdown_ReturningOnDate,TestDataPool.tcData.get("returningDay"));
	}

	public void preferences(WebDriver driver) {
		if((TestDataPool.tcData.get("class")).equals("First"))
			op.ClickRadioBtn(driver, FlightFinderObj.radiobutton_FirstClass);
		else if((TestDataPool.tcData.get("class")).equals("Business"))
			op.ClickRadioBtn(driver, FlightFinderObj.radiobutton_BusinessClass);
		else
			op.ClickRadioBtn(driver, FlightFinderObj.radiobutton_EconomyClass);

	}

	public void continueButton(WebDriver driver) {
		ReportingUtils.reportResult("Pass", "Flight Finder Page", "Flight Finder Page");
		op.clickLink(driver, FlightFinderObj.button_Continue);
		op.implicitlyWait(driver, 30);

	}
}
