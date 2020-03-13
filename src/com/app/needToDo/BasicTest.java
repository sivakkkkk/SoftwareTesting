package com.app.needToDo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
	
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://bank.uftselenium.com/home.aspx");
		/*-------Webdriver Locators------SESSION-1--------------*/
		//1)by ID
		d.findElement(By.id("txtuId")).sendKeys("Admin");
		//2)by Class
		d.findElement(By.className("style7")).sendKeys("Admin");
		//3)by tag
		//4)by Name
		//5)by Link Text
		//6)by Partial Link Text
		//7)by Xpath
		//8)by using CSS
		
		
		
		
		/*---------------Working with web page elements using WebDriver-------SESSION-2--------------*/
		//1)Textbox
		//2)Links
		//3)Buttons
		//4)CheckBox
		//5)Radio button
		//6)List Box
		//7)Drop Down

		/*--Selenium WebDiver API Commands and Operations------SESSION-3---------------------------*/
		/*--------(1)DRIVER COMMANDS LIKE--------*/
		//1)driver.get("url");
		//2)driver.getTitle();
		//3)driver.getWindowHandle();
		//4)driver.getWindowHandles();
		//5)driver.close();
		//6)driver.quit();
		//7)
		//8)
		//9)
		
		/*----(2)Child Elements Like--------------*/
		//1)element.clear();
		//2)element.sendKeys():
		//3)element.click();
		//4)element.getAttribute("args");
		//5)element.getTagName();
		//6)element.getTest();
		//7)element.isDisplayed();
		//8)element.isEnabled();
		//9)element.isSelected()..etc
		/*--------(3)Advance Concepts of Selenium-------------Action or Robot classes-----*/
		//1)popup handling
		//2)simulating the keyboard key press events
		//3)simulating front and back button click in browser
		//4)Listeners using webdriver event listener
		//5)Partical usage of Listeners in  Selenium
	}

}
