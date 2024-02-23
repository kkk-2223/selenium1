package automationLibrary;

import org.openqa.selenium.By;

import settings.Settings;
import testBase.webDriver;
import testdata.tableData;

public class dblogin extends webDriver {
Settings se = new Settings();
    
    
    public static dblogin cha = null;
    public static dblogin getInstance() throws Exception {
   	 try {
   		 if (cha == null) {
   			 cha = new dblogin();
   		 }    
   	 } catch (Exception e) {
   		 throw new Exception("Exception while Initializing TestBase.", e);
   	 }
   	 return cha;
    }
    

// Load Website
public void LaunchWebExcel () throws Exception

{  
    //USING COFIG_LAUNCH WEB
    String URL = se.getProperty("webURL");
    driver.get(URL);
    Thread.sleep(4000);
    //driver.get("https://www.facebook.com/");

   	 //Thread.sleep(2000);   	 
    
}

//Login page field check

public void readDb () throws Exception

{
    String fname[] = tableData.getInstance().retrieveDBValue("obj1");    
    System.out.println("checking firstname in dblogin.java"+fname[1]);
    //System.out.println(fname[1]);
    driver.findElement(By.id(fname[0])).sendKeys(fname[1]);
    
    String fname1[] = tableData.getInstance().retrieveDBValue("obj2");    
    System.out.println("checking firstname in dblogin.java"+fname1[1]);
    //System.out.println(fname1[1]);
    driver.findElement(By.id(fname1[0])).sendKeys(fname1[1]);
   	 }






}
