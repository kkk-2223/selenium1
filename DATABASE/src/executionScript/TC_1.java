package executionScript;

import org.testng.annotations.Test;

import automationLibrary.dblogin;
import testBase.webDriver;

public class TC_1 extends webDriver  {
	@Test
    // Login page navigation check    
   	 public void LaunchWebConfig () throws Exception
   	 {   
   	 
   	 dblogin.getInstance().LaunchWebExcel();
   	 //system.out.println("my code is wrkon");
   	 //Excelclass.getInstance().LaunchWebConfig();
   		 Thread.sleep(1000);
   	 }



}
