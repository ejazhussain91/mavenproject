package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Loginpage extends BasePage {
	
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(name="email")WebElement email1;
	
	@FindBy(name="password")WebElement password1;
	
	@FindBy(xpath="//*[@id=\"form-login\"]/button")WebElement login1;
	
	@FindBy(xpath="//*[@id=\"logo\"]/a/img")WebElement logo;
	
	
	public void setemail1(String ueml)
	{
		email1.sendKeys(ueml);
	}
	public void setpassword(String pwd)
	{
		password1.sendKeys(pwd);
	}
	public void setlogin1()
	{
		login1.click();
	}
	public void setlogostatus()
	{
		boolean status=logo.isDisplayed();
		Assert.assertEquals(status,true);
		System.out.println("Congratulation Test is passed");
	}

}
