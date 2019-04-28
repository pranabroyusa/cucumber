package stepDefination;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

// Pranab K Roy
// Manisha Roy
// Aditri Roy



public class GoogleClass {
WebDriver driver;
/*	@Given("^User navigate to google$")
	public void user_navigate_to_google() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
	}

	@When("^user enter an \"([^\"]*)\"$")
	public void user_enter_an(String s) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(s);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@jsname='erkvQe']/li[3]")).click();
		Thread.sleep(2000);
		 TakesScreenshot sc = (TakesScreenshot)driver;
		 File srcFile = sc.getScreenshotAs(OutputType.FILE);
		File destFile= new File("C:\\Users\\Pranab Roy\\Desktop\\Images\\abc.png");
		 FileUtils.copyFile(srcFile, destFile);
	   
	}
	@When("^user click search$")
	public void user_click_search() throws Throwable {
		
		
	   
	}

	@Then("^user click on$")
	public void user_click_on() throws Throwable {
		driver.quit();
	  
	}*/
	
	@Given("^User navigate to facebook$")
	public void user_navigate_to_facebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");  
	}

	@When("^user fillup the field$")
	public void user_fillup_the_field(DataTable dt) throws Throwable {
	List<List<String>> s = dt.asLists(String.class);
	System.out.println("f_Name is :"+s.get(1).get(0)+" l_Name is :"+s.get(1).get(1)+" mobile is :"+s.get(1).get(2));
	driver.findElement(By.xpath("//input[@name='firstname']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(s.get(1).get(0));
    
	
		driver.findElement(By.xpath("//input[@name='lastname']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(s.get(1).get(1));  
		driver.findElement(By.xpath("//input[@name='reg_email__']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(s.get(1).get(2));
	
	}
	
	@When("^user fillup the fields \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void user_fillup_the_fields(String s1, String s2, String s3) throws Throwable {
		driver.findElement(By.xpath("//input[@name='firstname']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(s1);
	    
		
			driver.findElement(By.xpath("//input[@name='lastname']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(s2);  
			driver.findElement(By.xpath("//input[@name='reg_email__']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(s3);
	   
	}

}
