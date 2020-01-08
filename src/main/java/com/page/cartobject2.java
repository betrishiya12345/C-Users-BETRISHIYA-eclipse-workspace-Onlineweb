package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartobject2 extends basepage{
	@FindBy(xpath = "//*[@name='Submit']")
	private WebElement Addtocart;
	
	@FindBy(name = "Submit")
	private WebElement CartAdd;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']//span")
	public WebElement verified;
	
	public cartobject2() {
		PageFactory.initElements(driver, this);
	}
	

public WebElement cart() {
	return Addtocart;
	}

public WebElement verified() {
	return verified;
	}
public WebElement clickcart() {
	CartAdd.click();
	return CartAdd;
	}

public WebElement cartText() {
	return Addtocart;
	}
}
	
	