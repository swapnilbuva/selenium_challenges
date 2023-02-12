package java_selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;

public class browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		wait of 5 seconds
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://petdiseasealerts.org/forecast-map");
//		identify element
//		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
		List<WebElement> list = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[local-name()='g' and @id='regions']//*[local-name()='g' and @id]"));
		System.out.println("Size :"+list.size());
		String state = "texas";
		List<WebElement> state_map = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[local-name()='g' and @id='regions']//*[local-name()='g' and @id='"+state+"']"));
		if(state_map.size()>0)
		{
			state_map.get(0).click();
			Thread.sleep(500);
			String text =driver.findElement(By.xpath("//ul[@class='breadcrumb']//li/span")).getText();
			System.out.println("State :"+text);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			if(text.equalsIgnoreCase(state) && url.contains(state))
			{
				
				System.out.println("Correct");
			}
			else
			{
				System.out.println("Incorrect");
			}
		}
		driver.quit();
	}

}
