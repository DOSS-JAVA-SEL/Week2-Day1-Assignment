package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCase2 {

	public static void main(String[] args) {
		
		//setting the browser and it driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//entering the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximizing the screen
		driver.manage().window().maximize();
		
		//entering username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		
		
		//entering password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//clicking the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//clicking CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//clicking Contacts
		driver.findElement(By.linkText("Contacts")).click();
		
		//clicking findcontacts
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//clicking email
		driver.findElement(By.xpath("(//span[text()='Email'])")).click();
		
		//entering emailaddress
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
		
		//clicking find contact
		driver.findElement(By.xpath("//button[text() = 'Find Contacts']")).click();
		
		//close the driver
		driver.close();
		
		
		
		

	}

}
