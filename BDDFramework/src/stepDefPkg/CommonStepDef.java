package stepDefPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonFunction.WebBrowser;
import commonFunction.WebElementCommon;
import commonFunction.WebTextBox;
import cucumber.api.java.en.Given;
import junit.framework.Assert;

public class CommonStepDef {
	
    WebDriver driver =null;
	@Given("^As a user,i want to open \"([^\"]*)\" browser$")
	public void openBrowser(String browserName)  {
	  System.out.println(browserName);
	  driver = WebBrowser.openBrowser(browserName);
	}
	@Given("^As a user i want to enter \"([^\"]*)\" url$")
	public void enterUrl(String url)  {
	  WebBrowser.openURL(driver,url);
	 }
	@Given("^AS a user i want to enter \"([^\"]*)\" using locator type \"([^\"]*)\"with value \"([^\"]*)\"$")
	public void enterText(String valueEnter ,String locatorType,String locatorValue){
		WebTextBox.sendKeys(driver, valueEnter, locatorType, locatorValue);
	}
	@Given("^AS a user i want to click button using locator type \"([^\"]*)\"with value \"([^\"]*)\"$")
	public void clickOnLogin(String locatorType,String locatorValue)  {
		WebElementCommon.getElement(driver, locatorType, locatorValue).click();
	}
	@Given("^AS a user i want to i want to validate page title \"([^\"]*)\"$")
	public void titleValidation(String expectedTitle
			)  {
		Assert.assertEquals(WebBrowser.validateTitle(driver, expectedTitle),true);
	  
	}
	}
	    
public void enterUrl(String url)  {}

