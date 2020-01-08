import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.HomePageObjects;
import com.page.basepage;


public class HomePageTest {

	HomePageObjects hp;
	basepage bp;

	public HomePageTest() {
		hp = new HomePageObjects();
		bp = new basepage();
	}

	@Test
	public void verifyWomen() {
		Assert.assertTrue(hp.getWomen().isDisplayed());}
		
	@Test
		public void verifyDresses() {
			Assert.assertTrue(hp.getDresses().isDisplayed());}
			
	@Test
			public void verifyTshirts() {
				Assert.assertTrue(hp.getTshirts().isDisplayed());
	}
	@Test
	public void verifytabs() {
		hp.clickgetWomen();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
		
		hp.clickgetDresses();
			Assert.assertTrue(hp.getTitlte().contains("Dresses"));
			
			hp.clickgetTshirts();
			Assert.assertTrue(hp.getTitlte().contains("T-shirts"));
			
			
		}
			
		}

				

