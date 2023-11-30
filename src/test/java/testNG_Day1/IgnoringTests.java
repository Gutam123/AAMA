package testNG_Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoringTests {
	
	String myExpectedName = "Gautam";
	
	@Test(enabled=true, groups= {"SmokeTest"})
	public void testprintMessage() {
		System.out.println("This is a message == HAPPY Holidays ");
	}
	
	@Test(groups= {"Regression"})
	public void assertTesting() {
		String actualName = "Gautam";
		Assert.assertEquals(actualName,myExpectedName);
	}

}
