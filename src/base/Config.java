package base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import utils.SWDFuntions;


public class config extends SWDFuntions {
	
	@BeforeTest
	
	public void initDrivers() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jakya\\eclipse-workspace\\seleniumpro\\seleniumproject\\Drivers\\chomedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://us.shein.com/user/auth/login");
		 
		


	}

}
