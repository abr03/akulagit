import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window Handle "+parentWindow);
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElements(By.xpath("//a[contains(@href,'MukeshOtwani')]")).get(0).click();
			
		Set <String>allWindows= driver.getWindowHandles();
		
		
		
		for (String handle:allWindows) {
			System.out.println("Handles are "+handle);
			
			
			if(!parentWindow.equalsIgnoreCase(handle)) {
				
				driver.switchTo().window(handle);
				Thread.sleep(4000);
				
			String title=	driver.getTitle();
			
			if(title.contains("Youtube")) {
				Thread.sleep(2000);

				System.out.println("Switched To Child Tab");

			}
			driver.close();

			}
			driver.switchTo().window(parentWindow);

		}
		
			
		if(driver.getTitle().contains("Courses")) {
			System.out.println("Switched To Parent Tab");
		}
		else
		{
			System.out.println("Could not Switched To Parent Tab");
		}
		
		driver.quit();


	}

	
}
