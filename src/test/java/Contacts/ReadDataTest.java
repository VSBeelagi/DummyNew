package Contacts;

import org.testng.annotations.Test;

public class ReadDataTest {
	
	@Test
	public void readData()
	{
		
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	
	
	System.out.println(BROWSER);
	System.out.println("url created");
	
	System.out.println(URL);
	System.out.println("Changes done successfully");
	
	}
}
