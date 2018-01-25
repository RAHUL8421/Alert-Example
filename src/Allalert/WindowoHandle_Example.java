package Allalert;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowoHandle_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rahul\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("#nav-orders > span:nth-child(2)")).click();
		
		String windows = driver.getWindowHandle();
		String count =driver.getWindowHandle();
		System.out.println(count);
		System.out.println("4294967297" +windows);
		
		for(String Winhandle : driver.getWindowHandles())
		{
			driver.switchTo().window(Winhandle);
		System.out.println("Switch to next window" +Winhandle);
		

	}


		
	}

}
