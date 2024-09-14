package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RgistrationPage extends BasePage {

	public RgistrationPage(WebDriver driver) {
		super(driver);
		
	}
@FindBy(xpath="//input[@id='input-firstname']") WebElement firstName;
@FindBy(xpath="//input[@id='input-lastname']") WebElement lastName;
@FindBy(xpath="//input[@id='input-email']") WebElement Mail;
@FindBy(xpath="//input[@id='input-telephone']") WebElement telephone;
@FindBy(xpath="//input[@id='input-password']") WebElement password;
@FindBy(xpath="//input[@id='input-confirm']") WebElement passwordConfirm;
@FindBy(xpath="//input[@name='agree']") WebElement agree;
@FindBy(xpath="//input[@value='Continue']") WebElement continueBtn;

public void firstName(String fname) {
	firstName.sendKeys(fname);
	
}
public void lastName(String lname) {
	lastName.sendKeys(lname);
	
}
public void Mail(String mail) {
	Mail.sendKeys(mail);
	
}
public void telephone(String no) {
	
	telephone.sendKeys(no);
}
public void password(String pwd) {
	
	password.sendKeys(pwd);
}
public void passwordConfirm(String cpwd) {
	
	passwordConfirm.sendKeys(cpwd);
}
public void agree() {
	
	agree.click();
}
public void continueBtn() {
	continueBtn.click();
	
}

}

