package testBase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RgistrationPage;

public class TC001_AccountRegistration extends BaseClass{
@Test
	public void AccountRegistration() {
	HomePage hp=new HomePage(driver);
	hp.clkAccount();
	hp.clkRegistration();
	
	
	RgistrationPage rp=new RgistrationPage(driver);
	rp.firstName(p.getProperty("firstname"));
	rp.lastName(p.getProperty("lastname"));
	rp.Mail(p.getProperty("email"));
	rp.telephone(p.getProperty("phone"));
	rp.password(p.getProperty("password"));
	rp.passwordConfirm(p.getProperty("confpassword"));
	rp.agree();
	rp.continueBtn();
	
	}
	

	
	
}
