package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpOrSignInPage extends BaseFile
{
	@FindBy(name="firstName")
	public static WebElement name;
	
	public static void signUp()
	{
		name.sendKeys("name");
	}
}
