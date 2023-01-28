package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class KartPages {
	public KartPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//p[@class='product-price']")
	private static List<WebElement> allPrices;

	@FindBy(how = How.XPATH, using = "//*[@alt='Cart']")
	private static WebElement cartButton;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'PROCEED TO CHECKOUT')]")
	private static WebElement checkoutButton;

	@FindBy(how = How.XPATH, using = "//*[@class='totAmt']")
	private static WebElement totalAmt;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Place Order')]")
	private static WebElement placeOrderButton;

	@FindBy(how = How.XPATH, using = "//*[@style=\"width: 200px;\"]")
	private static WebElement chooseOption;

	@FindBy(how = How.XPATH, using = "//*[@value='\" + arg1 + \"']")
	private static WebElement chooseCountry;

	@FindBy(how = How.XPATH, using = "//*[@type='checkbox']")
	private static WebElement checkBox;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Proceed')]")
	private static WebElement proceed;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Thank you, your order has been placed successfully')]")
	private static WebElement verifyText;

	public static WebElement getVerifyText() {
		return verifyText;
	}

	public static void setVerifyText(WebElement verifyText) {
		KartPages.verifyText = verifyText;
	}

	public static WebElement getProceed() {
		return proceed;
	}

	public static void setProceed(WebElement proceed) {
		KartPages.proceed = proceed;
	}

	public static WebElement getCheckBox() {
		return checkBox;
	}

	public static void setCheckBox(WebElement checkBox) {
		KartPages.checkBox = checkBox;
	}

	public static WebElement getChooseOption() {
		return chooseOption;
	}

	public static void setChooseOption(WebElement chooseOption) {
		KartPages.chooseOption = chooseOption;
	}

	public static WebElement getChooseCountry() {
		return chooseCountry;
	}

	public static void setChooseCountry(WebElement chooseCountry) {
		KartPages.chooseCountry = chooseCountry;
	}

	public static WebElement getCheckoutButton() {
		return checkoutButton;
	}

	public static void setCheckoutButton(WebElement checkoutButton) {
		KartPages.checkoutButton = checkoutButton;
	}

	public static WebElement getTotalAmt() {
		return totalAmt;
	}

	public static void setTotalAmt(WebElement totalAmt) {
		KartPages.totalAmt = totalAmt;
	}

	public static WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}

	public static void setPlaceOrderButton(WebElement placeOrderButton) {
		KartPages.placeOrderButton = placeOrderButton;
	}

	public static WebElement getCartButton() {
		return cartButton;
	}

	public static void setCartButton(WebElement cartButton) {
		KartPages.cartButton = cartButton;
	}

	public List<WebElement> getAllPrices() {
		return allPrices;
	}

	public void setAllPrices(List<WebElement> allPrices) {
		KartPages.allPrices = allPrices;
	}
}