package Modules;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import jxl.read.biff.BiffException;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import CommonMethods.CommonlyUsed;
import CommonMethods.DriverSetUp;

public class Add 

{
	WebDriver driver;
	
	static String SpotName;
	

	String sampleDataPath = "./src/DataFolder";
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod() throws IOException{
		driver=DriverSetUp.getinstance();
		 
		
	}
	
	@Test
	public void test123() throws IOException, InterruptedException
	{
		CommonlyUsed.SendValueInTextBox(driver, "id", CommonlyUsed.GetPropertyValue("nine"), "test");
		Thread.sleep(5000);
		CommonlyUsed.ClickOnObject(driver, "name", CommonlyUsed.GetPropertyValue("ten"));

		}
	
	@DataProvider
		public Object[][] AddSpotDetail() throws Exception
		{
		      Object[][] testObjArray = CommonlyUsed.getTableArray(sampleDataPath + "/Registration.xls","AddSpotData","");
		      return (testObjArray);
		}
	  
	
	
	
	}
