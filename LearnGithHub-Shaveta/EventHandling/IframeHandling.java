package EventHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 * Select class---->indexValue
 * visibletext
 * id
 */
public class IframeHandling {
	WebDriver driver;

	@Test
	public void browserLaunch() throws InterruptedException {
		// Get theDriver path
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		// System.out.println(driverPath);

		// Set the Browser property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// Browser launch
		driver = new ChromeDriver();

		// launch app
		driver.get("file:///G:/Selenium/sel_2018/template_7/iFrames.html");
		// switch to iframe
		driver.switchTo().frame(0);
		driver.findElement(By.id("name")).sendKeys("USer name");

		// switch from iframe to parent window
		driver.switchTo().defaultContent();

		String pageHeading = driver.findElement(By.xpath("//h1[text()='iFrames Handling']")).getText();
		System.out.println(pageHeading);
		
		
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@src='iframe_alerts_data.html']"));
		driver.switchTo().frame(iframe2);
		
		driver.findElement(By.xpath("//input[@value='Alert Box']")).click();
		driver.switchTo().alert().accept();
	}

}
