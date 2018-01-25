package Allalert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class alert2 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\Rahul\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		
		
		Thread.sleep(5000);
		
		Alert  alert2 = driver.switchTo().alert2();
		
		String AlertText = simplealert.getText();
		
		System.out.println(AlertText);
		
		simplealert.accept();2
		
		
	

	}

}
