import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		// partial match
		wait.until(ExpectedConditions.titleContains("Selenium"));
		
		// complete match
		wait.until(ExpectedConditions.titleIs("Welcome To Selenium"));
		
		// elemement count
		wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//input[@id='selenium']"), 5));
		
		wait.until(ExpectedConditions.urlContains("signup"));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		// u can avoid since elementToBeClickable check present +visible+enable
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
		
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(""))));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		
		wait.until(ExpectedConditions.textToBe(By.id(""), "Tran completed"));
		
}	}	