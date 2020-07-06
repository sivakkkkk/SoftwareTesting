package com.app.srav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
static WebDriver dr;
public static void testBase() {
	System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
	dr=new ChromeDriver();
	dr.manage().window().maximize();
}
public void Registrtion() throws InterruptedException {
	testBase();
	dr.get("http://demo.automationtesting.in/Register.html");
	WebElement Firstname=dr.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
	Firstname.clear();
	Firstname.sendKeys("sravani");
	System.out.println("first name");
	WebElement Lastname=dr.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	Lastname.clear();
	Lastname.sendKeys("vedhantham");
	System.out.println("last name");
	WebElement Adress=dr.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
	Adress.clear();
	Adress.sendKeys("hyderabad athapur");
	System.out.println("address");
	WebElement email=dr.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
	email.clear();
	email.sendKeys("sravani.vedhantham@gmail.com");
System.out.println("email");
	WebElement pho=dr.findElement(By.xpath("//input[@ng-model=\"Phone\"]"));
	pho.clear();
	pho.sendKeys("12345678");
	System.out.println("fail");
	pho.clear();
	Thread.sleep(3000);
	pho.sendKeys("9030111632");
	System.out.println("pass");
	System.out.println("ph no");
dr.findElement(By.xpath("//input[@value=\"FeMale\"]")).click();
WebElement hobbies=dr.findElement(By.xpath("//input[@type=\"checkbox\"and@value=\"Movies\"]"));
hobbies.click();
System.out.println("hobies");
//sjkiped language

//WebElement language=dr.findElement(By.xpath("//a[text()='English']"));
//language.clear();
//language.click();

WebElement skill=dr.findElement(By.xpath("//select[@type=\"text\"and@ng-model=\"Skill\"]"));
Select s=new Select(skill);
s.selectByVisibleText("Java");
skill.click();
System.out.println("skill");


WebElement countries=dr.findElement(By.xpath("//select[@type=\"text\"and@id=\"countries\"]"));
Select s1=new Select(countries);
s1.selectByValue("Bermuda");
countries.click();
System.out.println("country");

/*from internet diff sol
 * WebElement HeaderTxtElem = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='form-style-abc']/fieldset/legend[(self::legend) and not (@class='number')]")));

System.out.println(HeaderTxtElem.getText());*/




WebElement selectcountry=dr.findElement(By.xpath("//select[@id=\"country\"]"));
Select s2=new Select(selectcountry);
s2.selectByValue("India");

selectcountry.click();
//dr.close();

WebElement year=dr.findElement(By.xpath("//select[@id='yearbox']"));
Select y=new Select(year);
y.selectByValue("1916");
year.click();
System.out.println("year");
WebElement month=dr.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
Select m=new Select(month);
m.selectByValue("January");
month.click();
System.out.println("month");
WebElement day=dr.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
Select d=new Select(day);
d.selectByValue("2");
day.click();
System.out.println("day");

WebElement password=dr.findElement(By.xpath("//input[@id='firstpassword']"));
password.clear();
password.sendKeys("Sravani123@");
System.out.println("pwd");
WebElement conformPassword=dr.findElement(By.xpath("//input[@id='secondpassword']"));
conformPassword.clear();
conformPassword.sendKeys("Sravani123@");
System.out.println("conform pwd");
WebElement sub=dr.findElement(By.xpath("//button[@id='submitbtn']"));
sub.click();
System.out.println("submit");

}
	public static void main(String[] args) {
		Login s=new Login();
	  
		try {
			s.Registrtion();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}