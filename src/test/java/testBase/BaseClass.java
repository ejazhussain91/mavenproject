package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    
	public Logger logger;
	public WebDriver driver;

	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		logger=LogManager.getLogger(this.getClass());
		
		if(br.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/index.php");

	}

	/*@AfterClass
	public void teardown() {
		driver.quit();
	}*/
	
	public String randomstringalphabetgenerated()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return (generatedstring);
	}
	public String randomnumericgenerated()
	{
		String generatednum=RandomStringUtils.randomNumeric(5);
		return (generatednum);
	}
	public String randomstringAlphanumericgenerated()
	{
		String st1=RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomNumeric(5);
		return(st1+"@"+num);
	}

}
