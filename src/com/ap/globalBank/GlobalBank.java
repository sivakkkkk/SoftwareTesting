package com.ap.globalBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GlobalBank {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d=new ChromeDriver();
		d.get("http://bank.uftselenium.com/home.aspx");
		//Thread.sleep(10000);
		
		//d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//admin login
		d.findElement(By.xpath("//input[@maxlength='18'][@tabindex='2']")).sendKeys("Admin");
		//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@maxlength='18'][@id='txtPword']")).sendKeys("sreekanth");
		//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(d,30);
		d.findElement(By.xpath("//input[@type='image'][@id='login']")).click();
		//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//sd.close();
		//Branch creations
		d.findElement(By.xpath("//a[@href='admin_banker_master.aspx']")).click();
		d.findElement(By.xpath("//input[@id='BtnNewBR'][@name='BtnNewBR']")).click();
		
		
		d.findElement(By.xpath("//input[@id='txtbName'][@name='txtbName']")).sendKeys("navaloor");
		d.findElement(By.xpath("//input[@id='txtAdd1'][@name='txtAdd1']")).sendKeys("navaloor");
		d.findElement(By.xpath("//input[@name='Txtadd2']")).sendKeys("navaloor");
		d.findElement(By.xpath("//input[@name='txtadd3']")).sendKeys("odalakur old bus stop");
		d.findElement(By.xpath("//input[@name='txtArea']")).sendKeys("my area");
		d.findElement(By.xpath("//input[@name='txtZip']")).sendKeys("524345");
		WebElement e=d.findElement(By.xpath("//select[@name='lst_counrtyU']"));
		
	
		
		Select ss=new Select(e);
		ss.selectByIndex(2);
		WebElement e1=d.findElement(By.xpath("//select[@name='lst_stateI']"));
		Select s1=new Select(e1);
		s1.selectByIndex(2);
		WebElement e2=d.findElement(By.xpath("//select[@name='lst_cityI']"));
		Select s2=new Select(e2);
		s2.selectByIndex(2);
		d.findElement(By.xpath("//input[@id='btn_insert']")).click();
		//Roles creation
		
		d.findElement(By.xpath("//img[@src='images/Roles_but.jpg']")).click();
		
		/*d.quit();*/
	}

}
