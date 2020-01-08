

import org.testng.annotations.Test;


import com.page.basepage;
import com.page.pagecountobject;
import com.page.HomePageObjects;

public class pagecounttest {
	basepage bp;
	pagecountobject pc;
	HomePageObjects hp;
	
	
	public pagecounttest() {
		bp=new basepage();
		pc=new pagecountobject();
		hp=new HomePageObjects();
	}
	
	@Test
	public void verifypagecountobject(){
		hp.clickgetWomen();
		System.out.println(pc.Imgcount());
		System.out.println(pc.prdcount1());
	}

}