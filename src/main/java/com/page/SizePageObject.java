package com.page;import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SizePageObject extends basepage {

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_1']")
	private WebElement smallsize;
	
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_2']")
	private WebElement mediumsize;
	
	@FindBy(xpath = "//label[@for='layered_id_attribute_group_3']")
	private WebElement largesize;
	
	public SizePageObject(){
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickWomen() {
		Women.click();
		return Women;
	}

	public WebElement smalltab() {
		return smallsize;
	}
	
	public WebElement mediumtab() {
		return mediumsize;
	}
	
	public WebElement largetab() {
		return largesize;
		
		
		
	}

	
}




