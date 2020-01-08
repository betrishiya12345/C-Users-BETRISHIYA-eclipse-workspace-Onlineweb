import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.HomePageObjects;
import com.page.basepage;
import com.page.cartobject;
import com.page.productobject;

public class Testproduct {
	basepage a;
	productobject b;
	cartobject c;
	HomePageObjects d;
	
	public Testproduct() {
		a= new  basepage ();
		b=new productobject ();
		c=new cartobject ();
		d=new HomePageObjects ();
		
		}
	@Test
	
	public void checkproduct() {

		d.clickgetWomen();
		 c.clickproduct1();
		 
		Assert.assertTrue(b.tweet().isDisplayed());
		Assert.assertTrue(b.share().isDisplayed());
	
	}
	}

