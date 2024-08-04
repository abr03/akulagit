import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExplicityWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver  = new ChromeDriver();
		

		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button")).click();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		for (int i=0; i <10; i++) {
			
			try {

			Alert alt=	driver.switchTo().alert();
			//Thread.sleep(500);

			String alert=alt.getText();
			System.out.println(alert);
	
			if(alert.contains("Selenium")) {
				System.out.println(alt.getText());
				alt.accept();
			}
			else {
				System.out.println("Alert not found");
				alt.dismiss();
			}
			break;
				
			}
			catch (NoAlertPresentException e)
			{
				
				System.out.println("Exception  found"+i);
				
			}
		}
		Thread.sleep(500);

		}
		
	}
			