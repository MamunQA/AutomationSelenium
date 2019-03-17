package pageFlows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
import pageObjects.SelectFlightObj;
import utils.ReportingUtils;

public class SelectFlightPage {
	Operations op = new Operations();

	public void departReturnFlight(WebDriver driver){
		//Depart Flight
		//driver.findElement(By.xpath(SelectFlightObj.Select_Depart)).click();
		new Operations().ClickRadioBtn(driver, SelectFlightObj.Select_Depart);

		//Return Flight
		new Operations().ClickRadioBtn(driver, SelectFlightObj.Select_Return);
		
		ReportingUtils.reportResult("Pass", "Select Flight Page", "Select Flight Page");
		
	

	}
	

	// click on contuinue btn
	public void continueButton(WebDriver driver) {
		op.clickLink(driver, SelectFlightObj.Button_Continue);

	}
}
