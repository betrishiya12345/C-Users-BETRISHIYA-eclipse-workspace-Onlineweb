package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productobject extends basepage{
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement tweetdisplay;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	private WebElement Sharedisplay;

	public productobject1() {
		PageFactory.initElements(driver, this);
		}
	
	public WebElement tweet() {
		return tweetdisplay;
	}
	
	public WebElement share() {
		return Sharedisplay;
	}
}
