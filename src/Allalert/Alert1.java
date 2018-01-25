package Allalert;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rahul\\Desktop\\Selenium\\Browser Driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.google.com");
		
		Thread.sleep(5000);
		
		Actions oaction = new Actions (driver);
		oaction.sendKeys(Keys.F5).perform();
				
				System.out.println("performed");
		
		WebElement element = driver.findElement(By.cssSelector("#gbwa > div.gb_Mc > a"));
				
		Actions oAction1=new Actions(driver);
		oAction1.clickAndHold(element).release().build().perform();
	
		

	}

}
