package pageFlows;

import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
import pageObjects.RegisterConfirmPageObj;
import utils.ReportingUtils;

public class RegisterConfirmPage {
	Operations op = new Operations();

	public void registerConfirm_Dear(WebDriver driver) {
		op.implicitlyWait(driver, 30);
		// String capturedValue = driver.findElement(By.xpath(RegisterConfirmPageObj.text_DearFnLn)).getText();//linearway
		// return capturedValue;

		String actualValue_RegConfDear = op.getText(driver, RegisterConfirmPageObj.text_DearFnLn);
		String expectedValue_RegConfDear = "Dear MD Mamun,";

		// Validation
		if (expectedValue_RegConfDear.equals(actualValue_RegConfDear)) {
			System.out.println("============DearConf===================");
			System.out.println("Pass - Dear confirmation :: " + expectedValue_RegConfDear);
			System.out.println("=========================================");
		} else
			System.out.println("Fail - Dear confirmation");

	}
	public void registerConfirm_UserName(WebDriver driver) {
		op.implicitlyWait(driver, 30);
		String actualValue_RegConfUserName = op.getText(driver, RegisterConfirmPageObj.confirm_UserName);
		String expectedValue_RegConfUserName = "Note: Your user name is AutomationTest.";

		if (expectedValue_RegConfUserName.equals(actualValue_RegConfUserName)) {
			System.out.println("=============UserNameConf==================");
			System.out.println("Pass - Note confirmation :: " + expectedValue_RegConfUserName);
			System.out.println("============================================");
		} else
			System.out.println("Fail - Note confirmation");
		op.implicitlyWait(driver, 30);
		ReportingUtils.reportResult("Pass", "Registration Confirmation", "Registration Confirmation");

	}
}
