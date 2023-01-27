package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registrationpage extends BasePage {
	
	public Registrationpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(name="firstname")WebElement fname;
	@FindBy(name="lastname")WebElement lname;
	
	@FindBy(name="email")WebElement email;
	@FindBy(name="password")WebElement passwd;
	@FindBy(xpath="//*[@id=\"input-newsletter-yes\"]")WebElement chksub;
	@FindBy(name="agree")WebElement chkprivp;
	@FindBy(xpath="//*[@id=\"form-register\"]/div/div/button")WebElement login;
	@FindBy(xpath="//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span")WebElement account2; 
	@FindBy(xpath="//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[5]/a")WebElement logout;
	
	public void setfname(String uname)
	{
		fname.sendKeys(uname);
	}
	public void setlname(String lnam)
	
	{
		lname.sendKeys(lnam);
	}
	public void setemail(String eml)
	{
		email.sendKeys(eml);
	}
	public void setpassword(String pawd)
	{
		passwd.sendKeys(pawd);
	}
	public void setchkbox()
	{
		chksub.click();
	}
	public void setchkpriv()
	{
		chkprivp.click();
	}
	public void setlogin()
	{
		login.click();
	}
	public void setaccount2()
	{
		account2.click();
	}
	public void setlogout()
	{
		logout.click();
	}

}
