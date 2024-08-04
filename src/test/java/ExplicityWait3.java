import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver  = new ChromeDriver();
		

		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button")).click();
		
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Alert alr=driver.switchTo().alert();
	Alert alt=	wait.until(ExpectedConditions.alertIsPresent());
		
	if(alt.getText().contains("Selenium")) {
		System.out.println("Test is Validated");
		alt.accept();

	}
	else {
		System.out.println("Test is failed");
	}
		driver.quit();
		
		
		
	}
}
			