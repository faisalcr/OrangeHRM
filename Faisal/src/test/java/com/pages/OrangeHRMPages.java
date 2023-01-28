package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPages {

	public OrangeHRMPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (how = How.XPATH, using = "//*[@name='username']")	
	private static WebElement username;
	
	@FindBy (how = How.XPATH, using = "//*[@name='password']")	
	private static WebElement password;
	
	@FindBy (how = How.XPATH, using = "//*[@type='submit']")	
	private static WebElement submit;
	
	
	public static WebElement getSubmit() {
		return submit;
	}
	public static void setSubmit(WebElement submit) {
		OrangeHRMPages.submit = submit;
	}
	public static WebElement getPassword() {
		return password;
	}
	public static void setPassword(WebElement password) {
		OrangeHRMPages.password = password;
	}
	public static WebElement getUsername() {
		return username;
	}
	public static void setUsername(WebElement username) {
		OrangeHRMPages.username = username;
	}

}
