package byclassdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.support.locators.RelativeLocator;
//RelativeLocator
public class ByClass01 {
	public void testcase04() {

		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
//driver.get("D:\\Jsumit\\Daisyz\\Xpathacess.html");
//driver.findElement(By.xpath("//a[@href='https://www.facebook.com']/parent::div/parent::div/preceding::button")).click();
		driver.get("https://www.myntra.com/");
//driver.findElement(By.partialLinkText("Kids")).click();
//driver.get("D:\\Jsumit\\Daisyz\\Xpathacess.html");
		//driver.findElement(By.xpath("//div[@class='desktop-shopLinks']/a[@href='/shop/women']")).click();
driver.findElement(By.xpath("//div[@class='desktop-shopLinks']/a[@href='/shop/women']")).click();
	
	}

	public static void main(String[] args) {
		new ByClass01().testcase04();

	}
}
