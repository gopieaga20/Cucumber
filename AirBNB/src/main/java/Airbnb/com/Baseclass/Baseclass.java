package Airbnb.com.Baseclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	public static WebDriver driver;

	public static void Browser_launch(String Url) {
		try {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
	driver.get(Url);
	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("Unable to Launch Browser : "+e.getMessage());
		}
		
	}
	
	public static void element_Click(WebElement element) {
	
try {
	highlighter(element);
	element.click();
} catch (Exception e) {
	System.out.println("Unable to Click : "+e.getMessage());
}
	}
	
	public static void AClick(WebElement element) {
		
try {
	highlighter(element);
	Actions ac=new Actions(driver);
	ac.click(element).build().perform();
} catch (Exception e) {
	System.out.println("Unable to Click : "+e.getMessage());
}
	}
	
	public static void element_Senkeys(WebElement element,String value) {
		try {
			highlighter(element);
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Unable to Send Value : "+e.getMessage());
		}

	}
	
	public static void window_handle(String Window_name) {
		// TODO Auto-generated method stub
Set<String> windowHandles = driver.getWindowHandles();
for (String id : windowHandles) {
	if (Window_name.equals(driver.switchTo().window(id).getTitle())) {
		break;
	}
}
	}
	
	
	public static void highlighter(WebElement element) {
	WebDriverWait wb= new WebDriverWait(driver, 30);
	wb.until(ExpectedConditions.visibilityOfAllElements(element));
	try {
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
	} catch (Exception e) {
		// TODO: handle exception
	}
try {
	 JavascriptExecutor js=(JavascriptExecutor)driver;   
	 js.executeScript("arguments[0].style.border='4px groove yellow'", element);  
} catch (Exception e) {
	// TODO: handle exception
}
	}
	
	public static boolean element_is_enabled(WebElement element) {
		boolean enable=false;
try {
	highlighter(element);
	enable=element.isEnabled();
} catch (Exception e) {
	// TODO: handle exception
}
return enable;
	}
	
	public static boolean element_is_displayed(WebElement element) {
		boolean display=false;
		try {
			highlighter(element);
			display=element.isDisplayed();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return display;
	}
	
	public static void Assert_true_with_Isdisplayed(WebElement element) {
			Assert.assertTrue("Assertion failed : ",element_is_displayed(element));

	}
	
	public static void scroll(WebElement element) throws Throwable {
		// TODO Auto-generated method stub
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(2000);
	}
	
	
}
