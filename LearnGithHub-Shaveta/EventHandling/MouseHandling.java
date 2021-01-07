package EventHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHandling {
	WebDriver driver;
	Actions act;

	@BeforeMethod
	public void setUp() {
		// Get theDriver path
		String driverPath = System.getProperty("user.dir") + "\\src\\drivers\\chromedriver.exe";
		// System.out.println(driverPath);

		// Set the Browser property
		System.setProperty("webdriver.chrome.driver", driverPath);

		// Browser launch
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch app

		act = new Actions(driver);
	}

	@Test(enabled = false)
	public void browserLaunch() throws InterruptedException {
		
		driver.get("file:///G:/Selenium/sel_2018/template_7/nested_menus.html");
		WebElement mItem1 = driver.findElement(By.xpath("//a[text()='Projects']"));
		WebElement mItem2 = driver.findElement(By.xpath("//a[text()='Exercise2']"));
		WebElement mItem3 = driver.findElement(By.xpath("//a[text()='Alerts Handling']"));

		act.moveToElement(mItem1).build().perform();
		Thread.sleep(2000);
		act.moveToElement(mItem2).perform();
		Thread.sleep(2000);
		mItem3.click();

	}

	@Test
	public void dragDrop() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		WebElement elm = driver.findElement(By.xpath("//iframe[@src='/resources/demos/droppable/default.html']"));
		driver.switchTo().frame(elm);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
//		act.clickAndHold(target).wait();
//		act.release(target);
		act.dragAndDrop(source, target).build().perform();
	}

}
