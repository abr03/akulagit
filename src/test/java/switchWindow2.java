import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchWindow2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window is "+parentWindow);
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		driver.findElements(By.xpath("//a[contains(@href,'MukeshOtwani')]")).get(0).click();
		
	Set<String>allWindow=driver.getWindowHandles();
	
	
	Iterator<String>listofWindows=allWindow.iterator();
	
	while(listofWindows.hasNext())
	{
		
		String childwindow=listofWindows.next();
		System.out.println("Child window----"+childwindow);
		Thread.sleep(2000);

		if(!childwindow.equalsIgnoreCase(parentWindow)) {
			driver.switchTo().window(childwindow);
			Thread.sleep(2000);

			System.out.println(driver.getTitle());

	}
		
		
}
	driver.switchTo().window(parentWindow);
	
	System.out.println(driver.getTitle());
}
}
