package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseFile
{
	public static WebDriver driver;
	
	@BeforeClass
	public void setUpBrowser()
	{
		 driver = new FirefoxDriver();	
		 driver.get("https://www.shutterfly.com");
		 PageFactory.initElements(driver,this);
	}
	
	@AfterClass
	public static void closeBrowser()
	{
		driver.quit();
	}
}


/*1. Eclipse
Eclipse IDE for Java Developers

Version: Neon Release (4.6.0)
Build id: 20160613-1800

2. Selenium:
2.53.1

3. Firefox
46.0

4.FireBug 2.0.19

5. FirePath :
0.9.7.1.1-signed.1-signed

6. Apache POI 3.17*/