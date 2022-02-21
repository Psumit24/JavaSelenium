package javaSelinum;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WindowHandling {
	public void switchNewWindow() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testingshastra.com");
		driver.findElement(By.xpath("//a[@href=\"/assignments\"]")).click();
		driver.findElement(By.cssSelector("div.card-body ul li:nth-Child(4) a")).click();
		driver.findElement(By.xpath("//button[@class=\"alert-btn\"]")).click();
		//String currentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			String title = driver.switchTo().window(window).getTitle();
			if (title.contains("Testing Shastra")) {
				break;
			}
		}
		driver.findElement(By.xpath("//a[@href=\"/notes\"]")).click();
	}
public void newWindowHanndleSelm4() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("ignore-certificate-errors");
	RemoteWebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://testingshastra.com");
	Thread.sleep(5000);
	//driver.switchTo().newWindow(WindowType.TAB);
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com");
}
	public static void main(String[] args) throws InterruptedException {
		//new WindowHandling().switchNewWindow();
		new WindowHandling().newWindowHanndleSelm4();
	}
}
