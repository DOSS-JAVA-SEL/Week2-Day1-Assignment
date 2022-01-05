package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;




public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		
		// browser is setting up
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//using the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//to maximize
		driver.manage().window().maximize();
		
		//entering username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");

		//entering password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM/SFA button
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//clicking Leads button
		driver.findElement(By.linkText("Leads")).click();
		
		//clicking create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Entering the Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KAPPA TRANSFORMERS");
		
		//Entering the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DOSS");
		
		//Entering the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		
		//Entering the source
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select createLeadForm_dataSourceId = new Select(source);
		createLeadForm_dataSourceId.selectByValue("LEAD_PARTNER");
		
		//Entering the prefered currency
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select createLeadForm_currencyUomId = new Select(currency);
		createLeadForm_currencyUomId.selectByValue("INR");
		
		//Entering Marketing campain
		WebElement campaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select createLeadForm_marketingCampaignId = new Select(campaign);
	    createLeadForm_marketingCampaignId.selectByValue("CATRQ_AUTOMOBILE");
	    
	    //Entering Industry
	    WebElement eindustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    Select createLeadForm_industryEnumId = new Select(eindustry);
	    createLeadForm_industryEnumId.selectByValue("IND_DISTRIBUTION");
	    
	    
	    //Entering ownership
	    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select createLeadForm_ownershipEnumId = new Select(ownership);
	    createLeadForm_ownershipEnumId.selectByValue("OWN_PARTNERSHIP");
		
		//Entering First Name (Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RRD");
		
		//Entering Salutation
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		
		//Entering Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("ENGINEER");
		
		//Entering Annual Revenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
		
		//Entering SIC code
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("76");
		
		//Entering LastName Local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("DOSS");
		
		//Entering birthdate
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("1/1/2022");
		
		//Entering department name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		
		//Entering no of employees
		driver.findElement(By.name("numberEmployees")).sendKeys("100");
		
		//Entering ticker symbol
		driver.findElement(By.name("tickerSymbol")).sendKeys("$$$");
		
		//Entering Description
		driver.findElement(By.name("description")).sendKeys("Exporter to MNCs");
		
		//Entering important note
		driver.findElement(By.name("importantNote")).sendKeys("Having ISI standards");
		
		//contact informations
		
		//Entering country code
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		
		//Entering Area Code
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("603002");
		
		//Entering Extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("Tamilnadu");
		
		//Entering E-Mail address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Doss@testleaf.com");
		
		//Entering Phone no
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("044-12345678");
		
		//Entering the person to ask for
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mr.XYZ");
		
		//Entering the web url
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");
		

		
		//primary Address
		
		//Entering To Name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Testleaf");
		
		//Entering Address line 1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("10,ist street,ABC Nagar");
		
		//Entering City
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Nanganallur,chennai");
		
		//Entering Zip/postalcode
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603002");
		
		//Entering Zipcode extension
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("+11");
		
		//Entering Attention name
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("TestLeafInstitute");
		
		//Entering Address line 2
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("near Meenambakkam srailway station");
		
		//Entering the country
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown1 = new Select(country);
		dropdown1.selectByVisibleText("India");
		
		Thread.sleep(5000);
		
		//Entering the state/province
				WebElement pro = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select createLeadForm_generalStateProvinceGeoId = new Select(pro);
				createLeadForm_generalStateProvinceGeoId.selectByVisibleText("TAMILNADU");	
		
				Thread.sleep(5000);	
		
		//clicking create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys();
	
		
		
		
		
		
		
	}

}
