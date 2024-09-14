package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement clkAccount ;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement clkRegistration ;
	
	public void clkAccount() {
		clkAccount.click();
	}
	
	public void clkRegistration() {
		clkRegistration.click();
	}
}
