import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.page.basepage;
import com.page.emailobject1;
import com.page.emailobject2;

public class Testemail {
	emailobject1 a;
	emailobject2 b;
	basepage bp;

	
	public Testemail() {
		a= new emailobject1();
	    b= new emailobject2();
	    bp=new basepage ();
	}
	
	int random=new Random().nextInt(4000);
	String email="betrishiya"+random+"yahoo@gmail.com";
	
	@Test
	public void verified() {
		a.setemail(email);
		a.clickbutton();
		Assert.assertTrue(b.verified().getText().contains("You have successfully subscribed to this newsletter"));
	}
	
	

}
