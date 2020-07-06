package com.app.srav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerttype extends Login{

	public static void main(String[] args) {
		Alerttype al=new Alerttype();
		al.testBase();
		dr.get("http://demo.automationtesting.in/Register.html");
	WebElement switchto=dr.findElement(By.className("dropdown-toggle"));
	switchto.click();
	WebElement alert=dr.findElement(By.linkText("Alerts"));
	alert.click();
WebElement clicthebutton=dr.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
//	WebElement clicthebutton=dr.findElement(By.className("class=\"btn btn-danger\""));
//	WebElement clicthebutton=dr.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
	clicthebutton.click();
 
	}

}