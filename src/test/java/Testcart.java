import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.HomePageObjects;
import com.page.basepage;
import com.page.cartobject;
import com.page.cartobject2;


public class Testcart {
	cartobject a;
	cartobject2 b;
	HomePageObjects c;
	basepage d;
	
	public Testcart() {
		a= new  cartobject ();
		b=new cartobject2 ();
		c= new HomePageObjects ();
		d= new basepage ();
		}
	@Test
	
	public void checkcart() {

		c.clickgetWomen();
		 a.clickproduct1();
		 b.elementFound(b.clickcart());
		 b.clickcart();
		 
		Assert.assertTrue(b.verified.getText().contains("proceed to checkout"));
	}
	}
