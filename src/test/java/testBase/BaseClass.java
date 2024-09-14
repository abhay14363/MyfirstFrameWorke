package testBase;


import org.testng.annotations.AfterMethod;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	public WebDriver driver;
	public Properties p;
	@BeforeClass
	@Parameters({"browser"})
	public void Setup(String br) throws IOException {
		
		FileReader file=new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		switch (br.toLowerCase()){
		case "chrome" : driver=new ChromeDriver();break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver();break;
		case "default" : System.out.println("invalid browser");return;
		}
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	@AfterClass
	 public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}