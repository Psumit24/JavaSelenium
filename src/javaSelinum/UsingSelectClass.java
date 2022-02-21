package javaSelinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingSelectClass {
	public void testCase08() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Jsumit\\JARS\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testingshastra.com");
		driver.findElement(By.xpath("//a[contains(text(),'Assignments')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'DropDown List')]")).click();
		WebElement monthList = driver.findElement(By.xpath("//select[@class='single-select']"));
		Select select = new Select(monthList);
		select.selectByIndex(2);
//select.selectByVisibleText("August");-delesect thrown unsupported exception
//select.isMultiple(); true or false.
		WebElement skillsList = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select select1 = new Select(skillsList);
		select1.selectByVisibleText("Core Java");
		select1.selectByVisibleText("Selenium WebDriver");
		select1.selectByVisibleText("Selenium Grid");
		Thread.sleep(1000);
		select1.deselectByVisibleText("Selenium Webdriver");
	}

	public static void main(String[] args) throws InterruptedException {
		new UsingSelectClass().testCase08();
	}
}
