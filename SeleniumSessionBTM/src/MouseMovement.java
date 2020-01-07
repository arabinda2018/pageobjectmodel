import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");

		WebElement txtUserName = driver.findElement(By.id(""));
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		// performing single click.
		Actions seriesOfActions = builder.moveToElement(txtUserName).click();
		seriesOfActions.build().perform();
		// performing double click.
		Actions seriesOfActions1 = builder.moveToElement(txtUserName).click().doubleClick();
		seriesOfActions1.build().perform();
		// performing context click.
		Actions seriesOfActions2 = builder.moveToElement(txtUserName).click().contextClick();
		seriesOfActions2.build().perform();

	}
}
