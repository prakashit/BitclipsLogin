package StepDefinaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	WebDriver driver ;	
	 @Given("^Open Chrome and start application$")
	// public void Open_firefox_and_start_application()throws Throwable{
//System.setProperty("webdriver.gecko.driver","C://Prakash//geckodriver-v0.19.0-win64//geckodriver.exe");
	 public void Open_Chrome_and_start_application()throws Throwable{
		 System.setProperty("webdriver.chrome.driver", "C:\\Prakash\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://providers.bidclips.ml");
	 }
	 		
	
	@Given("^username exists in the database$")
	public void username_exists_in_the_database() throws Throwable {
		
		System.out.println("@Given - Verify User name Exist-" );
	   
	}

	@Given("^password is valid in the database$")
	public void password_is_valid_in_the_database() throws Throwable {
		
		System.out.println("@Given - Verify Valid  Password-");
	    
	}

	@When("^provider user is on the login page$")
	public void provider_user_is_on_the_login_page() throws Throwable {
		
		System.out.println("@When - Provider Login page-");
	    
	}

	@When("^enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_valid_username_and_password(String username, String password) throws Throwable {
		
	   driver.findElement(By.xpath(".//*[@id='usernameOrEmail']")).sendKeys(username);
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		System.out.println("@When -Enter valid user password-");
	    
	}

	@When("^hits the login button$")
	public void hits_the_login_button() throws Throwable {
		
		System.out.println("@When -Click on Login button-");
		driver.findElement(By.xpath(".//button[contains(.,'Login')]")).click();
	    
	}
           
	@Then("^login provider and show the forms coming-in from the consumers$")
	
	public void login_provider_and_show_the_forms_coming_in_from_the_consumers() throws Throwable {
		
		System.out.println("@Then -Provide show consumers-");
	  
	}
	
	@Then("^Click on Logout button$")
public void hits_the_Logout_button() throws Throwable {
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div[1]/div/div[2]/div/div[3]/div/div[1]")).click();
		System.out.println("@Then -Click on Logout button-");
	    
	}
	

	@Given("^username does not exist in the database$")
	public void username_does_not_exist_in_the_database() throws Throwable {
		
		System.out.println("@Given -verify user name not exit in database-");
	    
	}

	@When("^enters invalid username$")
	public void enters_invalid_username(String username, String password) throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='usernameOrEmail']")).sendKeys(username);
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			
			System.out.println("@When -Enter valid user password-");
		
		}

	@Then("^show message to the provider on the login page \"([^\"]*)\"$")
	public void show_message_to_the_provider_on_the_login_page(String arg1) throws Throwable {
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		System.out.println("@Then -Provider show message-");
		driver.close();
	 
	}
    




}
