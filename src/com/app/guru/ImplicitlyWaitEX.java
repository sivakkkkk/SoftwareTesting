package com.app.guru;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitEX {
	WebDriver driver;
	
	public void driverInitilization(){
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void myimplicitWait(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
public void checkCorretTitle(){
	String eTitle="Demo Guru99 Page";
	String aTitle="";
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	 aTitle=driver.getTitle();
	
	if(eTitle.equals(aTitle)){
		System.out.println("Test passed");
	}else{
		System.out.println("Test Failed");
	}
	
	
}

public void checkboguruFb(){
	driver.get("http://demo.guru99.com/test/facebook.html");
	WebElement ee=driver.findElement(By.id("persist_box"));
	for(int i=0;i<2;i++){
		
		ee.click();
		System.out.println("status:"+ee.isSelected());
	}
}



public void closeBrowser(){
	driver.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplicitlyWaitEX ex=new ImplicitlyWaitEX();
		ex.driverInitilization();
		ex.myimplicitWait();
		ex.checkCorretTitle();
		ex.checkboguruFb();
		ex.closeBrowser();

	}

}
