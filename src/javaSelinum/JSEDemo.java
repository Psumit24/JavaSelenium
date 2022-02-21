package javaSelinum;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JSEDemo {
	public void clickUsingJSE() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testingshastra.com");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript("document.querySelector('a[href=\"/recent-placements\"]').click()");
	}

	public void getTextUsingJSE() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testingshastra.com");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String btn = (String) jse
				.executeScript("return document.querySelector('a[href=\"/recent-placements\"]').innerText");
		System.out.println("Button Text:" + btn);
	}

	public void scrollUsingJSE() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chrom\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("ignore-certificate-errors");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://testingshastra.com");
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
//jse.executeScript("window.scroll(0,1000)");
		driver.executeScript("window.scrollBy(arguments[0],arguments[1])", 0, 1000);
	}

	public static void main(String[] args) {
		// new JSEDemo().clickUsingJSE();
		// new JSEDemo().getTextUsingJSE();
		new JSEDemo().scrollUsingJSE();
	}
}
