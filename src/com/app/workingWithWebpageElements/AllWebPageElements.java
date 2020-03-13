package com.app.workingWithWebpageElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class AllWebPageElements {
	WebDriver driver;
	public void initializeWebdriver(){
		//System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\LunaWorkspace\\SoftwareTesting\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void closeBrowser(){
		driver.close();
	}
	public void findradiobutton(){

		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement radio1=driver.findElement(By.xpath("//input[@type='radio' and @name='webform' and @value='Option 1' and @id='vfb-7-1']"));
		radio1.click();
		WebElement radio2=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		radio2.click();

	}
	public void findCheckbox(){
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement checkbox1=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		checkbox1.click();
		if(checkbox1.isSelected()){
			System.out.println("selected-check box is toggled on");
		}else{
			System.out.println("not selected-check box is toggled off");
		}

	}


	public void dropDownBOxexWithScrollDown(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor e=(JavascriptExecutor)driver;
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select s=new Select(driver.findElement(By.xpath("//select[@name='country']")));
		s.selectByVisibleText("ANGOLA");
		//s.selectByIndex(1);
		//s.selectByValue("ANGOLA");
		//s.deselectByValue("ANGOLA");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//e.executeScript("window.scrollBy(0,1000)");
		//e.executeScript("arguments[0].scrollIntoView();",s);
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		efw.executeScript("s.scrollTop=500");
		System.out.println("selected");
	}
	
	public void accessFaceBookLogo(){
		try{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
	
		driver.get(baseUrl);
		String atitile=driver.getCurrentUrl();
		String sourcecode=driver.getPageSource();
		System.out.println("source code:"+sourcecode);
		
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
		System.out.println("gettitle:"+driver.getTitle());
		if(driver.getTitle().equals("Facebook – log in or sign up")){
		
			System.out.println("e are back to facebook home page");
			
		}else{
			System.out.println("we are not in facebook homepage");
		}
	}catch(Exception e){
		e.printStackTrace();
	}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllWebPageElements a=new AllWebPageElements();
		a.initializeWebdriver();
		//a.findradiobutton();
		//a.findCheckbox();
		//a.dropDownBOxexWithScrollDown();
		a.accessFaceBookLogo();
		
		
		
		
		a.closeBrowser();
		
		

	}

}
