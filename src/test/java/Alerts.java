import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();

		
		String alerbpx=alt.getText();
		System.out.println(alerbpx);
		
		
		if(alerbpx.contains("alerbpx")) {
			System.out.println("Validation 1 is passed ");
		}
		else {
			driver.findElement(By.xpath("//button[contains(text(),'Click for JS Promp')]")).click();
			//driver.switchTo().alert();
			alt.accept();

		}
		

	}

}
