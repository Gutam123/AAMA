package TestNG_DAY2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest0nGroup {
	
	@Test
	public void testvprintMessage() {
		System.out.println("printing testprintMessage");
		Assert.assertTrue( true);
		
	}
	
	@Test(groups="cohort16")
	
	public void testSaluteGroup() {
		
		System.out.println("printing testMessage2(");
		
		Assert.assertTrue(true);
		
	}
	@Test(dependsOnGroups = "cohort16")
    public void testSaluteGroups() {
        System.out.println("Printing this from testSaluteGroups");
    }

}
