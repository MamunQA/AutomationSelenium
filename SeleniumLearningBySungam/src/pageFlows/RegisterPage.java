package pageFlows;

import org.openqa.selenium.WebDriver;

import data.TestDataPool;
import infrastructure.Operations;
import pageObjects.RegisterPageObj;
import utils.ReportingUtils;

public class RegisterPage {
	static Operations op = new Operations();

	public static void registerDetails(WebDriver driver) throws Exception {
		// Contact Info
		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath(RegisterPageObj.textbox_FirstName));
		 * ele.sendKeys("First Name");
		 */
		//No need to call datapool here, directly call TestDataPool.tcData.get
		//HashMap<String,String> tcData = ExcelUtils.getTestDataXls(Constants.DATAPOOL_PATH, "DemoAut", 0, 1);//comment this
		System.out.println("==========InputTextForRegistration===========");

		op.setText(driver, RegisterPageObj.textbox_FirstName, TestDataPool.tcData.get("firstName1"));
		op.setText(driver, RegisterPageObj.textbox_LastName, TestDataPool.tcData.get("lastName1"));
		op.setText(driver, RegisterPageObj.textbox_Phone, TestDataPool.tcData.get("phone"));
		op.setText(driver, RegisterPageObj.textbox_Email, TestDataPool.tcData.get("email"));

		// Mailing Info
		op.setText(driver, RegisterPageObj.textbox_Address1, TestDataPool.tcData.get("address1"));
		op.setText(driver, RegisterPageObj.textbox_City, TestDataPool.tcData.get("city"));
		op.setText(driver, RegisterPageObj.textbox_State, TestDataPool.tcData.get("state"));
		op.setText(driver, RegisterPageObj.textbox_PostalCode, TestDataPool.tcData.get("postalcode"));

		/*
		 * WebElement ele =
		 * driver.findElement(By.xpath(RegisterPageObj.dropdown_Country)); Select sel =
		 * new Select(ele); sel.selectByVisibleText("UNITED STATES");
		 */
		//selecting value from dropdown
		op.selectDropdown(driver, RegisterPageObj.dropdown_Country, "UNITED STATES");
		//username and password info
		op.setText(driver, RegisterPageObj.textbox_UserName, TestDataPool.tcData.get("userName"));
		op.setText(driver, RegisterPageObj.textbox_Password, TestDataPool.tcData.get("password"));
		op.setText(driver, RegisterPageObj.textbox_ConfirmPassword, TestDataPool.tcData.get("confirmpass"));
		
		//report and take screenshots
		ReportingUtils.reportResult("Pass", "Registration", "Registration successful!");
        //click on register link
		op.clickLink(driver, RegisterPageObj.link_Submit);
		op.implicitlyWait(driver, 30);
		//Thread.sleep(20000);//static wait Not recommended
	}

}
