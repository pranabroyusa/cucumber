package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook_Signup {
	WebDriver driver;
	@Before
	public void startUp()
	{
		System.out.println("***********************StartUp****Signup************************");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	public void close()
	{
		driver.close();
		driver.quit();
		System.out.println("***********************close****************************");
	}
	
	@Given("^I login Facebook$")
	public void i_login_Facebook() throws Throwable {
		
		driver.get("https://www.facebook.com/");
	   
	}

	
	@When("^I enter firstName \"([^\"]*)\"$")
	public void i_enter_lastName(String f_Name) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='u_0_c']")).sendKeys(f_Name);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(f_Name);
	    
	}

	@Then("^I enter lastName \"([^\"]*)\"$")
	public void i_enter_firstName(String l_Name) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(l_Name);  
	}


	
	@Then("^I enter email \"([^\"]*)\"$")
	public void i_enter_email(String email) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email); 
	}

	

}
