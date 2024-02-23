package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class webDriver {
	public static WebDriver driver = null;

    public static webDriver testBase;
public static webDriver getInstance() throws Exception {


   	 try {

   		 if (testBase == null) {
   			 testBase = new webDriver();
   		 }
   	 }
   	 catch (Exception e) {
   		 throw new Exception("Exception while Initializing TestBase.", e);
   	 }

   	 return testBase;
    }


    @BeforeSuite
    public void initialize() throws Exception {
   	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Desktop\\web drivers\\Gecko driver\\geckodriver.exe");
   	 driver = new FirefoxDriver();
    }

    
    

    @AfterSuite
    public void tearDown() throws WebDriverException {
   		 driver.close();
   		 driver.quit();

   	 }




}
