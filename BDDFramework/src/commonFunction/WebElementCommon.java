package commonFunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementCommon {
 public static WebElement getElement(WebDriver driver,String locatorType,String locatorValue) {
	 WebElement element=null;
	 switch (locatorType) {
	 case"id":
		 element=driver.findElement(By.id(locatorValue));
		 break;
	 case"name":
		 element=driver.findElement(By.name(locatorValue));
		 break;
	 case"xpath":
		 element=driver.findElement(By.xpath(locatorValue));
		 break;
	 case"linktext":
		 element=driver.findElement(By.linkText(locatorValue));
		 break;
	  }

	return element;
}
 
	
}
