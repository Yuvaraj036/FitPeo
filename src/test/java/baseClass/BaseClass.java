package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

		
		     protected static WebDriver driver;
		  
		     @BeforeSuite
		 	public  void browserLaunch() {
		 		
		 		
		 		WebDriverManager.chromedriver().setup();
		 		
		 		 driver=new ChromeDriver();
		 		driver.get("https://www.fitpeo.com");
		 		driver.manage().window().maximize();
		 		
		 	}
		     
		     
	
	@AfterSuite
	public void browserQuit()
	{
		driver.quit();
	}

	

}
