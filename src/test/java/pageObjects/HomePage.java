package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnMyaccount;
	@FindBy(xpath="//a[@class='dropdown-item'and text()='Register']")
	WebElement lnRegister;
	
	public void MyAccountClick()
	{
		lnMyaccount.click();
	}
	public void ClickRegister()
	{
		lnRegister.click();
	}
}
