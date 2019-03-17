package pageFlows;

import org.openqa.selenium.WebDriver;

import infrastructure.Operations;
import pageObjects.HomePageObj;

public class HomePage {
	Operations op = new Operations();

	public void registration(WebDriver driver) {
		op.implicitlyWait(driver, 20);
		op.clickLink(driver, HomePageObj.link_Register);

	}

}
