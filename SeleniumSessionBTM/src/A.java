import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		 driver.get("http://www.gmail.com");		
		WebElement element =driver.findElement(By.xpath("//input[@id='identifierId']"));
		element.sendKeys("arabindamohanty41@gmail.com");	 
		Thread.sleep(2000);
		WebElement element1 =driver.findElement(By.xpath("//span[text()='Next']"));
		element1.click();
	}
}
