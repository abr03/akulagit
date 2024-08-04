import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("moneyiframe");
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'money')]")));
		
		//a[@target='_blank']//span[contains(text(),'BSE')]
		//a[@target='_blank']//span[text()='BSE']
		driver.findElement(By.xpath("//a[@target='_blank']//span[text()='BSE']"));
		
		System.out.println(driver.findElement(By.xpath("//a[@target='_blank']//span[text()='BSE']")).getText());
	}

}
