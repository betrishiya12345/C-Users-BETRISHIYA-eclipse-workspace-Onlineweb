
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.page.SizePageObject;
	import com.page.basepage;


	public class SizePageTest  {

	SizePageObject Sp;
		basepage bp;
		
	
		public SizePageTest() {
			Sp = new SizePageObject();
			bp = new basepage();
		}
		
		@Test
		public void verifysmallsize() {
		Sp.clickWomen();
			Assert.assertTrue(Sp.smalltab().isDisplayed());
				Assert.assertTrue(Sp.mediumtab().isDisplayed());
					Assert.assertTrue(Sp.largetab().isDisplayed());
		}
		
				
			}

				
