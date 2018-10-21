package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {

	public static void main(String[] args) {

		System.setProperty("webriver.chrome.driver","C:\\Users\\jakya\\eclipse-workspace\\seleniumpro\\seleniumproject\\jars\\ChromeSetup.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
	}

}
