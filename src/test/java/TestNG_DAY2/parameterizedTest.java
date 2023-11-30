package TestNG_DAY2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizedTest {
	
	@Test
	@Parameters("anyname")
	
	public void parameterTest(String myName) {
		System.out.println("parameterized value is -->"+myName );
		
	}

}
