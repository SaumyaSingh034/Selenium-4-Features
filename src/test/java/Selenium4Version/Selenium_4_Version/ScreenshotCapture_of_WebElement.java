package Selenium4Version.Selenium_4_Version;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotCapture_of_WebElement {
	WebDriver driver;
	
	@Test(description="Taking Scrrenshot of one web element")
	public void takeScreenshotofElement() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement logo = driver.findElement(By.cssSelector("#divLogo"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File target = new File("logo.png");
		FileUtils.copyFile(src, target);
		
		Thread.sleep(8000);
		driver.quit();
				
		
	}

}
