package Allalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlert_Example {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Rahul\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
	
	
	driver.findElement(By.cssSelector("ul.nav-tabs > li:nth-child(3) > a:nth-child(1)")).click();
	driver.findElement(By.cssSelector("#Textbox > button")).click();
	
	
	Alert confirmationAlert = driver.switchTo().alert();
	confirmationAlert.sendKeys("Hello Guys!!");
	String AlertText = confirmationAlert.getText();
	System.out.println(AlertText);
	confirmationAlert.accept();
	

	
	Alert simplealert = driver.switchTo().alert();
	
	System.out.println(AlertText);
	
	simplealert.accept();
	
		
		


	}

}
