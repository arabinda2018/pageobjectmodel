import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B {
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://accounts.zoho.com/signin?servicename=ZohoCRM&signupurl=https://www.zoho.com/crm/signup.html?plan=enterprise");
		//login
		driver.findElement(By.xpath("//*[@id=\"lid\"]")).sendKeys("arabindamohanty873@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("EiBvh5Hy38ve@Up");
		driver.findElement(By.xpath("//*[@id=\"signin_submit\"]")).click();
		Thread.sleep(30000);
		//+ icon
		driver.findElement(By.xpath("//*[@id=\"createIcon\"]")).click();
		//lead
		driver.findElement(By.xpath("/html/body/lyte-menu-box[2]/lyte-yield/lyte-menu-body/lyte-menu-item[1]/link-to"))
				.click();
		Thread.sleep(5000);
		//mr.
		driver.findElement(By.xpath("//*[@id=\"Leads_fldRow_FIRSTNAME\"]/div[2]/div/span/span[1]/span")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
}
