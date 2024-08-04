import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.rediff.com/");

		driver.switchTo().frame("mukesh");
	
		String bseIndex=driver.findElement(By.id("bseindex")).getText();
		
		System.out.println("Current Index Value is "+bseIndex);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
}
}
