import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipileWindow {

	public static void main(String[] args) throws InterruptedException {
		//lunch firefox 
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://naukri.com");
		Set handles =driver.getWindowHandles();
System.out.println(handles);	
		  Object[] alluniqueid=handles.toArray();
		  driver.switchTo().window((String) alluniqueid[0]);
		  Thread.sleep(4000);
		  driver.close();
		  driver.switchTo().window((String) alluniqueid[1]); 
		  Thread.sleep(4000);
		  driver.close();
		  driver.switchTo().window((String) alluniqueid[2]);
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
		  driver.close();
	}
}
