package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		
		
		//Setting up browsers and drivers
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the browser
		driver.manage().window().maximize();

		//entering username
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("DemoSalesManager");
				
				
				//entering password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//clicking Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//clicking CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//clicking contacts
		driver.findElement(By.linkText("Contacts")).click();
		
		//clicking create contacts
		driver.findElement(By.linkText("Create Contact")).click();
		
		//type the first name
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("DOSS");
		
		//type lastname
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("R");
		
		//Click create contact button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//retrieve the first name 
		String firstname = driver.findElement(By.xpath("//input[@id='firstNameField']")).getText();
		System.out.println(firstname);
		
		//retrieve the browser title
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//close the browser
		driver.close();
		
		
	}

}
