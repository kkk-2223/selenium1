package executionScript;

import org.testng.annotations.Test;

import automationLibrary.dblogin;
import testBase.webDriver;




public class TC_3 extends webDriver  {
	
	@Test
	// Login page navigation check    
	    public void readDb () throws Exception
	    {    
	   	 dblogin.getInstance().readDb();
	   	 Thread.sleep(1000);
	   	 //System.out.println("my code is wrkon");
	}

}
