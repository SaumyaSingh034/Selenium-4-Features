package Selenium4Version.Selenium_4_Version;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab_NewBrowser {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(description="Opening new Tab")
	public void openNewTab()
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://github.com/SaumyaSingh034/SDET-JAVA-QA");
		
	}
	
	@Test(description="Opening new Window")
	public void openNewWindow()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://github.com/SaumyaSingh034/SDET-JAVA-QA");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
