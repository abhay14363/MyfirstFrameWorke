package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement ClkAccount;

@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") WebElement login;

public void ClkAccount() {
	ClkAccount.click();
}
public void login() {
	login.click();
}

}
