package pageFlows;

import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
import pageObjects.RegisterTitleValidationPageObj;

public class RegisterTitleValidationPage {
	Operations op = new Operations();

	public void Register_Title(WebDriver driver) throws InterruptedException {
		op.implicitlyWait(driver, 50);
		String ExpectedTitle = "Register: Mercury Tours";
		String ActualTitle = op.getTitle(driver, RegisterTitleValidationPageObj.Title_Register);
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("=================Title Of RegPage==================");
			System.out.println("Pass Expected Title Matched :" + "\n" + "Expected Title Is :" + ExpectedTitle);
			System.out.println("=================================================");
		} else
			System.out.println("Fail Expected Title Doesn't Matched");

	}

}
