import java.time.Duration;
import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class AssignmentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//List<WebElement> totalelements=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='social-btns']/a")));
		
		List<WebElement> elements=wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='social-btns']/a"), 9));
		int size=elements.size();
		System.out.println("Total size is "+size);
		
		for(int i=0;i<size;i++)
		{
			String socialbtn=elements.get(i).getAttribute("href");
			System.out.println("Social Button  is "+socialbtn);
			
			if(socialbtn.equalsIgnoreCase("Linkedin")) {
				System.out.println("Social Button  is "+socialbtn);
				elements.get(i).click();
				break;
			}
			else {
				System.out.println("link is not clickable");
			}
		}
		
		
		
	}
}
