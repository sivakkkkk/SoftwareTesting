package com.ap.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver d=new ChromeDriver();
/*d.get("http://www.google.com");
by tag name
List <WebElement>l=d.findElements(By.tagName("a"));
System.out.println("list size:"+l.size());
for(int i=0;i<l.size();i++){
	System.out.println(l.get(i).getText());
	}*/

d.navigate().to("http://www.facebook.com");
//for fb name and id=email
//pwd name id=pass
//login button id=u_0_b

d.findElement(By.xpath("//input[@type='email']")).sendKeys("siva@gmail.com");
d.findElement(By.name("pass")).sendKeys("Ram3@srdl");
d.findElement(By.id("u_0_b")).click();





	}

}
