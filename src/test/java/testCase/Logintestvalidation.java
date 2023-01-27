package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Homepage;
import pageObject.Loginpage;
import pageObject.Registrationpage;
import testBase.BaseClass;

public class Logintestvalidation extends BaseClass {

	@Test

	public void logintest() {
		
		try
		{
		Homepage hp = new Homepage(driver);
        logger.debug("...create test...");
		hp.clkaccount();
		hp.clkreg();
       logger.info("...registration is started....");
		Registrationpage rp = new Registrationpage(driver);
		rp.setfname(randomstringalphabetgenerated());
		rp.setlname(randomstringalphabetgenerated());
		rp.setemail(randomstringAlphanumericgenerated());
		rp.setpassword(randomstringAlphanumericgenerated());
		rp.setchkbox();
		rp.setchkpriv();
		rp.setlogin();
		rp.setlogout();

		Loginpage lp = new Loginpage(driver);
		lp.setemail1("serferazhussain@gmail.com");
		lp.setpassword("ser@123");
		lp.setlogin1();
		lp.setlogostatus();
		}catch(Exception e)
		{
			Assert.fail();
		}
		

	}

}
