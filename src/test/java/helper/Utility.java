package helper;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	public static void selectValueFromList(WebDriver driver,String xpathValue,String value)
	{
		
		List<WebElement> allValues=driver.findElements(By.xpath(xpathValue));
		
		for(WebElement ele:allValues)
		{
			if(ele.getText().equalsIgnoreCase(value))
			{
				ele.click();
				
				break;
			}
		}
		
		
	}
	
	public static void selectValueFromList(WebDriver driver,By locator,String value)
	{
		
		List<WebElement> allValues=driver.findElements(locator);
		
		for(WebElement ele:allValues)
		{
			if(ele.getText().equalsIgnoreCase(value))
			{
				ele.click();
				
				break;
			}
		}
		
		
	}

	
	public static WebDriver startBrowser(String appURL)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(appURL);
		
		return driver;
		
	}
	
	public static void  startBrowserHeadless(String browser,String appURL)
	{
		//WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get(appURL);
			ChromeOptions options = new ChromeOptions();
			options. addArguments("headless");
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			FirefoxDriver driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			EdgeDriver driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			SafariDriver driver=new SafariDriver();
		}
		else
		{
			System.out.println("Sorry Currently We Do Not Support "+browser);
		}
		
		//driver.manage().window().maximize();
		
		
		//return driver;
		
	}


	public static WebDriver startBrowser(String browser,String appURL)
	{
		WebDriver driver=null;
		
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}
		else
		{
			System.out.println("Sorry Currently We Do Not Support "+browser);
		}
		
		//driver.manage().window().maximize();
		
		driver.get(appURL);
		
		return driver;
		
	}
	
	public static WebDriverWait setExplicitWait(WebDriver driver) {
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait;
		
	}
	
	public static void sleep(int seconds) {
		
		try {
			Thread.sleep(seconds*1000);
		}catch(InterruptedException e) {
			
		}
	}
	
	

}
