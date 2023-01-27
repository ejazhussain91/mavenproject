package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span")
	WebElement account;

	@FindBy(xpath = "//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a")
	WebElement register;

	public void clkaccount() {
		account.click();
	}

	public void clkreg() {
		register.click();
	}

}
