import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		List<WebElement>allFrames=driver.findElements(By.xpath("//iframe"));

		
		for(WebElement frames: allFrames) {
			
			if (frames.getAttribute("src").equalsIgnoreCase("newimad"))
			{
			driver.switchTo().frame(driver.findElements(By.xpath("(//a[contains(@id,'clickArea_Tile_Box_HP') and text()='MENSWEAR'])[1]")).get(0));
			
			driver.getTitle();
			
			
			
			}

			
		}
		
		

	}
}
