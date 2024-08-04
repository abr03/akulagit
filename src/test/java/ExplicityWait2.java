import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExplicityWait2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver  = new ChromeDriver();
		

		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button")).click();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		 * 
		 * driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 */
		

		for(int i=0;i<15;i++)
		{
			try 
			{
				Alert alt=driver.switchTo().alert();
				
				String alt_text=alt.getText();
				
				if(alt_text.contains("Selenium"))
				{
					System.out.println("Text Validated");
				}
				else
				{
					System.out.println("Could Not  Validate The Text");
				}
				break;
			}
			catch(NoAlertPresentException e)
			{
				System.out.println("Alert not present - waiting for alert to appear ");
			}
			
			Thread.sleep(500);
			
		}
		
		
		
		driver.quit();

		
		
	}
}
			