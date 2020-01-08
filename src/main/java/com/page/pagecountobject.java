package com.page;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class pagecountobject extends basepage {
	

	@FindBys(@FindBy(xpath="//a//img[@width='250']"))
	private List< WebElement> Imgcount;
	
	@FindBy(xpath="//h1//span[@class='heading-counter']")
	private WebElement Prdcount;
	
	public pagecountobject() {
		PageFactory.initElements(driver, this);
	}
	
	public int prdcount25() {
		String count=Prdcount.getText();
		String [] v=count.split(" ");
		int total=Integer.parseInt(v[2]);
		
		return total;
	}
	
	public int Imgcount() {
		return Imgcount.size();
		

	

}
	
}