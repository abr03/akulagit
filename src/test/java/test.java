import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
		///AutoSuggestions
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Bhaskar");
		Thread.sleep(2000);

		//List<WebElement> TotalResults=driver.findElements(By.xpath("//div[@role='option']//div[@role='presentation' and not(@style)]//span"));
		
		List<WebElement> allSuggestions=driver.findElements(By.xpath("//div[@role='option']//div[@role='presentation']//span"));

		
		
		System.out.println("No of Results are " +allSuggestions.size());
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for (WebElement ele: allSuggestions) {
			
			String resultname=ele.getText();
			System.out.println("Results for Test "+resultname);

			
		}
		
	}

}
