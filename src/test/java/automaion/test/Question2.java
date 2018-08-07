package automaion.test;

import static org.testng.Assert.assertEquals;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Question2 {
	
	static String driverPath = (new java.io.File("").getAbsolutePath());
	public static ChromeDriver driver;
	public String getLocation;
	public static String getHours,currentDay;
	@BeforeSuite
	public static void startBrowserAndOpenURL() throws InterruptedException
	{
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath + "/chromedriver");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setVersion("60.0.3112.101");
		capabilities.setCapability("chrome.switches",
			    Arrays.asList("--verbose"));
		
		ChromeOptions options = new ChromeOptions();
        
		options.addArguments("--test-type");
		options.addArguments("--allow-running-insecure-content");
		options.addArguments("no-sandbox");
		options.addArguments("--disable-extensions");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setPlatform(org.openqa.selenium.Platform.YOSEMITE);
		Thread.sleep(5000);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.navigate().to("https://www.weightwatchers.com/us/");
	}

	
	public void validatePageTitle(String title)
	{
		
		String actualTitle = driver.getTitle();
		String expectedTitle = title;
		assertEquals(expectedTitle,actualTitle);
		
	}
	
	@Test(priority=1)
	public void validate1TitleName()
	{
		validatePageTitle("Weight Loss Program, Recipes & Help | Weight Watchers");
		
	}
	
	@Test(priority=2)
	public void CanUserClickOnFindMeeting() throws InterruptedException
	{
		
		driver.findElement(By.linkText("Find a Meeting")).click();
		Thread.sleep(5000);
		validatePageTitle("Get Schedules & Times Near You");
		
	}
	
	@Test(priority=3)
	public void CanAUserPerformSearch() throws InterruptedException
	{
		driver.findElement(By.name("meetingSearch")).sendKeys("10011");
		Thread.sleep(5000);
		WebElement textbox = driver.findElement(By.name("meetingSearch"));
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		
		
	}
	
	@Test(priority=4)
	public void CanUSerPrintFirstLocationNameAndDistanceFromZipCode() throws InterruptedException
	{
		java.util.List<WebElement> checkLocation =  driver.findElements(By.className("location__name"));
		
		Thread.sleep(2000);
		System.out.println("Your first location is " +checkLocation.get(0).getText());
		
		
		Thread.sleep(5000);
		
		java.util.List<WebElement> checkMiles =  driver.findElements(By.className("location__distance"));
	
		Thread.sleep(2000);
		System.out.println("Your first location in miles is " +checkMiles.get(0).getText());
		checkLocation.get(0).click();
		
		
		
		
	}
	
	
	
	@Test(priority=5)
	public static void CanUserfindOutHoursOfOperation() throws InterruptedException
	{
		
		Thread.sleep(2000);
		java.util.List<WebElement> checkDate =  driver.findElements(By.className("hours-list-item-day"));
		
		java.util.List<WebElement> checkHours =  driver.findElements(By.className("hours-list-item-hours"));
		
       
		Thread.sleep(2000);
		
		
		
		Date now = new Date();
		 
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        currentDay=simpleDateformat.format(now);
        
        
        System.out.println("Today's day is " +currentDay);
        
        for (int a=0;a<checkDate.size();a++)
        {
        	String temp=checkDate.get(a).getText();
        	
        	
        	
        	if(temp.contains(currentDay))
        	{
        	System.out.println("Your working hours are " +checkHours.get(a).getText());
        	
        	
        	
        	}
        }
        

        
        
        
        
        
        

		
	}
	
	@AfterSuite
	public void stopScript()
	{
		driver.quit();
	}
	
	
	 
}
