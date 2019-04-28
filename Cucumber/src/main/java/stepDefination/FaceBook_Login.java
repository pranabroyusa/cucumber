package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBook_Login {
	WebDriver driver;
	
	
	@Before
	public void startUp()
	{
		System.out.println("***********************StartUp***Login*****************");
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
	

  /* @Given("^I login Facebook$")
	public void i_login_Facebook() throws Throwable {
	 
		driver.get("https://www.facebook.com/");

	   
	}*/
	

	@When("^I enter userName \"([^\"]*)\"$")
	public void i_enter_userName(String userName) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(userName);
		
	 
	}

	@Then("^I enter passWord \"([^\"]*)\"$")
	public void i_enter_passWord(String password) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	
	
	@Then("^I click submit$")
	public void i__click_submit() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
	}
	

	
}
