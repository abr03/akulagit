import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class breakOutsessionAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
	
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		int price1=Integer.parseInt(driver.findElement(By.xpath("//h2[normalize-space()='Cypress']//following::span[3]/b")).getText().substring(1));
		
		System.out.println("Price "+price1);
		
		driver.findElement(By.xpath("//h2[normalize-space()='Cypress']//following::button[1]")).click();
				
		int price2=Integer.parseInt(driver.findElement(By.xpath("//h2[normalize-space()='Selenium']//following::span[3]/b")).getText().substring(1));
		
		System.out.println("Price "+price2);
		
		driver.findElement(By.xpath("//h2[normalize-space()='Selenium']//following::button[1]")).click();
		
		if(Integer.parseInt(driver.findElement(By.xpath("//span[@class='count']")).getText())==2)
		{
			System.out.println("Count Verified");
		}
		else
		{
			System.out.println("Count Verification Failed");
			
		}
		
		driver.findElement(By.xpath("//button[@class='cartBtn']")).click();
		
		int finalPrice=Integer.parseInt(driver.findElement(By.xpath("//div[@class='top-container']//b")).getText().substring(1));
		
		if(finalPrice==(price1+price2))
		{
			System.out.println("Total Verified");
		}
		else
		{
			System.out.println("Total Amount Is Invalid");
		}
		
		driver.findElement(By.xpath("//button[normalize-space()='Enroll Now']")).click();
	
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9090897867");
		
		driver.findElement(By.xpath("//button[@class='action-btn']")).click();
		
		String orderID=driver.findElement(By.xpath("//h4[@class='uniqueId']//b")).getText();
		
		System.out.println("Order id is "+orderID);
		
		if(orderID!=null)
		{
			System.out.println("Order validated");
		}
		else
		{
			System.out.println("Could Not Validate The Order");
		}
		driver.quit();
	}
}
