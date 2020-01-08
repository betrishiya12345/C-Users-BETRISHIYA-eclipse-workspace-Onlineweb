import org.testng.Assert;
import org.testng.annotations.Test;

public class nametest {
	String name="bet";
	boolean value1=true;
	boolean value=false;
	@Test
	public void checkEquals() {
	//if(name.equals("Agni")) {
		//System.out.println("name is equal");
	//}else {
		//System.out.println("name is not equal");
	//}
		//Assert.assertEqual(name,"Bet");
		
		//Assert.assertNotEquals(name, "Bet");
		Assert.assertTrue(value1,"this is chicken");
		Assert.assertFalse(value,"this is chicken");

}
}
