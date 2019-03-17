package infrastructure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Operations {

	// Clicking link or button
	public void clickLink(WebDriver driver, String xpathExpression) {
		try {
			driver.findElement(By.xpath(xpathExpression)).click();
			System.out.println("Clicked the link - "+ xpathExpression );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Typing input value in textbox
	public void setText(WebDriver driver, String xpathExp, String inputValue) throws InterruptedException {
		driver.findElement(By.xpath(xpathExp)).clear();
		driver.findElement(By.xpath(xpathExp)).sendKeys(inputValue);
		System.out.println("setText - "+xpathExp + " - "+inputValue);

	}

	// Select a values from dropdown
	public void selectDropdown(WebDriver driver, String xpathExpression, String inputValue) throws Exception {
		WebElement ele = driver.findElement(By.xpath(xpathExpression));
		Select sel = new Select(ele);
		sel.selectByVisibleText(inputValue);
		System.out.println(inputValue);
		System.out.println("selectDropdown - "+xpathExpression + " - "+inputValue);
	}

	// Get text from page
	public String getText(WebDriver driver, String xpathExpression) {
		String value = driver.findElement(By.xpath(xpathExpression)).getText();
		return value;
	}

	// get the title of page
	public String getTitle(WebDriver driver, String xpathExpression) throws InterruptedException {
		String Title = driver.getTitle();
		return Title;
	}

	// Clicking on Radio button
	public void ClickRadioBtn(WebDriver driver, String xpathExpression) {
		driver.findElement(By.xpath(xpathExpression)).click();
		System.out.println("clickRadiobutton - "+xpathExpression);

	}
	//Check the checkbox
		public void clickCheckbox(WebDriver driver, String xPathExpression){
			driver.findElement(By.xpath(xPathExpression)).click();
			System.out.println("clickCheckbox - "+xPathExpression);
			
		}
	// Selecting checkbox with inputValue (isSelected = Yes or No)
	public void clickCheckbox(WebDriver driver, String xpathExpression, String inputval)
	{
		//driver.findElement(By.xpath(xpathExpression)).isSelected()

		if(inputval.equalsIgnoreCase("Yes"))
		driver.findElement(By.xpath(xpathExpression)).click();
	}

	// Implicit wait
	public void implicitlyWait(WebDriver driver, long maxTimeout) {
		driver.manage().timeouts().implicitlyWait(maxTimeout, TimeUnit.SECONDS);

	}

}
