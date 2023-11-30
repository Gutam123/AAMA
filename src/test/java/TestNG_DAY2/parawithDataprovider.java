package TestNG_DAY2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parawithDataprovider {
	
	
	    @DataProvider(name = "data1")
	    public Object[][] nameOfTheMethod() {
	        return new Object[][] { { "Saroj", "A", 6 }, { "Irfan", "B", 3 }, { "Shafkat", "C", 5 }, { "Summer", "D", 7 } };
	    }

	    @Test(dataProvider = "data1")
	    public void printDataProvider(String name1, String name2, int age) {
	        System.out.println("My name is " + name1 + ", I'm " + name2 + ". I'm " + age + " years old.");
	    }
}
