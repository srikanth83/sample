package LSR.Passport;

import java.net.URL;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class LostorStolenStepDefinitions {

	private WebDriver driver;
	
	@Given("^an instance of \"(.*?)\" browser$")
	public void anInstanceOfBrowser(final String browserName) throws Throwable {
		this.driver.manage().window().maximize();
		if(browserName.equalsIgnoreCase("Firefox")){
			  this.driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.firefox());
		}
		else if (browserName.equalsIgnoreCase("Chrome")){
			
			System.setProperty("webdriver.chrome.driver", "/chromedriver/chromedriver.exe");
			DesiredCapabilities dc = DesiredCapabilities.chrome();
			dc.setCapability(ChromeOptions.CAPABILITY, browserName);
			
			  this.driver = new ChromeDriver();
		}
		}

	@When("^the url \"(.*?)\" is opened$")
	public void theUrlIsOpened(String url) throws Throwable {
	   this.driver.get(url);
	}

	@Then("^the lost or stolen user interface is presented$")
	public void theLostOrStolenUserInterfaceIsPresented() throws Throwable {
	   Assert.assertTrue(this.driver.findElement(By.id("startForm")).isDisplayed());


	}
	
	@Then("^the user clicks start now$")
	public void theUserClicksStartNow() throws Throwable {
	 this.driver.findElement(By.id("startForm")).click();
	}

	@Then("^selects child under (\\d+) and clicks continue$")
	public void selectsChildUnderAndClicksContinue(int arg1) throws Throwable {
	 this.driver.findElement(By.id("ReportType_holder_holder_1")).click();
	 this.driver.findElement(By.id("submitNext")).click();
	}

	@Then("^enters valid name and telephone number$")
	public void entersValidNameAndTelephoneNumber() throws Throwable {
	    this.driver.findElement(By.id("ReportType_reporter_child_fullName")).sendKeys("sree");
	    this.driver.findElement(By.id("ReportType_reporter_child_telephone")).sendKeys("07950731996");
	}

	@Then("^clicks submit$")
	public void clicksSubmit() throws Throwable {
		 this.driver.findElement(By.id("submitNext")).click();
	}

	@Then("^close the browser$")
	public void closeTheBrowser() throws Throwable {
		 this.driver.quit();
	}

}
