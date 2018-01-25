package Allalert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationAlert_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rahul\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(2) > a")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		Alert confirmationAlert = driver.switchTo().alert();
		String AlertText = confirmationAlert.getText();
		System.out.println(AlertText);
		confirmationAlert.accept();
		
		
		
		

	}

}
