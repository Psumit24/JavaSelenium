package javaSelinum;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {
public void popUp() throws InterruptedException {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://omayo.blogspot.com");
	String parentWindow = driver.getWindowHandle();
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> itr = windows.iterator();
	while (itr.hasNext()) {
		String string = (String) itr.next();
		driver.switchTo().window(string);
		if (driver.getTitle().equals("Basic Web Page Title")) {
			driver.close();
		} 
	}
	driver.switchTo().window(parentWindow);
	WebElement sumit = driver.findElement(By.xpath("//input[@autocomplete='off']"));
	sumit.click();
	sumit.sendKeys("Pakhare");
	Thread.sleep(5000);
	driver.quit();
}

public static void main(String[] args) throws InterruptedException {
	new HandleWindowPopUp().popUp();
}
}
