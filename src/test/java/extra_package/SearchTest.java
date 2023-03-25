package extra_package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest {
	
	@Test
	void SearchUser() {
		System.out.println("this is for search test");
		
		
	}
	
	@Test(enabled=false)
	void SearchspecificproductTest() {
		Assert.fail();
	}

}
