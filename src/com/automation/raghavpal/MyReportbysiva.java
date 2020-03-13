package com.automation.raghavpal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class MyReportbysiva {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			WebDriver driver=null;
	ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest  test1=extent.createTest("Google  search Test 1","this is the test to validate google search functionality");

		String chomedriverpath=System.getProperty("user.dir")+"/drivers/chromedriver.exe";
		System.out.println(chomedriverpath);
		System.setProperty("webdriver.chrome.driver", chomedriverpath);
		String k=System.getenv("PATH");
		System.out.println(k);
		driver=new ChromeDriver();
		
		test1.log(Status.INFO,"starting test case");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		test1.pass("navigated to google page");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.pass("entered automation word in google search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK'][0]")).sendKeys(Keys.RETURN);
		test1.pass("clicked on search button");
		/*taskkill is a standard Windows utility. The fact that Selenium cannot 
		 * find it means that the environment variable PATH does not include 
		 * the directory that contains standard system utilities. 
		 * It is C:\Windows\system32 for modern Windows versions.*/
		
		/*driver.quit(); causes the problem. If you use driver.close();
		 *  this exception will not be thrown, 
		 * and the browser will be closed properly.*/
		driver.close();
		driver.quit();
		test1.pass("closed browsers");
		test1.info("test completed");
		extent.flush();
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
