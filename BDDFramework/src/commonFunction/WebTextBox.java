package commonFunction;

import org.openqa.selenium.WebDriver;

public class WebTextBox {
    public static void sendKeys(WebDriver driver,String valueEnter ,String locatorType,String locatorValue) {
    	WebElementCommon.getElement(driver,locatorType, locatorValue).sendKeys(valueEnter);
    	
    	
	
}
}
