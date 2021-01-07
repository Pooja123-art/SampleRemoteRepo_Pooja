package EventHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
 * Alert interface methods-
 * getText();
 * accept()- OK
 * dismiss()- cancel
 * sendKeys()- Txt Field
 * 
 * chromealert
 * fb notifaction
 * block, allow
 */
public class AlertHandling {
	WebDriver driver;
	@BeforeMethod
	public void browserLaunch() throws InterruptedException {
		// Get theDriver path
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		// System.out.println(driverPath);

		// Set the Browser property
		System.setProperty("webdriver.chrome.driver", driverPath);

		
		
		
		
		// Browser launch
		driver = new ChromeDriver();

		// launch app
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		//Thread.sleep(2000);
		
		
	}
	
	@Test
	public void alertBox() {
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		Alert alt = driver.switchTo().alert();
		String alertMsg = alt.getText();
		System.out.println(alertMsg);
		
		//Clikc on Ok button 
		alt.accept();
	}
	
	@Test
	public void promptBox() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Click for Prompt Box')]")).click();
		Alert alt = driver.switchTo().alert();
		String alertMsg = alt.getText();
		System.out.println(alertMsg);
		Thread.sleep(5000);
		alt.sendKeys("PromptBox Data"); 
		alt.accept();
	}
	
	 
}
