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

public class LostorStolenStepDefinitions {

	private WebDriver driver;
	
	@Given("^an instance of \"(.*?)\" browser$")
	public void anInstanceOfBrowser(final String browserName) throws Throwable {
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

	@SuppressWarnings("deprecation")
	@Then("^the lost or stolen user interface is presented$")
	public void theLostOrStolenUserInterfaceIsPresented() throws Throwable {
	   Assert.assertTrue(this.driver.findElement(By.id("startForm")).isDisplayed());


	}
}
