package com.app.guru;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTest {
	static WebDriver driver=null;
	
	public static void  initializeWebDriver(){
		System.setProperty("webdriver.chrome.driver", "D:/LunaWorkspace/SoftwareTesting/chromedriver.exe");
		 driver=new ChromeDriver();
		System.out.println("chrome launch-1");
	}
	public static void deleteAllCoockies(){
		driver.manage().deleteAllCookies();
		System.out.println("deleted all coockies-2");
		
	}
	public static void launchGmailApp(){
		//http://www.gmail.com
		//"http://demo.guru99.com/test/radio.html"
		driver.get("http://demo.guru99.com/test/radio.html");
		System.out.println("app launch-3");
	}
	public static void gmailLogin(){
		System.out.println("gmaillogin 1st");
		
	}
	
	public static void sendMailText(){
		System.out.println("sendMailText");
		
	}
	public static void gmailLogout(){
		System.out.println("gmailLogout");
	}
	public static void gmailLogin2(){
		System.out.println("gmailLogin2");
		
	}
	
	public static void receiveMailText(){
		System.out.println("receiveMailText");
	}
	
	public static void gmailLogout2(){
		System.out.println("gmailLogout2");
	}
	public static void closeGmailApp(){
		System.out.println("closeGmailApp");
	}
	public static void closeAllBrowsers(){
		
	driver.close();
		System.out.println("close all browsers");
	}
	public static void killWebdriver(){
		System.out.println("killWebdriver");
	}
	
	public static void takingSreenshot() throws IOException{
		TakesScreenshot tss=(TakesScreenshot)driver;
		File f1=tss.getScreenshotAs(OutputType.FILE);
		File f2=new File("D:\\LunaWorkspace\\SoftwareTesting\\imagesORscreenshots\\sc1.png");
		FileUtils.copyFile(f1, f2);
		
		System.out.println("takingSreenshot");
	}
	
	public static void radioButton(){
		 WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
	        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
	        		
	        //Radio Button1 is selected		
	        radio1.click();			
	        System.out.println("Radio Button Option 1 Selected");					
	        		
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        System.out.println("Radio Button Option 2 Selected");					
	        		
	        // Selecting CheckBox		
	        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

	        // This will Toggle the Check box 		
	        option1.click();			

	        // Check whether the Check box is toggled on 		
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }		
	         
	        		
	        		
	        //Selecting Checkbox and using isSelected Method		
	        driver.get("http://demo.guru99.com/test/facebook.html");					
	        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
	        for (int i=0; i<2; i++) {											
	            chkFBPersist.click (); 			
	            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
	        }		
			//driver.close();		
	        		}
	
	public static void implicitWiatmethod(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("implicitWiatmethod");
		
	}
	public static void explicitwait(){
		
		System.out.println("explicitwait");
	}
	public static void pageloadingtime(){
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("pageloadingtime");
	}
	public static void pageloadingtime1(){
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		System.out.println("pageloadingtime");
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LearningTest.initializeWebDriver();
		LearningTest.launchGmailApp();
		LearningTest.takingSreenshot();
		LearningTest.radioButton();
		

	}

}
