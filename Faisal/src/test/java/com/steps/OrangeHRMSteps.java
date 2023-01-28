package com.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.OrangeHRMPages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMSteps {
	WebDriver driver;
	OrangeHRMPages pf;
	@Given("^User go to OrangeHRM home page$")
	public void user_go_to_OrangeHRM_home_page() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		pf= new OrangeHRMPages(driver);
	    
	}

	@Given("^User click on the user name field$")
	public void user_click_on_the_user_name_field() throws Throwable {
		
		//driver.findElement(By.xpath("//*[@name='username']")).click();
		pf.getUsername().click();
	    
	}

	@When("^User type test username in username field$")
	public void user_type_test_username_in_username_field() throws Throwable {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
		pf.getUsername().sendKeys("Admin");
	    
	}

	@When("^User click on the password field$")
	public void user_click_on_the_password_field() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='password']")).click();
    	//pf.getPassword().click();
	    
	}

	@When("^User type test password in password field$")
	public void user_type_test_password_in_password_field() throws Throwable {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
        pf.getPassword().sendKeys("admin123");
	    
	}

	@Then("^User click on the loging button$")
	public void user_click_on_the_loging_button() throws Throwable {
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		pf.getSubmit().click();
		driver.quit();
	    
	}

	


}
