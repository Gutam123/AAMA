package TestNG_DAY2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTestUsingAnnotation {
	
	
	String  actualMessage = "Gautam";
	String expectedMessage = "Gautam";
	
	@Test
	public void TestprintMessage() {
		System.out.println("printing inside TestprintMessage()");
		actualMessage ="Gautam" ;
		Assert.assertEquals(actualMessage, expectedMessage);
		
		
	}
	@Test(dependsOnMethods = "TestprintMessage")
	public void testSalutationTopGautam() {
		System.out.println("printing inside testSalutationToGautam");
	}
		
		
	}


