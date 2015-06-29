package CommonMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverSetUp
{
	private static WebDriver driver= null;
	static String sampleDataPath = "./src/";
			
	public static WebDriver getinstance()
	{
		if(driver==null){}
		return driver;
	}
		
	 
	@Parameters({ "web-browser" })
	@Test
    public void GetBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Firefox"))
		{
		driver = new FirefoxDriver();
		System.out.println("Firefox Browser Opened Successfully");
		Reporter.log("Firefox Browser Opened Successfully");
		}
		else if(browser.equalsIgnoreCase("IE"))
			 driver =new InternetExplorerDriver();
		else if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", sampleDataPath + "/chromedriver.exe");
				driver=new ChromeDriver();	
			}	
	}
	
	@Parameters({"website"})
	@Test
	public void OpenUrl(String website)
	{
		driver.get(website);
		driver.manage().window().maximize();
		System.out.println("URL Opened Successfully");
		Reporter.log("URL Opened Successfully");
	}
	
	
	public void winmax()
	{
		driver.manage().window().maximize();
	}
		
		

}

