package com.page;
//import java.util.ArrayList;
//import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends basepage {

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Women;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement Dresses;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement Tshirts;
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return Women;
	}
	
	public WebElement getDresses() {
		return Dresses;
	}
	
	public WebElement getTshirts() {
		return Dresses;
		
	}
	public WebElement clickgetWomen() {
		Women.click();
		return Women;
	}
	
	public WebElement clickgetDresses() {
		Dresses.click();
		return Dresses;
	}
	
	public WebElement clickgetTshirts() {
		Tshirts.click();
		return Dresses;
		
	}

	}


	
	

	
	
	
	





