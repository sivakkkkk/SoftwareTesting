package com.app.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBTesting {
	
	public static void dbconTest(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtestingdb","root","root");
			Statement stmt=con.createStatement();
			String qry="insert into orglogin values('ram','ram')";
			stmt.executeUpdate(qry);
			String qry2="select * from orglogin";
       ResultSet r=stmt.executeQuery(qry2);
       while(r.next()){
    	   System.out.println(r.getString(1)+"/t"+r.getString(2));
    	   String un=r.getString(1);
    	   String pwd=r.getString(2);
    	   WebDriver d=new ChromeDriver();
    	   d.get("http://orangehrm.uftselenium.com/");
    	   d.findElement(By.id("txtUsername")).sendKeys(un);
    	   d.findElement(By.id("txtPassword")).sendKeys(pwd);
    	   d.findElement(By.xpath("//input[@id='btnLogin']")).click(); 
    	   d.close();
    	   
       }
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DBTesting.dbconTest();

		
		
		
		
		
	}

}
