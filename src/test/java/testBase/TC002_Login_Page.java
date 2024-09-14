package testBase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.LoginSucss;

public class TC002_Login_Page extends BaseClass{
@Test
	public void logingPage() {
	LoginPage lp=new LoginPage(driver);
	lp.ClkAccount();
	lp.login();
	
	LoginSucss ls=new LoginSucss(driver);
	ls.MailAddress(p.getProperty("email"));
	ls.password(p.getProperty("password"));
	ls.login();
	}
	
	}

