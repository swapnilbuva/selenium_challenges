package selenium_challenge_Naveen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class website {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chromedriver_win32");
		//WebDriver driver = new WebDriver();
//		wait of 5 seconds
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/index.htm");
//		identify element
	
	}
}
